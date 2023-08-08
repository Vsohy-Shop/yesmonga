package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.g3 */
public final class C31929g3 extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ String f77874b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f77875c;

    /* renamed from: d */
    public final /* synthetic */ C31993v f77876d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31929g3(C31993v vVar, C32239p pVar, String str, C32239p pVar2) {
        super(pVar);
        this.f77876d = vVar;
        this.f77874b = str;
        this.f77875c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77876d.f78146c.mo92831c()).mo92818G7(this.f77876d.f78144a, C31993v.m129682i(0, this.f77874b), C31993v.m129684k(), new C31965o(this.f77876d, this.f77875c, (short[]) null));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "removePack(%s)", this.f77874b);
        }
    }
}
