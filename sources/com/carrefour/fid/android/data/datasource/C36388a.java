package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.ecommerce.utils.C38213c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.datasource.a */
public final class C36388a {

    /* renamed from: a */
    public static final int f90030a = 0;

    @C12580l
    /* renamed from: a */
    public final String mo108696a(@C12580l AccountInfo accountInfo, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "uidIam");
        Intrinsics.checkNotNullParameter(str2, "orderNumber");
        if (accountInfo != null) {
            return C38213c.f96819a.mo119639a(accountInfo, str, str2);
        }
        return null;
    }
}
