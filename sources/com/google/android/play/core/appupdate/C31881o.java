package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.o */
public final class C31881o extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ C32239p f77735b;

    /* renamed from: c */
    public final /* synthetic */ String f77736c;

    /* renamed from: d */
    public final /* synthetic */ C31885s f77737d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31881o(C31885s sVar, C32239p pVar, C32239p pVar2, String str) {
        super(pVar);
        this.f77737d = sVar;
        this.f77735b = pVar2;
        this.f77736c = str;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f77737d.f77745a.mo92831c().mo92799p5(this.f77737d.f77746b, C31885s.m129317j(), new C31883q(this.f77737d, this.f77735b));
        } catch (RemoteException e) {
            C31885s.f77743e.mo92777c(e, "completeUpdate(%s)", this.f77736c);
            this.f77735b.mo93033d(new RuntimeException(e));
        }
    }
}
