package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.q */
public final class C31883q extends C31882p<Void> {
    public C31883q(C31885s sVar, C32239p<Void> pVar) {
        super(sVar, new C32062k("OnCompleteUpdateCallback"), pVar);
    }

    /* renamed from: H */
    public final void mo92421H(Bundle bundle) throws RemoteException {
        super.mo92421H(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f77739o.mo93033d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f77739o.mo93034e(null);
        }
    }
}
