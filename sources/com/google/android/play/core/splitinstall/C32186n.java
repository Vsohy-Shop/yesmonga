package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.n */
public final class C32186n extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f78471b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78472c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78473d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32186n(C32162d0 d0Var, C32239p pVar, List list, C32239p pVar2) {
        super(pVar);
        this.f78473d = d0Var;
        this.f78471b = list;
        this.f78472c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78473d.f78401b.mo92831c().mo92791V4(this.f78473d.f78400a, C32162d0.m130148i(this.f78471b), C32162d0.m130151l(), new C32220y(this.f78473d, this.f78472c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "deferredUninstall(%s)", this.f78471b);
            this.f78472c.mo93033d(new RuntimeException(e));
        }
    }
}
