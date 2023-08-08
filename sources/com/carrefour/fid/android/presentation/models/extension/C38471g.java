package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.domain.models.CurrentCampaignsDomain;
import com.carrefour.fid.android.presentation.models.CurrentCampaignsModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.g */
public final class C38471g {
    @C12579k
    /* renamed from: a */
    public static final CurrentCampaignsModel m159630a(@C12579k CurrentCampaignsDomain currentCampaignsDomain) {
        Intrinsics.checkNotNullParameter(currentCampaignsDomain, "<this>");
        return new CurrentCampaignsModel(currentCampaignsDomain.mo115781h(), currentCampaignsDomain.mo115780g(), currentCampaignsDomain.mo115779f());
    }
}
