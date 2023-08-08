package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.util.C22633m;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.n */
public class C22256n<Z> implements C22270s<Z> {

    /* renamed from: a */
    public final boolean f57198a;

    /* renamed from: b */
    public final boolean f57199b;

    /* renamed from: c */
    public final C22270s<Z> f57200c;

    /* renamed from: d */
    public final C22257a f57201d;

    /* renamed from: e */
    public final C22108c f57202e;

    /* renamed from: f */
    public int f57203f;

    /* renamed from: g */
    public boolean f57204g;

    /* renamed from: com.bumptech.glide.load.engine.n$a */
    public interface C22257a {
        /* renamed from: d */
        void mo66127d(C22108c cVar, C22256n<?> nVar);
    }

    public C22256n(C22270s<Z> sVar, boolean z, boolean z2, C22108c cVar, C22257a aVar) {
        this.f57200c = (C22270s) C22633m.m102624d(sVar);
        this.f57198a = z;
        this.f57199b = z2;
        this.f57202e = cVar;
        this.f57201d = (C22257a) C22633m.m102624d(aVar);
    }

    /* renamed from: a */
    public synchronized void mo66175a() {
        if (this.f57203f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f57204g) {
            this.f57204g = true;
            if (this.f57199b) {
                this.f57200c.mo66175a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: b */
    public synchronized void mo66176b() {
        if (!this.f57204g) {
            this.f57203f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @C0359n0
    /* renamed from: c */
    public Class<Z> mo66177c() {
        return this.f57200c.mo66177c();
    }

    /* renamed from: d */
    public C22270s<Z> mo66178d() {
        return this.f57200c;
    }

    /* renamed from: e */
    public boolean mo66179e() {
        return this.f57198a;
    }

    /* renamed from: f */
    public void mo66180f() {
        boolean z;
        synchronized (this) {
            int i = this.f57203f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f57203f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f57201d.mo66127d(this.f57202e, this);
        }
    }

    @C0359n0
    public Z get() {
        return this.f57200c.get();
    }

    public int getSize() {
        return this.f57200c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f57198a + ", listener=" + this.f57201d + ", key=" + this.f57202e + ", acquired=" + this.f57203f + ", isRecycled=" + this.f57204g + ", resource=" + this.f57200c + C12361b.f30259j;
    }
}
