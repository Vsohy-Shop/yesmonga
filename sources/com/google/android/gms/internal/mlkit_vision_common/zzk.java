package com.google.android.gms.internal.mlkit_vision_common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

public abstract class zzk<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f100606a = new Object[0];

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo123376e(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo123377h() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo123378i() {
        throw null;
    }

    /* renamed from: k */
    public abstract C39309v7<E> iterator();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public Object[] mo123381q() {
        throw null;
    }

    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f100606a);
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] q = mo123381q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo123378i(), mo123377h(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo123376e(tArr, 0);
        return tArr;
    }
}
