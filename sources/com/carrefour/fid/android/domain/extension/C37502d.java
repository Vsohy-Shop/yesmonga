package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.data.entities.CurrentCampaignsResponse;
import com.carrefour.fid.android.data.entities.extension.C36450g;
import com.carrefour.fid.android.domain.models.CurrentCampaignsDomain;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.extension.d */
public final class C37502d {
    @C12579k
    /* renamed from: a */
    public static final CurrentCampaignsDomain m153942a(@C12580l CurrentCampaignsResponse currentCampaignsResponse) {
        boolean z;
        String str;
        String str2;
        if (currentCampaignsResponse != null) {
            z = C36450g.m149522c(currentCampaignsResponse);
        } else {
            z = false;
        }
        if (currentCampaignsResponse == null || (str = C36450g.m149521b(currentCampaignsResponse)) == null) {
            str = new String();
        }
        if (currentCampaignsResponse == null || (str2 = C36450g.m149520a(currentCampaignsResponse)) == null) {
            str2 = new String();
        }
        return new CurrentCampaignsDomain(z, str, str2);
    }
}
