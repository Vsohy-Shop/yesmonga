package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.C40129e;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.f */
public final class C40140f<T> implements Provider<T>, C40129e<T> {

    /* renamed from: c */
    public static final Object f102368c = new Object();

    /* renamed from: d */
    public static final /* synthetic */ boolean f102369d = false;

    /* renamed from: a */
    public volatile Provider<T> f102370a;

    /* renamed from: b */
    public volatile Object f102371b = f102368c;

    public C40140f(Provider<T> provider) {
        this.f102370a = provider;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> C40129e<T> m163357a(P p) {
        if (p instanceof C40129e) {
            return (C40129e) p;
        }
        return new C40140f((Provider) C40153o.m163383b(p));
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m163358b(P p) {
        C40153o.m163383b(p);
        if (p instanceof C40140f) {
            return p;
        }
        return new C40140f(p);
    }

    /* renamed from: c */
    public static Object m163359c(Object obj, Object obj2) {
        boolean z;
        if (obj == f102368c || (obj instanceof C40152n)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f102371b;
        T t2 = f102368c;
        if (t == t2) {
            synchronized (this) {
                t = this.f102371b;
                if (t == t2) {
                    t = this.f102370a.get();
                    this.f102371b = m163359c(this.f102371b, t);
                    this.f102370a = null;
                }
            }
        }
        return t;
    }
}
