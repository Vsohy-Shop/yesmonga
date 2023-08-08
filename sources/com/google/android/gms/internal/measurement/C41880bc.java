package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.bc */
public final class C41880bc implements ListIterator {

    /* renamed from: a */
    public final ListIterator f106028a;

    /* renamed from: b */
    public final /* synthetic */ int f106029b;

    /* renamed from: c */
    public final /* synthetic */ C41916dc f106030c;

    public C41880bc(C41916dc dcVar, int i) {
        this.f106030c = dcVar;
        this.f106029b = i;
        this.f106028a = dcVar.f106080a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f106028a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f106028a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f106028a.next();
    }

    public final int nextIndex() {
        return this.f106028a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f106028a.previous();
    }

    public final int previousIndex() {
        return this.f106028a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
