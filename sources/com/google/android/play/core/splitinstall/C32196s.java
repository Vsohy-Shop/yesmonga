package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.splitinstall.s */
public final class C32196s extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ C32239p f78493b;

    /* renamed from: c */
    public final /* synthetic */ C32162d0 f78494c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32196s(C32162d0 d0Var, C32239p pVar, C32239p pVar2) {
        super(pVar);
        this.f78494c = d0Var;
        this.f78493b = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78494c.f78401b.mo92831c().mo92790O3(this.f78494c.f78400a, new C32153a0(this.f78494c, this.f78493b));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "getSessionStates", new Object[0]);
            this.f78493b.mo93033d(new RuntimeException(e));
        }
    }
}
