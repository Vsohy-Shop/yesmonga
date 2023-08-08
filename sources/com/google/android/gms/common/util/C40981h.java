package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.collection.C1869c;
import com.google.android.gms.common.annotation.C40473a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C40473a
/* renamed from: com.google.android.gms.common.util.h */
public final class C40981h {
    @C40473a
    /* renamed from: a */
    public static boolean m166620a(@C0363p0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m166621b() {
        return Collections.emptyList();
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m166622c(@C0359n0 T t) {
        return Collections.singletonList(t);
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: d */
    public static <T> List<T> m166623d(@C0359n0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m166621b();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m166622c(tArr[0]);
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static <K, V> Map<K, V> m166624e(@C0359n0 K k, @C0359n0 V v, @C0359n0 K k2, @C0359n0 V v2, @C0359n0 K k3, @C0359n0 V v3) {
        Map k4 = m166630k(3, false);
        k4.put(k, v);
        k4.put(k2, v2);
        k4.put(k3, v3);
        return Collections.unmodifiableMap(k4);
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public static <K, V> Map<K, V> m166625f(@C0359n0 K k, @C0359n0 V v, @C0359n0 K k2, @C0359n0 V v2, @C0359n0 K k3, @C0359n0 V v3, @C0359n0 K k4, @C0359n0 V v4, @C0359n0 K k5, @C0359n0 V v5, @C0359n0 K k6, @C0359n0 V v6) {
        Map k7 = m166630k(6, false);
        k7.put(k, v);
        k7.put(k2, v2);
        k7.put(k3, v3);
        k7.put(k4, v4);
        k7.put(k5, v5);
        k7.put(k6, v6);
        return Collections.unmodifiableMap(k7);
    }

    @C40473a
    @C0359n0
    /* renamed from: g */
    public static <K, V> Map<K, V> m166626g(@C0359n0 K[] kArr, @C0359n0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map k = m166630k(length, false);
            for (int i = 0; i < kArr.length; i++) {
                k.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(k);
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public static <T> Set<T> m166627h(int i) {
        if (i == 0) {
            return new C1869c();
        }
        return m166631l(i, true);
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: i */
    public static <T> Set<T> m166628i(@C0359n0 T t, @C0359n0 T t2, @C0359n0 T t3) {
        Set l = m166631l(3, false);
        l.add(t);
        l.add(t2);
        l.add(t3);
        return Collections.unmodifiableSet(l);
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: j */
    public static <T> Set<T> m166629j(@C0359n0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set l = m166631l(2, false);
            l.add(t);
            l.add(t2);
            return Collections.unmodifiableSet(l);
        } else if (length == 3) {
            return m166628i(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set l2 = m166631l(length, false);
                Collections.addAll(l2, tArr);
                return Collections.unmodifiableSet(l2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set l3 = m166631l(4, false);
            l3.add(t3);
            l3.add(t4);
            l3.add(t5);
            l3.add(t6);
            return Collections.unmodifiableSet(l3);
        }
    }

    /* renamed from: k */
    public static Map m166630k(int i, boolean z) {
        if (i <= 256) {
            return new C1866a(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: l */
    public static Set m166631l(int i, boolean z) {
        float f;
        int i2;
        if (true != z) {
            f = 1.0f;
        } else {
            f = 0.75f;
        }
        if (true != z) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        if (i <= i2) {
            return new C1869c(i);
        }
        return new HashSet(i, f);
    }
}
