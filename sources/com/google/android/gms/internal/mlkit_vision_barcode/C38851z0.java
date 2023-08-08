package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.z0 */
public abstract class C38851z0<K, V> extends C38613g1<Map.Entry<K, V>> {
    public final void clear() {
        mo122495e().clear();
    }

    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object a = C38574d1.m159889a(mo122495e(), key);
        if (!C38676l.m160047a(a, entry.getValue())) {
            return false;
        }
        if (a != null) {
            return true;
        }
        if (!C38574d1.m159890b(((C38790u) mo122495e()).f98186d, key)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public abstract Map<K, V> mo122495e();

    public final boolean isEmpty() {
        return mo122495e().isEmpty();
    }

    public boolean remove(@CheckForNull Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return ((C38790u) mo122495e()).f98187e.mo122299u().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        try {
            return C38626h1.m159976a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C38626h1.m159977b(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection<?> collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i = size + 1;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("expectedSize cannot be negative but was: ");
                    sb.append(size);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (size < 1073741824) {
                i = (int) ((((float) size) / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return ((C38790u) mo122495e()).f98187e.mo122299u().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo122495e().size();
    }
}
