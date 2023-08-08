package com.carrefour.fid.android.logm.utils;

import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.type.HashType;
import kotlin.ranges.C11466l;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.logm.utils.a */
public final class C38284a {
    @C12579k

    /* renamed from: a */
    public static final C38284a f96975a = new C38284a();

    @C12580l
    /* renamed from: a */
    public final Long mo119882a(@C12580l String str, @C12580l String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return Long.valueOf(StringKt.m118915X(str) - StringKt.m118915X(str2));
    }

    /* renamed from: b */
    public final String mo119883b(String str) {
        String e = mo119886e(StringsKt__StringsKt.indexOf$default((CharSequence) str, "@", 0, false, 6, (Object) null), str);
        String str2 = str;
        String d = mo119885d(StringsKt__StringsKt.indexOf$default((CharSequence) str2, "@", 0, false, 6, (Object) null), str);
        HashType hashType = HashType.SHA_ONE;
        String replace$default = C11622t.replace$default(str2, d, StringKt.m118899H(d, hashType, (String) null, 2, (Object) null), false, 4, (Object) null);
        if (!(!C11622t.isBlank(e))) {
            return replace$default;
        }
        return C11622t.replace$default(replace$default, e, StringKt.m118899H(e, hashType, (String) null, 2, (Object) null), false, 4, (Object) null);
    }

    @C12580l
    /* renamed from: c */
    public final String mo119884c(@C12580l String str) {
        String D;
        String str2;
        if (str == null || (D = StringKt.m118895D(str)) == null) {
            return str;
        }
        if (C11622t.isBlank(D)) {
            str2 = str;
        } else {
            str2 = C11622t.replace$default(str, D, f96975a.mo119883b(D), false, 4, (Object) null);
        }
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* renamed from: d */
    public final String mo119885d(int i, String str) {
        if (i <= 2) {
            return String.valueOf(str.charAt(i));
        }
        return StringsKt__StringsKt.substring(str, new C11466l(3, i));
    }

    /* renamed from: e */
    public final String mo119886e(int i, String str) {
        if (i + 3 > StringsKt__StringsKt.getLastIndex(str)) {
            return "";
        }
        return StringsKt__StringsKt.substring(str, new C11466l(i + 4, StringsKt__StringsKt.getLastIndex(str)));
    }
}
