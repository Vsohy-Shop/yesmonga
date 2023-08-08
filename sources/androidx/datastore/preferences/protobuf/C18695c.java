package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c */
public abstract class C18695c<E> extends AbstractList<E> implements C18753i1.C18770k<E> {

    /* renamed from: b */
    public static final int f47804b = 10;

    /* renamed from: a */
    public boolean f47805a = true;

    /* renamed from: J */
    public final void mo54404J() {
        this.f47805a = false;
    }

    /* renamed from: T */
    public boolean mo54405T() {
        return this.f47805a;
    }

    public boolean add(E e) {
        mo54411e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo54411e();
        return super.addAll(collection);
    }

    public void clear() {
        mo54411e();
        super.clear();
    }

    /* renamed from: e */
    public void mo54411e() {
        if (!this.f47805a) {
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
        mo54411e();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo54411e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo54411e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo54411e();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo54411e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo54411e();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo54411e();
        return super.remove(obj);
    }
}
