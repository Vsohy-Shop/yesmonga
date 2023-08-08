package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
public final class C42047l implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f106276a;

    public C42047l(Iterator it) {
        this.f106276a = it;
    }

    public final boolean hasNext() {
        return this.f106276a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C42201u((String) this.f106276a.next());
    }
}
