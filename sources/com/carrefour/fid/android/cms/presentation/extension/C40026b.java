package com.carrefour.fid.android.cms.presentation.extension;

import com.carrefour.fid.android.cms.domain.models.LinkDomain;
import com.carrefour.fid.android.cms.domain.models.MiniHubBlocks;
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.MiniHubBlocksModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.presentation.extension.b */
public final class C40026b {
    @C12579k
    /* renamed from: a */
    public static final MiniHubBlocksModel m163010a(@C12579k MiniHubBlocks miniHubBlocks) {
        LinkModel linkModel;
        Intrinsics.checkNotNullParameter(miniHubBlocks, "<this>");
        String urlImage = miniHubBlocks.getUrlImage();
        LinkDomain linkDomain = miniHubBlocks.getLinkDomain();
        if (linkDomain != null) {
            linkModel = C40025a.m163009a(linkDomain);
        } else {
            linkModel = null;
        }
        return new MiniHubBlocksModel(urlImage, linkModel, miniHubBlocks.getAlt());
    }
}
