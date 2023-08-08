package androidx.compose.p004ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.C0344h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.u */
public final class C16136u {
    /* renamed from: a */
    public static final void m72607a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    /* renamed from: b */
    public static final void m72608b(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            C16134t.m72605a(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }

    @C12579k
    /* renamed from: c */
    public static final Rect m72609c(@C12579k TextPaint textPaint, @C12579k CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
            if (C16138v.m72613b(spanned, cls, i, i2)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    Intrinsics.checkNotNullExpressionValue(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    m72608b(textPaint2, charSequence, i, nextSpanTransition, rect2);
                    m72607a(rect, rect2);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        return m72610d(textPaint, charSequence, i, i2);
    }

    @C0344h1
    @C12579k
    /* renamed from: d */
    public static final Rect m72610d(@C12579k Paint paint, @C12579k CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Rect rect = new Rect();
        m72608b(paint, charSequence, i, i2, rect);
        return rect;
    }
}
