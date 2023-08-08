package com.google.android.gms.common.api.internal;

import androidx.annotation.C0348i1;
import com.google.android.gms.common.api.C40477a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
public final class C40625t0 extends C40656z0 {

    /* renamed from: b */
    public final ArrayList f103567b;

    /* renamed from: c */
    public final /* synthetic */ C40515a1 f103568c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40625t0(C40515a1 a1Var, ArrayList arrayList) {
        super(a1Var, (C40651y0) null);
        this.f103568c = a1Var;
        this.f103567b = arrayList;
    }

    @C0348i1
    /* renamed from: a */
    public final void mo134023a() {
        C40515a1 a1Var = this.f103568c;
        a1Var.f103299a.f103496A.f103451s = C40515a1.m164907y(a1Var);
        ArrayList arrayList = this.f103567b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C40515a1 a1Var2 = this.f103568c;
            ((C40477a.C40489f) arrayList.get(i)).mo133681p(a1Var2.f103313o, a1Var2.f103299a.f103496A.f103451s);
        }
    }
}
