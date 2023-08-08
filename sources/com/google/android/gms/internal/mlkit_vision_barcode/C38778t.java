package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.t */
public final class C38778t implements Iterator<Map.Entry> {

    /* renamed from: a */
    public final Iterator<Map.Entry> f98155a;
    @CheckForNull

    /* renamed from: b */
    public Collection f98156b;

    /* renamed from: c */
    public final /* synthetic */ C38790u f98157c;

    public C38778t(C38790u uVar) {
        this.f98157c = uVar;
        this.f98155a = uVar.f98186d.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f98155a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.f98155a.next();
        this.f98156b = (Collection) next.getValue();
        C38790u uVar = this.f98157c;
        Object key = next.getKey();
        return new zzby(key, uVar.f98187e.mo122599f(key, (Collection) next.getValue()));
    }

    public final void remove() {
        boolean z;
        if (this.f98156b != null) {
            z = true;
        } else {
            z = false;
        }
        C38728p.m160097d(z, "no calls to next() since the last call to remove()");
        this.f98155a.remove();
        zzbe zzbe = this.f98157c.f98187e;
        zzbe.f98383d = zzbe.f98383d - this.f98156b.size();
        this.f98156b.clear();
        this.f98156b = null;
    }
}
