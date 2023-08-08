package com.carrefour.fid.android.design.components.utils;

import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.utils.d */
public final class C37137d {
    @C12579k
    /* renamed from: a */
    public static final String m152209a(long j) {
        String format = new DecimalFormat("00").format(j);
        Intrinsics.checkNotNullExpressionValue(format, "timerValue");
        return format;
    }
}
