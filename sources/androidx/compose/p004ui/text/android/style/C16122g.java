package androidx.compose.p004ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.g */
public final class C16122g implements LineHeightSpan {

    /* renamed from: b */
    public static final int f40084b = 0;

    /* renamed from: a */
    public final float f40085a;

    public C16122g(float f) {
        this.f40085a = f;
    }

    /* renamed from: a */
    public final float mo46561a() {
        return this.f40085a;
    }

    public void chooseHeight(@C12579k CharSequence charSequence, int i, int i2, int i3, int i4, @C12579k Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        int a = C16124i.m72590a(fontMetricsInt);
        if (a > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.f40085a));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) a))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
