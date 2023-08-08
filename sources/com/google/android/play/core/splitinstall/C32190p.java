package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.p */
public final class C32190p extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f78483b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78484c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78485d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32190p(C32162d0 d0Var, C32239p pVar, List list, C32239p pVar2) {
        super(pVar);
        this.f78485d = d0Var;
        this.f78483b = list;
        this.f78484c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78485d.f78401b.mo92831c().mo92792a4(this.f78485d.f78400a, C32162d0.m130149j(this.f78483b), C32162d0.m130151l(), new C32216w(this.f78485d, this.f78484c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "deferredLanguageInstall(%s)", this.f78483b);
            this.f78484c.mo93033d(new RuntimeException(e));
        }
    }
}
