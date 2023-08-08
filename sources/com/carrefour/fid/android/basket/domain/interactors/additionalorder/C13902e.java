package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.additionalorder.e */
public final class C13902e implements C10324h<CheckAdditionalOrderPermissionUseCase> {

    /* renamed from: a */
    public final Provider<C37540a> f33929a;

    public C13902e(Provider<C37540a> provider) {
        this.f33929a = provider;
    }

    /* renamed from: a */
    public static C13902e m58999a(Provider<C37540a> provider) {
        return new C13902e(provider);
    }

    /* renamed from: c */
    public static CheckAdditionalOrderPermissionUseCase m59000c(C37540a aVar) {
        return new CheckAdditionalOrderPermissionUseCase(aVar);
    }

    /* renamed from: b */
    public CheckAdditionalOrderPermissionUseCase get() {
        return m59000c(this.f33929a.get());
    }
}
