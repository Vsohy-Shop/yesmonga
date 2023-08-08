package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Collections;
import java.util.List;

public final class g00 extends k00 {

    /* renamed from: c */
    public static final Class<?> f71254c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ g00(f00 f00) {
        super((j00) null);
    }

    /* renamed from: a */
    public final void mo84634a(Object obj, long j) {
        Object obj2;
        List list = (List) C29725t.m121139k(obj, j);
        if (list instanceof e00) {
            obj2 = ((e00) list).mo84581x();
        } else if (!f71254c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof f10) || !(list instanceof C29872wz)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C29872wz wzVar = (C29872wz) list;
                if (wzVar.mo84839z()) {
                    wzVar.mo84834I();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C29725t.m121152x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo84635b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121139k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.e00
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00 r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.f10
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r0 = r1.mo84516P1(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121152x(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f71254c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121152x(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29540o
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00 r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.d00
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.o r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29540o) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121152x(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.f10
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29872wz) r2
            boolean r3 = r2.mo84839z()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.wz r1 = r2.mo84516P1(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121152x(r5, r7, r1)
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29725t.m121152x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_bundled_common.g00.mo84635b(java.lang.Object, java.lang.Object, long):void");
    }

    public g00() {
        super((j00) null);
    }
}
