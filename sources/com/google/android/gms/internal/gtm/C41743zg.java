package com.google.android.gms.internal.gtm;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.gtm.zg */
public abstract class C41743zg<E> extends AbstractList<E> implements C41626uj<E> {

    /* renamed from: a */
    public boolean f105325a = true;

    public void add(int i, E e) {
        mo136121e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo136121e();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo136121e();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo135928d() {
        return this.f105325a;
    }

    /* renamed from: e */
    public final void mo136121e() {
        if (!this.f105325a) {
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
        mo136121e();
        return super.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo136121e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo136121e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo136121e();
        return super.set(i, e);
    }

    public final void zzb() {
        this.f105325a = false;
    }

    public boolean add(E e) {
        mo136121e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo136121e();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo136121e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
