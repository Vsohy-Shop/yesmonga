package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z2 */
public final class C39102z2<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    public final Map.Entry<K, C38876b3> f98978a;

    public /* synthetic */ C39102z2(Map.Entry entry, C39093y2 y2Var) {
        this.f98978a = entry;
    }

    /* renamed from: a */
    public final C38876b3 mo123133a() {
        return this.f98978a.getValue();
    }

    public final K getKey() {
        return this.f98978a.getKey();
    }

    public final Object getValue() {
        if (this.f98978a.getValue() == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C39076w3) {
            return this.f98978a.getValue().mo122809c((C39076w3) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
