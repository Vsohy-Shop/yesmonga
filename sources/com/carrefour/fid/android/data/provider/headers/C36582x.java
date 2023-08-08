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
/* renamed from: com.carrefour.fid.android.data.provider.headers.x */
public final class C36582x implements C10324h<C36581w> {

    /* renamed from: a */
    public final Provider<C28640a> f90320a;

    public C36582x(Provider<C28640a> provider) {
        this.f90320a = provider;
    }

    /* renamed from: a */
    public static C36582x m149947a(Provider<C28640a> provider) {
        return new C36582x(provider);
    }

    /* renamed from: c */
    public static C36581w m149948c(C28640a aVar) {
        return new C36581w(aVar);
    }

    /* renamed from: b */
    public C36581w get() {
        return m149948c(this.f90320a.get());
    }
}
