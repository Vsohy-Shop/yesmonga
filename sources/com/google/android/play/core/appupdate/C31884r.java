package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.r */
public final class C31884r extends C31882p<C31865a> {

    /* renamed from: q */
    public final String f77741q;

    /* renamed from: r */
    public final /* synthetic */ C31885s f77742r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31884r(C31885s sVar, C32239p<C31865a> pVar, String str) {
        super(sVar, new C32062k("OnRequestInstallCallback"), pVar);
        this.f77742r = sVar;
        this.f77741q = str;
    }

    /* renamed from: b0 */
    public final void mo92422b0(Bundle bundle) throws RemoteException {
        super.mo92422b0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f77739o.mo93033d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f77739o.mo93034e(C31885s.m129315h(this.f77742r, bundle, this.f77741q));
        }
    }
}
