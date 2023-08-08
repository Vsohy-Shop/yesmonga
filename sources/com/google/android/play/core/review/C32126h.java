package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.common.C32015b;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.h */
public final class C32126h extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ C32239p f78344b;

    /* renamed from: c */
    public final /* synthetic */ C32129k f78345c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32126h(C32129k kVar, C32239p pVar, C32239p pVar2) {
        super(pVar);
        this.f78345c = kVar;
        this.f78344b = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            this.f78345c.f78350a.mo92831c().mo92729R3(this.f78345c.f78351b, C32015b.m129740c("review"), new C32128j(this.f78345c, this.f78344b));
        } catch (RemoteException e) {
            C32129k.f78349c.mo92777c(e, "error requesting in-app review for %s", this.f78345c.f78351b);
            this.f78344b.mo93033d(new RuntimeException(e));
        }
    }
}
