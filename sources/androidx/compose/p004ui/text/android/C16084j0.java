package androidx.compose.p004ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0337f0;
import androidx.annotation.C0379x;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.j0 */
public final class C16084j0 {
    @C12579k

    /* renamed from: a */
    public static final C16084j0 f39976a = new C16084j0();
    @C12579k

    /* renamed from: b */
    public static final C16096l0 f39977b = new C16140w();

    /* renamed from: b */
    public static /* synthetic */ StaticLayout m72482b(C16084j0 j0Var, CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        int i12 = i11;
        return j0Var.mo46474a(charSequence, (i12 & 2) != 0 ? 0 : i, (i12 & 4) != 0 ? charSequence.length() : i2, textPaint, i3, (i12 & 32) != 0 ? C16088l.f39996a.mo46480b() : textDirectionHeuristic, (i12 & 64) != 0 ? C16088l.f39996a.mo46479a() : alignment, (i12 & 128) != 0 ? Integer.MAX_VALUE : i4, (i12 & 256) != 0 ? null : truncateAt, (i12 & 512) != 0 ? i3 : i5, (i12 & 1024) != 0 ? 1.0f : f, (i12 & 2048) != 0 ? 0.0f : f2, (i12 & 4096) != 0 ? 0 : i6, (i12 & 8192) != 0 ? false : z, (i12 & 16384) != 0 ? true : z2, (32768 & i12) != 0 ? 0 : i7, (65536 & i12) != 0 ? 0 : i8, (131072 & i12) != 0 ? 0 : i9, (262144 & i12) != 0 ? 0 : i10, (524288 & i12) != 0 ? null : iArr, (i12 & 1048576) != 0 ? null : iArr2);
    }

    @C12579k
    /* renamed from: a */
    public final StaticLayout mo46474a(@C12579k CharSequence charSequence, int i, int i2, @C12579k TextPaint textPaint, int i3, @C12579k TextDirectionHeuristic textDirectionHeuristic, @C12579k Layout.Alignment alignment, @C0337f0(from = 0) int i4, @C12580l TextUtils.TruncateAt truncateAt, @C0337f0(from = 0) int i5, @C0379x(from = 0.0d) float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, @C12580l int[] iArr, @C12580l int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "text");
        Intrinsics.checkNotNullParameter(textPaint, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic, "textDir");
        Intrinsics.checkNotNullParameter(alignment, C9168d0.f24891y);
        C16101n0 n0Var = r0;
        C16096l0 l0Var = f39977b;
        C16101n0 n0Var2 = new C16101n0(charSequence2, i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2);
        return l0Var.mo46476a(n0Var);
    }

    /* renamed from: c */
    public final boolean mo46475c(@C12579k StaticLayout staticLayout, boolean z) {
        Intrinsics.checkNotNullParameter(staticLayout, "layout");
        return f39977b.mo46477b(staticLayout, z);
    }
}
