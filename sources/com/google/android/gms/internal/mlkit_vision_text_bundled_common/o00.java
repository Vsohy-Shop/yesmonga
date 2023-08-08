package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

public final class o00 implements k10 {

    /* renamed from: b */
    public static final v00 f71379b = new m00();

    /* renamed from: a */
    public final v00 f71380a;

    public o00() {
        v00 v00;
        v00[] v00Arr = new v00[2];
        v00Arr[0] = C29244fz.m120392c();
        try {
            v00 = (v00) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            v00 = f71379b;
        }
        v00Arr[1] = v00;
        n00 n00 = new n00(v00Arr);
        C29909xz.m121348f(n00, "messageInfoFactory");
        this.f71380a = n00;
    }

    /* renamed from: b */
    public static boolean m120822b(u00 u00) {
        return u00.mo84659z() == 1;
    }

    /* renamed from: a */
    public final <T> j10<T> mo84702a(Class<T> cls) {
        l10.m120686g(cls);
        u00 a = this.f71380a.mo84613a(cls);
        Class<C29502mz> cls2 = C29502mz.class;
        if (a.mo84657I()) {
            if (cls2.isAssignableFrom(cls)) {
                return b10.m120178i(l10.m120680b(), C29060az.m120175b(), a.mo84658i());
            }
            return b10.m120178i(l10.m120681b0(), C29060az.m120174a(), a.mo84658i());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m120822b(a)) {
                return a10.m120091G(cls, a, e10.m120331b(), k00.m120599d(), l10.m120680b(), C29060az.m120175b(), t00.m121158b());
            }
            return a10.m120091G(cls, a, e10.m120331b(), k00.m120599d(), l10.m120680b(), (C29945yy<?>) null, t00.m121158b());
        } else if (m120822b(a)) {
            return a10.m120091G(cls, a, e10.m120330a(), k00.m120598c(), l10.m120681b0(), C29060az.m120174a(), t00.m121157a());
        } else {
            return a10.m120091G(cls, a, e10.m120330a(), k00.m120598c(), l10.m120678a(), (C29945yy<?>) null, t00.m121157a());
        }
    }
}
