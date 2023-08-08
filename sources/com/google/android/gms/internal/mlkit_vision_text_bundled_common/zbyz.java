package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zbyz<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final zbyz f71693a;
    private boolean zbb = true;

    static {
        zbyz zbyz = new zbyz();
        f71693a = zbyz;
        zbyz.zbb = false;
    }

    private zbyz() {
    }

    /* renamed from: b */
    public static <K, V> zbyz<K, V> m121517b() {
        return f71693a;
    }

    /* renamed from: i */
    public static int m121518i(Object obj) {
        if (obj instanceof byte[]) {
            return C29909xz.m121344b((byte[]) obj);
        }
        if (!(obj instanceof C29576oz)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final zbyz<K, V> mo85006c() {
        return isEmpty() ? new zbyz<>() : new zbyz<>(this);
    }

    public final void clear() {
        mo85014j();
        super.clear();
    }

    /* renamed from: e */
    public final void mo85008e() {
        this.zbb = false;
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
    public final void mo85011f(zbyz<K, V> zbyz) {
        mo85014j();
        if (!zbyz.isEmpty()) {
            putAll(zbyz);
        }
    }

    /* renamed from: h */
    public final boolean mo85012h() {
        return this.zbb;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m121518i(entry.getValue()) ^ m121518i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo85014j() {
        if (!this.zbb) {
            throw new UnsupportedOperationException();
        }
    }

    public final V put(K k, V v) {
        mo85014j();
        C29909xz.m121347e(k);
        C29909xz.m121347e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo85014j();
        for (Object next : map.keySet()) {
            C29909xz.m121347e(next);
            C29909xz.m121347e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo85014j();
        return super.remove(obj);
    }

    public zbyz(Map<K, V> map) {
        super(map);
    }
}
