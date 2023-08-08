package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.j3 */
public final class C31944j3 extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ Map f77935b;

    /* renamed from: c */
    public final /* synthetic */ C32239p f77936c;

    /* renamed from: d */
    public final /* synthetic */ C31993v f77937d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31944j3(C31993v vVar, C32239p pVar, Map map, C32239p pVar2) {
        super(pVar);
        this.f77937d = vVar;
        this.f77935b = map;
        this.f77936c = pVar2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        try {
            ((C32094u1) this.f77937d.f78146c.mo92831c()).mo92815B4(this.f77937d.f78144a, C31993v.m129687n(this.f77935b), new C31973q(this.f77937d, this.f77936c));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "syncPacks", new Object[0]);
            this.f77936c.mo93033d(new RuntimeException(e));
        }
    }
}
