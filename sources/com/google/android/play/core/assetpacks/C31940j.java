package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.j */
public final class C31940j extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ int f77917b;

    /* renamed from: c */
    public final /* synthetic */ String f77918c;

    /* renamed from: d */
    public final /* synthetic */ String f77919d;

    /* renamed from: e */
    public final /* synthetic */ int f77920e;

    /* renamed from: f */
    public final /* synthetic */ C32239p f77921f;

    /* renamed from: g */
    public final /* synthetic */ C31993v f77922g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31940j(C31993v vVar, C32239p pVar, int i, String str, String str2, int i2, C32239p pVar2) {
        super(pVar);
        this.f77922g = vVar;
        this.f77917b = i;
        this.f77918c = str;
        this.f77919d = str2;
        this.f77920e = i2;
        this.f77921f = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77922g.f78146c.mo92831c()).mo92821K4(this.f77922g.f78144a, C31993v.m129692t(this.f77917b, this.f77918c, this.f77919d, this.f77920e), C31993v.m129684k(), new C31965o(this.f77922g, this.f77921f, (char[]) null));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
