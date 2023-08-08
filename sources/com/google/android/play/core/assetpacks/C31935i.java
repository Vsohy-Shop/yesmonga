package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32065l;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.i */
public final class C31935i extends C32065l {

    /* renamed from: b */
    public final /* synthetic */ List f77897b;

    /* renamed from: c */
    public final /* synthetic */ Map f77898c;

    /* renamed from: d */
    public final /* synthetic */ C32239p f77899d;

    /* renamed from: e */
    public final /* synthetic */ C31895a0 f77900e;

    /* renamed from: f */
    public final /* synthetic */ C31993v f77901f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31935i(C31993v vVar, C32239p pVar, List list, Map map, C32239p pVar2, C31895a0 a0Var) {
        super(pVar);
        this.f77901f = vVar;
        this.f77897b = list;
        this.f77898c = map;
        this.f77899d = pVar2;
        this.f77900e = a0Var;
    }

    /* renamed from: a */
    public final void mo92420a() {
        ArrayList l = C31993v.m129685l(this.f77897b);
        try {
            String m = this.f77901f.f78144a;
            Bundle n = C31993v.m129687n(this.f77898c);
            C31993v vVar = this.f77901f;
            ((C32094u1) this.f77901f.f78146c.mo92831c()).mo92819I4(m, l, n, new C31985t(vVar, this.f77899d, vVar.f78145b, this.f77900e));
        } catch (RemoteException e) {
            C31993v.f78142f.mo92777c(e, "getPackStates(%s)", this.f77897b);
            this.f77899d.mo93033d(new RuntimeException(e));
        }
    }
}
