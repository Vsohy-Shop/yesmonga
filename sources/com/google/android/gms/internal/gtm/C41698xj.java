package com.google.android.gms.internal.gtm;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.xj */
public final class C41698xj<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    public final Map.Entry<K, C41746zj> f105248a;

    public /* synthetic */ C41698xj(Map.Entry entry, C41674wj wjVar) {
        this.f105248a = entry;
    }

    /* renamed from: a */
    public final C41746zj mo136056a() {
        return this.f105248a.getValue();
    }

    public final K getKey() {
        return this.f105248a.getKey();
    }

    public final Object getValue() {
        if (this.f105248a.getValue() == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C41627uk) {
            return this.f105248a.getValue().mo135035c((C41627uk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
