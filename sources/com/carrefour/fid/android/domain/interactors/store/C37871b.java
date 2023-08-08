package com.carrefour.fid.android.domain.interactors.store;

import com.carrefour.fid.android.domain.interactors.address.C37542a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.store.b */
public final class C37871b implements C10324h<GetDeliveryStoreUseCase> {

    /* renamed from: a */
    public final Provider<C37542a> f94985a;

    /* renamed from: b */
    public final Provider<C37812b> f94986b;

    public C37871b(Provider<C37542a> provider, Provider<C37812b> provider2) {
        this.f94985a = provider;
        this.f94986b = provider2;
    }

    /* renamed from: a */
    public static C37871b m155118a(Provider<C37542a> provider, Provider<C37812b> provider2) {
        return new C37871b(provider, provider2);
    }

    /* renamed from: c */
    public static GetDeliveryStoreUseCase m155119c(C37542a aVar, C37812b bVar) {
        return new GetDeliveryStoreUseCase(aVar, bVar);
    }

    /* renamed from: b */
    public GetDeliveryStoreUseCase get() {
        return m155119c(this.f94985a.get(), this.f94986b.get());
    }
}
