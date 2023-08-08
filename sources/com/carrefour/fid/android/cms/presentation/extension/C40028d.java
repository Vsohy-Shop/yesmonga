package com.carrefour.fid.android.cms.presentation.extension;

import com.carrefour.fid.android.cms.domain.models.SlideOfferCell;
import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.presentation.extension.d */
public final class C40028d {
    @C12579k
    /* renamed from: a */
    public static final SlideOfferCellModel m163012a(@C12579k SlideOfferCell slideOfferCell) {
        Intrinsics.checkNotNullParameter(slideOfferCell, "<this>");
        return new SlideOfferCellModel(slideOfferCell.getUrlImage(), slideOfferCell.getAlt(), slideOfferCell.getTitle(), slideOfferCell.getDates(), slideOfferCell.getQuery());
    }
}
