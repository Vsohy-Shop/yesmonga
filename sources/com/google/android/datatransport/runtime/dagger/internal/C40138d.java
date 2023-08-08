package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.d */
public final class C40138d {

    /* renamed from: a */
    public static final int f102366a = 1073741824;

    /* renamed from: a */
    public static int m163349a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m163350b(List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        if (list.size() != new HashSet(list).size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static <T> HashSet<T> m163351c(int i) {
        return new HashSet<>(m163349a(i));
    }

    /* renamed from: d */
    public static <K, V> LinkedHashMap<K, V> m163352d(int i) {
        return new LinkedHashMap<>(m163349a(i));
    }

    /* renamed from: e */
    public static <T> List<T> m163353e(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }
}
