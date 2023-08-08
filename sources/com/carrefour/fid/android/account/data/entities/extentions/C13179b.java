package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.AccountResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileInfoResponse;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.b */
public final class C13179b {
    /* renamed from: a */
    public static final long m57138a(@C12580l AccountResponse accountResponse) {
        ProfileInfoResponse profileInfoResponse;
        String lastModification;
        if (accountResponse == null || (profileInfoResponse = accountResponse.getProfileInfoResponse()) == null || (lastModification = profileInfoResponse.getLastModification()) == null) {
            return 0;
        }
        return Long.parseLong(lastModification);
    }
}
