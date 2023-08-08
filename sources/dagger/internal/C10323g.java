package dagger.internal;

import dagger.C10156e;
import javax.inject.Provider;

/* renamed from: dagger.internal.g */
public final class C10323g<T> implements Provider<T>, C10156e<T> {

    /* renamed from: c */
    public static final Object f27963c = new Object();

    /* renamed from: d */
    public static final /* synthetic */ boolean f27964d = false;

    /* renamed from: a */
    public volatile Provider<T> f27965a;

    /* renamed from: b */
    public volatile Object f27966b = f27963c;

    public C10323g(Provider<T> provider) {
        this.f27965a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> C10156e<T> m38524a(P p) {
        if (p instanceof C10156e) {
            return (C10156e) p;
        }
        return new C10323g((Provider) C10335o.m38550b(p));
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m38525b(P p) {
        C10335o.m38550b(p);
        if (p instanceof C10323g) {
            return p;
        }
        return new C10323g(p);
    }

    /* renamed from: c */
    public static Object m38526c(Object obj, Object obj2) {
        boolean z;
        if (obj != f27963c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f27966b;
        T t2 = f27963c;
        if (t == t2) {
            synchronized (this) {
                t = this.f27966b;
                if (t == t2) {
                    t = this.f27965a.get();
                    this.f27966b = m38526c(this.f27966b, t);
                    this.f27965a = null;
                }
            }
        }
        return t;
    }
}
