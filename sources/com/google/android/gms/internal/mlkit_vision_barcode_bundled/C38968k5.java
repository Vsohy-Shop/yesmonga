package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k5 */
public final class C38968k5 implements Iterator<String> {

    /* renamed from: a */
    public final Iterator<String> f98881a;

    /* renamed from: b */
    public final /* synthetic */ C38978l5 f98882b;

    public C38968k5(C38978l5 l5Var) {
        this.f98882b = l5Var;
        this.f98881a = l5Var.f98891a.iterator();
    }

    public final boolean hasNext() {
        return this.f98881a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f98881a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
