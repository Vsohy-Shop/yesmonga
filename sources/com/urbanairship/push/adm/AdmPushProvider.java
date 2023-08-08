package com.urbanairship.push.adm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.messaging.C33188f0;
import com.urbanairship.AirshipVersionInfo;
import com.urbanairship.C36059m;
import com.urbanairship.push.PushProvider;

public class AdmPushProvider implements PushProvider, AirshipVersionInfo {
    private static final String AMAZON_SEND_PERMISSION = "com.amazon.device.messaging.permission.SEND";
    private static Boolean isAdmDependencyAvailable;

    public static class RegistrationReceiver extends BroadcastReceiver {
        private static final long REGISTRATION_TIMEOUT_MS = 10000;
        /* access modifiers changed from: private */
        public String error;
        /* access modifiers changed from: private */
        public String registrationToken;

        private RegistrationReceiver() {
        }

        public void awaitRegistration() throws InterruptedException {
            synchronized (this) {
                wait(10000);
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (!(intent == null || intent.getExtras() == null || !"com.amazon.device.messaging.intent.REGISTRATION".equals(intent.getAction()))) {
                if (intent.getExtras().containsKey("error")) {
                    C36059m.m148409e("ADM error occurred: %s", intent.getExtras().getString("error"));
                    this.error = intent.getExtras().getString("error");
                } else {
                    this.registrationToken = intent.getStringExtra(C33188f0.f80660h);
                }
            }
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @C0359n0
    public String getAirshipVersion() {
        return "16.9.2";
    }

    @C0359n0
    public String getDeliveryType() {
        return PushProvider.f25852a;
    }

    @C0359n0
    public String getPackageVersion() {
        return BuildConfig.SDK_VERSION;
    }

    public int getPlatform() {
        return 1;
    }

    @C0363p0
    public String getRegistrationToken(@C0359n0 Context context) throws PushProvider.RegistrationException {
        String registrationId = AdmWrapper.getRegistrationId(context);
        if (registrationId != null) {
            return registrationId;
        }
        RegistrationReceiver registrationReceiver = new RegistrationReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.amazon.device.messaging.intent.REGISTRATION");
        intentFilter.addCategory(context.getPackageName());
        context.registerReceiver(registrationReceiver, intentFilter, AMAZON_SEND_PERMISSION, new Handler(Looper.getMainLooper()));
        AdmWrapper.startRegistration(context);
        try {
            registrationReceiver.awaitRegistration();
            context.unregisterReceiver(registrationReceiver);
            if (registrationReceiver.error == null) {
                return registrationReceiver.registrationToken;
            }
            throw new PushProvider.RegistrationException(registrationReceiver.error, false);
        } catch (InterruptedException e) {
            throw new PushProvider.RegistrationException("ADM registration interrupted", true, e);
        }
    }

    public boolean isAvailable(@C0359n0 Context context) {
        return true;
    }

    public boolean isSupported(@C0359n0 Context context) {
        if (isAdmDependencyAvailable == null) {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                isAdmDependencyAvailable = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                isAdmDependencyAvailable = Boolean.FALSE;
            }
        }
        if (isAdmDependencyAvailable.booleanValue()) {
            return AdmWrapper.isSupported();
        }
        return false;
    }

    @C0359n0
    public String toString() {
        return "ADM Push Provider " + getAirshipVersion();
    }
}
