package com.carrefour.fid.android.core.p056di.module.domain;

import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import com.carrefour.fid.android.domain.interactors.criteo.C37666g;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCatalogCriteoBannerUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoSendCriteoEventUseCase;
import com.carrefour.fid.android.domain.interactors.criteo.CriteoTrackingCriteoUseCase;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.domain.b */
public interface C36250b {
    @C10147a
    @C12579k
    /* renamed from: a */
    C37611c mo108218a(@C12579k CriteoGetCatalogCriteoBannerUseCase criteoGetCatalogCriteoBannerUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37672j mo108219b(@C12579k CriteoTrackingCriteoUseCase criteoTrackingCriteoUseCase);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37670i mo108220c(@C12579k CriteoSendCriteoEventUseCase criteoSendCriteoEventUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37666g mo108221d(@C12579k CriteoGetCriteoProductsUseCase criteoGetCriteoProductsUseCase);
}
