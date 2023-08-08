package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2354e1;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.C8275r3;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8740a;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.C16507v;
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
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nDepartmentStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentHeader$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,340:1\n74#2,6:341\n80#2:373\n84#2:433\n75#3:347\n76#3,11:349\n75#3:382\n76#3,11:384\n89#3:420\n89#3:432\n76#4:348\n76#4:383\n460#5,13:360\n460#5,13:395\n50#5:409\n49#5:410\n473#5,3:417\n473#5,3:429\n154#6:374\n154#6:376\n154#6:378\n154#6:379\n154#6:422\n154#6:424\n154#6:426\n154#6:428\n88#7:375\n88#7:377\n88#7:423\n88#7:425\n88#7:427\n79#8,2:380\n81#8:408\n85#8:421\n1114#9,6:411\n*S KotlinDebug\n*F\n+ 1 DepartmentStateful.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentStatefulKt$DepartmentHeader$1\n*L\n187#1:341,6\n187#1:373\n187#1:433\n187#1:347\n187#1:349,11\n192#1:382\n192#1:384,11\n192#1:420\n187#1:432\n187#1:348\n192#1:383\n187#1:360,13\n192#1:395,13\n211#1:409\n211#1:410\n192#1:417,3\n187#1:429,3\n190#1:374\n191#1:376\n195#1:378\n196#1:379\n219#1:422\n220#1:424\n223#1:426\n225#1:428\n190#1:375\n191#1:377\n219#1:423\n220#1:425\n223#1:427\n192#1:380,2\n192#1:408\n192#1:421\n211#1:411,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentStatefulKt$DepartmentHeader$1 */
public final class DepartmentStatefulKt$DepartmentHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C39769a, C11079d2> $actioner;
    final /* synthetic */ boolean $isTopAppBarFullyCollapsed;
    final /* synthetic */ C8275r3 $scrollBehavior;
    final /* synthetic */ float $topAppBarExpandedFraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentStatefulKt$DepartmentHeader$1(C8275r3 r3Var, float f, int i, boolean z, C11300l<? super C39769a, C11079d2> lVar) {
        super(2);
        this.$scrollBehavior = r3Var;
        this.$topAppBarExpandedFraction = f;
        this.$$dirty = i;
        this.$isTopAppBarFullyCollapsed = z;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        boolean z;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-562620378, i2, -1, "com.carrefour.fid.android.categories.presentation.ui.department.DepartmentHeader.<anonymous> (DepartmentStateful.kt:185)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C37475b bVar = C37475b.f94185a;
            C8767m d = BackgroundKt.m8825d(aVar, bVar.mo114231a0(), (C15218g4) null, 2, (Object) null);
            C8275r3 r3Var = this.$scrollBehavior;
            float f = this.$topAppBarExpandedFraction;
            int i3 = this.$$dirty;
            boolean z2 = this.$isTopAppBarFullyCollapsed;
            C11300l<C39769a, C11079d2> lVar = this.$actioner;
            oVar2.mo14918M(-483455358);
            Arrangement arrangement = Arrangement.f6010a;
            Arrangement.C2279l r = arrangement.mo7631r();
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 b = ColumnKt.m9863b(r, aVar2.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(d);
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
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f3 = (float) 3;
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(C16483g.m74435M(f3) * r3Var.getState().mo12411b())), oVar2, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar, C16483g.m74435M(C16483g.m74435M((float) 31) * f)), oVar2, 0);
            float f4 = (float) 16;
            C8767m o = PaddingKt.m10028o(PaddingKt.m10025l(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f4), C16483g.m74435M((float) 12)), 0.0f, 0.0f, C16483g.m74435M(f4), 0.0f, 11, (Object) null);
            Arrangement.C2271e l = arrangement.mo7628l();
            C8734c.C8737c q = aVar2.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(o);
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
            Updater.m30188j(b3, d2, companion.mo44588d());
            Updater.m30188j(b3, dVar2, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b3, c4Var2, companion.mo44590f());
            oVar.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            float f6 = (float) 8;
            String d3 = C16018i.m71858d(C39711b.C39729r.title_search_department, oVar2, 0);
            int f7 = C16432i.f40718b.mo47672f();
            C16361p0 g = C7933t0.f19075a.mo11077c(oVar2, C7933t0.f19076b).mo11093g();
            long a3 = C16506u.m74700a(((float) 20) + (f6 * f), C16507v.f40911b.mo47909b());
            float f8 = f6;
            float f9 = f3;
            C11300l<C39769a, C11079d2> lVar2 = lVar;
            int i4 = i3;
            boolean z3 = z2;
            float f10 = f;
            C8275r3 r3Var2 = r3Var;
            TextKt.m26700c(d3, (C8767m) null, bVar.mo114205B(), a3, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(f7), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, g, oVar, 0, 0, 65010);
            C8767m.C8768a aVar3 = aVar;
            C8767m a4 = C8740a.m32500a(aVar3, r3Var2.getState().mo12411b());
            Boolean valueOf = Boolean.valueOf(z3);
            C8592o oVar3 = oVar;
            oVar3.mo14918M(511388516);
            C11300l<C39769a, C11079d2> lVar3 = lVar2;
            boolean n0 = oVar3.mo15006n0(valueOf) | oVar3.mo15006n0(lVar3);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                z = z3;
                N = new DepartmentStatefulKt$DepartmentHeader$1$1$1$1$1(z, lVar3);
                oVar3.mo14893C(N);
            } else {
                z = z3;
            }
            oVar.mo15002m0();
            IconKt.m25824b(C16015f.m71849d(C39711b.C39719h.ds_ic_search_1, oVar3, 0), C16018i.m71858d(C39711b.C39729r.accessibility_open_search_page, oVar3, 0), ClickableKt.m8878e(a4, false, (String) null, (C16031g) null, (C11289a) N, 7, (Object) null), bVar.mo114218O(), oVar, 8, 0);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M(C16483g.m74435M((float) 4) * f10)), oVar3, 0);
            C2428y0.m10726a(SizeKt.m10115o(aVar3, C16483g.m74435M(C16483g.m74435M(f9) * r3Var2.getState().mo12411b())), oVar3, 0);
            C8767m o2 = PaddingKt.m10028o(BackgroundKt.m8825d(SizeKt.m10115o(aVar3, C16483g.m74435M(C16483g.m74435M((float) 48) * f10)), bVar.mo114231a0(), (C15218g4) null, 2, (Object) null), 0.0f, 0.0f, 0.0f, C16483g.m74435M(f8), 7, (Object) null);
            C8592o oVar4 = oVar;
            C8767m mVar = o2;
            C8275r3 r3Var3 = r3Var2;
            C8592o oVar5 = oVar;
            AppBarKt.m25389i(C8553b.m31048b(oVar4, -15281704, true, new DepartmentStatefulKt$DepartmentHeader$1$1$2(z, lVar3, i4)), mVar, (C11304p<? super C8592o, ? super Integer, C11079d2>) null, (C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2>) null, (C2354e1) null, TopAppBarDefaults.f19955a.mo12410i(0, bVar.mo114231a0(), 0, 0, 0, oVar, TopAppBarDefaults.f19956b << 15, 29), r3Var3, oVar5, ((i4 << 18) & 3670016) | 6, 28);
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
