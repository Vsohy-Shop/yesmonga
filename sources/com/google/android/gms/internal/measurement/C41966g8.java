package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.g8 */
public abstract class C41966g8 extends AbstractList implements C42296z9 {

    /* renamed from: a */
    public boolean f106150a;

    public C41966g8(boolean z) {
        this.f106150a = z;
    }

    public void add(int i, Object obj) {
        mo136872e();
        super.add(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo136872e();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo136872e();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo136871d() {
        return this.f106150a;
    }

    /* renamed from: e */
    public final void mo136872e() {
        if (!this.f106150a) {
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

    public Object remove(int i) {
        mo136872e();
        return super.remove(i);
    }

    public final boolean removeAll(Collection collection) {
        mo136872e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo136872e();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo136872e();
        return super.set(i, obj);
    }

    public final void zzb() {
        if (this.f106150a) {
            this.f106150a = false;
        }
    }

    public boolean add(Object obj) {
        mo136872e();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo136872e();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        mo136872e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
