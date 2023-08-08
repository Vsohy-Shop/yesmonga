package com.carrefour.fid.android.cms.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.cms.data.headers.b */
public final class C40021b implements C10324h<C40020a> {

    /* renamed from: a */
    public final Provider<C28640a> f102044a;

    public C40021b(Provider<C28640a> provider) {
        this.f102044a = provider;
    }

    /* renamed from: a */
    public static C40021b m162994a(Provider<C28640a> provider) {
        return new C40021b(provider);
    }

    /* renamed from: c */
    public static C40020a m162995c(C28640a aVar) {
        return new C40020a(aVar);
    }

    /* renamed from: b */
    public C40020a get() {
        return m162995c(this.f102044a.get());
    }
}
