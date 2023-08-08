package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.b0 */
public final class C38547b0 extends C38850z implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C38560c0 f97706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38547b0(C38560c0 c0Var) {
        super(c0Var);
        this.f97706d = c0Var;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f97706d.isEmpty();
        mo122587b();
        ((ListIterator) this.f98297a).add(obj);
        zzbe zzbe = this.f97706d.f97743f;
        zzbe.f98383d = zzbe.f98383d + 1;
        if (isEmpty) {
            this.f97706d.mo122199e();
        }
    }

    public final boolean hasPrevious() {
        mo122587b();
        return ((ListIterator) this.f98297a).hasPrevious();
    }

    public final int nextIndex() {
        mo122587b();
        return ((ListIterator) this.f98297a).nextIndex();
    }

    public final Object previous() {
        mo122587b();
        return ((ListIterator) this.f98297a).previous();
    }

    public final int previousIndex() {
        mo122587b();
        return ((ListIterator) this.f98297a).previousIndex();
    }

    public final void set(Object obj) {
        mo122587b();
        ((ListIterator) this.f98297a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38547b0(C38560c0 c0Var, int i) {
        super(c0Var, ((List) c0Var.f97681b).listIterator(i));
        this.f97706d = c0Var;
    }
}
