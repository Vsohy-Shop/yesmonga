package androidx.compose.material;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ListItemKt$OffsetToBaselineOrCenter$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ float f7693a;

    public ListItemKt$OffsetToBaselineOrCenter$1(float f) {
        this.f7693a = f;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        C15611w0 t0 = ((C15557e0) list.get(0)).mo44324t0(C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null));
        int A = t0.mo44325A(AlignmentLineKt.m68885a());
        if (A != Integer.MIN_VALUE) {
            i2 = h0Var.mo7429n2(this.f7693a) - A;
            i = Math.max(C16476b.m74363q(j), t0.mo44468G0() + i2);
        } else {
            i = Math.max(C16476b.m74363q(j), t0.mo44468G0());
            i2 = C16494m.m74583o(C8734c.f23406a.mo17066i().mo17059a(C16500q.f40900b.mo47897a(), C16502r.m74668a(0, i - t0.mo44468G0()), h0Var.getLayoutDirection()));
        }
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), i, (Map) null, new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(t0, i2), 4, (Object) null);
    }
}
