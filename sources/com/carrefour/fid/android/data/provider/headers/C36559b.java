package com.carrefour.fid.android.data.provider.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.provider.headers.b */
public final class C36559b implements C10324h<C36558a> {

    /* renamed from: a */
    public final Provider<C28640a> f90288a;

    public C36559b(Provider<C28640a> provider) {
        this.f90288a = provider;
    }

    /* renamed from: a */
    public static C36559b m149895a(Provider<C28640a> provider) {
        return new C36559b(provider);
    }

    /* renamed from: c */
    public static C36558a m149896c(C28640a aVar) {
        return new C36558a(aVar);
    }

    /* renamed from: b */
    public C36558a get() {
        return m149896c(this.f90288a.get());
    }
}
