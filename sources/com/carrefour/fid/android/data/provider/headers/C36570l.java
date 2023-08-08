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
/* renamed from: com.carrefour.fid.android.data.provider.headers.l */
public final class C36570l implements C10324h<C36569k> {

    /* renamed from: a */
    public final Provider<C28640a> f90302a;

    public C36570l(Provider<C28640a> provider) {
        this.f90302a = provider;
    }

    /* renamed from: a */
    public static C36570l m149921a(Provider<C28640a> provider) {
        return new C36570l(provider);
    }

    /* renamed from: c */
    public static C36569k m149922c(C28640a aVar) {
        return new C36569k(aVar);
    }

    /* renamed from: b */
    public C36569k get() {
        return m149922c(this.f90302a.get());
    }
}
