package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.CarouselsOffersCmsResponse;
import com.carrefour.fid.android.cms.data.entities.OfferImageUrlResponse;
import com.carrefour.fid.android.cms.data.entities.OffersBlocksResponse;
import com.carrefour.fid.android.cms.data.entities.OffersImageResponse;
import com.carrefour.fid.android.cms.domain.models.SlideOfferCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, mo22516d2 = {"toDomain", "", "Lcom/carrefour/fid/android/cms/domain/models/SlideOfferCell;", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsOffersCmsResponse;", "cms_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSlideOfferCell.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideOfferCell.kt\ncom/carrefour/fid/android/cms/domain/extension/SlideOfferCellKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1549#2:18\n1620#2,3:19\n*S KotlinDebug\n*F\n+ 1 SlideOfferCell.kt\ncom/carrefour/fid/android/cms/domain/extension/SlideOfferCellKt\n*L\n7#1:18\n7#1:19,3\n*E\n"})
public final class SlideOfferCellKt {
    @C12579k
    public static final List<SlideOfferCell> toDomain(@C12579k CarouselsOffersCmsResponse carouselsOffersCmsResponse) {
        String str;
        String str2;
        OfferImageUrlResponse image;
        OfferImageUrlResponse image2;
        Intrinsics.checkNotNullParameter(carouselsOffersCmsResponse, "<this>");
        Iterable<OffersBlocksResponse> blocks = carouselsOffersCmsResponse.getBlocks();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(blocks, 10));
        for (OffersBlocksResponse offersBlocksResponse : blocks) {
            OffersImageResponse image3 = offersBlocksResponse.getImage();
            if (image3 == null || (image2 = image3.getImage()) == null) {
                str = null;
            } else {
                str = image2.getUrl();
            }
            OffersImageResponse image4 = offersBlocksResponse.getImage();
            if (image4 == null || (image = image4.getImage()) == null) {
                str2 = null;
            } else {
                str2 = image.getAlt();
            }
            arrayList.add(new SlideOfferCell(str, str2, offersBlocksResponse.getTitle(), offersBlocksResponse.getDates(), offersBlocksResponse.getQuery()));
        }
        return arrayList;
    }
}
