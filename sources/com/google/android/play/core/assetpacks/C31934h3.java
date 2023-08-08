package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.h3 */
public final class C31934h3 extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f77892b;

    /* renamed from: c */
    public final /* synthetic */ Map f77893c;

    /* renamed from: d */
    public final /* synthetic */ C32239p f77894d;

    /* renamed from: e */
    public final /* synthetic */ List f77895e;

    /* renamed from: f */
    public final /* synthetic */ C31993v f77896f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31934h3(C31993v vVar, C32239p pVar, List list, Map map, C32239p pVar2, List list2) {
        super(pVar);
        this.f77896f = vVar;
        this.f77892b = list;
        this.f77893c = map;
        this.f77894d = pVar2;
        this.f77895e = list2;
    }

    /* renamed from: a */
    public final void mo92420a() {
        ArrayList l = C31993v.m129685l(this.f77892b);
        try {
            String m = this.f77896f.f78144a;
            Bundle n = C31993v.m129687n(this.f77893c);
            C31993v vVar = this.f77896f;
            ((C32094u1) this.f77896f.f78146c.mo92831c()).mo92824z8(m, l, n, new C31989u(vVar, this.f77894d, vVar.f78145b, this.f77895e));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "startDownload(%s)", this.f77892b);
            this.f77894d.mo93033d(new RuntimeException(e));
        }
    }
}
