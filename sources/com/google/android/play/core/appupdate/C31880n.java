package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.n */
public final class C31880n extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ String f77732b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f77733c;

    /* renamed from: d */
    public final /* synthetic */ C31885s f77734d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31880n(C31885s sVar, C32239p pVar, String str, C32239p pVar2) {
        super(pVar);
        this.f77734d = sVar;
        this.f77732b = str;
        this.f77733c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f77734d.f77745a.mo92831c().mo92798P5(this.f77734d.f77746b, C31885s.m129311d(this.f77734d, this.f77732b), new C31884r(this.f77734d, this.f77733c, this.f77732b));
        } catch (RemoteException e) {
            C31885s.f77743e.mo92777c(e, "requestUpdateInfo(%s)", this.f77732b);
            this.f77733c.mo93033d(new RuntimeException(e));
        }
    }
}
