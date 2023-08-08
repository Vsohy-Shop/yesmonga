package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.gtm.ve */
public final class C41645ve<T> {

    /* renamed from: a */
    public Status f105160a;

    /* renamed from: b */
    public T f105161b;

    /* renamed from: c */
    public long f105162c;

    public C41645ve(Status status, T t, long j) {
        this.f105160a = status;
        this.f105161b = t;
        this.f105162c = j;
    }

    /* renamed from: a */
    public final long mo135976a() {
        return this.f105162c;
    }

    /* renamed from: b */
    public final void mo135977b(T t) {
        this.f105161b = t;
    }

    /* renamed from: c */
    public final void mo135978c(long j) {
        this.f105162c = j;
    }

    /* renamed from: d */
    public final void mo135979d(Status status) {
        this.f105160a = status;
    }
}
