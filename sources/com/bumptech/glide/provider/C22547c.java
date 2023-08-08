package com.bumptech.glide.provider;

import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.engine.C22232g;
import com.bumptech.glide.load.engine.C22267q;
import com.bumptech.glide.load.resource.transcode.C22502g;
import com.bumptech.glide.util.C22632l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.provider.c */
public class C22547c {

    /* renamed from: c */
    public static final C22267q<?, ?, ?> f57762c = new C22267q(Object.class, Object.class, Object.class, Collections.singletonList(new C22232g(Object.class, Object.class, Object.class, Collections.emptyList(), new C22502g(), (C17997q.C17998a<List<Throwable>>) null)), (C17997q.C17998a<List<Throwable>>) null);

    /* renamed from: a */
    public final C1866a<C22632l, C22267q<?, ?, ?>> f57763a = new C1866a<>();

    /* renamed from: b */
    public final AtomicReference<C22632l> f57764b = new AtomicReference<>();

    @C0363p0
    /* renamed from: a */
    public <Data, TResource, Transcode> C22267q<Data, TResource, Transcode> mo66676a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C22267q<Data, TResource, Transcode> qVar;
        C22632l b = mo66677b(cls, cls2, cls3);
        synchronized (this.f57763a) {
            qVar = this.f57763a.get(b);
        }
        this.f57764b.set(b);
        return qVar;
    }

    /* renamed from: b */
    public final C22632l mo66677b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C22632l andSet = this.f57764b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C22632l();
        }
        andSet.mo67008b(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: c */
    public boolean mo66678c(@C0363p0 C22267q<?, ?, ?> qVar) {
        return f57762c.equals(qVar);
    }

    /* renamed from: d */
    public void mo66679d(Class<?> cls, Class<?> cls2, Class<?> cls3, @C0363p0 C22267q<?, ?, ?> qVar) {
        synchronized (this.f57763a) {
            C1866a<C22632l, C22267q<?, ?, ?>> aVar = this.f57763a;
            C22632l lVar = new C22632l(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f57762c;
            }
            aVar.put(lVar, qVar);
        }
    }
}
