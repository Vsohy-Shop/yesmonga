package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32082q1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.p */
public class C31882p<T> extends C32082q1 {

    /* renamed from: n */
    public final C32062k f77738n;

    /* renamed from: o */
    public final C32239p<T> f77739o;

    /* renamed from: p */
    public final /* synthetic */ C31885s f77740p;

    public C31882p(C31885s sVar, C32062k kVar, C32239p<T> pVar) {
        this.f77740p = sVar;
        this.f77738n = kVar;
        this.f77739o = pVar;
    }

    /* renamed from: H */
    public void mo92421H(Bundle bundle) throws RemoteException {
        this.f77740p.f77745a.mo92830b();
        this.f77738n.mo92778d("onCompleteUpdate", new Object[0]);
    }

    /* renamed from: b0 */
    public void mo92422b0(Bundle bundle) throws RemoteException {
        this.f77740p.f77745a.mo92830b();
        this.f77738n.mo92778d("onRequestInfo", new Object[0]);
    }
}
