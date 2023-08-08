package com.contentsquare.android.sdk;

import android.text.TextUtils;
import com.carrefour.fid.android.airship.util.C13758b;

/* renamed from: com.contentsquare.android.sdk.g3 */
public class C14358g3 {

    /* renamed from: a */
    public static final C14453jf f35514a = new C14453jf("Strings");

    /* renamed from: a */
    public static String m61807a(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0) {
            return str;
        }
        char c = charArray[0];
        if (!Character.isLowerCase(c)) {
            return str;
        }
        charArray[0] = Character.toUpperCase(c);
        return String.valueOf(charArray);
    }

    /* renamed from: b */
    public static boolean m61808b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: c */
    public static boolean m61809c(String str) {
        return C13758b.f33436b.equals(str) || C13758b.f33438c.equals(str);
    }

    /* renamed from: d */
    public static boolean m61810d(String str) {
        return TextUtils.isDigitsOnly(str) && !str.isEmpty();
    }

    /* renamed from: e */
    public static boolean m61811e(String str) {
        return str == null || str.isEmpty();
    }
}
