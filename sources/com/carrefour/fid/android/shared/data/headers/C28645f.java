package com.carrefour.fid.android.shared.data.headers;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.shared.data.headers.f */
public final class C28645f implements C10324h<C28644e> {

    /* renamed from: a */
    public final Provider<BaseHeaders> f70243a;

    public C28645f(Provider<BaseHeaders> provider) {
        this.f70243a = provider;
    }

    /* renamed from: a */
    public static C28645f m118610a(Provider<BaseHeaders> provider) {
        return new C28645f(provider);
    }

    /* renamed from: c */
    public static C28644e m118611c(BaseHeaders baseHeaders) {
        return new C28644e(baseHeaders);
    }

    /* renamed from: b */
    public C28644e get() {
        return m118611c(this.f70243a.get());
    }
}
