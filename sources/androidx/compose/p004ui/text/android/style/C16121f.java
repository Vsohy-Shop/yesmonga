package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.C0372t0;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.f */
public final class C16121f extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40082b = 0;

    /* renamed from: a */
    public final float f40083a;

    public C16121f(@C0372t0 float f) {
        this.f40083a = f;
    }

    /* renamed from: a */
    public final float mo46557a() {
        return this.f40083a;
    }

    /* renamed from: b */
    public final void mo46558b(TextPaint textPaint) {
        boolean z;
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.f40083a / textSize);
        }
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        mo46558b(textPaint);
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        mo46558b(textPaint);
    }
}
