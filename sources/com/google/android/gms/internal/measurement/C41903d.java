package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C41903d implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f106060a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f106061b;

    public C41903d(C41939f fVar, Iterator it, Iterator it2) {
        this.f106060a = it;
        this.f106061b = it2;
    }

    public final boolean hasNext() {
        if (this.f106060a.hasNext()) {
            return true;
        }
        return this.f106061b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f106060a.hasNext()) {
            return new C42201u(((Integer) this.f106060a.next()).toString());
        }
        if (this.f106061b.hasNext()) {
            return new C42201u((String) this.f106061b.next());
        }
        throw new NoSuchElementException();
    }
}
