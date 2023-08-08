package com.google.android.datatransport;

import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: com.google.android.datatransport.d */
public abstract class C40083d<T> {
    /* renamed from: d */
    public static <T> C40083d<T> m163239d(int i, T t) {
        return new C40037a(Integer.valueOf(i), t, Priority.DEFAULT);
    }

    /* renamed from: e */
    public static <T> C40083d<T> m163240e(T t) {
        return new C40037a((Integer) null, t, Priority.DEFAULT);
    }

    /* renamed from: f */
    public static <T> C40083d<T> m163241f(int i, T t) {
        return new C40037a(Integer.valueOf(i), t, Priority.VERY_LOW);
    }

    /* renamed from: g */
    public static <T> C40083d<T> m163242g(T t) {
        return new C40037a((Integer) null, t, Priority.VERY_LOW);
    }

    /* renamed from: h */
    public static <T> C40083d<T> m163243h(int i, T t) {
        return new C40037a(Integer.valueOf(i), t, Priority.HIGHEST);
    }

    /* renamed from: i */
    public static <T> C40083d<T> m163244i(T t) {
        return new C40037a((Integer) null, t, Priority.HIGHEST);
    }

    @C0363p0
    /* renamed from: a */
    public abstract Integer mo132543a();

    /* renamed from: b */
    public abstract T mo132544b();

    /* renamed from: c */
    public abstract Priority mo132545c();
}
