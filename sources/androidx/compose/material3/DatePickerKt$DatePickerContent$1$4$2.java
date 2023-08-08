package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1920:1\n36#2:1921\n460#2,13:1947\n473#2,3:1963\n1114#3,6:1922\n74#4,6:1928\n80#4:1960\n84#4:1967\n75#5:1934\n76#5,11:1936\n89#5:1966\n76#6:1935\n92#7:1961\n58#7:1962\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n*L\n1193#1:1921\n1193#1:1947,13\n1193#1:1963,3\n1193#1:1922,6\n1193#1:1928,6\n1193#1:1960\n1193#1:1967\n1193#1:1934\n1193#1:1936,11\n1193#1:1966\n1193#1:1935\n1200#1:1961\n1200#1:1962\n*E\n"})
public final class DatePickerKt$DatePickerContent$1$4$2 extends Lambda implements C11305q<AnimatedVisibilityScope, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8700z0<Boolean> $yearPickerVisible$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$1$4$2(C8180c0 c0Var, StateData stateData, int i, C12074o0 o0Var, C8700z0<Boolean> z0Var, LazyListState lazyListState) {
        super(3);
        this.$colors = c0Var;
        this.$stateData = stateData;
        this.$$dirty = i;
        this.$coroutineScope = o0Var;
        this.$yearPickerVisible$delegate = z0Var;
        this.$monthsListState = lazyListState;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11375a(@C12579k AnimatedVisibilityScope animatedVisibilityScope, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(760161496, i, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1186)");
        }
        String a = C8357u2.m29348a(C8284t2.f20507b.mo13018D(), oVar2, 6);
        C8767m.C8768a aVar = C8767m.f23478j;
        oVar2.mo14918M(1157296644);
        boolean n0 = oVar2.mo15006n0(a);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new DatePickerKt$DatePickerContent$1$4$2$1$1(a);
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m c = SemanticsModifierKt.m71868c(aVar, false, (C11300l) N, 1, (Object) null);
        C8180c0 c0Var = this.$colors;
        StateData stateData = this.$stateData;
        int i2 = this.$$dirty;
        C12074o0 o0Var = this.$coroutineScope;
        C8700z0<Boolean> z0Var = this.$yearPickerVisible$delegate;
        LazyListState lazyListState = this.$monthsListState;
        oVar2.mo14918M(-483455358);
        C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
        oVar2.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(c);
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar2.mo14947W(a2);
        } else {
            oVar.mo14888A();
        }
        oVar.mo14941U();
        C8592o b2 = Updater.m30180b(oVar);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        oVar.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
        oVar2.mo14918M(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
        C8592o oVar3 = oVar;
        DatePickerKt.m25609o(PaddingKt.m10026m(SizeKt.m10118r(aVar, C16483g.m74435M(C16483g.m74435M(DatePickerKt.m25591K() * ((float) 7)) - C8214i0.f20177a.mo12651b())), DatePickerKt.m25588H(), 0.0f, 2, (Object) null), new DatePickerKt$DatePickerContent$1$4$2$2$1(o0Var, z0Var, stateData, lazyListState), c0Var, stateData, oVar3, ((i2 >> 3) & 896) | 6 | ((i2 << 9) & 7168));
        DividerKt.m25704a((C8767m) null, 0.0f, 0, oVar3, 0, 7);
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11375a((AnimatedVisibilityScope) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
