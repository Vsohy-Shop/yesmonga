package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import javax.annotation.CheckForNull;

final class zbpq<T> extends zbpl<T> {
    private final T zba;

    public zbpq(T t) {
        this.zba = t;
    }

    /* renamed from: a */
    public final T mo84926a() {
        return this.zba;
    }

    /* renamed from: b */
    public final T mo84927b(T t) {
        return this.zba;
    }

    /* renamed from: c */
    public final boolean mo84928c() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zbpq) {
            return this.zba.equals(((zbpq) obj).zba);
        }
        return false;
    }

    public final int hashCode() {
        return this.zba.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zba);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
