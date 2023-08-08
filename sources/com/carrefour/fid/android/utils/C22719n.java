package com.carrefour.fid.android.utils;

import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.utils.n */
public final class C22719n<T> {

    /* renamed from: a */
    public final T f58218a;

    /* renamed from: b */
    public boolean f58219b;

    public C22719n(T t) {
        this.f58218a = t;
    }

    @C12580l
    /* renamed from: a */
    public final T mo67133a() {
        if (this.f58219b) {
            return null;
        }
        this.f58219b = true;
        return this.f58218a;
    }

    /* renamed from: b */
    public final boolean mo67134b() {
        return this.f58219b;
    }

    /* renamed from: c */
    public final T mo67135c() {
        return this.f58218a;
    }
}
