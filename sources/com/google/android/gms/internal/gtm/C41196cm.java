package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.gtm.cm */
public final class C41196cm implements Iterator<String> {

    /* renamed from: a */
    public final Iterator<String> f104504a;

    /* renamed from: b */
    public final /* synthetic */ C41220dm f104505b;

    public C41196cm(C41220dm dmVar) {
        this.f104505b = dmVar;
        this.f104504a = dmVar.f104551a.iterator();
    }

    public final boolean hasNext() {
        return this.f104504a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f104504a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
