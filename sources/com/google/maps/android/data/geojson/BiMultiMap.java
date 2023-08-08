package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BiMultiMap<K> extends HashMap<K, Object> {
    private final Map<Object, K> mValuesToKeys = new HashMap();

    @C0359n0
    /* renamed from: b */
    public BiMultiMap<K> clone() {
        BiMultiMap<K> biMultiMap = new BiMultiMap<>();
        biMultiMap.putAll((Map) super.clone());
        return biMultiMap;
    }

    /* renamed from: c */
    public K mo98265c(Object obj) {
        return this.mValuesToKeys.get(obj);
    }

    public void clear() {
        super.clear();
        this.mValuesToKeys.clear();
    }

    /* renamed from: e */
    public Object mo98268e(K k, Collection collection) {
        for (Object put : collection) {
            this.mValuesToKeys.put(put, k);
        }
        return super.put(k, collection);
    }

    public Object put(K k, Object obj) {
        if (obj instanceof Collection) {
            return mo98268e(k, (Collection) obj);
        }
        this.mValuesToKeys.put(obj, k);
        return super.put(k, obj);
    }

    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Object remove(Object obj) {
        Object remove = super.remove(obj);
        if (remove instanceof Collection) {
            for (Object remove2 : (Collection) remove) {
                this.mValuesToKeys.remove(remove2);
            }
        } else {
            this.mValuesToKeys.remove(remove);
        }
        return remove;
    }
}
