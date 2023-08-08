package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    public static final C41792p0<Object> f105967b = new C41788n0(zzbt.f105968e, 0);

    /* renamed from: A */
    public static <E> zzbs<E> m169210A() {
        return zzbt.f105968e;
    }

    /* renamed from: H */
    public static <E> zzbs<E> m169211H(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> q = ((zzbp) collection).mo136291q();
            if (!q.mo136292r()) {
                return q;
            }
            Object[] array = q.toArray();
            return m169212M(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i = 0;
        while (i < length) {
            if (array2[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return m169212M(array2, length);
    }

    /* renamed from: M */
    public static <E> zzbs<E> m169212M(Object[] objArr, int i) {
        if (i == 0) {
            return zzbt.f105968e;
        }
        return new zzbt(objArr, i);
    }

    /* renamed from: Q */
    public final C41792p0<E> listIterator(int i) {
        C41780k0.m169055b(i, size(), "index");
        if (isEmpty()) {
            return f105967b;
        }
        return new C41788n0(this, i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public final C41790o0<E> mo136286e() {
        return listIterator(0);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C41777j0.m169049a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C41777j0.m169049a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final zzbs<E> mo136291q() {
        return this;
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public int mo136298w(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    /* renamed from: y */
    public zzbs<E> subList(int i, int i2) {
        C41780k0.m169056c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzbt.f105968e;
        }
        return new zzbr(this, i, i3);
    }
}
