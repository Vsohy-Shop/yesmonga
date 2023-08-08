package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.C21693a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.animatable.n */
public abstract class C21556n<V, O> implements C21555m<V, O> {

    /* renamed from: a */
    public final List<C21693a<V>> f55610a;

    public C21556n(V v) {
        this(Collections.singletonList(new C21693a(v)));
    }

    /* renamed from: b */
    public List<C21693a<V>> mo64301b() {
        return this.f55610a;
    }

    /* renamed from: c */
    public boolean mo64302c() {
        if (!this.f55610a.isEmpty()) {
            return this.f55610a.size() == 1 && this.f55610a.get(0).mo64728h();
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f55610a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f55610a.toArray()));
        }
        return sb.toString();
    }

    public C21556n(List<C21693a<V>> list) {
        this.f55610a = list;
    }
}
