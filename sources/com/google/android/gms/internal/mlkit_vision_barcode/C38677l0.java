package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.l0 */
public final class C38677l0 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzbs f98006a;

    public C38677l0(zzbs zzbs) {
        this.f98006a = zzbs;
    }

    public final void clear() {
        this.f98006a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f98006a.containsKey(obj);
    }

    public final Iterator iterator() {
        zzbs zzbs = this.f98006a;
        Map l = zzbs.mo122612l();
        if (l != null) {
            return l.keySet().iterator();
        }
        return new C38599f0(zzbs);
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.f98006a.mo122612l();
        if (l != null) {
            return l.keySet().remove(obj);
        }
        if (this.f98006a.mo122623u(obj) == zzbs.f98384x) {
            return false;
        }
        return true;
    }

    public final int size() {
        return this.f98006a.size();
    }
}
