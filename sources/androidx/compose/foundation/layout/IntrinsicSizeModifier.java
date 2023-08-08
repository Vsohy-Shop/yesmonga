package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16478c;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public interface IntrinsicSizeModifier extends C15603u {
    /* renamed from: C5 */
    boolean mo7801C5() {
        return true;
    }

    /* renamed from: M4 */
    long mo7802M4(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j);

    /* renamed from: c */
    int mo7060c(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44320d(i);
    }

    /* renamed from: d */
    int mo7061d(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44317a0(i);
    }

    /* renamed from: f */
    int mo7062f(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44322o0(i);
    }

    /* renamed from: h */
    int mo7063h(@C12579k C15583m mVar, @C12579k C15580l lVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "measurable");
        return lVar.mo44323p0(i);
    }

    @C12579k
    /* renamed from: i */
    C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        long M4 = mo7802M4(h0Var, e0Var, j);
        if (mo7801C5()) {
            M4 = C16478c.m74380e(j, M4);
        }
        C15611w0 t0 = e0Var.mo44324t0(M4);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new IntrinsicSizeModifier$measure$1(t0), 4, (Object) null);
    }
}
