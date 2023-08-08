package androidx.compose.p004ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.p004ui.text.android.style.C16123h;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1035:1\n26#2:1036\n26#2:1037\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n1027#1:1036\n1031#1:1037\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.i1 */
public final class C16082i1 {
    @C12579k

    /* renamed from: a */
    public static final C16079h1 f39971a = new C16079h1();
    @C12579k

    /* renamed from: b */
    public static final Pair<Integer, Integer> f39972b = new Pair<>(0, 0);

    /* renamed from: f */
    public static final Pair<Paint.FontMetricsInt, Integer> m72470f(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, C16123h[] hVarArr) {
        boolean z;
        boolean z2;
        int q = textLayout.mo46311q() - 1;
        if (textLayout.mo46305j().getLineStart(q) == textLayout.mo46305j().getLineEnd(q)) {
            if (hVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                SpannableString spannableString = new SpannableString("​");
                C16123h hVar = (C16123h) ArraysKt___ArraysKt.m40180sc(hVarArr);
                int length = spannableString.length();
                if (q == 0 || !hVar.mo46569g()) {
                    z2 = hVar.mo46569g();
                } else {
                    z2 = false;
                }
                spannableString.setSpan(hVar.mo46564b(0, length, z2), 0, spannableString.length(), 33);
                StaticLayout b = C16084j0.m72482b(C16084j0.f39976a, spannableString, 0, spannableString.length(), textPaint, Integer.MAX_VALUE, textDirectionHeuristic, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, textLayout.mo46304i(), textLayout.mo46301f(), 0, 0, 0, 0, (int[]) null, (int[]) null, 2072512, (Object) null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = b.getLineAscent(0);
                fontMetricsInt.descent = b.getLineDescent(0);
                fontMetricsInt.top = b.getLineTop(0);
                int lineBottom = b.getLineBottom(0);
                fontMetricsInt.bottom = lineBottom;
                return new Pair<>(fontMetricsInt, Integer.valueOf(lineBottom - ((int) textLayout.mo46318x(q))));
            }
        }
        return new Pair<>(null, 0);
    }

    /* renamed from: g */
    public static final Pair<Integer, Integer> m72471g(TextLayout textLayout, C16123h[] hVarArr) {
        int i = 0;
        int i2 = 0;
        for (C16123h hVar : hVarArr) {
            if (hVar.mo46566d() < 0) {
                i = Math.max(i, Math.abs(hVar.mo46566d()));
            }
            if (hVar.mo46567e() < 0) {
                i2 = Math.max(i, Math.abs(hVar.mo46567e()));
            }
        }
        if (i == 0 && i2 == 0) {
            return f39972b;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static final C16123h[] m72472h(TextLayout textLayout) {
        boolean z;
        if (!(textLayout.mo46291N() instanceof Spanned)) {
            return new C16123h[0];
        }
        CharSequence N = textLayout.mo46291N();
        Intrinsics.checkNotNull(N, "null cannot be cast to non-null type android.text.Spanned");
        C16123h[] hVarArr = (C16123h[]) ((Spanned) N).getSpans(0, textLayout.mo46291N().length(), C16123h.class);
        Intrinsics.checkNotNullExpressionValue(hVarArr, "lineHeightStyleSpans");
        if (hVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C16123h[0];
        }
        return hVarArr;
    }

    @C12579k
    /* renamed from: i */
    public static final TextDirectionHeuristic m72473i(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic, StaticLayoutBuilderCompat.f75784s);
            return textDirectionHeuristic;
        } else if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic2, StaticLayoutBuilderCompat.f75785t);
            return textDirectionHeuristic2;
        } else if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }

    /* renamed from: j */
    public static final Pair<Integer, Integer> m72474j(TextLayout textLayout) {
        int i;
        int i2;
        if (textLayout.mo46304i() || textLayout.mo46293Q()) {
            return new Pair<>(0, 0);
        }
        TextPaint paint = textLayout.mo46305j().getPaint();
        CharSequence text = textLayout.mo46305j().getText();
        Intrinsics.checkNotNullExpressionValue(paint, "paint");
        Intrinsics.checkNotNullExpressionValue(text, "text");
        Rect c = C16136u.m72609c(paint, text, textLayout.mo46305j().getLineStart(0), textLayout.mo46305j().getLineEnd(0));
        int lineAscent = textLayout.mo46305j().getLineAscent(0);
        int i3 = c.top;
        if (i3 < lineAscent) {
            i = lineAscent - i3;
        } else {
            i = textLayout.mo46305j().getTopPadding();
        }
        if (textLayout.mo46311q() != 1) {
            int q = textLayout.mo46311q() - 1;
            c = C16136u.m72609c(paint, text, textLayout.mo46305j().getLineStart(q), textLayout.mo46305j().getLineEnd(q));
        }
        int lineDescent = textLayout.mo46305j().getLineDescent(textLayout.mo46311q() - 1);
        int i4 = c.bottom;
        if (i4 > lineDescent) {
            i2 = i4 - lineDescent;
        } else {
            i2 = textLayout.mo46305j().getBottomPadding();
        }
        if (i == 0 && i2 == 0) {
            return f39972b;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: k */
    public static final boolean m72475k(@C12579k Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }
}
