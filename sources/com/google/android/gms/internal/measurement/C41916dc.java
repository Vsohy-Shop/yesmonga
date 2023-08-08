package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: com.google.android.gms.internal.measurement.dc */
public final class C41916dc extends AbstractList implements RandomAccess, C41932ea {

    /* renamed from: a */
    public final C41932ea f106080a;

    public C41916dc(C41932ea eaVar) {
        this.f106080a = eaVar;
    }

    /* renamed from: f */
    public final C41932ea mo136693f() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C41914da) this.f106080a).get(i);
    }

    public final Iterator iterator() {
        return new C41898cc(this);
    }

    /* renamed from: j */
    public final List mo136696j() {
        return this.f106080a.mo136696j();
    }

    /* renamed from: j2 */
    public final void mo136697j2(zzka zzka) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new C41880bc(this, i);
    }

    /* renamed from: m */
    public final Object mo136698m(int i) {
        return this.f106080a.mo136698m(i);
    }

    public final int size() {
        return this.f106080a.size();
    }
}
