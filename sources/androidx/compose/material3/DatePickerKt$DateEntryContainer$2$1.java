package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
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
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1920:1\n74#2,6:1921\n80#2:1953\n84#2:1992\n75#3:1927\n76#3,11:1929\n75#3:1956\n76#3,11:1958\n89#3:1986\n89#3:1991\n76#4:1928\n76#4:1957\n460#5,13:1940\n460#5,13:1969\n473#5,3:1983\n473#5,3:1988\n79#6,2:1954\n81#6:1982\n85#6:1987\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n*L\n1034#1:1921,6\n1034#1:1953\n1034#1:1992\n1034#1:1927\n1034#1:1929,11\n1040#1:1956\n1040#1:1958,11\n1040#1:1986\n1034#1:1991\n1034#1:1928\n1040#1:1957\n1034#1:1940,13\n1040#1:1969,13\n1040#1:1983,3\n1034#1:1988,3\n1040#1:1954,2\n1040#1:1982\n1040#1:1987\n*E\n"})
public final class DatePickerKt$DateEntryContainer$2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $headline;
    final /* synthetic */ C16361p0 $headlineTextStyle;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $modeToggleButton;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DateEntryContainer$2$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C16361p0 p0Var, int i) {
        super(2);
        this.$headline = pVar;
        this.$modeToggleButton = pVar2;
        this.$title = pVar3;
        this.$headlineTextStyle = p0Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        Arrangement.C2269d dVar;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-229007058, i2, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1032)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$headline;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$modeToggleButton;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$title;
            C16361p0 p0Var = this.$headlineTextStyle;
            int i3 = this.$$dirty;
            oVar2.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b2 = Updater.m30180b(oVar);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            if (pVar != null && pVar2 != null) {
                dVar = arrangement.mo7628l();
            } else if (pVar != null) {
                dVar = arrangement.mo7630p();
            } else {
                dVar = arrangement.mo7626h();
            }
            C8767m n2 = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C8734c.C8737c q = aVar2.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(dVar, q, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(n2);
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
            C8592o b3 = Updater.m30180b(oVar);
            Updater.m30188j(b3, d, companion.mo44588d());
            Updater.m30188j(b3, dVar3, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            oVar2.mo14918M(-1011378861);
            if (pVar != null) {
                TextKt.m26698a(p0Var, C8553b.m31048b(oVar2, -962031352, true, new DatePickerKt$DateEntryContainer$2$1$1$1$1(rowScopeInstance, pVar, i3)), oVar2, ((i3 >> 15) & 14) | 48);
            }
            oVar.mo15002m0();
            oVar2.mo14918M(1449812209);
            if (pVar2 != null) {
                pVar2.invoke(oVar2, Integer.valueOf((i3 >> 9) & 14));
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar2.mo14918M(1680507480);
            if (!(pVar3 == null && pVar == null && pVar2 == null)) {
                DividerKt.m25704a((C8767m) null, 0.0f, 0, oVar, 0, 7);
            }
            oVar.mo15002m0();
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
