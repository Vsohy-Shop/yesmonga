package com.bumptech.glide.load.resource;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.resource.j */
public class C22493j<T> implements C22270s<T> {

    /* renamed from: a */
    public final T f57677a;

    public C22493j(@C0359n0 T t) {
        this.f57677a = C22633m.m102624d(t);
    }

    /* renamed from: a */
    public void mo66175a() {
    }

    @C0359n0
    /* renamed from: c */
    public Class<T> mo66177c() {
        return this.f57677a.getClass();
    }

    @C0359n0
    public final T get() {
        return this.f57677a;
    }

    public final int getSize() {
        return 1;
    }
}
