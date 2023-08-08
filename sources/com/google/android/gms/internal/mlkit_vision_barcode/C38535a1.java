package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.a1 */
public class C38535a1<K, V> extends C38613g1<K> {

    /* renamed from: a */
    public final Map<K, V> f97685a;

    public C38535a1(Map<K, V> map) {
        map.getClass();
        this.f97685a = map;
    }

    public void clear() {
        this.f97685a.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f97685a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f97685a.isEmpty();
    }

    public Iterator<K> iterator() {
        return new C38827x0(this.f97685a.entrySet().iterator());
    }

    public boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f97685a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f97685a.size();
    }
}
