package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.mlkit_common.b9 */
public final class C42324b9 {
    @C0363p0

    /* renamed from: a */
    public static C42313a9 f106862a;

    /* renamed from: a */
    public static synchronized C42477p8 m171413a(C42400i8 i8Var) {
        C42477p8 p8Var;
        synchronized (C42324b9.class) {
            if (f106862a == null) {
                f106862a = new C42313a9((C42583z8) null);
            }
            p8Var = (C42477p8) f106862a.mo98709b(i8Var);
        }
        return p8Var;
    }

    /* renamed from: b */
    public static synchronized C42477p8 m171414b(String str) {
        C42477p8 a;
        synchronized (C42324b9.class) {
            a = m171413a(C42400i8.m171543d("common").mo137623c());
        }
        return a;
    }
}
