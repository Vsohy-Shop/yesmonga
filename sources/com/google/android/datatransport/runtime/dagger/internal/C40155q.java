package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.q */
public final class C40155q<T> {

    /* renamed from: b */
    public static final String f102378b = "Set contributions cannot be null";

    /* renamed from: a */
    public final List<T> f102379a;

    public C40155q(int i) {
        this.f102379a = new ArrayList(i);
    }

    /* renamed from: d */
    public static <T> C40155q<T> m163388d(int i) {
        return new C40155q<>(i);
    }

    /* renamed from: a */
    public C40155q<T> mo132772a(T t) {
        this.f102379a.add(C40153o.m163384c(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public C40155q<T> mo132773b(Collection<? extends T> collection) {
        for (Object c : collection) {
            C40153o.m163384c(c, "Set contributions cannot be null");
        }
        this.f102379a.addAll(collection);
        return this;
    }

    /* renamed from: c */
    public Set<T> mo132774c() {
        int size = this.f102379a.size();
        if (size == 0) {
            return Collections.emptySet();
        }
        if (size != 1) {
            return Collections.unmodifiableSet(new HashSet(this.f102379a));
        }
        return Collections.singleton(this.f102379a.get(0));
    }
}
