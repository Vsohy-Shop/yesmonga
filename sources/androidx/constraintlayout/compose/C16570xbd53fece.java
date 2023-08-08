package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8700z0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1 */
public final class C16570xbd53fece implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ Measurer f41139a;

    /* renamed from: b */
    public final /* synthetic */ ConstraintSetForInlineDsl f41140b;

    /* renamed from: c */
    public final /* synthetic */ int f41141c;

    /* renamed from: d */
    public final /* synthetic */ C8700z0<Boolean> f41142d;

    public C16570xbd53fece(Measurer measurer, ConstraintSetForInlineDsl constraintSetForInlineDsl, int i, C8700z0<Boolean> z0Var) {
        this.f41139a = measurer;
        this.f41140b = constraintSetForInlineDsl;
        this.f41141c = i;
        this.f41142d = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list, "measurables");
        long z = this.f41139a.mo48410z(j, h0Var.getLayoutDirection(), this.f41140b, list, this.f41141c, h0Var);
        this.f41142d.getValue();
        return C15568h0.m69206r2(h0Var, C16500q.m74662m(z), C16500q.m74659j(z), (Map) null, new C16571x78640815(this.f41139a, list), 4, (Object) null);
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        return C15560f0.C15561a.m69174b(this, mVar, list, i);
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        return C15560f0.C15561a.m69175c(this, mVar, list, i);
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        return C15560f0.C15561a.m69176d(this, mVar, list, i);
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        return C15560f0.C15561a.m69173a(this, mVar, list, i);
    }
}
