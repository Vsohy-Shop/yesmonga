package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.q7 */
public final class C39264q7 {
    @C0363p0

    /* renamed from: a */
    public static C39264q7 f100279a;

    /* renamed from: a */
    public static synchronized C39264q7 m161322a() {
        C39264q7 q7Var;
        synchronized (C39264q7.class) {
            if (f100279a == null) {
                f100279a = new C39264q7();
            }
            q7Var = f100279a;
        }
        return q7Var;
    }

    /* renamed from: b */
    public static final boolean m161323b() {
        return C39255p7.m161298a("mlkit-dev-profiling");
    }
}
