package com.google.protobuf;

import com.google.protobuf.C34363f1;
import java.util.Map;

/* renamed from: com.google.protobuf.h1 */
public class C34375h1 implements C34371g1 {
    /* renamed from: i */
    public static <K, V> int m139280i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C34363f1 f1Var = (C34363f1) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += f1Var.mo101046a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> MapFieldLite<K, V> m139281j(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.mo100543n()) {
                mapFieldLite = mapFieldLite.mo100549t();
            }
            mapFieldLite.mo100548s(mapFieldLite2);
        }
        return mapFieldLite;
    }

    /* renamed from: a */
    public Object mo101106a(Object obj, Object obj2) {
        return m139281j(obj, obj2);
    }

    /* renamed from: b */
    public C34363f1.C34365b<?, ?> mo101107b(Object obj) {
        return ((C34363f1) obj).mo101048d();
    }

    /* renamed from: c */
    public Map<?, ?> mo101108c(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: d */
    public Object mo101109d(Object obj) {
        return MapFieldLite.m138446i().mo100549t();
    }

    /* renamed from: e */
    public Map<?, ?> mo101110e(Object obj) {
        return (MapFieldLite) obj;
    }

    /* renamed from: f */
    public Object mo101111f(Object obj) {
        ((MapFieldLite) obj).mo100544o();
        return obj;
    }

    /* renamed from: g */
    public int mo101112g(int i, Object obj, Object obj2) {
        return m139280i(i, obj, obj2);
    }

    /* renamed from: h */
    public boolean mo101113h(Object obj) {
        return !((MapFieldLite) obj).mo100543n();
    }
}
