package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import com.google.errorprone.annotations.C32496e;
import com.google.errorprone.annotations.C32503l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzag extends zzac implements List, RandomAccess {

    /* renamed from: b */
    public static final C41106h f104412b = new C41100e(zzai.f104413e, 0);

    /* renamed from: A */
    public static zzag m167014A(Object[] objArr, int i) {
        if (i == 0) {
            return zzai.f104413e;
        }
        return new zzai(objArr, i);
    }

    /* renamed from: H */
    public static zzag m167015H(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m167016M((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.f104413e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m167018W(next);
        }
        C41098d dVar = new C41098d(4);
        dVar.mo134914c(next);
        dVar.mo134915d(it);
        dVar.f104385c = true;
        return m167014A(dVar.f104383a, dVar.f104384b);
    }

    /* renamed from: M */
    public static zzag m167016M(Collection collection) {
        if (collection instanceof zzac) {
            zzag k = ((zzac) collection).mo134947k();
            if (!k.mo134949r()) {
                return k;
            }
            Object[] array = k.toArray();
            return m167014A(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        C41102f.m166978a(array2, length);
        return m167014A(array2, length);
    }

    /* renamed from: Q */
    public static zzag m167017Q() {
        return zzai.f104413e;
    }

    /* renamed from: W */
    public static zzag m167018W(Object obj) {
        Object[] objArr = {obj};
        C41102f.m166978a(objArr, 1);
        return m167014A(objArr, 1);
    }

    /* renamed from: X */
    public static zzag m167019X(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C41102f.m166978a(objArr, 2);
        return m167014A(objArr, 2);
    }

    /* renamed from: Y */
    public final C41106h listIterator(int i) {
        C41124z.m166999b(i, size(), "index");
        if (isEmpty()) {
            return f104412b;
        }
        return new C41100e(this, i);
    }

    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public int mo134943e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean equals(@CheckForNull Object obj) {
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
                        if (C41123y.m166997a(get(i), list.get(i))) {
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
                            if (!C41123y.m166997a(it.next(), it2.next())) {
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

    public final int indexOf(@CheckForNull Object obj) {
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

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Deprecated
    @C32503l(replacement = "this")
    /* renamed from: k */
    public final zzag mo134947k() {
        return this;
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
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

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final C41104g mo134948q() {
        return listIterator(0);
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @C32488a
    @C32496e("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public zzag subList(int i, int i2) {
        C41124z.m167000c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzai.f104413e;
        }
        return new zzaf(this, i, i3);
    }
}
