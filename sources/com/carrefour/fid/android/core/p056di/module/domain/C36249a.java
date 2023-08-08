package com.carrefour.fid.android.core.p056di.module.domain;

import com.carrefour.fid.android.domain.interactors.coupons.C37649g;
import com.carrefour.fid.android.domain.interactors.coupons.C37651i;
import com.carrefour.fid.android.domain.interactors.coupons.CouponsIsScanProductOnBoardingUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.CouponsSetScanProductViewedUseCase;
import dagger.C10147a;
import dagger.C10159h;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import org.jetbrains.annotations.C12579k;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.domain.a */
public interface C36249a {
    @C10147a
    @C12579k
    /* renamed from: a */
    C37651i mo108216a(@C12579k CouponsSetScanProductViewedUseCase couponsSetScanProductViewedUseCase);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37649g mo108217b(@C12579k CouponsIsScanProductOnBoardingUseCase couponsIsScanProductOnBoardingUseCase);
}
