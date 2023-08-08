package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* renamed from: com.google.firebase.perf.util.e */
public final class C33436e<T> {

    /* renamed from: a */
    public final T f81331a;

    public C33436e() {
        this.f81331a = null;
    }

    /* renamed from: a */
    public static <T> C33436e<T> m134825a() {
        return new C33436e<>();
    }

    /* renamed from: b */
    public static <T> C33436e<T> m134826b(T t) {
        return t == null ? m134825a() : m134827e(t);
    }

    /* renamed from: e */
    public static <T> C33436e<T> m134827e(T t) {
        return new C33436e<>(t);
    }

    /* renamed from: c */
    public T mo96911c() {
        T t = this.f81331a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean mo96912d() {
        return this.f81331a != null;
    }

    public C33436e(T t) {
        if (t != null) {
            this.f81331a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
