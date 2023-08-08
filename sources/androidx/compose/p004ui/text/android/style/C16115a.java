package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.a */
public class C16115a extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40074b = 0;

    /* renamed from: a */
    public final float f40075a;

    public C16115a(float f) {
        this.f40075a = f;
    }

    /* renamed from: a */
    public final float mo46546a() {
        return this.f40075a;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f40075a)));
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f40075a)));
    }
}
