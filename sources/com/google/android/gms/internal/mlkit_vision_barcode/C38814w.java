package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.w */
public final class C38814w extends C38535a1 {

    /* renamed from: b */
    public final /* synthetic */ zzbe f98240b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38814w(zzbe zzbe, Map map) {
        super(map);
        this.f98240b = zzbe;
    }

    public final void clear() {
        C38803v0.m160193a(iterator());
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f97685a.keySet().containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj || this.f97685a.keySet().equals(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f97685a.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new C38802v(this, this.f97685a.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f97685a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzbe zzbe = this.f98240b;
        zzbe.f98383d = zzbe.f98383d - size;
        if (size > 0) {
            return true;
        }
        return false;
    }
}
