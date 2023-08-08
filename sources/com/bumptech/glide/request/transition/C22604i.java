package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.C22605j;

/* renamed from: com.bumptech.glide.request.transition.i */
public class C22604i<R> implements C22600g<R> {

    /* renamed from: a */
    public final C22605j.C22606a f57979a;

    /* renamed from: b */
    public C22605j<R> f57980b;

    public C22604i(C22605j.C22606a aVar) {
        this.f57979a = aVar;
    }

    /* renamed from: a */
    public C22598f<R> mo66937a(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C22596e.m102547b();
        }
        if (this.f57980b == null) {
            this.f57980b = new C22605j<>(this.f57979a);
        }
        return this.f57980b;
    }
}
