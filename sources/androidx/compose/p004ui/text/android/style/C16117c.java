package androidx.compose.p004ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p004ui.text.android.C16082i1;
import androidx.compose.p004ui.text.android.C16085k;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.android.style.c */
public final class C16117c implements LeadingMarginSpan {

    /* renamed from: a */
    public static final int f40078a = 0;

    public void drawLeadingMargin(@C12580l Canvas canvas, @C12580l Paint paint, int i, int i2, int i3, int i4, int i5, @C12580l CharSequence charSequence, int i6, int i7, boolean z, @C12580l Layout layout) {
        if (layout != null && paint != null) {
            int lineForOffset = layout.getLineForOffset(i6);
            boolean z2 = true;
            if (lineForOffset == layout.getLineCount() - 1 && C16082i1.m72475k(layout, lineForOffset)) {
                float a = C16118d.m72575a(layout, lineForOffset, paint) + C16118d.m72577c(layout, lineForOffset, paint);
                if (a != 0.0f) {
                    z2 = false;
                }
                if (!z2) {
                    Intrinsics.checkNotNull(canvas);
                    canvas.translate(a, 0.0f);
                }
            }
        }
    }

    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
