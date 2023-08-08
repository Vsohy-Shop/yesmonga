package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzfj<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final zzfj f99144a;
    private boolean zzb = true;

    static {
        zzfj zzfj = new zzfj();
        f99144a = zzfj;
        zzfj.zzb = false;
    }

    private zzfj() {
    }

    /* renamed from: b */
    public static <K, V> zzfj<K, V> m161108b() {
        return f99144a;
    }

    /* renamed from: i */
    public static int m161109i(Object obj) {
        if (obj instanceof byte[]) {
            return C39084x2.m160966b((byte[]) obj);
        }
        if (!(obj instanceof C39021q2)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final zzfj<K, V> mo123209c() {
        return isEmpty() ? new zzfj<>() : new zzfj<>(this);
    }

    public final void clear() {
        mo123217j();
        super.clear();
    }

    /* renamed from: e */
    public final void mo123211e() {
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
    public final void mo123214f(zzfj<K, V> zzfj) {
        mo123217j();
        if (!zzfj.isEmpty()) {
            putAll(zzfj);
        }
    }

    /* renamed from: h */
    public final boolean mo123215h() {
        return this.zzb;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m161109i(entry.getValue()) ^ m161109i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo123217j() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final V put(K k, V v) {
        mo123217j();
        C39084x2.m160969e(k);
        C39084x2.m160969e(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo123217j();
        for (Object next : map.keySet()) {
            C39084x2.m160969e(next);
            C39084x2.m160969e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo123217j();
        return super.remove(obj);
    }

    public zzfj(Map<K, V> map) {
        super(map);
    }
}
