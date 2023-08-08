package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j5 */
public final class C38958j5 implements ListIterator<String> {

    /* renamed from: a */
    public final ListIterator<String> f98878a;

    /* renamed from: b */
    public final /* synthetic */ int f98879b;

    /* renamed from: c */
    public final /* synthetic */ C38978l5 f98880c;

    public C38958j5(C38978l5 l5Var, int i) {
        this.f98880c = l5Var;
        this.f98879b = i;
        this.f98878a = l5Var.f98891a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f98878a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f98878a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f98878a.next();
    }

    public final int nextIndex() {
        return this.f98878a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f98878a.previous();
    }

    public final int previousIndex() {
        return this.f98878a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
