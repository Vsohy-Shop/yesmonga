package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.pool.C22639a;
import com.bumptech.glide.util.pool.C22648c;

/* renamed from: com.bumptech.glide.load.engine.r */
public final class C22268r<Z> implements C22270s<Z>, C22639a.C22645f {

    /* renamed from: e */
    public static final C17997q.C17998a<C22268r<?>> f57242e = C22639a.m102662e(20, new C22269a());

    /* renamed from: a */
    public final C22648c f57243a = C22648c.m102683a();

    /* renamed from: b */
    public C22270s<Z> f57244b;

    /* renamed from: c */
    public boolean f57245c;

    /* renamed from: d */
    public boolean f57246d;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    public class C22269a implements C22639a.C22643d<C22268r<?>> {
        /* renamed from: b */
        public C22268r<?> mo66065a() {
            return new C22268r<>();
        }
    }

    @C0359n0
    /* renamed from: d */
    public static <Z> C22268r<Z> m101310d(C22270s<Z> sVar) {
        C22268r<Z> rVar = (C22268r) C22633m.m102624d(f57242e.mo52469b());
        rVar.mo66217b(sVar);
        return rVar;
    }

    /* renamed from: a */
    public synchronized void mo66175a() {
        this.f57243a.mo67017c();
        this.f57246d = true;
        if (!this.f57245c) {
            this.f57244b.mo66175a();
            mo66218e();
        }
    }

    /* renamed from: b */
    public final void mo66217b(C22270s<Z> sVar) {
        this.f57246d = false;
        this.f57245c = true;
        this.f57244b = sVar;
    }

    @C0359n0
    /* renamed from: c */
    public Class<Z> mo66177c() {
        return this.f57244b.mo66177c();
    }

    /* renamed from: e */
    public final void mo66218e() {
        this.f57244b = null;
        f57242e.mo52468a(this);
    }

    /* renamed from: f */
    public synchronized void mo66219f() {
        this.f57243a.mo67017c();
        if (this.f57245c) {
            this.f57245c = false;
            if (this.f57246d) {
                mo66175a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @C0359n0
    /* renamed from: g */
    public C22648c mo65861g() {
        return this.f57243a;
    }

    @C0359n0
    public Z get() {
        return this.f57244b.get();
    }

    public int getSize() {
        return this.f57244b.getSize();
    }
}
