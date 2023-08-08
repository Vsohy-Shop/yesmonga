package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
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
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,547:1\n75#2,6:548\n81#2:580\n85#2:585\n75#2,6:586\n81#2:618\n85#2:623\n75#3:554\n76#3,11:556\n89#3:584\n75#3:592\n76#3,11:594\n89#3:622\n76#4:555\n76#4:593\n460#5,13:567\n473#5,3:581\n460#5,13:605\n473#5,3:619\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n97#1:548,6\n97#1:580\n97#1:585\n105#1:586,6\n105#1:618\n105#1:623\n97#1:554\n97#1:556,11\n97#1:584\n105#1:592\n105#1:594,11\n105#1:622\n97#1:555\n105#1:593\n97#1:567,13\n97#1:581,3\n105#1:605,13\n105#1:619,3\n*E\n"})
public final class AppBarKt$TopAppBar$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $actions;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $navigationIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(3);
        this.$navigationIcon = pVar;
        this.$$dirty = i;
        this.$title = pVar2;
        this.$actions = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2411u0 u0Var2 = u0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(u0Var2, "$this$AppBar");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(u0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1484077694, i3, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
            }
            if (this.$navigationIcon == null) {
                oVar2.mo14918M(-512812651);
                C2428y0.m10726a(AppBarKt.f7505c, oVar2, 6);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-512812592);
                C8767m j = AppBarKt.f7506d;
                C8734c.C8737c q = C8734c.f23406a.mo17070q();
                C11304p<C8592o, Integer, C11079d2> pVar = this.$navigationIcon;
                int i4 = this.$$dirty;
                oVar2.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, oVar2, 48);
                oVar2.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j);
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
                C8592o b = Updater.m30180b(oVar);
                Updater.m30188j(b, d, companion.mo44588d());
                Updater.m30188j(b, dVar, companion.mo44586b());
                Updater.m30188j(b, layoutDirection, companion.mo44587c());
                Updater.m30188j(b, c4Var, companion.mo44590f());
                oVar.mo14972e();
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                CompositionLocalKt.m29856b(new C8572j1[]{ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C7904r.f18969a.mo10992c(oVar2, 6)))}, pVar, oVar2, ((i4 >> 3) & 112) | 8);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo15002m0();
            }
            C8767m e = C2411u0.m10660e(u0Var, SizeKt.m10110j(C8767m.f23478j, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            C8734c.C8737c q2 = C8734c.f23406a.mo17070q();
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$title;
            int i5 = this.$$dirty;
            oVar2.mo14918M(693286680);
            C15560f0 d2 = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q2, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion2.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(e);
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
            Updater.m30188j(b2, d2, companion2.mo44588d());
            Updater.m30188j(b2, dVar2, companion2.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion2.mo44587c());
            Updater.m30188j(b2, c4Var2, companion2.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6147a;
            TextKt.m14194a(C7933t0.f19075a.mo11077c(oVar2, 6).mo11099l(), C8553b.m31048b(oVar2, -2021518195, true, new AppBarKt$TopAppBar$1$2$1(pVar2, i5)), oVar2, 48);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C7904r.f18969a.mo10993d(oVar2, 6)))};
            final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$actions;
            final int i6 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar2, 1157662914, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1157662914, i, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:116)");
                        }
                        C8767m j = SizeKt.m10110j(C8767m.f23478j, 0.0f, 1, (Object) null);
                        Arrangement.C2269d h = Arrangement.f6010a.mo7626h();
                        C8734c.C8737c q = C8734c.f23406a.mo17070q();
                        C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                        int i2 = (i6 & 7168) | 438;
                        oVar.mo14918M(693286680);
                        int i3 = i2 >> 3;
                        C15560f0 d = RowKt.m10071d(h, q, oVar, (i3 & 112) | (i3 & 14));
                        oVar.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j);
                        int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i4 >> 3) & 112));
                        oVar.mo14918M(2058660585);
                        qVar.invoke(RowScopeInstance.f6147a, oVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
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
            }), oVar2, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
