package androidx.compose.p004ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C0376v0(33)
/* renamed from: androidx.compose.ui.text.android.f */
public final class C16071f {
    @C12579k

    /* renamed from: a */
    public static final C16071f f39962a = new C16071f();

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: a */
    public static final BoringLayout m72446a(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, int i, @C12579k Layout.Alignment alignment, float f, float f2, @C12579k BoringLayout.Metrics metrics, boolean z, boolean z2, @C12580l TextUtils.TruncateAt truncateAt, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(alignment, C9168d0.f24891y);
        BoringLayout.Metrics metrics2 = metrics;
        Intrinsics.checkNotNullParameter(metrics2, "metrics");
        BoringLayout a = C16062c.m72437a(charSequence, textPaint, i, alignment, f, f2, metrics2, z, truncateAt, i2, z2);
        Intrinsics.checkNotNullExpressionValue(a, "create(\n            text…backLineSpacing\n        )");
        return a;
    }

    /* renamed from: b */
    public static /* synthetic */ BoringLayout m72447b(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        int i4 = i3;
        return m72446a(charSequence, textPaint, i, alignment, f, f2, metrics, z, z2, (i4 & 512) != 0 ? null : truncateAt, (i4 & 1024) != 0 ? i : i2);
    }

    @C12580l
    @C0373u
    @C11384m
    /* renamed from: c */
    public static final BoringLayout.Metrics m72448c(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, @C12579k TextDirectionHeuristic textDirectionHeuristic) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic, "textDir");
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, (BoringLayout.Metrics) null);
    }

    /* renamed from: d */
    public final boolean mo46348d(@C12579k BoringLayout boringLayout) {
        Intrinsics.checkNotNullParameter(boringLayout, "layout");
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
