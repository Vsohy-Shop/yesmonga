package com.google.android.gms.internal.gtm;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.gtm.bm */
public final class C41172bm implements ListIterator<String> {

    /* renamed from: a */
    public final ListIterator<String> f104478a;

    /* renamed from: b */
    public final /* synthetic */ int f104479b;

    /* renamed from: c */
    public final /* synthetic */ C41220dm f104480c;

    public C41172bm(C41220dm dmVar, int i) {
        this.f104480c = dmVar;
        this.f104479b = i;
        this.f104478a = dmVar.f104551a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f104478a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f104478a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f104478a.next();
    }

    public final int nextIndex() {
        return this.f104478a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f104478a.previous();
    }

    public final int previousIndex() {
        return this.f104478a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
