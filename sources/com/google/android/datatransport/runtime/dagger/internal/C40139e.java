package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.e */
public final class C40139e<T> implements C40141g<T> {

    /* renamed from: a */
    public Provider<T> f102367a;

    /* renamed from: b */
    public static <T> void m163354b(Provider<T> provider, Provider<T> provider2) {
        C40153o.m163383b(provider2);
        C40139e eVar = (C40139e) provider;
        if (eVar.f102367a == null) {
            eVar.f102367a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Provider<T> mo132757a() {
        return (Provider) C40153o.m163383b(this.f102367a);
    }

    @Deprecated
    /* renamed from: c */
    public void mo132758c(Provider<T> provider) {
        m163354b(this, provider);
    }

    public T get() {
        Provider<T> provider = this.f102367a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
