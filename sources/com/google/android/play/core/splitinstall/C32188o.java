package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.o */
public final class C32188o extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f78477b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f78478c;

    /* renamed from: d */
    public final /* synthetic */ C32162d0 f78479d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32188o(C32162d0 d0Var, C32239p pVar, List list, C32239p pVar2) {
        super(pVar);
        this.f78479d = d0Var;
        this.f78477b = list;
        this.f78478c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78479d.f78401b.mo92831c().mo92787C4(this.f78479d.f78400a, C32162d0.m130148i(this.f78477b), C32162d0.m130151l(), new C32214v(this.f78479d, this.f78478c));
        } catch (RemoteException e) {
            C32162d0.f78398c.mo92777c(e, "deferredInstall(%s)", this.f78477b);
            this.f78478c.mo93033d(new RuntimeException(e));
        }
    }
}
