package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.h1 */
public final class C38626h1 {
    /* renamed from: a */
    public static boolean m159976a(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof C38600f1) {
            collection = ((C38600f1) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m159977b(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m159977b(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
