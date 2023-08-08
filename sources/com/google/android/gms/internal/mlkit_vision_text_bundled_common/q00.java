package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;

public final class q00<K, V> {

    /* renamed from: a */
    public final p00<K, V> f71413a;

    /* renamed from: b */
    public final K f71414b;

    /* renamed from: c */
    public final V f71415c;

    public q00(zbaay zbaay, K k, zbaay zbaay2, V v) {
        this.f71413a = new p00<>(zbaay, k, zbaay2, v);
        this.f71414b = k;
        this.f71415c = v;
    }

    /* renamed from: b */
    public static <K, V> int m120911b(p00<K, V> p00, K k, V v) {
        return C29133cz.m120261a(p00.f71394a, 1, k) + C29133cz.m120261a(p00.f71396c, 2, v);
    }

    /* renamed from: d */
    public static <K, V> q00<K, V> m120912d(zbaay zbaay, K k, zbaay zbaay2, V v) {
        return new q00<>(zbaay, k, zbaay2, v);
    }

    /* renamed from: e */
    public static <K, V> void m120913e(C29686ry ryVar, p00<K, V> p00, K k, V v) throws IOException {
        C29133cz.m120265l(ryVar, p00.f71394a, 1, k);
        C29133cz.m120265l(ryVar, p00.f71396c, 2, v);
    }

    /* renamed from: a */
    public final int mo84793a(int i, K k, V v) {
        int e = C29686ry.m121014e(i);
        int b = m120911b(this.f71413a, k, v);
        return e + C29686ry.m121015f(b) + b;
    }

    /* renamed from: c */
    public final p00<K, V> mo84794c() {
        return this.f71413a;
    }
}
