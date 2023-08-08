package com.carrefour.fid.android.cms.presentation.extension;

import com.carrefour.fid.android.cms.domain.models.LinkDomain;
import com.carrefour.fid.android.cms.domain.models.SlideFooterCell;
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import com.carrefour.fid.android.cms.presentation.models.SlideFooterCellModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.presentation.extension.c */
public final class C40027c {
    @C12579k
    /* renamed from: a */
    public static final SlideFooterCellModel m163011a(@C12579k SlideFooterCell slideFooterCell) {
        LinkModel linkModel;
        Intrinsics.checkNotNullParameter(slideFooterCell, "<this>");
        String urlImage = slideFooterCell.getUrlImage();
        String title = slideFooterCell.getTitle();
        String alt = slideFooterCell.getAlt();
        LinkDomain linkDomain = slideFooterCell.getLinkDomain();
        if (linkDomain != null) {
            linkModel = C40025a.m163009a(linkDomain);
        } else {
            linkModel = null;
        }
        return new SlideFooterCellModel(urlImage, title, linkModel, alt);
    }
}
