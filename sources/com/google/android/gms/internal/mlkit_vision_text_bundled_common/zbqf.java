package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zbqf<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    final List<F> zba;
    final C29457lr<? super F, ? extends T> zbb;

    public zbqf(List<F> list, C29457lr<? super F, ? extends T> lrVar) {
        list.getClass();
        this.zba = list;
        lrVar.getClass();
        this.zbb = lrVar;
    }

    public final void clear() {
        this.zba.clear();
    }

    public final T get(int i) {
        return this.zbb.mo84712a(this.zba.get(i));
    }

    public final boolean isEmpty() {
        return this.zba.isEmpty();
    }

    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C29163ds(this, this.zba.listIterator(i));
    }

    public final T remove(int i) {
        return this.zbb.mo84712a(this.zba.remove(i));
    }

    public final int size() {
        return this.zba.size();
    }
}
