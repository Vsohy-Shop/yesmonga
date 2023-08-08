package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l5 */
public final class C38978l5 extends AbstractList<String> implements RandomAccess, C38906e3 {

    /* renamed from: a */
    public final C38906e3 f98891a;

    public C38978l5(C38906e3 e3Var) {
        this.f98891a = e3Var;
    }

    /* renamed from: f */
    public final C38906e3 mo122839f() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C38896d3) this.f98891a).get(i);
    }

    public final Iterator<String> iterator() {
        return new C38968k5(this);
    }

    /* renamed from: j */
    public final List<?> mo122842j() {
        return this.f98891a.mo122842j();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C38958j5(this, i);
    }

    /* renamed from: m */
    public final Object mo122843m(int i) {
        return this.f98891a.mo122843m(i);
    }

    public final int size() {
        return this.f98891a.size();
    }
}
