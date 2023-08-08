package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.C32014a;

/* renamed from: com.google.android.play.core.appupdate.g */
public final class C31873g implements C32014a {

    /* renamed from: a */
    public final /* synthetic */ Activity f77719a;

    public C31873g(Activity activity) {
        this.f77719a = activity;
    }

    /* renamed from: a */
    public final void mo92415a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f77719a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
