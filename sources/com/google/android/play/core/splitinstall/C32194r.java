package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.splitinstall.r */
public final class C32194r extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f78490b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78491c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78492d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32194r(C32162d0 d0Var, C32239p pVar, int i, C32239p pVar2) {
        super(pVar);
        this.f78492d = d0Var;
        this.f78490b = i;
        this.f78491c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78492d.f78401b.mo92831c().mo92793j8(this.f78492d.f78400a, this.f78490b, new C32222z(this.f78492d, this.f78491c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "getSessionState(%d)", Integer.valueOf(this.f78490b));
            this.f78491c.mo93033d(new RuntimeException(e));
        }
    }
}
