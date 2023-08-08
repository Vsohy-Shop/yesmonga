package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import javax.annotation.CheckForNull;

public abstract class zbpl<T> implements Serializable {
    /* renamed from: d */
    public static <T> zbpl<T> m121446d() {
        return zbpb.f71597a;
    }

    /* renamed from: e */
    public static <T> zbpl<T> m121447e(T t) {
        t.getClass();
        return new zbpq(t);
    }

    /* renamed from: a */
    public abstract T mo84926a();

    /* renamed from: b */
    public abstract T mo84927b(T t);

    /* renamed from: c */
    public abstract boolean mo84928c();

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract int hashCode();
}
