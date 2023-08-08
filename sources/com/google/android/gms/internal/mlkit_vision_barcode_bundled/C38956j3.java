package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j3 */
public final class C38956j3 extends C38976l3 {
    public /* synthetic */ C38956j3(C38946i3 i3Var) {
        super((C38966k3) null);
    }

    /* renamed from: a */
    public final void mo122900a(Object obj, long j) {
        ((C39075w2) C39024q5.m160721k(obj, j)).zzb();
    }

    /* renamed from: b */
    public final <E> void mo122901b(Object obj, Object obj2, long j) {
        C39075w2 w2Var = (C39075w2) C39024q5.m160721k(obj, j);
        C39075w2 w2Var2 = (C39075w2) C39024q5.m160721k(obj2, j);
        int size = w2Var.size();
        int size2 = w2Var2.size();
        if (size > 0 && size2 > 0) {
            if (!w2Var.mo122767d()) {
                w2Var = w2Var.mo122844n(size2 + size);
            }
            w2Var.addAll(w2Var2);
        }
        if (size > 0) {
            w2Var2 = w2Var;
        }
        C39024q5.m160734x(obj, j, w2Var2);
    }

    public C38956j3() {
        super((C38966k3) null);
    }
}
