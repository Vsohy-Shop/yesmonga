package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s */
public final class C30871s implements Iterator {

    /* renamed from: a */
    public final Iterator f73927a;

    /* renamed from: b */
    public final /* synthetic */ zzau f73928b;

    public C30871s(zzau zzau) {
        this.f73928b = zzau;
        this.f73927a = zzau.f74162a.keySet().iterator();
    }

    /* renamed from: b */
    public final String next() {
        return (String) this.f73927a.next();
    }

    public final boolean hasNext() {
        return this.f73927a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
