package com.carrefour.fid.android.data.entities.mapper;

import com.carrefour.fid.android.data.entities.luckycart.LuckyCartTicketEntity;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.mapper.l0 */
public final class C36506l0 {
    @C12579k
    /* renamed from: a */
    public static final LuckyCartTicketDomain m149709a(@C12579k LuckyCartTicketEntity luckyCartTicketEntity) {
        Intrinsics.checkNotNullParameter(luckyCartTicketEntity, "<this>");
        String imageUrl = luckyCartTicketEntity.getImageUrl();
        String str = "";
        if (imageUrl == null) {
            imageUrl = str;
        }
        String redirectionUrl = luckyCartTicketEntity.getRedirectionUrl();
        if (redirectionUrl != null) {
            str = redirectionUrl;
        }
        return new LuckyCartTicketDomain(imageUrl, str);
    }
}
