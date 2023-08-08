package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.dm */
public final class C41220dm extends AbstractList<String> implements RandomAccess, C41194ck {

    /* renamed from: a */
    public final C41194ck f104551a;

    public C41220dm(C41194ck ckVar) {
        this.f104551a = ckVar;
    }

    /* renamed from: E0 */
    public final void mo135120E0(zztd zztd) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final C41194ck mo135125f() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C41170bk) this.f104551a).get(i);
    }

    public final Iterator<String> iterator() {
        return new C41196cm(this);
    }

    /* renamed from: j */
    public final List<?> mo135128j() {
        return this.f104551a.mo135128j();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C41172bm(this, i);
    }

    /* renamed from: m */
    public final Object mo135129m(int i) {
        return this.f104551a.mo135129m(i);
    }

    public final int size() {
        return this.f104551a.size();
    }
}
