package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.gtm.sg */
public final class C41575sg implements Iterator<C41310hg<?>> {

    /* renamed from: a */
    public int f104961a = 0;

    /* renamed from: b */
    public final /* synthetic */ C41599tg f104962b;

    public C41575sg(C41599tg tgVar) {
        this.f104962b = tgVar;
    }

    public final boolean hasNext() {
        if (this.f104961a < this.f104962b.f105017b.length()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f104961a < this.f104962b.f105017b.length()) {
            int i = this.f104961a;
            this.f104961a = i + 1;
            return new C41358jg(Double.valueOf((double) i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
