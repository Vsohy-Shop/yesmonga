package com.carrefour.fid.android.cms.presentation.extension;

import com.carrefour.fid.android.cms.domain.models.ExternalLink;
import com.carrefour.fid.android.cms.domain.models.InternalLink;
import com.carrefour.fid.android.cms.domain.models.LinkDomain;
import com.carrefour.fid.android.cms.presentation.models.LinkModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.presentation.extension.a */
public final class C40025a {
    @C12579k
    /* renamed from: a */
    public static final LinkModel m163009a(@C12579k LinkDomain linkDomain) {
        Intrinsics.checkNotNullParameter(linkDomain, "<this>");
        if (linkDomain instanceof ExternalLink) {
            ExternalLink externalLink = (ExternalLink) linkDomain;
            return new LinkModel.ExternalLinkModel(externalLink.getTitle(), externalLink.getUri(), externalLink.getContentId());
        } else if (linkDomain instanceof InternalLink) {
            InternalLink internalLink = (InternalLink) linkDomain;
            return new LinkModel.InternalLinkModel(internalLink.getTitle(), internalLink.getDeepLink(), internalLink.getContentId());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
