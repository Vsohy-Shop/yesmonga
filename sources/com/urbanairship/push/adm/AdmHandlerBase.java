package com.urbanairship.push.adm;

import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.push.C9539u;
import com.urbanairship.push.PushMessage;

public class AdmHandlerBase extends ADMMessageHandlerBase {
    public AdmHandlerBase(String str) {
        super(str);
    }

    public void onMessage(Intent intent) {
        Autopilot.m146142e(getApplicationContext());
        C9539u.m35826a(AdmPushProvider.class, new PushMessage(intent.getExtras())).mo19441c(getApplicationContext());
    }

    public void onRegistered(String str) {
        C9539u.m35828c(getApplicationContext(), AdmPushProvider.class, str);
    }

    public void onRegistrationError(String str) {
        C36059m.m148409e("An error occured during ADM Registration : " + str, new Object[0]);
    }

    public void onUnregistered(String str) {
        C9539u.m35828c(getApplicationContext(), AdmPushProvider.class, str);
    }

    public AdmHandlerBase() {
        super("AdmHandlerBase");
    }
}
