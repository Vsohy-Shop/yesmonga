package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.m */
public final class C29466m implements ListIterator<String> {

    /* renamed from: a */
    public final ListIterator<String> f71347a;

    /* renamed from: b */
    public final /* synthetic */ int f71348b;

    /* renamed from: c */
    public final /* synthetic */ C29540o f71349c;

    public C29466m(C29540o oVar, int i) {
        this.f71349c = oVar;
        this.f71348b = i;
        this.f71347a = oVar.f71377a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f71347a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f71347a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f71347a.next();
    }

    public final int nextIndex() {
        return this.f71347a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f71347a.previous();
    }

    public final int previousIndex() {
        return this.f71347a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
