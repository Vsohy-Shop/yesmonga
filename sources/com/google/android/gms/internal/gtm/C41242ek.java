package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.ek */
public final class C41242ek extends C41338ik {

    /* renamed from: c */
    public static final Class<?> f104571c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C41242ek(C41218dk dkVar) {
        super((C41314hk) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.gtm.bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.gtm.bk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.gtm.bk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> java.util.List<L> m167465f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.gtm.C41340im.m167753k(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41194ck
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.gtm.bk r0 = new com.google.android.gms.internal.gtm.bk
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41195cl
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41626uj
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.gtm.uj r0 = (com.google.android.gms.internal.gtm.C41626uj) r0
            com.google.android.gms.internal.gtm.uj r6 = r0.mo135130n(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.gtm.C41340im.m167766x(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class<?> r1 = f104571c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.gtm.C41340im.m167766x(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41220dm
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.gtm.bk r1 = new com.google.android.gms.internal.gtm.bk
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.gtm.dm r0 = (com.google.android.gms.internal.gtm.C41220dm) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.gtm.C41340im.m167766x(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41195cl
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.gtm.C41626uj
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.gtm.uj r1 = (com.google.android.gms.internal.gtm.C41626uj) r1
            boolean r2 = r1.mo135928d()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.gtm.uj r6 = r1.mo135130n(r0)
            com.google.android.gms.internal.gtm.C41340im.m167766x(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41242ek.m167465f(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: a */
    public final <L> List<L> mo135347a(Object obj, long j) {
        return m167465f(obj, j, 10);
    }

    /* renamed from: b */
    public final void mo135348b(Object obj, long j) {
        Object obj2;
        List list = (List) C41340im.m167753k(obj, j);
        if (list instanceof C41194ck) {
            obj2 = ((C41194ck) list).mo135125f();
        } else if (!f104571c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C41195cl) || !(list instanceof C41626uj)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C41626uj ujVar = (C41626uj) list;
                if (ujVar.mo135928d()) {
                    ujVar.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C41340im.m167766x(obj, j, obj2);
    }

    /* renamed from: c */
    public final <E> void mo135349c(Object obj, Object obj2, long j) {
        List list = (List) C41340im.m167753k(obj2, j);
        List f = m167465f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        C41340im.m167766x(obj, j, list);
    }

    public C41242ek() {
        super((C41314hk) null);
    }
}
