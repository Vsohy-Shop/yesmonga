package com.bumptech.glide.provider;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.bumptech.glide.util.C22632l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.provider.d */
public class C22548d {

    /* renamed from: a */
    public final AtomicReference<C22632l> f57765a = new AtomicReference<>();

    /* renamed from: b */
    public final C1866a<C22632l, List<Class<?>>> f57766b = new C1866a<>();

    /* renamed from: a */
    public void mo66680a() {
        synchronized (this.f57766b) {
            this.f57766b.clear();
        }
    }

    @C0363p0
    /* renamed from: b */
    public List<Class<?>> mo66681b(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2, @C0359n0 Class<?> cls3) {
        List<Class<?>> list;
        C22632l andSet = this.f57765a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C22632l(cls, cls2, cls3);
        } else {
            andSet.mo67008b(cls, cls2, cls3);
        }
        synchronized (this.f57766b) {
            list = this.f57766b.get(andSet);
        }
        this.f57765a.set(andSet);
        return list;
    }

    /* renamed from: c */
    public void mo66682c(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2, @C0359n0 Class<?> cls3, @C0359n0 List<Class<?>> list) {
        synchronized (this.f57766b) {
            this.f57766b.put(new C22632l(cls, cls2, cls3), list);
        }
    }
}
