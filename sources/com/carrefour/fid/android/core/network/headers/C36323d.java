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
/* renamed from: com.carrefour.fid.android.core.network.headers.d */
public final class C36323d implements C10324h<C36322c> {

    /* renamed from: a */
    public final Provider<C28640a> f89738a;

    public C36323d(Provider<C28640a> provider) {
        this.f89738a = provider;
    }

    /* renamed from: a */
    public static C36323d m149041a(Provider<C28640a> provider) {
        return new C36323d(provider);
    }

    /* renamed from: c */
    public static C36322c m149042c(C28640a aVar) {
        return new C36322c(aVar);
    }

    /* renamed from: b */
    public C36322c get() {
        return m149042c(this.f89738a.get());
    }
}
