package com.carrefour.fid.android.domain.interactors.delivery;

import com.carrefour.fid.android.domain.repositories.DlvRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.delivery.a */
public final class C37675a implements C10324h<AppGetDeliveryOptionsUseCase> {

    /* renamed from: a */
    public final Provider<DlvRepository> f94535a;

    public C37675a(Provider<DlvRepository> provider) {
        this.f94535a = provider;
    }

    /* renamed from: a */
    public static C37675a m154441a(Provider<DlvRepository> provider) {
        return new C37675a(provider);
    }

    /* renamed from: c */
    public static AppGetDeliveryOptionsUseCase m154442c(DlvRepository dlvRepository) {
        return new AppGetDeliveryOptionsUseCase(dlvRepository);
    }

    /* renamed from: b */
    public AppGetDeliveryOptionsUseCase get() {
        return m154442c(this.f94535a.get());
    }
}
