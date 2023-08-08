package dagger.internal;

import dagger.C10156e;
import javax.inject.Provider;

/* renamed from: dagger.internal.p */
public final class C10336p<T> implements Provider<C10156e<T>> {

    /* renamed from: b */
    public static final /* synthetic */ boolean f27971b = false;

    /* renamed from: a */
    public final Provider<T> f27972a;

    public C10336p(Provider<T> provider) {
        this.f27972a = provider;
    }

    /* renamed from: a */
    public static <T> Provider<C10156e<T>> m38555a(Provider<T> provider) {
        return new C10336p((Provider) C10335o.m38550b(provider));
    }

    /* renamed from: b */
    public C10156e<T> get() {
        return C10323g.m38524a(this.f27972a);
    }
}
