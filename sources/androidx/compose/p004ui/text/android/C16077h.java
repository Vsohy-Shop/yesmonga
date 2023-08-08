package androidx.compose.p004ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0373u;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.h */
public final class C16077h {
    @C12579k

    /* renamed from: a */
    public static final C16077h f39964a = new C16077h();

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: a */
    public static final BoringLayout m72458a(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, int i, @C12579k Layout.Alignment alignment, float f, float f2, @C12579k BoringLayout.Metrics metrics, boolean z, @C12580l TextUtils.TruncateAt truncateAt, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(alignment, C9168d0.f24891y);
        BoringLayout.Metrics metrics2 = metrics;
        Intrinsics.checkNotNullParameter(metrics2, "metrics");
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics2, z, truncateAt, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ BoringLayout m72459b(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        int i4 = i3;
        return m72458a(charSequence, textPaint, i, alignment, f, f2, metrics, z, (i4 & 256) != 0 ? null : truncateAt, (i4 & 512) != 0 ? i : i2);
    }

    @C12580l
    @C0373u
    @C11384m
    /* renamed from: c */
    public static final BoringLayout.Metrics m72460c(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, @C12579k TextDirectionHeuristic textDirectionHeuristic) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic, "textDir");
        if (!textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) null);
        }
        return null;
    }
}
