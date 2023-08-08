package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.play.core.splitinstall.m */
public final class C32181m extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ Collection f78437b;

    /* renamed from: c */
    public final /* synthetic */ Collection f78438c;

    /* renamed from: d */
    public final /* synthetic */ C32239p f78439d;

    /* renamed from: e */
    public final /* synthetic */ C32162d0 f78440e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32181m(C32162d0 d0Var, C32239p pVar, Collection collection, Collection collection2, C32239p pVar2) {
        super(pVar);
        this.f78440e = d0Var;
        this.f78437b = collection;
        this.f78438c = collection2;
        this.f78439d = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        ArrayList i = C32162d0.m130148i(this.f78437b);
        i.addAll(C32162d0.m130149j(this.f78438c));
        try {
            this.f78440e.f78401b.mo92831c().mo92789O2(this.f78440e.f78400a, i, C32162d0.m130151l(), new C32156b0(this.f78440e, this.f78439d));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "startInstall(%s,%s)", this.f78437b, this.f78438c);
            this.f78439d.mo93033d(new RuntimeException(e));
        }
    }
}
