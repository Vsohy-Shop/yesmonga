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
/* renamed from: com.carrefour.fid.android.core.network.headers.b */
public final class C36321b implements C10324h<C36320a> {

    /* renamed from: a */
    public final Provider<C28640a> f89735a;

    public C36321b(Provider<C28640a> provider) {
        this.f89735a = provider;
    }

    /* renamed from: a */
    public static C36321b m149038a(Provider<C28640a> provider) {
        return new C36321b(provider);
    }

    /* renamed from: c */
    public static C36320a m149039c(C28640a aVar) {
        return new C36320a(aVar);
    }

    /* renamed from: b */
    public C36320a get() {
        return m149039c(this.f89735a.get());
    }
}
