package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
public final class C41921e implements Iterator {

    /* renamed from: a */
    public int f106087a = 0;

    /* renamed from: b */
    public final /* synthetic */ C41939f f106088b;

    public C41921e(C41939f fVar) {
        this.f106088b = fVar;
    }

    public final boolean hasNext() {
        return this.f106087a < this.f106088b.mo136726A();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f106087a < this.f106088b.mo136726A()) {
            C41939f fVar = this.f106088b;
            int i = this.f106087a;
            this.f106087a = i + 1;
            return fVar.mo136727H(i);
        }
        int i2 = this.f106087a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
