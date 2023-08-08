package com.carrefour.fid.android.basket.data.api.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.data.api.headers.b */
public final class C13880b implements C10324h<C13879a> {

    /* renamed from: a */
    public final Provider<C28640a> f33841a;

    public C13880b(Provider<C28640a> provider) {
        this.f33841a = provider;
    }

    /* renamed from: a */
    public static C13880b m58882a(Provider<C28640a> provider) {
        return new C13880b(provider);
    }

    /* renamed from: c */
    public static C13879a m58883c(C28640a aVar) {
        return new C13879a(aVar);
    }

    /* renamed from: b */
    public C13879a get() {
        return m58883c(this.f33841a.get());
    }
}
