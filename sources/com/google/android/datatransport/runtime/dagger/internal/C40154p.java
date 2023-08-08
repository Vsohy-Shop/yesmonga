package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.C40129e;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.p */
public final class C40154p<T> implements Provider<C40129e<T>> {

    /* renamed from: b */
    public static final /* synthetic */ boolean f102376b = false;

    /* renamed from: a */
    public final Provider<T> f102377a;

    public C40154p(Provider<T> provider) {
        this.f102377a = provider;
    }

    /* renamed from: a */
    public static <T> Provider<C40129e<T>> m163386a(Provider<T> provider) {
        return new C40154p((Provider) C40153o.m163383b(provider));
    }

    /* renamed from: b */
    public C40129e<T> get() {
        return C40140f.m163357a(this.f102377a);
    }
}
