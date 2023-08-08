package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.CheckForNull;

public abstract class zzbh<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f72403a = new Object[0];

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
    public int mo85447e(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo85448h() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo85449i() {
        throw null;
    }

    /* renamed from: k */
    public abstract C30286z0<E> iterator();

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public Object[] mo85452q() {
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
        return toArray(f72403a);
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] q = mo85452q();
            if (q != null) {
                return Arrays.copyOfRange(q, mo85449i(), mo85448h(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo85447e(tArr, 0);
        return tArr;
    }
}
