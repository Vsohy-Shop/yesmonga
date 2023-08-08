package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ej */
public final class C41241ej implements C41579sk {

    /* renamed from: a */
    public static final C41241ej f104570a = new C41241ej();

    /* renamed from: c */
    public static C41241ej m167462c() {
        return f104570a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.C41555rk mo135345a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.gtm.lj> r0 = com.google.android.gms.internal.gtm.C41410lj.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            int r1 = r5.length()
            java.lang.String r2 = "Unsupported message type: "
            if (r1 == 0) goto L_0x001b
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.gtm.lj r0 = com.google.android.gms.internal.gtm.C41410lj.m168014o(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo134974A(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            com.google.android.gms.internal.gtm.rk r0 = (com.google.android.gms.internal.gtm.C41555rk) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            java.lang.String r3 = "Unable to get message info for "
            if (r2 == 0) goto L_0x0049
            java.lang.String r5 = r3.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41241ej.mo135345a(java.lang.Class):com.google.android.gms.internal.gtm.rk");
    }

    /* renamed from: b */
    public final boolean mo135346b(Class<?> cls) {
        return C41410lj.class.isAssignableFrom(cls);
    }
}
