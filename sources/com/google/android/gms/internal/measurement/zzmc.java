package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzmc extends LinkedHashMap {

    /* renamed from: a */
    public static final zzmc f106775a;
    private boolean zzb = true;

    static {
        zzmc zzmc = new zzmc();
        f106775a = zzmc;
        zzmc.zzb = false;
    }

    private zzmc() {
    }

    /* renamed from: b */
    public static zzmc m171379b() {
        return f106775a;
    }

    /* renamed from: i */
    public static int m171380i(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = C41860aa.f105998d;
            int length = bArr.length;
            int b = C41860aa.m169667b(length, bArr, 0, length);
            if (b == 0) {
                return 1;
            }
            return b;
        } else if (!(obj instanceof C42211u9)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final zzmc mo137607c() {
        return isEmpty() ? new zzmc() : new zzmc(this);
    }

    public final void clear() {
        mo137615j();
        super.clear();
    }

    /* renamed from: e */
    public final void mo137609e() {
        this.zzb = false;
    }

    public final Set entrySet() {
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
    public final void mo137612f(zzmc zzmc) {
        mo137615j();
        if (!zzmc.isEmpty()) {
            putAll(zzmc);
        }
    }

    /* renamed from: h */
    public final boolean mo137613h() {
        return this.zzb;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m171380i(entry.getValue()) ^ m171380i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo137615j() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        mo137615j();
        byte[] bArr = C41860aa.f105998d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo137615j();
        for (Object next : map.keySet()) {
            byte[] bArr = C41860aa.f105998d;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo137615j();
        return super.remove(obj);
    }

    public zzmc(Map map) {
        super(map);
    }
}
