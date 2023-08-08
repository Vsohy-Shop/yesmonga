package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ia */
public final class C42004ia extends C42040ka {
    public /* synthetic */ C42004ia(C41986ha haVar) {
        super((C42022ja) null);
    }

    /* renamed from: a */
    public final void mo136877a(Object obj, long j) {
        ((C42296z9) C42006ic.m170300k(obj, j)).zzb();
    }

    /* renamed from: b */
    public final void mo136878b(Object obj, Object obj2, long j) {
        C42296z9 z9Var = (C42296z9) C42006ic.m170300k(obj, j);
        C42296z9 z9Var2 = (C42296z9) C42006ic.m170300k(obj2, j);
        int size = z9Var.size();
        int size2 = z9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!z9Var.mo136871d()) {
                z9Var = z9Var.mo136618n(size2 + size);
            }
            z9Var.addAll(z9Var2);
        }
        if (size > 0) {
            z9Var2 = z9Var;
        }
        C42006ic.m170313x(obj, j, z9Var2);
    }

    public C42004ia() {
        super((C42022ja) null);
    }
}
