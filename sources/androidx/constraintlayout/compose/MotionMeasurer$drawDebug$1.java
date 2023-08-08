package androidx.constraintlayout.compose;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.constraintlayout.core.state.C16772o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class MotionMeasurer$drawDebug$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ MotionMeasurer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MotionMeasurer$drawDebug$1(MotionMeasurer motionMeasurer) {
        super(1);
        this.this$0 = motionMeasurer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        C15242j3 c = C15242j3.f37562a.mo42856c(new float[]{10.0f, 10.0f}, 0.0f);
        Iterator<ConstraintWidget> it = this.this$0.mo48404t().mo49843l2().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            C16772o J = this.this$0.mo48435R().mo49362J(next);
            C16772o z = this.this$0.mo48435R().mo49383z(next);
            MotionMeasurer motionMeasurer = this.this$0;
            eVar.mo42683q5().mo42703a().mo42712e(2.0f, 2.0f);
            float t = C15104m.m65023t(eVar.mo42718b());
            float m = C15104m.m65016m(eVar.mo42718b());
            Intrinsics.checkNotNullExpressionValue(J, "startFrame");
            Intrinsics.checkNotNullExpressionValue(z, "endFrame");
            C15240j2.C15241a aVar = C15240j2.f37547b;
            C16772o oVar = z;
            C15242j3 j3Var = c;
            motionMeasurer.mo48429L(eVar, t, m, J, oVar, j3Var, aVar.mo42852w());
            eVar.mo42683q5().mo42703a().mo42712e(-2.0f, -2.0f);
            this.this$0.mo48429L(eVar, C15104m.m65023t(eVar.mo42718b()), C15104m.m65016m(eVar.mo42718b()), J, oVar, j3Var, aVar.mo42842c());
        }
    }
}
