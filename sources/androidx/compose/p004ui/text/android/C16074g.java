package androidx.compose.p004ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0368r0;
import androidx.core.p027os.C17772a;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.g */
public final class C16074g {
    @C12579k

    /* renamed from: a */
    public static final C16074g f39963a = new C16074g();

    /* renamed from: b */
    public static /* synthetic */ BoringLayout m72452b(C16074g gVar, CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        Layout.Alignment alignment2;
        boolean z3;
        boolean z4;
        TextUtils.TruncateAt truncateAt2;
        int i4;
        int i5 = i3;
        if ((i5 & 16) != 0) {
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment2 = alignment;
        }
        if ((i5 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i5 & 64) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        if ((i5 & 128) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i5 & 256) != 0) {
            i4 = i;
        } else {
            i4 = i2;
        }
        return gVar.mo46349a(charSequence, textPaint, i, metrics, alignment2, z3, z4, truncateAt2, i4);
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    @C12579k
    /* renamed from: a */
    public final BoringLayout mo46349a(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, int i, @C12579k BoringLayout.Metrics metrics, @C12579k Layout.Alignment alignment, boolean z, boolean z2, @C12580l TextUtils.TruncateAt truncateAt, int i2) {
        boolean z3;
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence, "text");
        TextPaint textPaint2 = textPaint;
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(alignment, C9168d0.f24891y);
        boolean z4 = true;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i2 < 0) {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (C17772a.m81155k()) {
                return C16071f.m72446a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, z2, truncateAt, i2);
            } else {
                return C16077h.m72458a(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: c */
    public final boolean mo46350c(@C12579k BoringLayout boringLayout) {
        Intrinsics.checkNotNullParameter(boringLayout, "layout");
        if (C17772a.m81155k()) {
            return C16071f.f39962a.mo46348d(boringLayout);
        }
        return false;
    }

    @C12580l
    @C0368r0(markerClass = {C17772a.C17773a.class})
    /* renamed from: d */
    public final BoringLayout.Metrics mo46351d(@C12579k CharSequence charSequence, @C12579k TextPaint textPaint, @C12579k TextDirectionHeuristic textDirectionHeuristic) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic, "textDir");
        if (C17772a.m81155k()) {
            return C16071f.m72448c(charSequence, textPaint, textDirectionHeuristic);
        }
        return C16077h.m72460c(charSequence, textPaint, textDirectionHeuristic);
    }
}
