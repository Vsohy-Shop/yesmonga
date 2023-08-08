package androidx.compose.material.pullrefresh;

import androidx.compose.material.C3044g0;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,233:1\n154#2:234\n1#3:235\n474#4,4:236\n478#4,2:244\n482#4:250\n25#5:240\n36#5:252\n1114#6,3:241\n1117#6,3:247\n1114#6,6:253\n474#7:246\n76#8:251\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n62#1:234\n64#1:236,4\n64#1:244,2\n64#1:250\n64#1:240\n74#1:252\n64#1:241,3\n64#1:247,3\n74#1:253,6\n64#1:246\n69#1:251\n*E\n"})
public final class PullRefreshStateKt {

    /* renamed from: a */
    public static final float f18940a = 0.5f;

    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final PullRefreshState m25162a(boolean z, @C12579k C11289a<C11079d2> aVar, float f, float f2, @C12580l C8592o oVar, int i, int i2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(aVar, "onRefresh");
        oVar.mo14918M(-174977512);
        if ((i2 & 4) != 0) {
            f = C7900b.f18945a.mo10959a();
        }
        if ((i2 & 8) != 0) {
            f2 = C7900b.f18945a.mo10960b();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-174977512, i, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:55)");
        }
        if (C16483g.m74452z(f, C16483g.m74435M((float) 0)) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            oVar.mo14918M(773894976);
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            C8592o.C8593a aVar2 = C8592o.f23032a;
            if (N == aVar2.mo16277a()) {
                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
                oVar.mo14893C(wVar);
                N = wVar;
            }
            oVar.mo15002m0();
            C12074o0 a = ((C8690w) N).mo16831a();
            oVar.mo15002m0();
            C8578k2<T> t = C8415c2.m30251t(aVar, oVar, (i >> 3) & 14);
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            floatRef.element = dVar.mo7425g5(f);
            floatRef2.element = dVar.mo7425g5(f2);
            oVar.mo14918M(1157296644);
            boolean n0 = oVar.mo15006n0(a);
            Object N2 = oVar.mo14921N();
            if (n0 || N2 == aVar2.mo16277a()) {
                N2 = new PullRefreshState(a, t, floatRef2.element, floatRef.element);
                oVar.mo14893C(N2);
            }
            oVar.mo15002m0();
            PullRefreshState pullRefreshState = (PullRefreshState) N2;
            EffectsKt.m29899k(new PullRefreshStateKt$rememberPullRefreshState$3(pullRefreshState, z, floatRef, floatRef2), oVar, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return pullRefreshState;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }
}
