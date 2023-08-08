package com.carrefour.fid.android.shared.util;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.shared.util.r */
public final class C28950r {
    @C12579k
    /* renamed from: a */
    public static final String m119747a(@C12579k String str, @C12579k Locale locale) {
        boolean z;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            str2 = C11600b.m45193v(charAt, locale);
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    /* renamed from: b */
    public static /* synthetic */ String m119748b(String str, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return m119747a(str, locale);
    }
}
