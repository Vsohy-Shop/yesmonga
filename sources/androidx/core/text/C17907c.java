package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.text.c */
public final class C17907c {

    /* renamed from: a */
    public static final int f46364a = 0;

    /* renamed from: b */
    public static final int f46365b = 1;

    /* renamed from: c */
    public static final int f46366c = 1;

    /* renamed from: d */
    public static final int f46367d = 2;

    /* renamed from: e */
    public static final int f46368e = 4;

    /* renamed from: f */
    public static final int f46369f = 8;

    /* renamed from: g */
    public static final int f46370g = 16;

    /* renamed from: h */
    public static final int f46371h = 32;

    /* renamed from: i */
    public static final int f46372i = 256;

    /* renamed from: j */
    public static final int f46373j = 0;

    /* renamed from: k */
    public static final int f46374k = 63;

    @C0376v0(24)
    /* renamed from: androidx.core.text.c$a */
    public static class C17908a {
        @C0373u
        /* renamed from: a */
        public static Spanned m81485a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @C0373u
        /* renamed from: b */
        public static Spanned m81486b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @C0373u
        /* renamed from: c */
        public static String m81487c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Spanned m81482a(@C0359n0 String str, int i) {
        return C17908a.m81485a(str, i);
    }

    @C0359n0
    /* renamed from: b */
    public static Spanned m81483b(@C0359n0 String str, int i, @C0363p0 Html.ImageGetter imageGetter, @C0363p0 Html.TagHandler tagHandler) {
        return C17908a.m81486b(str, i, imageGetter, tagHandler);
    }

    @C0359n0
    /* renamed from: c */
    public static String m81484c(@C0359n0 Spanned spanned, int i) {
        return C17908a.m81487c(spanned, i);
    }
}
