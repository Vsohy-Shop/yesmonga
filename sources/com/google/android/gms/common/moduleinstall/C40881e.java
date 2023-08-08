package com.google.android.gms.common.moduleinstall;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.C40501f;

/* renamed from: com.google.android.gms.common.moduleinstall.e */
public final class C40881e extends C40501f {

    /* renamed from: t */
    public static final int f104040t = 0;

    /* renamed from: u */
    public static final int f104041u = 46000;

    /* renamed from: v */
    public static final int f104042v = 46001;

    /* renamed from: w */
    public static final int f104043w = 46002;

    /* renamed from: x */
    public static final int f104044x = 46003;

    @C0359n0
    /* renamed from: a */
    public static String m166304a(int i) {
        switch (i) {
            case f104041u /*46000*/:
                return "UNKNOWN_MODULE";
            case f104042v /*46001*/:
                return "NOT_ALLOWED_MODULE";
            case f104043w /*46002*/:
                return "MODULE_NOT_FOUND";
            case f104044x /*46003*/:
                return "INSUFFICIENT_STORAGE";
            default:
                return C40501f.m164764a(i);
        }
    }
}
