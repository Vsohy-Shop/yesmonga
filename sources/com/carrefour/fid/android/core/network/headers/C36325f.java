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
/* renamed from: com.carrefour.fid.android.core.network.headers.f */
public final class C36325f implements C10324h<C36324e> {

    /* renamed from: a */
    public final Provider<C28640a> f89741a;

    public C36325f(Provider<C28640a> provider) {
        this.f89741a = provider;
    }

    /* renamed from: a */
    public static C36325f m149044a(Provider<C28640a> provider) {
        return new C36325f(provider);
    }

    /* renamed from: c */
    public static C36324e m149045c(C28640a aVar) {
        return new C36324e(aVar);
    }

    /* renamed from: b */
    public C36324e get() {
        return m149045c(this.f89741a.get());
    }
}
