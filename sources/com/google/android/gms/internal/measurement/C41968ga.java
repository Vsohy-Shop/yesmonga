package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ga */
public final class C41968ga extends C42040ka {

    /* renamed from: c */
    public static final Class f106151c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C41968ga(C41950fa faVar) {
        super((C42022ja) null);
    }

    /* renamed from: a */
    public final void mo136877a(Object obj, long j) {
        Object obj2;
        List list = (List) C42006ic.m170300k(obj, j);
        if (list instanceof C41932ea) {
            obj2 = ((C41932ea) list).mo136693f();
        } else if (!f106151c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C41915db) || !(list instanceof C42296z9)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C42296z9 z9Var = (C42296z9) list;
                if (z9Var.mo136871d()) {
                    z9Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C42006ic.m170313x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.da} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136878b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C42006ic.m170300k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C41932ea
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.da r1 = new com.google.android.gms.internal.measurement.da
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C41915db
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C42296z9
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.z9 r1 = (com.google.android.gms.internal.measurement.C42296z9) r1
            com.google.android.gms.internal.measurement.z9 r0 = r1.mo136618n(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.C42006ic.m170313x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = f106151c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.measurement.C42006ic.m170313x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C41916dc
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.da r2 = new com.google.android.gms.internal.measurement.da
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.dc r1 = (com.google.android.gms.internal.measurement.C41916dc) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.measurement.C42006ic.m170313x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C41915db
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C42296z9
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.measurement.z9 r2 = (com.google.android.gms.internal.measurement.C42296z9) r2
            boolean r3 = r2.mo136871d()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.z9 r1 = r2.mo136618n(r1)
            com.google.android.gms.internal.measurement.C42006ic.m170313x(r5, r7, r1)
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
            com.google.android.gms.internal.measurement.C42006ic.m170313x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C41968ga.mo136878b(java.lang.Object, java.lang.Object, long):void");
    }

    public C41968ga() {
        super((C42022ja) null);
    }
}
