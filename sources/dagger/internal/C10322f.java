package dagger.internal;

import javax.inject.Provider;

/* renamed from: dagger.internal.f */
public final class C10322f<T> implements C10324h<T> {

    /* renamed from: a */
    public Provider<T> f27962a;

    /* renamed from: b */
    public static <T> void m38521b(Provider<T> provider, Provider<T> provider2) {
        C10335o.m38550b(provider2);
        C10322f fVar = (C10322f) provider;
        if (fVar.f27962a == null) {
            fVar.f27962a = provider2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public Provider<T> mo21723a() {
        return (Provider) C10335o.m38550b(this.f27962a);
    }

    @Deprecated
    /* renamed from: c */
    public void mo21724c(Provider<T> provider) {
        m38521b(this, provider);
    }

    public T get() {
        Provider<T> provider = this.f27962a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
