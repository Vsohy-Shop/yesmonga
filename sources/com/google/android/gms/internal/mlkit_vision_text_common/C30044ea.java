package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ea */
public final class C30044ea {
    @C0363p0

    /* renamed from: a */
    public static C30032da f71832a;

    /* renamed from: a */
    public static synchronized C30223t9 m121655a(C30151n9 n9Var) {
        C30223t9 t9Var;
        synchronized (C30044ea.class) {
            if (f71832a == null) {
                f71832a = new C30032da((C30020ca) null);
            }
            t9Var = (C30223t9) f71832a.mo98709b(n9Var);
        }
        return t9Var;
    }

    /* renamed from: b */
    public static synchronized C30223t9 m121656b(String str) {
        C30223t9 a;
        synchronized (C30044ea.class) {
            a = m121655a(C30151n9.m121804d(str).mo85184c());
        }
        return a;
    }
}
