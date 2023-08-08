package com.carrefour.fid.android.account.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.headers.b */
public final class C13197b implements C10324h<C13196a> {

    /* renamed from: a */
    public final Provider<C28640a> f32361a;

    public C13197b(Provider<C28640a> provider) {
        this.f32361a = provider;
    }

    /* renamed from: a */
    public static C13197b m57184a(Provider<C28640a> provider) {
        return new C13197b(provider);
    }

    /* renamed from: c */
    public static C13196a m57185c(C28640a aVar) {
        return new C13196a(aVar);
    }

    /* renamed from: b */
    public C13196a get() {
        return m57185c(this.f32361a.get());
    }
}
