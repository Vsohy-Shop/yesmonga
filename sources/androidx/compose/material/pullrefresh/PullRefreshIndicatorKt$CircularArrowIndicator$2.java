package androidx.compose.material.pullrefresh;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15244j4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,242:1\n136#2,5:243\n261#2,11:248\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n*L\n142#1:243,5\n142#1:248,11\n*E\n"})
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ C8578k2<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ C15231i3 $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, C8578k2<Float> k2Var, long j, C15231i3 i3Var) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = k2Var;
        this.$color = j;
        this.$path = i3Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$Canvas");
        C7899a f = PullRefreshIndicatorKt.m25102a(this.$state.mo10934j());
        float floatValue = this.$alphaState.getValue().floatValue();
        float b = f.mo10956b();
        long j = this.$color;
        C15231i3 i3Var = this.$path;
        long U = eVar.mo42717U();
        C15186d q5 = eVar.mo42683q5();
        long b2 = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(b, U);
        float g5 = eVar2.mo7425g5(PullRefreshIndicatorKt.f18917e) + (eVar2.mo7425g5(PullRefreshIndicatorKt.f18918f) / 2.0f);
        C15098i iVar = new C15098i(C15094f.m64880p(C15106n.m65034b(eVar.mo42718b())) - g5, C15094f.m64882r(C15106n.m65034b(eVar.mo42718b())) - g5, C15094f.m64880p(C15106n.m65034b(eVar.mo42718b())) + g5, C15094f.m64882r(C15106n.m65034b(eVar.mo42718b())) + g5);
        C15187e eVar3 = eVar;
        C15186d dVar = q5;
        C15231i3 i3Var2 = i3Var;
        C15187e.m65724z2(eVar3, j, f.mo10958d(), f.mo10955a() - f.mo10958d(), false, iVar.mo42251E(), iVar.mo42284z(), floatValue, new C15198m(eVar2.mo7425g5(PullRefreshIndicatorKt.f18918f), 0.0f, C15244j4.f37564b.mo42864c(), 0, (C15242j3) null, 26, (DefaultConstructorMarker) null), (C15249k2) null, 0, 768, (Object) null);
        PullRefreshIndicatorKt.m25112k(eVar3, i3Var2, iVar, j, floatValue, f);
        dVar.mo42705c().mo42443q();
        dVar.mo42706d(b2);
    }
}
