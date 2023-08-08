package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.UpdateAccountBody;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.m */
public final class C13191m {
    @C12579k
    /* renamed from: a */
    public static final UpdateAccountBody m57172a(@C12579k AccountResponse accountResponse) {
        Intrinsics.checkNotNullParameter(accountResponse, "<this>");
        return new UpdateAccountBody(accountResponse.getProfileInfoResponse().getAccountInfoPojo().getCivility(), accountResponse.getProfileInfoResponse().getAccountInfoPojo().getFirstName(), accountResponse.getProfileInfoResponse().getAccountInfoPojo().getLastName());
    }
}
