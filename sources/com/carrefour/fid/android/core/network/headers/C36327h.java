package com.carrefour.fid.android.core.network.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.core.network.headers.h */
public final class C36327h implements C10324h<C36326g> {

    /* renamed from: a */
    public final Provider<C28640a> f89744a;

    public C36327h(Provider<C28640a> provider) {
        this.f89744a = provider;
    }

    /* renamed from: a */
    public static C36327h m149048a(Provider<C28640a> provider) {
        return new C36327h(provider);
    }

    /* renamed from: c */
    public static C36326g m149049c(C28640a aVar) {
        return new C36326g(aVar);
    }

    /* renamed from: b */
    public C36326g get() {
        return m149049c(this.f89744a.get());
    }
}
