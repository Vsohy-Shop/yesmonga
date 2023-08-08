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
/* renamed from: com.carrefour.fid.android.data.provider.headers.p */
public final class C36574p implements C10324h<C36573o> {

    /* renamed from: a */
    public final Provider<C28640a> f90308a;

    public C36574p(Provider<C28640a> provider) {
        this.f90308a = provider;
    }

    /* renamed from: a */
    public static C36574p m149929a(Provider<C28640a> provider) {
        return new C36574p(provider);
    }

    /* renamed from: c */
    public static C36573o m149930c(C28640a aVar) {
        return new C36573o(aVar);
    }

    /* renamed from: b */
    public C36573o get() {
        return m149930c(this.f90308a.get());
    }
}
