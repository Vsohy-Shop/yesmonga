package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.extension.i */
public final class C37508i {
    @C12579k
    /* renamed from: a */
    public static final String m153958a(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "orderGln");
        Intrinsics.checkNotNullParameter(str2, "orderKey");
        Intrinsics.checkNotNullParameter(str3, "orderDate");
        Intrinsics.checkNotNullParameter(str4, "screenName");
        Intrinsics.checkNotNullParameter(str5, "downloadReceiptButtonName");
        return StringKt.m118911T(C36178i.f89316k + str + "/" + str3 + "/" + str2, str4, str5);
    }
}
