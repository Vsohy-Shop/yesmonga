package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.g */
public class C21576g {

    /* renamed from: d */
    public static String f55746d = "\r";

    /* renamed from: a */
    public final String f55747a;

    /* renamed from: b */
    public final float f55748b;

    /* renamed from: c */
    public final float f55749c;

    public C21576g(String str, float f, float f2) {
        this.f55747a = str;
        this.f55749c = f2;
        this.f55748b = f;
    }

    /* renamed from: a */
    public boolean mo64442a(String str) {
        if (this.f55747a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f55747a.endsWith(f55746d)) {
            String str2 = this.f55747a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
