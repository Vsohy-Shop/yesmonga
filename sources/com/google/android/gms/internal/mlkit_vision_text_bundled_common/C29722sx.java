package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sx */
public abstract class C29722sx<E> extends AbstractList<E> implements C29872wz<E> {

    /* renamed from: a */
    public boolean f71459a = true;

    /* renamed from: I */
    public final void mo84834I() {
        this.f71459a = false;
    }

    public void add(int i, E e) {
        mo84835e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo84835e();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo84835e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo84835e() {
        if (!this.f71459a) {
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
        mo84835e();
        return super.remove(i);
    }

    public final boolean removeAll(Collection<?> collection) {
        mo84835e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo84835e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo84835e();
        return super.set(i, e);
    }

    /* renamed from: z */
    public final boolean mo84839z() {
        return this.f71459a;
    }

    public boolean add(E e) {
        mo84835e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo84835e();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo84835e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
