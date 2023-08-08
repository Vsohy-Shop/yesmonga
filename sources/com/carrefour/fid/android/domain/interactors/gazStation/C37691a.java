package com.carrefour.fid.android.domain.interactors.gazStation;

import com.carrefour.fid.android.data.repositories.GazStationRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.gazStation.a */
public final class C37691a implements C10324h<GetGazStationsCampaignUseCase> {

    /* renamed from: a */
    public final Provider<GazStationRepository> f94558a;

    /* renamed from: b */
    public final Provider<C37807b> f94559b;

    public C37691a(Provider<GazStationRepository> provider, Provider<C37807b> provider2) {
        this.f94558a = provider;
        this.f94559b = provider2;
    }

    /* renamed from: a */
    public static C37691a m154477a(Provider<GazStationRepository> provider, Provider<C37807b> provider2) {
        return new C37691a(provider, provider2);
    }

    /* renamed from: c */
    public static GetGazStationsCampaignUseCase m154478c(GazStationRepository gazStationRepository, C37807b bVar) {
        return new GetGazStationsCampaignUseCase(gazStationRepository, bVar);
    }

    /* renamed from: b */
    public GetGazStationsCampaignUseCase get() {
        return m154478c(this.f94558a.get(), this.f94559b.get());
    }
}
