package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import com.urbanairship.automation.C8970v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.text.c0 */
public final class C17909c0 {
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: a */
    public static final void m81488a(@C12579k Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    /* renamed from: b */
    public static final void m81489b(@C12579k Spannable spannable, int i, int i2, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    /* renamed from: c */
    public static final void m81490c(@C12579k Spannable spannable, @C12579k C11466l lVar, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C8970v.f24100k);
        Intrinsics.checkNotNullParameter(obj, "span");
        spannable.setSpan(obj, lVar.getStart().intValue(), lVar.mo23013q().intValue(), 17);
    }

    @C12579k
    /* renamed from: d */
    public static final Spannable m81491d(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }
}
