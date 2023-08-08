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

public final class MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ MotionMeasurer f41191a;

    /* renamed from: b */
    public final /* synthetic */ C16602j f41192b;

    /* renamed from: c */
    public final /* synthetic */ C16602j f41193c;

    /* renamed from: d */
    public final /* synthetic */ C16615n0 f41194d;

    /* renamed from: e */
    public final /* synthetic */ int f41195e;

    /* renamed from: f */
    public final /* synthetic */ C8700z0<Float> f41196f;

    public MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1(MotionMeasurer motionMeasurer, C16602j jVar, C16602j jVar2, C16615n0 n0Var, int i, C8700z0<Float> z0Var) {
        this.f41191a = motionMeasurer;
        this.f41192b = jVar;
        this.f41193c = jVar2;
        this.f41194d = n0Var;
        this.f41195e = i;
        this.f41196f = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        List<? extends C15557e0> list2 = list;
        C15568h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(h0Var, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        long V = this.f41191a.mo48439V(j, h0Var.getLayoutDirection(), this.f41192b, this.f41193c, this.f41194d, list, this.f41195e, this.f41196f.getValue().floatValue(), h0Var);
        return C15568h0.m69206r2(h0Var, C16500q.m74662m(V), C16500q.m74659j(V), (Map) null, new MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1(this.f41191a, list2), 4, (Object) null);
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
