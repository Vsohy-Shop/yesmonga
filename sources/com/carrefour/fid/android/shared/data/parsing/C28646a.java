package com.carrefour.fid.android.shared.data.parsing;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.parsing.a */
public final class C28646a {

    /* renamed from: a */
    public static final int f70244a = 0;

    /* renamed from: a */
    public final void mo83568a(@C12579k String str, @C12579k String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "fieldName");
        Intrinsics.checkNotNullParameter(str2, "parentName");
        String str4 = "Error in received JSON data: " + str2 + "." + str + " has value: " + str3;
        C28935i.m119705e(C28935i.f70940a, str4, (Throwable) null, 0, 6, (Object) null);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = "release".toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) C10108c.f27780E, false, 2, (Object) null)) {
            throw new IllegalStateException(str4);
        }
    }
}
