package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMAvailability;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.b */
public final class C36443b {
    /* renamed from: a */
    public static final boolean m149512a(@C12579k APIMAvailability aPIMAvailability, @C12579k String str) {
        int i;
        Intrinsics.checkNotNullParameter(aPIMAvailability, "<this>");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        if (!new Regex("[1-7][ab]", RegexOption.IGNORE_CASE).mo23334k(str) || C11622t.isBlank(aPIMAvailability.getRealAvailability())) {
            return false;
        }
        String str2 = null;
        if (!StringsKt__StringsKt.contains$default((CharSequence) aPIMAvailability.getRealAvailability(), (CharSequence) "1", false, 2, (Object) null)) {
            return false;
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) aPIMAvailability.getRealAvailability(), (CharSequence) "0", false, 2, (Object) null)) {
            return true;
        }
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int parseInt = Integer.parseInt(substring);
        String substring2 = str.substring(1, 2);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        if (C11622t.equals(substring2, "a", true)) {
            i = (parseInt * 2) - 2;
        } else {
            i = (parseInt * 2) - 1;
        }
        Character orNull = StringsKt___StringsKt.getOrNull(aPIMAvailability.getRealAvailability(), i);
        if (orNull != null) {
            str2 = orNull.toString();
        }
        if (str2 == null) {
            str2 = "";
        }
        return Intrinsics.areEqual((Object) str2, (Object) "1");
    }
}
