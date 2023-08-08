package com.carrefour.fid.android.domain.interactors.gazStation;

import com.carrefour.fid.android.data.repositories.GazStationRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.gazStation.b */
public final class C37692b implements C10324h<PostTicketCardUseCase> {

    /* renamed from: a */
    public final Provider<GazStationRepository> f94560a;

    public C37692b(Provider<GazStationRepository> provider) {
        this.f94560a = provider;
    }

    /* renamed from: a */
    public static C37692b m154480a(Provider<GazStationRepository> provider) {
        return new C37692b(provider);
    }

    /* renamed from: c */
    public static PostTicketCardUseCase m154481c(GazStationRepository gazStationRepository) {
        return new PostTicketCardUseCase(gazStationRepository);
    }

    /* renamed from: b */
    public PostTicketCardUseCase get() {
        return m154481c(this.f94560a.get());
    }
}
