package dagger.internal;

import dagger.C10156e;

/* renamed from: dagger.internal.k */
public final class C10327k<T> implements C10324h<T>, C10156e<T> {

    /* renamed from: b */
    public static final C10327k<Object> f27967b = new C10327k<>((Object) null);

    /* renamed from: a */
    public final T f27968a;

    public C10327k(T t) {
        this.f27968a = t;
    }

    /* renamed from: a */
    public static <T> C10324h<T> m38527a(T t) {
        return new C10327k(C10335o.m38551c(t, "instance cannot be null"));
    }

    /* renamed from: b */
    public static <T> C10324h<T> m38528b(T t) {
        if (t == null) {
            return m38529c();
        }
        return new C10327k(t);
    }

    /* renamed from: c */
    public static <T> C10327k<T> m38529c() {
        return f27967b;
    }

    public T get() {
        return this.f27968a;
    }
}
