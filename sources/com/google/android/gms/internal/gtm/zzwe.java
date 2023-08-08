package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzwe<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final zzwe f105811a;
    private boolean zzb = true;

    static {
        zzwe zzwe = new zzwe();
        f105811a = zzwe;
        zzwe.zzb = false;
    }

    private zzwe() {
    }

    /* renamed from: b */
    public static <K, V> zzwe<K, V> m169007b() {
        return f105811a;
    }

    /* renamed from: i */
    public static int m169008i(Object obj) {
        if (obj instanceof byte[]) {
            return C41650vj.m168600b((byte[]) obj);
        }
        if (!(obj instanceof C41482oj)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final zzwe<K, V> mo136163c() {
        return isEmpty() ? new zzwe<>() : new zzwe<>(this);
    }

    public final void clear() {
        mo136171j();
        super.clear();
    }

    /* renamed from: e */
    public final void mo136165e() {
        this.zzb = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo136168f(zzwe<K, V> zzwe) {
        mo136171j();
        if (!zzwe.isEmpty()) {
            putAll(zzwe);
        }
    }

    /* renamed from: h */
    public final boolean mo136169h() {
        return this.zzb;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m169008i(entry.getValue()) ^ m169008i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo136171j() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final V put(K k, V v) {
        mo136171j();
        C41650vj.m168603e(k);
        C41650vj.m168603e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo136171j();
        for (Object next : map.keySet()) {
            C41650vj.m168603e(next);
            C41650vj.m168603e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo136171j();
        return super.remove(obj);
    }

    public zzwe(Map<K, V> map) {
        super(map);
    }
}
