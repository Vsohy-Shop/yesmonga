package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.layout.p0 */
public final class C2397p0 implements IntrinsicSizeModifier {
    @C12579k

    /* renamed from: a */
    public static final C2397p0 f6310a = new C2397p0();

    /* renamed from: b */
    public static final boolean f6311b = false;

    /* renamed from: C5 */
    public boolean mo7801C5() {
        return f6311b;
    }

    /* renamed from: M4 */
    public long mo7802M4(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$calculateContentConstraints");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        return C16476b.f40850b.mo47811d(e0Var.mo44317a0(C16476b.m74362p(j)));
    }

    /* renamed from: c */
    public int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44317a0(i);
    }
}
