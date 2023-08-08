package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.oa */
public final class C42110oa extends C42011j {

    /* renamed from: c */
    public final /* synthetic */ C42095nc f106322c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42110oa(C42111ob obVar, String str, C42095nc ncVar) {
        super("getValue");
        this.f106322c = ncVar;
    }

    /* renamed from: a */
    public final C42133q mo136725a(C41909d5 d5Var, List list) {
        C41928e6.m169810h("getValue", 2, list);
        C42133q b = d5Var.mo136673b((C42133q) list.get(0));
        C42133q b2 = d5Var.mo136673b((C42133q) list.get(1));
        String a = this.f106322c.mo87562a(b.mo136744k());
        if (a != null) {
            return new C42201u(a);
        }
        return b2;
    }
}
