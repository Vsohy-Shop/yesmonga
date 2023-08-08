package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zz */
public final class C29983zz<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    public final Map.Entry<K, b00> f71700a;

    public /* synthetic */ C29983zz(Map.Entry entry, C29946yz yzVar) {
        this.f71700a = entry;
    }

    /* renamed from: a */
    public final b00 mo85025a() {
        return this.f71700a.getValue();
    }

    public final K getKey() {
        return this.f71700a.getKey();
    }

    public final Object getValue() {
        if (this.f71700a.getValue() == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof x00) {
            return this.f71700a.getValue().mo84551c((x00) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
