package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.n */
public final class C31961n extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ C32239p f78002b;

    /* renamed from: c */
    public final /* synthetic */ C31993v f78003c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31961n(C31993v vVar, C32239p pVar, C32239p pVar2) {
        super(pVar);
        this.f78003c = vVar;
        this.f78002b = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f78003c.f78147d.mo92831c()).mo92816D2(this.f78003c.f78144a, C31993v.m129684k(), new C31977r(this.f78003c, this.f78002b));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "keepAlive", new Object[0]);
        }
    }
}
