package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zzbq<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    final List<F> zza;
    final C30248va<? super F, ? extends T> zzb;

    public zzbq(List<F> list, C30248va<? super F, ? extends T> vaVar) {
        list.getClass();
        this.zza = list;
        vaVar.getClass();
        this.zzb = vaVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final T get(int i) {
        return this.zzb.mo85367b(this.zza.get(i));
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final ListIterator<T> listIterator(int i) {
        return new C30082i0(this, this.zza.listIterator(i));
    }

    public final T remove(int i) {
        return this.zzb.mo85367b(this.zza.remove(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
