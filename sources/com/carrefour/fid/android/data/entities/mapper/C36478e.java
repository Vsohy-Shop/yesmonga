package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.FrequentSalesType;
import com.carrefour.fid.android.data.entities.APIMFrequentSalesItem;
import com.carrefour.fid.android.domain.models.FrequentSaleDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.e */
public final class C36478e extends C28486g<APIMFrequentSalesItem, FrequentSaleDomain> {

    /* renamed from: b */
    public static final int f90170b = 0;

    @C12580l
    /* renamed from: d */
    public FrequentSaleDomain mo72340a(@C12580l APIMFrequentSalesItem aPIMFrequentSalesItem) {
        String str;
        double d;
        String str2;
        int i;
        if (aPIMFrequentSalesItem == null) {
            return null;
        }
        String gtin = aPIMFrequentSalesItem.getGtin();
        if (gtin == null) {
            str = "";
        } else {
            str = gtin;
        }
        String site = aPIMFrequentSalesItem.getSite();
        FrequentSalesType frequentSalesType = FrequentSalesType.Offline.f89852d;
        if (!Intrinsics.areEqual((Object) site, (Object) frequentSalesType.mo108480b())) {
            frequentSalesType = FrequentSalesType.Online.f89854d;
            if (!Intrinsics.areEqual((Object) site, (Object) frequentSalesType.mo108480b())) {
                frequentSalesType = FrequentSalesType.Mixte.f89850d;
                if (!Intrinsics.areEqual((Object) site, (Object) frequentSalesType.mo108480b())) {
                    frequentSalesType = FrequentSalesType.Unknown.f89856d;
                }
            }
        }
        Double score = aPIMFrequentSalesItem.getScore();
        double d2 = 0.0d;
        if (score != null) {
            d = score.doubleValue();
        } else {
            d = 0.0d;
        }
        String strategy = aPIMFrequentSalesItem.getStrategy();
        if (strategy == null) {
            str2 = "";
        } else {
            str2 = strategy;
        }
        Integer categoryRank = aPIMFrequentSalesItem.getCategoryRank();
        if (categoryRank != null) {
            i = categoryRank.intValue();
        } else {
            i = 0;
        }
        int i2 = i;
        Double categoryScore = aPIMFrequentSalesItem.getCategoryScore();
        if (categoryScore != null) {
            d2 = categoryScore.doubleValue();
        }
        double d3 = d2;
        String mainNodeId = aPIMFrequentSalesItem.getMainNodeId();
        if (mainNodeId == null) {
            mainNodeId = "";
        }
        return new FrequentSaleDomain(str, frequentSalesType, d, str2, i2, d3, mainNodeId);
    }
}
