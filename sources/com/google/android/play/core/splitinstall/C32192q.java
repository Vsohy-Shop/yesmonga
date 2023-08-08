package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.q */
public final class C32192q extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f78487b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78488c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78489d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32192q(C32162d0 d0Var, C32239p pVar, List list, C32239p pVar2) {
        super(pVar);
        this.f78489d = d0Var;
        this.f78487b = list;
        this.f78488c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78489d.f78401b.mo92831c().mo92788J3(this.f78489d.f78400a, C32162d0.m130149j(this.f78487b), C32162d0.m130151l(), new C32218x(this.f78489d, this.f78488c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "deferredLanguageUninstall(%s)", this.f78487b);
            this.f78488c.mo93033d(new RuntimeException(e));
        }
    }
}
