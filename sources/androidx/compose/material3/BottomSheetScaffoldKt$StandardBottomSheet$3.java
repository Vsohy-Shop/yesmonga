package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.C8284t2;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
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
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,396:1\n74#2,6:397\n80#2:429\n84#2:472\n75#3:403\n76#3,11:405\n75#3:436\n76#3,11:438\n89#3:466\n89#3:471\n76#4:404\n76#4:437\n460#5,13:416\n460#5,13:449\n473#5,3:463\n473#5,3:468\n67#6,6:430\n73#6:462\n77#6:467\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3\n*L\n271#1:397,6\n271#1:429\n271#1:472\n271#1:403\n271#1:405,11\n277#1:436\n277#1:438,11\n277#1:466\n271#1:471\n271#1:404\n277#1:437\n271#1:416,13\n277#1:449,13\n277#1:463,3\n271#1:468,3\n277#1:430,6\n277#1:462\n277#1:467\n*E\n"})
public final class BottomSheetScaffoldKt$StandardBottomSheet$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dragHandle;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, int i, SheetState sheetState, boolean z, C12074o0 o0Var, int i2) {
        super(2);
        this.$dragHandle = pVar;
        this.$content = qVar;
        this.$$dirty1 = i;
        this.$state = sheetState;
        this.$sheetSwipeEnabled = z;
        this.$scope = o0Var;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2 = oVar;
        int i3 = i;
        if ((i3 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1381492089, i3, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:269)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            C11304p<C8592o, Integer, C11079d2> pVar = this.$dragHandle;
            C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
            int i4 = this.$$dirty1;
            SheetState sheetState = this.$state;
            boolean z = this.$sheetSwipeEnabled;
            C12074o0 o0Var = this.$scope;
            int i5 = this.$$dirty;
            oVar2.mo14918M(-483455358);
            Arrangement.C2279l r = Arrangement.f6010a.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
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
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            oVar2.mo14918M(-176229648);
            if (pVar != null) {
                C8284t2.C8285a aVar3 = C8284t2.f20507b;
                String a2 = C8357u2.m29348a(aVar3.mo13048e(), oVar2, 6);
                String a3 = C8357u2.m29348a(aVar3.mo13042b(), oVar2, 6);
                String a4 = C8357u2.m29348a(aVar3.mo13046d(), oVar2, 6);
                C8767m e = columnScopeInstance.mo7714e(aVar, aVar2.mo17068m());
                BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 bottomSheetScaffoldKt$StandardBottomSheet$3$1$1 = r8;
                i2 = 6;
                BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 bottomSheetScaffoldKt$StandardBottomSheet$3$1$12 = new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(sheetState, z, a4, a2, a3, o0Var);
                C8767m b3 = SemanticsModifierKt.m71867b(e, true, bottomSheetScaffoldKt$StandardBottomSheet$3$1$12);
                oVar2.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
                oVar2.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                C11289a<ComposeUiNode> a5 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(b3);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar2.mo14947W(a5);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b4 = Updater.m30180b(oVar);
                Updater.m30188j(b4, k, companion.mo44588d());
                Updater.m30188j(b4, dVar2, companion.mo44586b());
                Updater.m30188j(b4, layoutDirection2, companion.mo44587c());
                Updater.m30188j(b4, c4Var2, companion.mo44590f());
                oVar.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                pVar.invoke(oVar2, Integer.valueOf((i5 >> 27) & 14));
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
            } else {
                i2 = 6;
            }
            oVar.mo15002m0();
            qVar.invoke(columnScopeInstance, oVar2, Integer.valueOf(i2 | ((i4 << 3) & 112)));
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
