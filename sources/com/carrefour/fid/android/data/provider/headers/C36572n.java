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
/* renamed from: com.carrefour.fid.android.data.provider.headers.n */
public final class C36572n implements C10324h<C36571m> {

    /* renamed from: a */
    public final Provider<C28640a> f90305a;

    public C36572n(Provider<C28640a> provider) {
        this.f90305a = provider;
    }

    /* renamed from: a */
    public static C36572n m149925a(Provider<C28640a> provider) {
        return new C36572n(provider);
    }

    /* renamed from: c */
    public static C36571m m149926c(C28640a aVar) {
        return new C36571m(aVar);
    }

    /* renamed from: b */
    public C36571m get() {
        return m149926c(this.f90305a.get());
    }
}
