package androidx.compose.p004ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.o */
public final class C16133o extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40131b = 8;
    @C12579k

    /* renamed from: a */
    public final Typeface f40132a;

    public C16133o(@C12579k Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f40132a = typeface;
    }

    @C12579k
    /* renamed from: a */
    public final Typeface mo46587a() {
        return this.f40132a;
    }

    /* renamed from: b */
    public final void mo46588b(Paint paint) {
        paint.setTypeface(this.f40132a);
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        mo46588b(textPaint);
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        mo46588b(textPaint);
    }
}
