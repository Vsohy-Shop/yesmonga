package androidx.compose.p004ui.text.platform;

import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.platform.m */
public final class C16384m {
    /* renamed from: a */
    public static final void m73954a(@C12579k TextPaint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(C11409d.m43851L0(C11479u.m44331H(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }
}
