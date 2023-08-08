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
/* renamed from: com.carrefour.fid.android.data.provider.headers.h */
public final class C36566h implements C10324h<C36565g> {

    /* renamed from: a */
    public final Provider<C28640a> f90296a;

    public C36566h(Provider<C28640a> provider) {
        this.f90296a = provider;
    }

    /* renamed from: a */
    public static C36566h m149909a(Provider<C28640a> provider) {
        return new C36566h(provider);
    }

    /* renamed from: c */
    public static C36565g m149910c(C28640a aVar) {
        return new C36565g(aVar);
    }

    /* renamed from: b */
    public C36565g get() {
        return m149910c(this.f90296a.get());
    }
}
