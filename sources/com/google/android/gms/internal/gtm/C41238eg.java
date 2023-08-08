package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.gtm.eg */
public final class C41238eg implements Iterator<C41310hg<?>> {

    /* renamed from: a */
    public final /* synthetic */ Iterator f104568a;

    public C41238eg(C41310hg hgVar, Iterator it) {
        this.f104568a = it;
    }

    public final boolean hasNext() {
        return this.f104568a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C41599tg((String) this.f104568a.next());
    }

    public final void remove() {
        this.f104568a.remove();
    }
}
