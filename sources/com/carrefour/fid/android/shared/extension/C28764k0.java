package com.carrefour.fid.android.shared.extension;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSpanned.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spanned.kt\ncom/carrefour/fid/android/shared/extension/SpannedKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,27:1\n1098#2:28\n34#3:29\n13579#4,2:30\n*S KotlinDebug\n*F\n+ 1 Spanned.kt\ncom/carrefour/fid/android/shared/extension/SpannedKt\n*L\n13#1:28\n16#1:29\n16#1:30,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.k0 */
public final class C28764k0 {
    @C12579k
    /* renamed from: a */
    public static final C16156d m119072a(@C12579k SpannableString spannableString) {
        SpannableString spannableString2 = spannableString;
        Intrinsics.checkNotNullParameter(spannableString2, "<this>");
        C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
        String spannableString3 = spannableString.toString();
        Intrinsics.checkNotNullExpressionValue(spannableString3, "spannable.toString()");
        aVar.mo46707l(spannableString3);
        Object[] spans = spannableString2.getSpans(0, spannableString.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        for (Object obj : spans) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    aVar.mo46698c(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null), spannableString2.getSpanStart(obj), spannableString2.getSpanEnd(obj));
                } else if (style == 2) {
                    aVar.mo46698c(new C16151c0(0, 0, (C16209i0) null, C16190e0.m72948c(C16190e0.f40252b.mo46882a()), (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16375, (DefaultConstructorMarker) null), spannableString2.getSpanStart(obj), spannableString2.getSpanEnd(obj));
                }
            }
        }
        return aVar.mo46716u();
    }
}
