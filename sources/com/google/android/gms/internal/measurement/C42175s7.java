package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.s7 */
public final class C42175s7 {
    /* renamed from: a */
    public static C42124p7 m170814a(C42124p7 p7Var) {
        if ((p7Var instanceof C42158r7) || (p7Var instanceof zzin)) {
            return p7Var;
        }
        if (p7Var instanceof Serializable) {
            return new zzin(p7Var);
        }
        return new C42158r7(p7Var);
    }

    /* renamed from: b */
    public static C42124p7 m170815b(Object obj) {
        return new zziq(obj);
    }
}
