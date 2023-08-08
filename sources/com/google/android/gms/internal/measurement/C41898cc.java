package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.cc */
public final class C41898cc implements Iterator {

    /* renamed from: a */
    public final Iterator f106054a;

    /* renamed from: b */
    public final /* synthetic */ C41916dc f106055b;

    public C41898cc(C41916dc dcVar) {
        this.f106055b = dcVar;
        this.f106054a = dcVar.f106080a.iterator();
    }

    public final boolean hasNext() {
        return this.f106054a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f106054a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
