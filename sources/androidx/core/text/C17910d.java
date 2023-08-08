package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.core.text.d */
public final class C17910d {
    @C12579k
    /* renamed from: a */
    public static final Spanned m81492a(@C12579k String str, int i, @C12580l Html.ImageGetter imageGetter, @C12580l Html.TagHandler tagHandler) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned b = C17907c.m81483b(str, i, imageGetter, tagHandler);
        Intrinsics.checkNotNullExpressionValue(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    /* renamed from: b */
    public static /* synthetic */ Spanned m81493b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned b = C17907c.m81483b(str, i, imageGetter, tagHandler);
        Intrinsics.checkNotNullExpressionValue(b, "fromHtml(this, flags, imageGetter, tagHandler)");
        return b;
    }

    @C12579k
    /* renamed from: c */
    public static final String m81494c(@C12579k Spanned spanned, int i) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        String c = C17907c.m81484c(spanned, i);
        Intrinsics.checkNotNullExpressionValue(c, "toHtml(this, option)");
        return c;
    }

    /* renamed from: d */
    public static /* synthetic */ String m81495d(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        String c = C17907c.m81484c(spanned, i);
        Intrinsics.checkNotNullExpressionValue(c, "toHtml(this, option)");
        return c;
    }
}
