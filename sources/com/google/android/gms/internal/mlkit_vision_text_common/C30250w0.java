package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.w0 */
public final class C30250w0 {
    /* renamed from: a */
    public static boolean m121901a(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof C30226u0) {
            collection = ((C30226u0) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m121902b(set, collection.iterator());
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
    public static boolean m121902b(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
