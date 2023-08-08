package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbp<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f105964a = new Object[0];

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
    public abstract C41790o0<E> iterator();

    @NullableDecl
    /* renamed from: h */
    public Object[] mo136287h() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo136288i() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo136290k() {
        throw null;
    }

    /* renamed from: q */
    public zzbs<E> mo136291q() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract boolean mo136292r();

    @Deprecated
    public final boolean remove(Object obj) {
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
        return toArray(f105964a);
    }

    /* renamed from: w */
    public int mo136298w(Object[] objArr, int i) {
        throw null;
    }

    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        int length = tArr.length;
        if (length < size) {
            Object[] h = mo136287h();
            if (h != null) {
                return Arrays.copyOfRange(h, mo136288i(), mo136290k(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (length > size) {
            tArr[size] = null;
        }
        mo136298w(tArr, 0);
        return tArr;
    }
}
