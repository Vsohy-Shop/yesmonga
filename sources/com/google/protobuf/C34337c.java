package com.google.protobuf;

import com.google.protobuf.C34471v0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
public abstract class C34337c<E> extends AbstractList<E> implements C34471v0.C34488k<E> {

    /* renamed from: b */
    public static final int f83213b = 10;

    /* renamed from: a */
    public boolean f83214a = true;

    /* renamed from: J */
    public final void mo100970J() {
        this.f83214a = false;
    }

    /* renamed from: T */
    public boolean mo100971T() {
        return this.f83214a;
    }

    public boolean add(E e) {
        mo100975e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo100975e();
        return super.addAll(collection);
    }

    public void clear() {
        mo100975e();
        super.clear();
    }

    /* renamed from: e */
    public void mo100975e() {
        if (!this.f83214a) {
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
        mo100975e();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo100975e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo100975e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo100975e();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo100975e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo100975e();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo100975e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
