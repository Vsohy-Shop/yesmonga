package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.C0359n0;
import com.google.firebase.perf.logging.C33363a;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.perf.util.k */
public class C33443k {

    /* renamed from: a */
    public static Boolean f81344a;

    /* renamed from: a */
    public static int m134835a(@C0359n0 byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < 4 && i < bArr.length) {
            i2 |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static void m134836b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static boolean m134837c(@C0359n0 Context context) {
        Boolean bool = f81344a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f81344a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C33363a e2 = C33363a.m134449e();
            e2.mo96429a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public static int m134838d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: e */
    public static String m134839e(@C0359n0 String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse != null) {
            return parse.newBuilder().username("").password("").query((String) null).fragment((String) null).toString();
        }
        return str;
    }

    /* renamed from: f */
    public static String m134840f(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return str.substring(0, i);
        }
        if (parse.encodedPath().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i - 1)) < 0) {
            return str.substring(0, i);
        }
        return str.substring(0, lastIndexOf);
    }
}
