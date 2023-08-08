package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.unit.C16476b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.layout.f0 */
public final class C2357f0 implements IntrinsicSizeModifier {
    @C12579k

    /* renamed from: a */
    public static final C2357f0 f6268a = new C2357f0();

    /* renamed from: M4 */
    public long mo7802M4(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$calculateContentConstraints");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        return C16476b.f40850b.mo47812e(e0Var.mo44322o0(C16476b.m74361o(j)));
    }

    /* renamed from: h */
    public int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44322o0(i);
    }
}
