package com.carrefour.fid.android.shared.p045di;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
@C10338r
/* renamed from: com.carrefour.fid.android.shared.di.b */
public final class C28675b implements C10324h<C12074o0> {

    /* renamed from: a */
    public final C28656a f70270a;

    public C28675b(C28656a aVar) {
        this.f70270a = aVar;
    }

    /* renamed from: a */
    public static C28675b m118650a(C28656a aVar) {
        return new C28675b(aVar);
    }

    /* renamed from: c */
    public static C12074o0 m118651c(C28656a aVar) {
        return (C12074o0) C10335o.m38554f(aVar.mo83578a());
    }

    /* renamed from: b */
    public C12074o0 get() {
        return m118651c(this.f70270a);
    }
}
