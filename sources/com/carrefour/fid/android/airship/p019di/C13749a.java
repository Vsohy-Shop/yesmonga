package com.carrefour.fid.android.airship.p019di;

import com.carrefour.fid.android.airship.data.datasource.C13744c;
import com.carrefour.fid.android.airship.data.repositories.GoogleAdsImpl;
import com.carrefour.fid.android.airship.domain.interactor.AirshipGetAirshipInboxUseCase;
import com.carrefour.fid.android.airship.domain.interactor.AirshipGetGaidUseCase;
import com.carrefour.fid.android.airship.domain.interactor.C13750a;
import com.carrefour.fid.android.airship.domain.repositories.C13755a;
import com.carrefour.fid.android.domain.interactors.airship.C37544a;
import com.carrefour.fid.android.domain.interactors.airship.C37545b;
import com.carrefour.fid.android.domain.interactors.airship.C37546c;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import javax.inject.Singleton;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.airship.di.a */
public abstract class C13749a {
    @Singleton
    /* renamed from: c */
    public static /* synthetic */ void m58625c(C13744c cVar) {
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    public abstract C37544a mo32677a(@C12579k C13750a aVar);

    @C10147a
    @C12579k
    /* renamed from: b */
    public abstract C28994a mo32678b(@C12579k C13744c cVar);

    @C10147a
    @C12579k
    /* renamed from: d */
    public abstract C37546c mo32679d(@C12579k AirshipGetGaidUseCase airshipGetGaidUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    public abstract C37545b mo32680e(@C12579k AirshipGetAirshipInboxUseCase airshipGetAirshipInboxUseCase);

    @C10147a
    @C12579k
    /* renamed from: f */
    public abstract C13755a mo32681f(@C12579k GoogleAdsImpl googleAdsImpl);
}
