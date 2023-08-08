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
/* renamed from: com.carrefour.fid.android.data.provider.headers.v */
public final class C36580v implements C10324h<C36579u> {

    /* renamed from: a */
    public final Provider<C28640a> f90317a;

    public C36580v(Provider<C28640a> provider) {
        this.f90317a = provider;
    }

    /* renamed from: a */
    public static C36580v m149942a(Provider<C28640a> provider) {
        return new C36580v(provider);
    }

    /* renamed from: c */
    public static C36579u m149943c(C28640a aVar) {
        return new C36579u(aVar);
    }

    /* renamed from: b */
    public C36579u get() {
        return m149943c(this.f90317a.get());
    }
}
