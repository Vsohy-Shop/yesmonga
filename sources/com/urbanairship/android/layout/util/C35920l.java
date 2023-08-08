package com.urbanairship.android.layout.util;

import androidx.annotation.C0359n0;
import java.util.regex.Pattern;

/* renamed from: com.urbanairship.android.layout.util.l */
public final class C35920l {

    /* renamed from: a */
    public static final Pattern f88822a = Pattern.compile("[^\\d.]");

    /* renamed from: b */
    public static final Pattern f88823b = Pattern.compile("^\\d{1,3}%$");

    @C0359n0
    /* renamed from: a */
    public static String m148108a(@C0359n0 String str) {
        return f88822a.matcher(str).replaceAll("");
    }

    /* renamed from: b */
    public static boolean m148109b(@C0359n0 String str) {
        return f88823b.matcher(str).matches();
    }

    /* renamed from: c */
    public static float m148110c(@C0359n0 String str) {
        return Float.parseFloat(m148108a(str)) / 100.0f;
    }
}
