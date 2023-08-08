package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.Locale;

/* renamed from: androidx.core.text.h0 */
public final class C17927h0 {

    /* renamed from: a */
    public static final Locale f46393a = new Locale("", "");

    /* renamed from: b */
    public static final String f46394b = "Arab";

    /* renamed from: c */
    public static final String f46395c = "Hebr";

    @C0376v0(17)
    /* renamed from: androidx.core.text.h0$a */
    public static class C17928a {
        @C0373u
        /* renamed from: a */
        public static int m81526a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m81523a(@C0359n0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m81524b(@C0363p0 Locale locale) {
        return C17928a.m81526a(locale);
    }

    @C0359n0
    /* renamed from: c */
    public static String m81525c(@C0359n0 String str) {
        return TextUtils.htmlEncode(str);
    }
}
