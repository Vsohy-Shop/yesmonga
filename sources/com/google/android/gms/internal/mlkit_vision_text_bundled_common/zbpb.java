package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import javax.annotation.CheckForNull;

final class zbpb<T> extends zbpl<T> {

    /* renamed from: a */
    public static final zbpb<Object> f71597a = new zbpb<>();

    private zbpb() {
    }

    /* renamed from: a */
    public final T mo84926a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final T mo84927b(T t) {
        return "";
    }

    /* renamed from: c */
    public final boolean mo84928c() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
