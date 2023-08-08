package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzbs<F, T> extends AbstractSequentialList<T> implements Serializable {
    final List<F> zza;
    final C30248va<? super F, ? extends T> zzb;

    public zzbs(List<F> list, C30248va<? super F, ? extends T> vaVar) {
        list.getClass();
        this.zza = list;
        vaVar.getClass();
        this.zzb = vaVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C30094j0(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
