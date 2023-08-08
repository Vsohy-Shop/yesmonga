package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.ma */
public final class C38700ma {
    @C0363p0

    /* renamed from: a */
    public static C38687la f98045a;

    /* renamed from: a */
    public static synchronized C38557ba m160071a(C38800u9 u9Var) {
        C38557ba baVar;
        synchronized (C38700ma.class) {
            if (f98045a == null) {
                f98045a = new C38687la((C38674ka) null);
            }
            baVar = (C38557ba) f98045a.mo98709b(u9Var);
        }
        return baVar;
    }

    /* renamed from: b */
    public static synchronized C38557ba m160072b(String str) {
        C38557ba a;
        synchronized (C38700ma.class) {
            a = m160071a(C38800u9.m160189d(str).mo122477c());
        }
        return a;
    }
}
