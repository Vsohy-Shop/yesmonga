package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.C40327a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class InstallReferrerClientImpl extends InstallReferrerClient {

    /* renamed from: e */
    public static final String f56128e = "InstallReferrerClient";

    /* renamed from: f */
    public static final int f56129f = 80837300;

    /* renamed from: g */
    public static final String f56130g = "com.android.vending";

    /* renamed from: h */
    public static final String f56131h = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";

    /* renamed from: i */
    public static final String f56132i = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";

    /* renamed from: a */
    public int f56133a = 0;

    /* renamed from: b */
    public final Context f56134b;

    /* renamed from: c */
    public C40327a f56135c;

    /* renamed from: d */
    public ServiceConnection f56136d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$b */
    public final class C21708b implements ServiceConnection {

        /* renamed from: c */
        public final InstallReferrerStateListener f56137c;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose(InstallReferrerClientImpl.f56128e, "Install Referrer service connected.");
            C40327a unused = InstallReferrerClientImpl.this.f56135c = C40327a.C40328a.m163846H0(iBinder);
            int unused2 = InstallReferrerClientImpl.this.f56133a = 2;
            this.f56137c.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(InstallReferrerClientImpl.f56128e, "Install Referrer service disconnected.");
            C40327a unused = InstallReferrerClientImpl.this.f56135c = null;
            int unused2 = InstallReferrerClientImpl.this.f56133a = 0;
            this.f56137c.onInstallReferrerServiceDisconnected();
        }

        public C21708b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f56137c = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f56134b = context.getApplicationContext();
    }

    /* renamed from: c */
    public final boolean mo64762c() {
        try {
            if (this.f56134b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void endConnection() {
        this.f56133a = 3;
        if (this.f56136d != null) {
            InstallReferrerCommons.logVerbose(f56128e, "Unbinding from service.");
            this.f56134b.unbindService(this.f56136d);
            this.f56136d = null;
        }
        this.f56135c = null;
    }

    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f56134b.getPackageName());
            try {
                return new ReferrerDetails(this.f56135c.mo132989H(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn(f56128e, "RemoteException getting install referrer information");
                this.f56133a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public boolean isReady() {
        return (this.f56133a != 2 || this.f56135c == null || this.f56136d == null) ? false : true;
    }

    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose(f56128e, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f56133a;
        if (i == 1) {
            InstallReferrerCommons.logWarn(f56128e, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            InstallReferrerCommons.logWarn(f56128e, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            InstallReferrerCommons.logVerbose(f56128e, "Starting install referrer service setup.");
            Intent intent = new Intent(f56132i);
            intent.setComponent(new ComponentName("com.android.vending", f56131h));
            List<ResolveInfo> queryIntentServices = this.f56134b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f56133a = 0;
                InstallReferrerCommons.logVerbose(f56128e, "Install Referrer service unavailable on device.");
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !mo64762c()) {
                InstallReferrerCommons.logWarn(f56128e, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f56133a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            C21708b bVar = new C21708b(installReferrerStateListener);
            this.f56136d = bVar;
            try {
                if (this.f56134b.bindService(intent2, bVar, 1)) {
                    InstallReferrerCommons.logVerbose(f56128e, "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn(f56128e, "Connection to service is blocked.");
                this.f56133a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
            } catch (SecurityException unused) {
                InstallReferrerCommons.logWarn(f56128e, "No permission to connect to service.");
                this.f56133a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(4);
            }
        }
    }
}
