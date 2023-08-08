package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.j */
public final class C32128j extends C32127i<ReviewInfo> {
    public C32128j(C32129k kVar, C32239p pVar) {
        super(kVar, new C32062k("OnRequestInstallCallback"), pVar);
    }

    /* renamed from: b0 */
    public final void mo92765b0(Bundle bundle) throws RemoteException {
        super.mo92765b0(bundle);
        this.f78347o.mo93034e(ReviewInfo.m130033b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
