package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zbqh<F, T> extends AbstractSequentialList<T> implements Serializable {
    final List<F> zba;
    final C29457lr<? super F, ? extends T> zbb;

    public zbqh(List<F> list, C29457lr<? super F, ? extends T> lrVar) {
        list.getClass();
        this.zba = list;
        lrVar.getClass();
        this.zbb = lrVar;
    }

    public final void clear() {
        this.zba.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C29200es(this, this.zba.listIterator(i));
    }

    public final int size() {
        return this.zba.size();
    }
}
