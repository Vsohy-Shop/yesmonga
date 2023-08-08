package com.carrefour.fid.android.loyalty.presentation.models.extension;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.loyalty.presentation.models.DataPrimeCmsModel;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, mo22516d2 = {"toDataPrimeCmsModel", "Lcom/carrefour/fid/android/loyalty/presentation/models/DataPrimeCmsModel;", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "loyalty_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DataPrimeCmsModelKt {
    @C11395k(message = "Please use LoyaltyBonus.toDataPrimeCmsModel")
    @C12579k
    public static final DataPrimeCmsModel toDataPrimeCmsModel(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "<this>");
        String name = dataPrimeCmsResponse.getName();
        String primeId = dataPrimeCmsResponse.getPrimeId();
        String text = dataPrimeCmsResponse.getText();
        boolean isSelected = dataPrimeCmsResponse.isSelected();
        PictoPrimeCmsResponse pictoMobile = dataPrimeCmsResponse.getPictoMobile();
        String url = pictoMobile != null ? pictoMobile.getUrl() : null;
        PictoPrimeCmsResponse pictoMobileOff = dataPrimeCmsResponse.getPictoMobileOff();
        return new DataPrimeCmsModel(name, primeId, text, isSelected, url, pictoMobileOff != null ? pictoMobileOff.getUrl() : null);
    }

    @C12579k
    public static final DataPrimeCmsModel toDataPrimeCmsModel(@C12579k LoyaltyBonus loyaltyBonus) {
        Intrinsics.checkNotNullParameter(loyaltyBonus, "<this>");
        return new DataPrimeCmsModel(loyaltyBonus.getName(), loyaltyBonus.getPrimeId(), loyaltyBonus.getText(), loyaltyBonus.isSelected(), loyaltyBonus.getImageUrl(), loyaltyBonus.getImageOffUrl());
    }
}
