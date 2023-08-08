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
/* renamed from: com.carrefour.fid.android.data.provider.headers.j */
public final class C36568j implements C10324h<C36567i> {

    /* renamed from: a */
    public final Provider<C28640a> f90299a;

    public C36568j(Provider<C28640a> provider) {
        this.f90299a = provider;
    }

    /* renamed from: a */
    public static C36568j m149916a(Provider<C28640a> provider) {
        return new C36568j(provider);
    }

    /* renamed from: c */
    public static C36567i m149917c(C28640a aVar) {
        return new C36567i(aVar);
    }

    /* renamed from: b */
    public C36567i get() {
        return m149917c(this.f90299a.get());
    }
}
