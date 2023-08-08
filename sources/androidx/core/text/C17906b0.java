package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.C0354l;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.text.b0 */
public final class C17906b0 {
    @C12579k
    /* renamed from: a */
    public static final SpannableStringBuilder m81470a(@C12579k SpannableStringBuilder spannableStringBuilder, @C0354l int i, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: b */
    public static final SpannableStringBuilder m81471b(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: c */
    public static final SpannedString m81472c(@C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @C12579k
    /* renamed from: d */
    public static final SpannableStringBuilder m81473d(@C12579k SpannableStringBuilder spannableStringBuilder, @C0354l int i, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: e */
    public static final SpannableStringBuilder m81474e(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k Object obj, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(obj, "span");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: f */
    public static final SpannableStringBuilder m81475f(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k Object[] objArr, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "spans");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: g */
    public static final SpannableStringBuilder m81476g(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: h */
    public static final SpannableStringBuilder m81477h(@C12579k SpannableStringBuilder spannableStringBuilder, float f, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: i */
    public static final SpannableStringBuilder m81478i(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: j */
    public static final SpannableStringBuilder m81479j(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: k */
    public static final SpannableStringBuilder m81480k(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: l */
    public static final SpannableStringBuilder m81481l(@C12579k SpannableStringBuilder spannableStringBuilder, @C12579k C11300l<? super SpannableStringBuilder, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
