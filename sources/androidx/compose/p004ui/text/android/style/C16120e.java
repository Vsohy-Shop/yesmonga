package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.e */
public final class C16120e extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40080b = 0;

    /* renamed from: a */
    public final float f40081a;

    public C16120e(float f) {
        this.f40081a = f;
    }

    /* renamed from: a */
    public final float mo46554a() {
        return this.f40081a;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f40081a);
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f40081a);
    }
}
