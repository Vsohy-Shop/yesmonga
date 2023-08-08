package dagger.internal;

import javax.inject.Provider;

/* renamed from: dagger.internal.u */
public final class C10343u<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f27981c = new Object();

    /* renamed from: d */
    public static final /* synthetic */ boolean f27982d = false;

    /* renamed from: a */
    public volatile Provider<T> f27983a;

    /* renamed from: b */
    public volatile Object f27984b = f27981c;

    public C10343u(Provider<T> provider) {
        this.f27983a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m38567a(P p) {
        if ((p instanceof C10343u) || (p instanceof C10323g)) {
            return p;
        }
        return new C10343u((Provider) C10335o.m38550b(p));
    }

    public T get() {
        T t = this.f27984b;
        if (t != f27981c) {
            return t;
        }
        Provider<T> provider = this.f27983a;
        if (provider == null) {
            return this.f27984b;
        }
        T t2 = provider.get();
        this.f27984b = t2;
        this.f27983a = null;
        return t2;
    }
}
