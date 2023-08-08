package dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: dagger.internal.d */
public final class C10320d {

    /* renamed from: a */
    public static final int f27961a = 1073741824;

    /* renamed from: a */
    public static int m38516a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m38517b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        if (list.size() != new HashSet(list).size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static <T> HashSet<T> m38518c(int i) {
        return new HashSet<>(m38516a(i));
    }

    /* renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m38519d(int i) {
        return new LinkedHashMap<>(m38516a(i));
    }

    /* renamed from: e */
    public static <T> List<T> m38520e(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }
}
