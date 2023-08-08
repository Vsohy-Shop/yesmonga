package com.urbanairship.automation.alarms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AlarmOperationReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f23566a = "com.urbanairship.automation.alarms.ALARM_FIRED";

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        if (intent != null && f23566a.equals(intent.getAction())) {
            C8804a.m32712d(context).mo17315b();
        }
    }
}
