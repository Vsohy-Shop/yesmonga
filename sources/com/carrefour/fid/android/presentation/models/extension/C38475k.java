package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.models.offer.AvailableType;
import com.carrefour.fid.android.domain.models.offer.UnavailableType;
import com.carrefour.fid.android.presentation.models.mapper.OfferListModelDataMapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.k */
public final class C38475k {
    @C12579k
    /* renamed from: a */
    public static final OfferListModelDataMapper.AvailableType m159636a(@C12579k AvailableType availableType) {
        Intrinsics.checkNotNullParameter(availableType, "<this>");
        return OfferListModelDataMapper.AvailableType.valueOf(availableType.name());
    }

    @C12579k
    /* renamed from: b */
    public static final OfferListModelDataMapper.UnavailableType m159637b(@C12579k UnavailableType unavailableType) {
        Intrinsics.checkNotNullParameter(unavailableType, "<this>");
        return OfferListModelDataMapper.UnavailableType.valueOf(unavailableType.name());
    }
}
