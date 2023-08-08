package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.splitinstall.t */
public final class C32198t extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f78496b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78497c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78498d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32198t(C32162d0 d0Var, C32239p pVar, int i, C32239p pVar2) {
        super(pVar);
        this.f78498d = d0Var;
        this.f78496b = i;
        this.f78497c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78498d.f78401b.mo92831c().mo92794y4(this.f78498d.f78400a, this.f78496b, C32162d0.m130151l(), new C32212u(this.f78498d, this.f78497c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "cancelInstall(%d)", Integer.valueOf(this.f78496b));
            this.f78497c.mo93033d(new RuntimeException(e));
        }
    }
}
