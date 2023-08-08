package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.n0 */
public abstract class C30142n0<K, V> extends C30238v0<Map.Entry<K, V>> {
    public final void clear() {
        mo85078e().clear();
    }

    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object a = C30202s0.m121842a(mo85078e(), key);
        if (!C30272xa.m121934a(a, entry.getValue())) {
            return false;
        }
        if (a != null) {
            return true;
        }
        if (!C30202s0.m121843b(((C30057g) mo85078e()).f71868d, key)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public abstract Map<K, V> mo85078e();

    public final boolean isEmpty() {
        return mo85078e().isEmpty();
    }

    public boolean remove(@CheckForNull Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return ((C30057g) mo85078e()).f71869e.mo85287u().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        try {
            return C30250w0.m121901a(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C30250w0.m121902b(this, collection.iterator());
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
            return ((C30057g) mo85078e()).f71869e.mo85287u().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo85078e().size();
    }
}
