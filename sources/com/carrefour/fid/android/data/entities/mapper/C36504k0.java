package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannerActionEntity;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannerDetailsEntity;
import com.carrefour.fid.android.data.entities.luckycart.LuckyCartBannersEntity;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.mapper.k0 */
public final class C36504k0 {
    @C12579k
    /* renamed from: a */
    public static final C38047a m149704a(@C12579k LuckyCartBannerDetailsEntity luckyCartBannerDetailsEntity) {
        String str;
        Intrinsics.checkNotNullParameter(luckyCartBannerDetailsEntity, "<this>");
        String imageUrl = luckyCartBannerDetailsEntity.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        String name = luckyCartBannerDetailsEntity.getName();
        if (name == null) {
            name = "";
        }
        LuckyCartBannerActionEntity action = luckyCartBannerDetailsEntity.getAction();
        if (action != null) {
            str = action.getQuery();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new C38047a(imageUrl, name, str, "");
    }

    @C12579k
    /* renamed from: b */
    public static final LuckyCartBanners m149705b(@C12579k LuckyCartBannersEntity luckyCartBannersEntity) {
        Intrinsics.checkNotNullParameter(luckyCartBannersEntity, "<this>");
        List<String> homePage = luckyCartBannersEntity.getHomePage();
        if (homePage == null) {
            homePage = CollectionsKt__CollectionsKt.m40441E();
        }
        List<String> promotions = luckyCartBannersEntity.getPromotions();
        if (promotions == null) {
            promotions = CollectionsKt__CollectionsKt.m40441E();
        }
        List<String> categories = luckyCartBannersEntity.getCategories();
        if (categories == null) {
            categories = CollectionsKt__CollectionsKt.m40441E();
        }
        return new LuckyCartBanners(homePage, promotions, categories);
    }
}
