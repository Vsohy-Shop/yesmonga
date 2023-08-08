package com.urbanairship.push.adm;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.push.C9539u;
import com.urbanairship.push.PushMessage;

public class AdmHandlerJobBase extends ADMMessageHandlerJobBase {
    public void onMessage(Context context, Intent intent) {
        Autopilot.m146142e(context);
        C9539u.m35826a(AdmPushProvider.class, new PushMessage(intent.getExtras())).mo19441c(context);
    }

    public void onRegistered(Context context, String str) {
        C9539u.m35828c(context, AdmPushProvider.class, str);
    }

    public void onRegistrationError(Context context, String str) {
        C36059m.m148409e("An error occured during ADM Registration : " + str, new Object[0]);
    }

    public void onUnregistered(Context context, String str) {
        C9539u.m35828c(context, AdmPushProvider.class, str);
    }
}
