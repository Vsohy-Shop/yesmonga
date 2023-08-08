package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.i3 */
public final class C31939i3 extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f77914b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f77915c;

    /* renamed from: d */
    public final /* synthetic */ C31993v f77916d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31939i3(C31993v vVar, C32239p pVar, List list, C32239p pVar2) {
        super(pVar);
        this.f77916d = vVar;
        this.f77914b = list;
        this.f77915c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77916d.f78146c.mo92831c()).mo92823i5(this.f77916d.f78144a, C31993v.m129685l(this.f77914b), C31993v.m129684k(), new C31965o(this.f77916d, this.f77915c, (byte[]) null));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "cancelDownloads(%s)", this.f77914b);
        }
    }
}
