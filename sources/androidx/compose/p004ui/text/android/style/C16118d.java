package androidx.compose.p004ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.p004ui.text.android.C16082i1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.style.d */
public final class C16118d {
    @C12579k

    /* renamed from: a */
    public static final String f40079a = "…";

    /* renamed from: androidx.compose.ui.text.android.style.d$a */
    public /* synthetic */ class C16119a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final float m72575a(@C12579k Layout layout, int i, @C12579k Paint paint) {
        int i2;
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        if (!C16082i1.m72475k(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = C16119a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            f = Math.abs(lineLeft);
            f2 = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        } else {
            f = Math.abs(lineLeft);
            f2 = ((float) layout.getWidth()) - primaryHorizontal;
        }
        return f + f2;
    }

    /* renamed from: b */
    public static /* synthetic */ float m72576b(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return m72575a(layout, i, paint);
    }

    /* renamed from: c */
    public static final float m72577c(@C12579k Layout layout, int i, @C12579k Paint paint) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (!C16082i1.m72475k(layout, i)) {
            return 0.0f;
        }
        int i2 = -1;
        if (layout.getParagraphDirection(i) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null) {
            i2 = C16119a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            f = ((float) layout.getWidth()) - layout.getLineRight(i);
            f2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        } else {
            f = ((float) layout.getWidth()) - layout.getLineRight(i);
            f2 = ((float) layout.getWidth()) - lineRight;
        }
        return f - f2;
    }

    /* renamed from: d */
    public static /* synthetic */ float m72578d(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return m72577c(layout, i, paint);
    }
}
