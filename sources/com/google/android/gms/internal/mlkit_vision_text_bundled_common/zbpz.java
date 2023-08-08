package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

public abstract class zbpz<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f71598a = new Object[0];

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

    /* renamed from: e */
    public int mo84936e(Object[] objArr, int i) {
        throw null;
    }

    /* renamed from: h */
    public int mo84937h() {
        throw null;
    }

    /* renamed from: i */
    public int mo84938i() {
        throw null;
    }

    /* renamed from: k */
    public abstract C29348is<E> iterator();

    @CheckForNull
    /* renamed from: q */
    public Object[] mo84941q() {
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
        return toArray(f71598a);
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] q = mo84941q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo84938i(), mo84937h(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo84936e(tArr, 0);
        return tArr;
    }
}
