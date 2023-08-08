package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.k */
public final class C31945k extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f77938b;

    /* renamed from: c */
    public final /* synthetic */ String f77939c;

    /* renamed from: d */
    public final /* synthetic */ C32239p f77940d;

    /* renamed from: e */
    public final /* synthetic */ int f77941e;

    /* renamed from: f */
    public final /* synthetic */ C31993v f77942f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31945k(C31993v vVar, C32239p pVar, int i, String str, C32239p pVar2, int i2) {
        super(pVar);
        this.f77942f = vVar;
        this.f77938b = i;
        this.f77939c = str;
        this.f77940d = pVar2;
        this.f77941e = i2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77942f.f78146c.mo92831c()).mo92822e1(this.f77942f.f78144a, C31993v.m129682i(this.f77938b, this.f77939c), C31993v.m129684k(), new C31981s(this.f77942f, this.f77940d, this.f77938b, this.f77939c, this.f77941e));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
