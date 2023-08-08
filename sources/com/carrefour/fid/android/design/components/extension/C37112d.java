package com.carrefour.fid.android.design.components.extension;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.extension.d */
public final class C37112d {
    @C12579k

    /* renamed from: a */
    public static final String f92908a = "EEEE dd MMMM";

    @C12579k
    /* renamed from: a */
    public static final String m152153a(@C12579k Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = new SimpleDateFormat("EEEE dd MMMM", Locale.getDefault()).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "accessibilityFormat.format(this)");
        return format;
    }
}
