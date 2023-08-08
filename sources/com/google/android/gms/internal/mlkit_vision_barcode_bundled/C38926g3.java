package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3 */
public final class C38926g3 extends C38976l3 {

    /* renamed from: c */
    public static final Class<?> f98852c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C38926g3(C38916f3 f3Var) {
        super((C38966k3) null);
    }

    /* renamed from: a */
    public final void mo122900a(Object obj, long j) {
        Object obj2;
        List list = (List) C39024q5.m160721k(obj, j);
        if (list instanceof C38906e3) {
            obj2 = ((C38906e3) list).mo122839f();
        } else if (!f98852c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C38907e4) || !(list instanceof C39075w2)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C39075w2 w2Var = (C39075w2) list;
                if (w2Var.mo122767d()) {
                    w2Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C39024q5.m160734x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo122901b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160721k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160721k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38906e3
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3 r1 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38907e4
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2 r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2 r0 = r1.mo122844n(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160734x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f98852c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160734x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38978l5
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3 r2 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.d3
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.l5 r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38978l5) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160734x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38907e4
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2 r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2) r2
            boolean r3 = r2.mo122767d()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2 r1 = r2.mo122844n(r1)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160734x(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r6)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = r1
        L_0x00a2:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39024q5.m160734x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C38926g3.mo122901b(java.lang.Object, java.lang.Object, long):void");
    }

    public C38926g3() {
        super((C38966k3) null);
    }
}
