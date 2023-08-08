package com.bumptech.glide.util;

import androidx.collection.C1866a;
import androidx.collection.C1886l;

/* renamed from: com.bumptech.glide.util.b */
public final class C22617b<K, V> extends C1866a<K, V> {

    /* renamed from: Y */
    public int f58000Y;

    public void clear() {
        this.f58000Y = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f58000Y == 0) {
            this.f58000Y = super.hashCode();
        }
        return this.f58000Y;
    }

    /* renamed from: l */
    public void mo6335l(C1886l<? extends K, ? extends V> lVar) {
        this.f58000Y = 0;
        super.mo6335l(lVar);
    }

    /* renamed from: m */
    public V mo6336m(int i) {
        this.f58000Y = 0;
        return super.mo6336m(i);
    }

    /* renamed from: n */
    public V mo6337n(int i, V v) {
        this.f58000Y = 0;
        return super.mo6337n(i, v);
    }

    public V put(K k, V v) {
        this.f58000Y = 0;
        return super.put(k, v);
    }
}
