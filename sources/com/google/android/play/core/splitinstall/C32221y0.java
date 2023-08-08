package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.C32014a;

/* renamed from: com.google.android.play.core.splitinstall.y0 */
public final class C32221y0 implements C32014a {

    /* renamed from: a */
    public final /* synthetic */ Activity f78564a;

    public C32221y0(Activity activity) {
        this.f78564a = activity;
    }

    /* renamed from: a */
    public final void mo92415a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f78564a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
