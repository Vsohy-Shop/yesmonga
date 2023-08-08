package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C8241l2;
import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1673:1\n74#2,7:1674\n81#2:1707\n85#2:1712\n75#3:1681\n76#3,11:1683\n89#3:1711\n76#4:1682\n460#5,13:1694\n473#5,3:1708\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n847#1:1674,7\n847#1:1707\n847#1:1712\n847#1:1681\n847#1:1683,11\n847#1:1711\n847#1:1682\n847#1:1694,13\n847#1:1708,3\n*E\n"})
public final class TimePickerKt$ClockDisplayNumbers$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockDisplayNumbers$1(TimePickerState timePickerState, C8212h3 h3Var, int i) {
        super(2);
        this.$state = timePickerState;
        this.$colors = h3Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-477913269, i, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:845)");
            }
            TimePickerState timePickerState = this.$state;
            C8212h3 h3Var = this.$colors;
            int i2 = this.$$dirty;
            oVar.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8306g1 g1Var = C8306g1.f21226a;
            C8767m E = SizeKt.m10089E(aVar, g1Var.mo13616O(), g1Var.mo13614M());
            int i3 = timePickerState.mo12348i();
            C8241l2.C8242a aVar2 = C8241l2.f20286b;
            TimePickerState timePickerState2 = timePickerState;
            C8212h3 h3Var2 = h3Var;
            C8592o oVar2 = oVar;
            int i4 = ((i2 << 9) & 57344) | ((i2 << 6) & 896) | 3078;
            TimePickerKt.m26771u(E, i3, timePickerState2, aVar2.mo12784a(), h3Var2, oVar2, i4);
            TimePickerKt.m26747g(SizeKt.m10089E(aVar, TimePickerKt.f19900j, g1Var.mo13610I()), oVar, 6);
            TimePickerKt.m26771u(SizeKt.m10089E(aVar, g1Var.mo13616O(), g1Var.mo13614M()), timePickerState.mo12349j(), timePickerState2, aVar2.mo12785b(), h3Var2, oVar2, i4);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
