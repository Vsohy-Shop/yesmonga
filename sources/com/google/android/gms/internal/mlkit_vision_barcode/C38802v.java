package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.v */
public final class C38802v implements Iterator {
    @CheckForNull

    /* renamed from: a */
    public Map.Entry f98218a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f98219b;

    /* renamed from: c */
    public final /* synthetic */ C38814w f98220c;

    public C38802v(C38814w wVar, Iterator it) {
        this.f98220c = wVar;
        this.f98219b = it;
    }

    public final boolean hasNext() {
        return this.f98219b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f98219b.next();
        this.f98218a = entry;
        return entry.getKey();
    }

    public final void remove() {
        boolean z;
        if (this.f98218a != null) {
            z = true;
        } else {
            z = false;
        }
        C38728p.m160097d(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f98218a.getValue();
        this.f98219b.remove();
        zzbe zzbe = this.f98220c.f98240b;
        zzbe.f98383d = zzbe.f98383d - collection.size();
        collection.clear();
        this.f98218a = null;
    }
}
