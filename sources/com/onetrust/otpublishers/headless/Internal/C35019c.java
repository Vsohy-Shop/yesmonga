package com.onetrust.otpublishers.headless.Internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.airship.util.C13758b;

/* renamed from: com.onetrust.otpublishers.headless.Internal.c */
public final class C35019c {
    @C0359n0
    /* renamed from: a */
    public static String m143596a(boolean z) {
        return Boolean.valueOf(z).toString();
    }

    /* renamed from: b */
    public static boolean m143597b(@C0363p0 String str) {
        return Boolean.parseBoolean(str);
    }

    /* renamed from: c */
    public static boolean m143598c(@C0363p0 String str, boolean z) {
        return C35020d.m143605J(str) ? z : C13758b.f33436b.equalsIgnoreCase(str);
    }
}
