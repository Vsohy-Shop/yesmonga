package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.gtm.og */
public final class C41479og implements Iterator<C41310hg<?>> {

    /* renamed from: a */
    public final /* synthetic */ Iterator f104845a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f104846b;

    public C41479og(C41503pg pgVar, Iterator it, Iterator it2) {
        this.f104845a = it;
        this.f104846b = it2;
    }

    public final boolean hasNext() {
        if (this.f104845a.hasNext() || this.f104846b.hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f104845a.hasNext()) {
            return ((C41455ng) this.f104845a).next();
        }
        return (C41310hg) this.f104846b.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
