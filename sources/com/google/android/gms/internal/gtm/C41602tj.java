package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.tj */
public final class C41602tj<F, T> extends AbstractList<T> {

    /* renamed from: a */
    public final List<F> f105021a;

    /* renamed from: b */
    public final C41578sj<F, T> f105022b;

    public C41602tj(List<F> list, C41578sj<F, T> sjVar) {
        this.f105021a = list;
        this.f105022b = sjVar;
    }

    public final T get(int i) {
        return this.f105022b.mo135549a(this.f105021a.get(i));
    }

    public final int size() {
        return this.f105021a.size();
    }
}
