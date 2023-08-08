package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.z */
public class C38850z implements Iterator {

    /* renamed from: a */
    public final Iterator f98297a;

    /* renamed from: b */
    public final Collection f98298b;

    /* renamed from: c */
    public final /* synthetic */ C38534a0 f98299c;

    public C38850z(C38534a0 a0Var, Iterator it) {
        this.f98299c = a0Var;
        this.f98298b = a0Var.f97681b;
        this.f98297a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo122587b() {
        this.f98299c.zzb();
        if (this.f98299c.f97681b != this.f98298b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo122587b();
        return this.f98297a.hasNext();
    }

    public final Object next() {
        mo122587b();
        return this.f98297a.next();
    }

    public final void remove() {
        this.f98297a.remove();
        zzbe zzbe = this.f98299c.f97684e;
        zzbe.f98383d = zzbe.f98383d - 1;
        this.f98299c.mo122201h();
    }

    public C38850z(C38534a0 a0Var) {
        Iterator it;
        this.f98299c = a0Var;
        Collection collection = a0Var.f97681b;
        this.f98298b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f98297a = it;
    }
}
