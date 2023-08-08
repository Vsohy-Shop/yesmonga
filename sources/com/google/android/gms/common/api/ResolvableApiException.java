package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.C0359n0;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@C0359n0 Status status) {
        super(status);
    }

    @C0359n0
    /* renamed from: d */
    public PendingIntent mo133638d() {
        return mo133627a().mo133647Q();
    }

    /* renamed from: e */
    public void mo133639e(@C0359n0 Activity activity, int i) throws IntentSender.SendIntentException {
        mo133627a().mo133656t0(activity, i);
    }
}
