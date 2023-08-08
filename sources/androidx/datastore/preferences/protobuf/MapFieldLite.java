package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final MapFieldLite f47668a;
    private boolean isMutable = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f47668a = mapFieldLite;
        mapFieldLite.mo54095o();
    }

    private MapFieldLite() {
    }

    /* renamed from: b */
    public static <K, V> int m85102b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m85103c(next.getValue()) ^ m85103c(next.getKey());
        }
        return i;
    }

    /* renamed from: c */
    public static int m85103c(Object obj) {
        if (obj instanceof byte[]) {
            return C18753i1.m86349m((byte[]) obj);
        }
        if (!(obj instanceof C18753i1.C18756c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public static void m85104e(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C18753i1.m86340d(next);
            C18753i1.m86340d(map.get(next));
        }
    }

    /* renamed from: f */
    public static Object m85105f(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: h */
    public static <K, V> Map<K, V> m85106h(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), m85105f(next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: i */
    public static <K, V> MapFieldLite<K, V> m85107i() {
        return f47668a;
    }

    /* renamed from: l */
    public static boolean m85108l(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> boolean m85109m(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m85108l(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MapFieldLite.m85109m(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        mo54093j();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m85109m(this, (Map) obj);
    }

    public int hashCode() {
        return m85102b(this);
    }

    /* renamed from: j */
    public final void mo54093j() {
        if (!mo54094n()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public boolean mo54094n() {
        return this.isMutable;
    }

    /* renamed from: o */
    public void mo54095o() {
        this.isMutable = false;
    }

    public V put(K k, V v) {
        mo54093j();
        C18753i1.m86340d(k);
        C18753i1.m86340d(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo54093j();
        m85104e(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo54093j();
        return super.remove(obj);
    }

    /* renamed from: s */
    public void mo54099s(MapFieldLite<K, V> mapFieldLite) {
        mo54093j();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    /* renamed from: t */
    public MapFieldLite<K, V> mo54100t() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    /* renamed from: u */
    public V mo54101u(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
    }
}
