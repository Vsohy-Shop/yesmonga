package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a1 */
public abstract class C38864a1<E> extends AbstractList<E> implements C39075w2<E> {

    /* renamed from: a */
    public boolean f98800a = true;

    public void add(int i, E e) {
        mo122768e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo122768e();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo122768e();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo122767d() {
        return this.f98800a;
    }

    /* renamed from: e */
    public final void mo122768e() {
        if (!this.f98800a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public E remove(int i) {
        mo122768e();
        return super.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo122768e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo122768e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo122768e();
        return super.set(i, e);
    }

    public final void zzb() {
        this.f98800a = false;
    }

    public boolean add(E e) {
        mo122768e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo122768e();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo122768e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
