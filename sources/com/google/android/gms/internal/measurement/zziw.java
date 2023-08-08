package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

public abstract class zziw extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f106691a = new Object[0];

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@CheckForNull Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo137554e(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo137555h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo137556i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public abstract C41894c8 iterator();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public Object[] mo137559q() {
        return null;
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f106691a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] q = mo137559q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo137556i(), mo137555h(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo137554e(objArr, 0);
        return objArr;
    }
}
