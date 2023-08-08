package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.o0 */
public class C30154o0<K, V> extends C30238v0<K> {

    /* renamed from: a */
    public final Map<K, V> f72052a;

    public C30154o0(Map<K, V> map) {
        map.getClass();
        this.f72052a = map;
    }

    public void clear() {
        this.f72052a.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.f72052a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f72052a.isEmpty();
    }

    public Iterator<K> iterator() {
        return new C30118l0(this.f72052a.entrySet().iterator());
    }

    public boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f72052a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f72052a.size();
    }
}
