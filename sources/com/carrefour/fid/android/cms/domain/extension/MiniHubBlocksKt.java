package com.carrefour.fid.android.cms.domain.extension;

import com.carrefour.fid.android.cms.data.entities.CmsLinkResponse;
import com.carrefour.fid.android.cms.data.entities.HomeNalCmsResponse;
import com.carrefour.fid.android.cms.data.entities.ImageResponse;
import com.carrefour.fid.android.cms.data.entities.ImageUrlResponse;
import com.carrefour.fid.android.cms.data.entities.MiniHubBlockCmsResponse;
import com.carrefour.fid.android.cms.data.entities.MiniHubCmsResponse;
import com.carrefour.fid.android.cms.domain.models.ExternalLink;
import com.carrefour.fid.android.cms.domain.models.InternalLink;
import com.carrefour.fid.android.cms.domain.models.LinkDomain;
import com.carrefour.fid.android.cms.domain.models.MiniHubBlocks;
import com.carrefour.fid.android.shared.constant.C28539g;
import com.carrefour.fid.android.shared.type.LinkType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u0007¨\u0006\b"}, mo22516d2 = {"mapToLinkType", "Lcom/carrefour/fid/android/cms/domain/models/LinkDomain;", "blocs", "Lcom/carrefour/fid/android/cms/data/entities/MiniHubBlockCmsResponse;", "toDomain", "", "Lcom/carrefour/fid/android/cms/domain/models/MiniHubBlocks;", "Lcom/carrefour/fid/android/cms/data/entities/HomeNalCmsResponse;", "cms_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nMiniHubBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniHubBlocks.kt\ncom/carrefour/fid/android/cms/domain/extension/MiniHubBlocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1#2:32\n1549#3:33\n1620#3,3:34\n*S KotlinDebug\n*F\n+ 1 MiniHubBlocks.kt\ncom/carrefour/fid/android/cms/domain/extension/MiniHubBlocksKt\n*L\n13#1:33\n13#1:34,3\n*E\n"})
public final class MiniHubBlocksKt {

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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.extension.MiniHubBlocksKt.WhenMappings.<clinit>():void");
        }
    }

    private static final LinkDomain mapToLinkType(MiniHubBlockCmsResponse miniHubBlockCmsResponse) {
        String str;
        LinkDomain linkDomain;
        String str2;
        String str3;
        LinkType.C28878a aVar = LinkType.f70749a;
        CmsLinkResponse link = miniHubBlockCmsResponse.getLink();
        String str4 = null;
        if (link != null) {
            str = link.getLinkType();
        } else {
            str = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[aVar.mo84051a(str).ordinal()];
        if (i == 1) {
            ImageResponse image = miniHubBlockCmsResponse.getImage();
            if (image == null || (str2 = image.getTitle()) == null) {
                str2 = new String();
            }
            CmsLinkResponse link2 = miniHubBlockCmsResponse.getLink();
            if (link2 != null) {
                str4 = link2.getUri();
            }
            linkDomain = new ExternalLink(str2, str4, String.valueOf(miniHubBlockCmsResponse.getContentId()));
        } else if (i != 2) {
            return null;
        } else {
            ImageResponse image2 = miniHubBlockCmsResponse.getImage();
            if (image2 == null || (str3 = image2.getTitle()) == null) {
                str3 = new String();
            }
            CmsLinkResponse link3 = miniHubBlockCmsResponse.getLink();
            if (link3 != null) {
                str4 = link3.getUri();
            }
            linkDomain = new InternalLink(str3, str4, String.valueOf(miniHubBlockCmsResponse.getContentId()));
        }
        return linkDomain;
    }

    @C12580l
    public static final List<MiniHubBlocks> toDomain(@C12579k HomeNalCmsResponse homeNalCmsResponse) {
        List<MiniHubBlockCmsResponse> blocks;
        String str;
        String str2;
        ImageUrlResponse image;
        ImageUrlResponse image2;
        Intrinsics.checkNotNullParameter(homeNalCmsResponse, "<this>");
        Object w2 = CollectionsKt___CollectionsKt.m40706w2(homeNalCmsResponse.getData().getMobilePages().getMini_hubs());
        if (!Intrinsics.areEqual((Object) ((MiniHubCmsResponse) w2).getTemplateId(), (Object) C28539g.f69267y)) {
            w2 = null;
        }
        MiniHubCmsResponse miniHubCmsResponse = (MiniHubCmsResponse) w2;
        if (miniHubCmsResponse == null || (blocks = miniHubCmsResponse.getBlocks()) == null) {
            return null;
        }
        Iterable<MiniHubBlockCmsResponse> iterable = blocks;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (MiniHubBlockCmsResponse miniHubBlockCmsResponse : iterable) {
            ImageResponse image3 = miniHubBlockCmsResponse.getImage();
            if (image3 == null || (image2 = image3.getImage()) == null) {
                str = null;
            } else {
                str = image2.getUrl();
            }
            ImageResponse image4 = miniHubBlockCmsResponse.getImage();
            if (image4 == null || (image = image4.getImage()) == null) {
                str2 = null;
            } else {
                str2 = image.getAlt();
            }
            arrayList.add(new MiniHubBlocks(str, str2, mapToLinkType(miniHubBlockCmsResponse)));
        }
        return arrayList;
    }
}
