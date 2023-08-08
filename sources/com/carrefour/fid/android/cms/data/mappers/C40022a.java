package com.carrefour.fid.android.cms.data.mappers;

import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse;
import com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.data.mappers.a */
public final class C40022a {
    @C12579k
    /* renamed from: a */
    public static final DataPrimeCmsResponse m162997a(@C12579k LoyaltyBonus loyaltyBonus) {
        Intrinsics.checkNotNullParameter(loyaltyBonus, "<this>");
        String primeId = loyaltyBonus.getPrimeId();
        return new DataPrimeCmsResponse(loyaltyBonus.getName(), primeId, new PictoPrimeCmsResponse(loyaltyBonus.getImageUrl(), (String) null, (String) null, 6, (DefaultConstructorMarker) null), new PictoPrimeCmsResponse(loyaltyBonus.getImageOffUrl(), (String) null, (String) null, 6, (DefaultConstructorMarker) null), new UrlPrimeCmsResponse(loyaltyBonus.getEditorialUri()), loyaltyBonus.getDescription(), loyaltyBonus.getText(), loyaltyBonus.isSelected());
    }

    @C12579k
    /* renamed from: b */
    public static final LoyaltyBonus m162998b(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "<this>");
        String primeId = dataPrimeCmsResponse.getPrimeId();
        String name = dataPrimeCmsResponse.getName();
        PictoPrimeCmsResponse pictoMobile = dataPrimeCmsResponse.getPictoMobile();
        String str6 = null;
        if (pictoMobile != null) {
            str = pictoMobile.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        PictoPrimeCmsResponse pictoMobileOff = dataPrimeCmsResponse.getPictoMobileOff();
        if (pictoMobileOff != null) {
            str3 = pictoMobileOff.getUrl();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        UrlPrimeCmsResponse urlEdito = dataPrimeCmsResponse.getUrlEdito();
        if (urlEdito != null) {
            str6 = urlEdito.getUri();
        }
        if (str6 == null) {
            str5 = "";
        } else {
            str5 = str6;
        }
        return new LoyaltyBonus(primeId, name, str2, str4, str5, dataPrimeCmsResponse.getDescription(), dataPrimeCmsResponse.getText(), dataPrimeCmsResponse.isSelected());
    }
}
