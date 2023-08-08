package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.n0 */
public final class C38703n0 extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ zzbs f98046a;

    public C38703n0(zzbs zzbs) {
        this.f98046a = zzbs;
    }

    public final void clear() {
        this.f98046a.clear();
    }

    public final Iterator iterator() {
        zzbs zzbs = this.f98046a;
        Map l = zzbs.mo122612l();
        if (l != null) {
            return l.values().iterator();
        }
        return new C38625h0(zzbs);
    }

    public final int size() {
        return this.f98046a.size();
    }
}
