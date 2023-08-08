package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.CurrentCampaignsResponse;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.g */
public final class C36450g {
    @C12579k
    /* renamed from: a */
    public static final String m149520a(@C12579k CurrentCampaignsResponse currentCampaignsResponse) {
        Intrinsics.checkNotNullParameter(currentCampaignsResponse, "<this>");
        if (!(!C11622t.isBlank(currentCampaignsResponse.getEndDate()))) {
            return new String();
        }
        C28932h.C28933a aVar = C28932h.f70914a;
        return aVar.mo84249s(aVar.mo84220K(currentCampaignsResponse.getEndDate()));
    }

    @C12579k
    /* renamed from: b */
    public static final String m149521b(@C12579k CurrentCampaignsResponse currentCampaignsResponse) {
        Intrinsics.checkNotNullParameter(currentCampaignsResponse, "<this>");
        if (!(!C11622t.isBlank(currentCampaignsResponse.getStartDate()))) {
            return new String();
        }
        C28932h.C28933a aVar = C28932h.f70914a;
        return aVar.mo84249s(aVar.mo84220K(currentCampaignsResponse.getStartDate()));
    }

    /* renamed from: c */
    public static final boolean m149522c(@C12579k CurrentCampaignsResponse currentCampaignsResponse) {
        Intrinsics.checkNotNullParameter(currentCampaignsResponse, "<this>");
        if (!(!C11622t.isBlank(currentCampaignsResponse.getReceiptReceptionDeadline())) || Calendar.getInstance().getTime().compareTo(C28932h.f70914a.mo84220K(currentCampaignsResponse.getReceiptReceptionDeadline())) >= 0) {
            return false;
        }
        return true;
    }
}
