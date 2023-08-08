package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.gtm.ng */
public final class C41455ng implements Iterator<C41310hg<?>> {

    /* renamed from: a */
    public int f104817a = 0;

    /* renamed from: b */
    public final /* synthetic */ C41503pg f104818b;

    public C41455ng(C41503pg pgVar) {
        this.f104818b = pgVar;
    }

    /* renamed from: b */
    public final C41310hg<?> next() {
        if (this.f104817a < this.f104818b.f104886b.size()) {
            for (int i = this.f104817a; i < this.f104818b.f104886b.size(); i++) {
                if (this.f104818b.f104886b.get(i) != null) {
                    this.f104817a = i;
                    this.f104817a = i + 1;
                    return new C41358jg(Double.valueOf((double) i));
                }
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        for (int i = this.f104817a; i < this.f104818b.f104886b.size(); i++) {
            if (this.f104818b.f104886b.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
