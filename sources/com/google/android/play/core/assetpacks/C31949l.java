package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.l */
public final class C31949l extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f77951b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f77952c;

    /* renamed from: d */
    public final /* synthetic */ C31993v f77953d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31949l(C31993v vVar, C32239p pVar, int i, C32239p pVar2) {
        super(pVar);
        this.f77953d = vVar;
        this.f77951b = i;
        this.f77952c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77953d.f78146c.mo92831c()).mo92820K1(this.f77953d.f78144a, C31993v.m129683j(this.f77951b), C31993v.m129684k(), new C31965o(this.f77953d, this.f77952c, (int[]) null));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
