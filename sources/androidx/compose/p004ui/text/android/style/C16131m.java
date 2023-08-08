package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.m */
public class C16131m extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40126b = 0;

    /* renamed from: a */
    public final float f40127a;

    public C16131m(float f) {
        this.f40127a = f;
    }

    /* renamed from: a */
    public final float mo46581a() {
        return this.f40127a;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f40127a + textPaint.getTextSkewX());
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f40127a + textPaint.getTextSkewX());
    }
}
