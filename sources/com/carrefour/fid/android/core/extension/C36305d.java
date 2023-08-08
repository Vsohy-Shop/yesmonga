package com.carrefour.fid.android.core.extension;

import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.core.extension.d */
public final class C36305d {
    /* renamed from: a */
    public static final void m148948a(@C12579k OrderConfirmationDomain orderConfirmationDomain, @C12580l String str) {
        Intrinsics.checkNotNullParameter(orderConfirmationDomain, "<this>");
        orderConfirmationDomain.mo116116D(Double.valueOf(StringKt.m118945y(str, 0.0d)));
    }
}
