package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.BlocksResponse;
import com.carrefour.fid.android.cms.data.entities.CarouselsCmsResponse;
import com.carrefour.fid.android.cms.data.entities.ImageResponse;
import com.carrefour.fid.android.cms.data.entities.ImageUrlResponse;
import com.carrefour.fid.android.cms.data.entities.LinkResponse;
import com.carrefour.fid.android.cms.domain.models.ExternalLink;
import com.carrefour.fid.android.cms.domain.models.InternalLink;
import com.carrefour.fid.android.cms.domain.models.LinkDomain;
import com.carrefour.fid.android.cms.domain.models.SlideFooterCell;
import com.carrefour.fid.android.shared.type.LinkType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007¨\u0006\b"}, mo22516d2 = {"mapToLinkType", "Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "block", "Lcom/carrefour/fid/android/cms/data/entities/BlocksResponse;", "toDomain", "", "Lcom/carrefour/fid/android/cms/domain/models/SlideFooterCell;", "Lcom/carrefour/fid/android/cms/data/entities/CarouselsCmsResponse;", "cms_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSlideFooterCell.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideFooterCell.kt\ncom/carrefour/fid/android/cms/domain/extension/SlideFooterCellKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1549#2:32\n1620#2,3:33\n*S KotlinDebug\n*F\n+ 1 SlideFooterCell.kt\ncom/carrefour/fid/android/cms/domain/extension/SlideFooterCellKt\n*L\n12#1:32\n12#1:33,3\n*E\n"})
public final class SlideFooterCellKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.shared.type.LinkType[] r0 = com.carrefour.fid.android.shared.type.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.shared.type.LinkType r1 = com.carrefour.fid.android.shared.type.LinkType.EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.shared.type.LinkType r1 = com.carrefour.fid.android.shared.type.LinkType.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.extension.SlideFooterCellKt.WhenMappings.<clinit>():void");
        }
    }

    private static final LinkDomain mapToLinkType(BlocksResponse blocksResponse) {
        LinkDomain externalLink;
        String str;
        String str2;
        String str3;
        int i = WhenMappings.$EnumSwitchMapping$0[LinkType.f70749a.mo84051a(blocksResponse.getLinkType()).ordinal()];
        if (i == 1) {
            ImageResponse image = blocksResponse.getImage();
            if (image == null || (str = image.getTitle()) == null) {
                str = new String();
            }
            LinkResponse link = blocksResponse.getLink();
            if (link != null) {
                str2 = link.getUri();
            } else {
                str2 = null;
            }
            externalLink = new ExternalLink(str, str2, (String) null);
        } else if (i != 2) {
            return null;
        } else {
            ImageResponse image2 = blocksResponse.getImage();
            if (image2 == null || (str3 = image2.getTitle()) == null) {
                str3 = new String();
            }
            externalLink = new InternalLink(str3, blocksResponse.getDeepLink(), (String) null);
        }
        return externalLink;
    }

    @C12579k
    public static final List<SlideFooterCell> toDomain(@C12579k CarouselsCmsResponse carouselsCmsResponse) {
        String str;
        String str2;
        ImageUrlResponse image;
        ImageUrlResponse image2;
        Intrinsics.checkNotNullParameter(carouselsCmsResponse, "<this>");
        Iterable<BlocksResponse> blocks = carouselsCmsResponse.getBlocks();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(blocks, 10));
        for (BlocksResponse blocksResponse : blocks) {
            ImageResponse image3 = blocksResponse.getImage();
            String str3 = null;
            if (image3 == null || (image2 = image3.getImage()) == null) {
                str = null;
            } else {
                str = image2.getUrl();
            }
            ImageResponse image4 = blocksResponse.getImage();
            if (image4 != null) {
                str2 = image4.getTitle();
            } else {
                str2 = null;
            }
            ImageResponse image5 = blocksResponse.getImage();
            if (!(image5 == null || (image = image5.getImage()) == null)) {
                str3 = image.getAlt();
            }
            arrayList.add(new SlideFooterCell(str, str2, mapToLinkType(blocksResponse), str3));
        }
        return arrayList;
    }
}
