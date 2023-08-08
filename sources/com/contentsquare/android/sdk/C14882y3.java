package com.contentsquare.android.sdk;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;

/* renamed from: com.contentsquare.android.sdk.y3 */
public final class C14882y3<E> implements ListIterator<E>, C11345a {

    /* renamed from: a */
    public final /* synthetic */ ListIterator<E> f36918a;

    public C14882y3(ListIterator<? extends E> listIterator) {
        Intrinsics.checkNotNullParameter(listIterator, "delegate");
        this.f36918a = listIterator;
    }

    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f36918a.hasNext();
    }

    public boolean hasPrevious() {
        return this.f36918a.hasPrevious();
    }

    public E next() {
        return this.f36918a.next();
    }

    public int nextIndex() {
        return this.f36918a.nextIndex();
    }

    public E previous() {
        return this.f36918a.previous();
    }

    public int previousIndex() {
        return this.f36918a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
