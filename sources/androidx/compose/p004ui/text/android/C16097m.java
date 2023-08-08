package androidx.compose.p004ui.text.android;

import android.text.Layout;
import androidx.annotation.C0337f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.m */
public final class C16097m {
    @C16085k
    /* renamed from: a */
    public static final int m72497a(@C12579k Layout layout, @C0337f0(from = 0) int i, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            if (z) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        } else if (z) {
            return lineForOffset;
        } else {
            return lineForOffset + 1;
        }
    }
}
