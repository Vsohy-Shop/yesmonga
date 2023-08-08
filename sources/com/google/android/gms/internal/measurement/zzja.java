package com.google.android.gms.internal.measurement;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

public abstract class zzja extends zziw implements List, RandomAccess {

    /* renamed from: b */
    public static final C41912d8 f106694b = new C42277y7(zzje.f106697f, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f106695c = 0;

    /* renamed from: A */
    public static zzja m171319A(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", FirebaseMessaging.f80405r, "am"};
        C41876b8.m169712b(objArr, 3);
        return m171321w(objArr, 3);
    }

    /* renamed from: H */
    public static zzja m171320H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        C41876b8.m169712b(objArr, 7);
        return m171321w(objArr, 7);
    }

    /* renamed from: w */
    public static zzja m171321w(Object[] objArr, int i) {
        if (i == 0) {
            return zzje.f106697f;
        }
        return new zzje(objArr, i);
    }

    /* renamed from: y */
    public static zzja m171322y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C41876b8.m169712b(objArr, 2);
        return m171321w(objArr, 2);
    }

    /* renamed from: M */
    public final C41912d8 listIterator(int i) {
        C42090n7.m170598b(i, size(), "index");
        if (isEmpty()) {
            return f106694b;
        }
        return new C42277y7(this, i);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public int mo137554e(Object[] objArr, int i) {
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
                        if (C42073m7.m170559a(get(i), list.get(i))) {
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
                            if (!C42073m7.m170559a(it.next(), it2.next())) {
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

    /* renamed from: k */
    public final C41894c8 mo137558k() {
        return listIterator(0);
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

    /* renamed from: r */
    public zzja subList(int i, int i2) {
        C42090n7.m170599c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzje.f106697f;
        }
        return new zziz(this, i, i3);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
