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
/* renamed from: com.carrefour.fid.android.data.provider.headers.r */
public final class C36576r implements C10324h<C36575q> {

    /* renamed from: a */
    public final Provider<C28640a> f90311a;

    public C36576r(Provider<C28640a> provider) {
        this.f90311a = provider;
    }

    /* renamed from: a */
    public static C36576r m149933a(Provider<C28640a> provider) {
        return new C36576r(provider);
    }

    /* renamed from: c */
    public static C36575q m149934c(C28640a aVar) {
        return new C36575q(aVar);
    }

    /* renamed from: b */
    public C36575q get() {
        return m149934c(this.f90311a.get());
    }
}
