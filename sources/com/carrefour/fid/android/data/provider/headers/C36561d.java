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
/* renamed from: com.carrefour.fid.android.data.provider.headers.d */
public final class C36561d implements C10324h<C36560c> {

    /* renamed from: a */
    public final Provider<C28640a> f90291a;

    public C36561d(Provider<C28640a> provider) {
        this.f90291a = provider;
    }

    /* renamed from: a */
    public static C36561d m149900a(Provider<C28640a> provider) {
        return new C36561d(provider);
    }

    /* renamed from: c */
    public static C36560c m149901c(C28640a aVar) {
        return new C36560c(aVar);
    }

    /* renamed from: b */
    public C36560c get() {
        return m149901c(this.f90291a.get());
    }
}
