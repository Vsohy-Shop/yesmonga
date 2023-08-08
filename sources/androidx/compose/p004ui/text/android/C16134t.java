package androidx.compose.p004ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(29)
/* renamed from: androidx.compose.ui.text.android.t */
public final class C16134t {
    @C12579k

    /* renamed from: a */
    public static final C16134t f40133a = new C16134t();

    @C0373u
    @C11384m
    /* renamed from: a */
    public static final void m72605a(@C12579k Paint paint, @C12579k CharSequence charSequence, int i, int i2, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}
