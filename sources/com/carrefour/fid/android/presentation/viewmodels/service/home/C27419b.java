package com.carrefour.fid.android.presentation.viewmodels.service.home;

import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.service.home.b */
public final class C27419b implements C10324h<C27418a> {

    /* renamed from: a */
    public final Provider<C28994a> f66509a;

    public C27419b(Provider<C28994a> provider) {
        this.f66509a = provider;
    }

    /* renamed from: a */
    public static C27419b m115445a(Provider<C28994a> provider) {
        return new C27419b(provider);
    }

    /* renamed from: c */
    public static C27418a m115446c(C28994a aVar) {
        return new C27418a(aVar);
    }

    /* renamed from: b */
    public C27418a get() {
        return m115446c(this.f66509a.get());
    }
}
