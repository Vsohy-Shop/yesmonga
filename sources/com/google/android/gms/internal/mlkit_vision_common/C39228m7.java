package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.m7 */
public final class C39228m7 {
    @C0363p0

    /* renamed from: a */
    public static C39219l7 f100186a;

    /* renamed from: a */
    public static synchronized C39136c7 m161281a(C39317w6 w6Var) {
        C39136c7 c7Var;
        synchronized (C39228m7.class) {
            if (f100186a == null) {
                f100186a = new C39219l7((C39210k7) null);
            }
            c7Var = (C39136c7) f100186a.mo98709b(w6Var);
        }
        return c7Var;
    }

    /* renamed from: b */
    public static synchronized C39136c7 m161282b(String str) {
        C39136c7 a;
        synchronized (C39228m7.class) {
            a = m161281a(C39317w6.m161368d("vision-common").mo123333c());
        }
        return a;
    }
}
