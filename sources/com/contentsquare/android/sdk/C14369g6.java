package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.contentsquare.android.sdk.g6 */
public final class C14369g6<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    public static final C14369g6<?, ?> f35546b;

    /* renamed from: a */
    public boolean f35547a = true;

    static {
        C14369g6<?, ?> g6Var = new C14369g6<>();
        f35546b = g6Var;
        g6Var.mo35357n();
    }

    public C14369g6() {
    }

    /* renamed from: b */
    public static int m61884b(Object obj) {
        if (obj instanceof byte[]) {
            return C14566o3.m62802d((byte[]) obj);
        }
        if (!(obj instanceof C14566o3.C14569c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public static <K, V> int m61885c(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m61884b(next.getValue()) ^ m61884b(next.getKey());
        }
        return i;
    }

    /* renamed from: f */
    public static boolean m61886f(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> boolean m61887h(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
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
            boolean r1 = m61886f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14369g6.m61887h(java.util.Map, java.util.Map):boolean");
    }

    /* renamed from: i */
    public static <K, V> C14369g6<K, V> m61888i() {
        return f35546b;
    }

    /* renamed from: j */
    public static void m61889j(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C14566o3.m62804f(next);
            C14566o3.m62804f(map.get(next));
        }
    }

    public void clear() {
        mo35355l();
        super.clear();
    }

    /* renamed from: e */
    public void mo35351e(C14369g6<K, V> g6Var) {
        mo35355l();
        if (!g6Var.isEmpty()) {
            putAll(g6Var);
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m61887h(this, (Map) obj);
    }

    public int hashCode() {
        return m61885c(this);
    }

    /* renamed from: l */
    public final void mo35355l() {
        if (!mo35356m()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: m */
    public boolean mo35356m() {
        return this.f35547a;
    }

    /* renamed from: n */
    public void mo35357n() {
        this.f35547a = false;
    }

    /* renamed from: o */
    public C14369g6<K, V> mo35358o() {
        return isEmpty() ? new C14369g6<>() : new C14369g6<>(this);
    }

    public V put(K k, V v) {
        mo35355l();
        C14566o3.m62804f(k);
        C14566o3.m62804f(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo35355l();
        m61889j(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo35355l();
        return super.remove(obj);
    }

    public C14369g6(Map<K, V> map) {
        super(map);
    }
}
