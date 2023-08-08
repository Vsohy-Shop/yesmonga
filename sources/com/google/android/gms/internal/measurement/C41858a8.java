package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.a8 */
public final class C41858a8 extends C41894c8 {

    /* renamed from: a */
    public boolean f105992a;

    /* renamed from: b */
    public final /* synthetic */ Object f105993b;

    public C41858a8(Object obj) {
        this.f105993b = obj;
    }

    public final boolean hasNext() {
        return !this.f105992a;
    }

    public final Object next() {
        if (!this.f105992a) {
            this.f105992a = true;
            return this.f105993b;
        }
        throw new NoSuchElementException();
    }
}
