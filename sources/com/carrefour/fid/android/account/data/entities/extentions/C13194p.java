package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptIn;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountBody;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountRequestBody;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.p */
public final class C13194p {
    /* renamed from: a */
    public static final BffConsentOptIn m57175a(boolean z, BffConsentOptInName bffConsentOptInName) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        return new BffConsentOptIn(bffConsentOptInName, str);
    }

    @C12579k
    /* renamed from: b */
    public static final UserAccountRequestBody m57176b(@C12579k UserAccountBody userAccountBody) {
        Intrinsics.checkNotNullParameter(userAccountBody, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(m57175a(true, BffConsentOptInName.CGU_CLIENT));
        Boolean personalizedAdvertisingOptin = userAccountBody.getPersonalizedAdvertisingOptin();
        if (personalizedAdvertisingOptin != null) {
            arrayList.add(m57175a(personalizedAdvertisingOptin.booleanValue(), BffConsentOptInName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING));
        }
        Boolean partnerPersonalizedAdvertisingOptin = userAccountBody.getPartnerPersonalizedAdvertisingOptin();
        if (partnerPersonalizedAdvertisingOptin != null) {
            arrayList.add(m57175a(partnerPersonalizedAdvertisingOptin.booleanValue(), BffConsentOptInName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING));
        }
        return new UserAccountRequestBody(userAccountBody.getLogin(), userAccountBody.getPassword(), userAccountBody.getCivility(), userAccountBody.getFirstName(), userAccountBody.getLastName(), userAccountBody.getBirthdate(), (List) null, (List) null, (List) null, arrayList, false, 1472, (DefaultConstructorMarker) null);
    }
}
