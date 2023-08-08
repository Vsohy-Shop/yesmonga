package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14566o3;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.c3 */
public abstract class C14240c3<E> extends AbstractList<E> implements C14566o3.C14575i<E> {

    /* renamed from: a */
    public boolean f35178a = true;

    public boolean add(E e) {
        mo34821e();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo34821e();
        return super.addAll(i, collection);
    }

    /* renamed from: c */
    public final void mo34819c() {
        this.f35178a = false;
    }

    public void clear() {
        mo34821e();
        super.clear();
    }

    /* renamed from: e */
    public void mo34821e() {
        if (!this.f35178a) {
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

    /* renamed from: p */
    public boolean mo34822p() {
        return this.f35178a;
    }

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo34821e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo34821e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo34821e();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo34821e();
        return super.addAll(collection);
    }
}
