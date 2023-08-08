package com.carrefour.fid.android.account.core.util;

import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.C10927c1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.core.util.a */
public final class C13169a {
    @C12579k

    /* renamed from: a */
    public static final String f32326a = "[$@!%*?&+, ]";
    @C12579k

    /* renamed from: b */
    public static final String f32327b = "[A-Z]+";
    @C12579k

    /* renamed from: c */
    public static final String f32328c = "[a-z]";
    @C12579k

    /* renamed from: d */
    public static final String f32329d = "[0-9]";

    /* renamed from: a */
    public static final boolean m57080a(String str) {
        return Pattern.compile("[a-z]").matcher(str).find();
    }

    /* renamed from: b */
    public static final boolean m57081b(String str) {
        return Pattern.compile("[0-9]", 2).matcher(str).find();
    }

    /* renamed from: c */
    public static final boolean m57082c(String str) {
        return Pattern.compile("[$@!%*?&+, ]", 2).matcher(str).find();
    }

    /* renamed from: d */
    public static final boolean m57083d(String str) {
        return Pattern.compile("[A-Z]+").matcher(str).find();
    }

    /* renamed from: e */
    public static final int m57084e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int d = m57083d(str);
        if (m57080a(str)) {
            d++;
        }
        if (m57081b(str)) {
            d++;
        }
        if (m57082c(str)) {
            return d + 1;
        }
        return d;
    }

    @C12579k
    /* renamed from: f */
    public static final Set<SecurityRule> m57085f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Set d = C10927c1.m40881d();
        if (m57083d(str)) {
            d.add(SecurityRule.UPPER_CASE);
        }
        if (m57080a(str)) {
            d.add(SecurityRule.LOWER_CASE);
        }
        if (m57081b(str)) {
            d.add(SecurityRule.NUMERIC);
        }
        if (m57082c(str)) {
            d.add(SecurityRule.SPECIAL_CHARACTER);
        }
        return C10927c1.m40878a(d);
    }
}
