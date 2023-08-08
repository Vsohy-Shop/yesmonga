package androidx.compose.p004ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.b */
public final class C16116b extends MetricAffectingSpan {

    /* renamed from: b */
    public static final int f40076b = 0;
    @C12579k

    /* renamed from: a */
    public final String f40077a;

    public C16116b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "fontFeatureSettings");
        this.f40077a = str;
    }

    @C12579k
    /* renamed from: a */
    public final String mo46549a() {
        return this.f40077a;
    }

    public void updateDrawState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f40077a);
    }

    public void updateMeasureState(@C12579k TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f40077a);
    }
}
