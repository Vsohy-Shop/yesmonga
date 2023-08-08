package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.s */
public final class C40159s<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f102386c = new Object();

    /* renamed from: d */
    public static final /* synthetic */ boolean f102387d = false;

    /* renamed from: a */
    public volatile Provider<T> f102388a;

    /* renamed from: b */
    public volatile Object f102389b = f102386c;

    public C40159s(Provider<T> provider) {
        this.f102388a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m163398a(P p) {
        if ((p instanceof C40159s) || (p instanceof C40140f)) {
            return p;
        }
        return new C40159s((Provider) C40153o.m163383b(p));
    }

    public T get() {
        T t = this.f102389b;
        if (t != f102386c) {
            return t;
        }
        Provider<T> provider = this.f102388a;
        if (provider == null) {
            return this.f102389b;
        }
        T t2 = provider.get();
        this.f102389b = t2;
        this.f102388a = null;
        return t2;
    }
}
