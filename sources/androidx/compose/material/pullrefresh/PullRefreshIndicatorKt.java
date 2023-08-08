package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2693n;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.C3044g0;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15251k3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,242:1\n50#2:243\n49#2:244\n25#2:252\n36#2:260\n1114#3,6:245\n1114#3,3:253\n1117#3,3:257\n1114#3,6:261\n154#4:251\n154#4:285\n164#4:286\n164#4:287\n154#4:288\n154#4:289\n154#4:290\n1#5:256\n136#6,5:267\n261#6,11:272\n76#7:283\n76#7:284\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n81#1:243\n81#1:244\n127#1:252\n129#1:260\n81#1:245,6\n127#1:253,3\n127#1:257,3\n129#1:261,6\n91#1:251\n230#1:285\n232#1:286\n233#1:287\n234#1:288\n235#1:289\n236#1:290\n222#1:267,5\n222#1:272,11\n81#1:283\n129#1:284\n*E\n"})
public final class PullRefreshIndicatorKt {

    /* renamed from: a */
    public static final int f18913a = 100;

    /* renamed from: b */
    public static final float f18914b = 0.8f;

    /* renamed from: c */
    public static final float f18915c = C16483g.m74435M((float) 40);
    @C12579k

    /* renamed from: d */
    public static final C2693n f18916d = C2694o.m12169k();

    /* renamed from: e */
    public static final float f18917e = C16483g.m74435M((float) 7.5d);

    /* renamed from: f */
    public static final float f18918f = C16483g.m74435M((float) 2.5d);

    /* renamed from: g */
    public static final float f18919g = C16483g.m74435M((float) 10);

    /* renamed from: h */
    public static final float f18920h = C16483g.m74435M((float) 5);

    /* renamed from: i */
    public static final float f18921i = C16483g.m74435M((float) 6);

    /* renamed from: j */
    public static final float f18922j = 0.3f;

    /* renamed from: k */
    public static final float f18923k = 1.0f;
    @C12579k

    /* renamed from: l */
    public static final C2023z0<Float> f18924l = C1972h.m8392q(300, 0, C1947b0.m8291c(), 2, (Object) null);

    /* renamed from: a */
    public static final C7899a m25102a(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * ((float) 5)) / ((float) 3);
        float H = C11479u.m44331H(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 16.0f) + (H - (((float) Math.pow((double) H, (double) 2)) / ((float) 4)))) * 0.5f;
        float f2 = (float) 360;
        return new C7899a(pow, pow * f2, ((0.8f * max) + pow) * f2, Math.min(1.0f, max));
    }

    @C8540g
    @C3044g0
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m25103b(PullRefreshState pullRefreshState, long j, C8767m mVar, C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-486016981);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-486016981, i, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:121)");
        }
        o.mo14918M(-492369756);
        Object N = o.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        C15231i3 i3Var = N;
        if (N == aVar.mo16277a()) {
            C15231i3 a = C15318t0.m66550a();
            a.mo42806g(C15251k3.f37571b.mo42873a());
            o.mo14893C(a);
            i3Var = a;
        }
        o.mo15002m0();
        C15231i3 i3Var2 = (C15231i3) i3Var;
        o.mo14918M(1157296644);
        boolean n0 = o.mo15006n0(pullRefreshState);
        Object N2 = o.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = C8415c2.m30235d(new PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1(pullRefreshState));
            o.mo14893C(N2);
        }
        o.mo15002m0();
        CanvasKt.m8873b(SemanticsModifierKt.m71868c(mVar, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.f18925f, 1, (Object) null), new PullRefreshIndicatorKt$CircularArrowIndicator$2(pullRefreshState, AnimateAsStateKt.m7972f(m25104c((C8578k2) N2), f18924l, 0.0f, (C11300l) null, o, 48, 12), j, i3Var2), o, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PullRefreshIndicatorKt$CircularArrowIndicator$3(pullRefreshState, j, mVar, i));
        }
    }

    /* renamed from: c */
    public static final float m25104c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C3044g0
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m25105d(boolean z, @C12579k PullRefreshState pullRefreshState, @C12580l C8767m mVar, long j, long j2, boolean z2, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        long j3;
        int i3;
        long j4;
        boolean z3;
        float f;
        PullRefreshState pullRefreshState2 = pullRefreshState;
        Intrinsics.checkNotNullParameter(pullRefreshState2, "state");
        C8592o o = oVar.mo15009o(308716636);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j3 = C7933t0.f19075a.mo11075a(o, 6).mo10975n();
        } else {
            j3 = j;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            i3 &= -57345;
            j4 = ColorsKt.m13381b(j3, o, (i3 >> 9) & 14);
        } else {
            j4 = j2;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(308716636, i3, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:72)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        o.mo14918M(511388516);
        boolean n0 = o.mo15006n0(valueOf) | o.mo15006n0(pullRefreshState2);
        Object N = o.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C8415c2.m30235d(new PullRefreshIndicatorKt$PullRefreshIndicator$showElevation$2$1(z, pullRefreshState2));
            o.mo14893C(N);
        } else {
            boolean z4 = z;
        }
        o.mo15002m0();
        C8767m a = PullRefreshIndicatorTransformKt.m25115a(SizeKt.m10087C(aVar, f18915c), pullRefreshState2, z3);
        C2693n nVar = f18916d;
        if (m25106e((C8578k2) N)) {
            f = f18921i;
        } else {
            f = C16483g.m74435M((float) 0);
        }
        boolean z5 = z3;
        long j5 = j3;
        SurfaceKt.m13879b(a, nVar, j3, 0, (C2223i) null, f, C8553b.m31048b(o, -194757728, true, new PullRefreshIndicatorKt$PullRefreshIndicator$1(z, i3, j4, pullRefreshState)), o, ((i3 >> 3) & 896) | 1572912, 24);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PullRefreshIndicatorKt$PullRefreshIndicator$2(z, pullRefreshState, aVar, j5, j4, z5, i, i2));
        }
    }

    /* renamed from: e */
    public static final boolean m25106e(C8578k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* renamed from: k */
    public static final void m25112k(C15187e eVar, C15231i3 i3Var, C15098i iVar, long j, float f, C7899a aVar) {
        i3Var.reset();
        i3Var.mo42815p(0.0f, 0.0f);
        float f2 = f18919g;
        i3Var.mo42823w(eVar.mo7425g5(f2) * aVar.mo10957c(), 0.0f);
        i3Var.mo42823w((eVar.mo7425g5(f2) * aVar.mo10957c()) / ((float) 2), eVar.mo7425g5(f18920h) * aVar.mo10957c());
        i3Var.mo42810j(C15096g.m64898a(((Math.min(iVar.mo42253G(), iVar.mo42278r()) / 2.0f) + C15094f.m64880p(iVar.mo42275o())) - ((eVar.mo7425g5(f2) * aVar.mo10957c()) / 2.0f), C15094f.m64882r(iVar.mo42275o()) + (eVar.mo7425g5(f18918f) / 2.0f)));
        i3Var.close();
        float a = aVar.mo10955a();
        long U = eVar.mo42717U();
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(a, U);
        C15187e.m65698O1(eVar, i3Var, j, f, (C15192h) null, (C15249k2) null, 0, 56, (Object) null);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }
}
