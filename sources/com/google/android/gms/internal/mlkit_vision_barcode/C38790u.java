package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.u */
public final class C38790u extends C38561c1 {

    /* renamed from: d */
    public final transient Map f98186d;

    /* renamed from: e */
    public final /* synthetic */ zzbe f98187e;

    public C38790u(zzbe zzbe, Map map) {
        this.f98187e = zzbe;
        this.f98186d = map;
    }

    /* renamed from: a */
    public final Set<Map.Entry> mo122257a() {
        return new C38766s(this);
    }

    public final void clear() {
        if (this.f98186d == this.f98187e.f98382c) {
            this.f98187e.mo122602m();
        } else {
            C38803v0.m160193a(new C38778t(this));
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return C38574d1.m159890b(this.f98186d, obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj || this.f98186d.equals(obj)) {
            return true;
        }
        return false;
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) C38574d1.m159889a(this.f98186d, obj);
        if (collection == null) {
            return null;
        }
        return this.f98187e.mo122599f(obj, collection);
    }

    public final int hashCode() {
        return this.f98186d.hashCode();
    }

    public final Set keySet() {
        return this.f98187e.mo122299u();
    }

    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f98186d.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection e = this.f98187e.mo122598e();
        e.addAll(collection);
        zzbe zzbe = this.f98187e;
        zzbe.f98383d = zzbe.f98383d - collection.size();
        collection.clear();
        return e;
    }

    public final int size() {
        return this.f98186d.size();
    }

    public final String toString() {
        return this.f98186d.toString();
    }
}
