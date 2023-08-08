package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.C40129e;

/* renamed from: com.google.android.datatransport.runtime.dagger.internal.j */
public final class C40144j<T> implements C40141g<T>, C40129e<T> {

    /* renamed from: b */
    public static final C40144j<Object> f102372b = new C40144j<>((Object) null);

    /* renamed from: a */
    public final T f102373a;

    public C40144j(T t) {
        this.f102373a = t;
    }

    /* renamed from: a */
    public static <T> C40141g<T> m163360a(T t) {
        return new C40144j(C40153o.m163384c(t, "instance cannot be null"));
    }

    /* renamed from: b */
    public static <T> C40141g<T> m163361b(T t) {
        if (t == null) {
            return m163362c();
        }
        return new C40144j(t);
    }

    /* renamed from: c */
    public static <T> C40144j<T> m163362c() {
        return f102372b;
    }

    public T get() {
        return this.f102373a;
    }
}
