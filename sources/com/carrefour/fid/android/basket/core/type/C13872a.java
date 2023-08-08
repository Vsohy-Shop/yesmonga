package com.carrefour.fid.android.basket.core.type;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.basket.core.type.a */
public final class C13872a {
    @C12579k
    /* renamed from: a */
    public static final String m58833a(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 19 && C11622t.startsWith$default(str, "91357", false, 2, (Object) null)) {
            long parseLong = Long.parseLong(str);
            if (9135720000643225010L > parseLong || parseLong >= 9135720000648225001L) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return "LOYALTY";
            }
        }
        if (C11622t.startsWith$default(str, "103", false, 2, (Object) null) || str.length() == 16) {
            return "PASS_MASTERCARD";
        }
        return "NOTEXIST";
    }
}
