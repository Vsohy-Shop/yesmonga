package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8302f0;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
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
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MenuKt$DropdownMenuItemContent$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8234k1 $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;
    final /* synthetic */ C2411u0 $this_Row;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C8234k1 k1Var, boolean z, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C2411u0 u0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3) {
        super(2);
        this.$leadingIcon = pVar;
        this.$colors = k1Var;
        this.$enabled = z;
        this.$$dirty = i;
        this.$trailingIcon = pVar2;
        this.$this_Row = u0Var;
        this.$text = pVar3;
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
                ComposerKt.m29845w0(1065051884, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
            }
            oVar.mo14918M(1426254055);
            if (this.$leadingIcon != null) {
                C8550i1<C15240j2> a = ContentColorKt.m25558a();
                C8234k1 k1Var = this.$colors;
                boolean z = this.$enabled;
                int i2 = this.$$dirty;
                C8572j1[] j1VarArr = {a.mo16141f(k1Var.mo12751a(z, oVar, ((i2 >> 15) & 112) | ((i2 >> 15) & 14)).getValue())};
                final C11304p<C8592o, Integer, C11079d2> pVar = this.$leadingIcon;
                final int i3 = this.$$dirty;
                CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 2035552199, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(2035552199, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:175)");
                            }
                            C8767m h = SizeKt.m10108h(C8767m.f23478j, C8302f0.f21080a.mo13518p(), 0.0f, 2, (Object) null);
                            C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                            int i2 = i3;
                            oVar.mo14918M(733328855);
                            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar, 0);
                            oVar.mo14918M(-1323940314);
                            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                            C11289a<ComposeUiNode> a = companion.mo44585a();
                            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(h);
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
                            Updater.m30188j(b, k, companion.mo44588d());
                            Updater.m30188j(b, dVar, companion.mo44586b());
                            Updater.m30188j(b, layoutDirection, companion.mo44587c());
                            Updater.m30188j(b, c4Var, companion.mo44590f());
                            oVar.mo14972e();
                            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                            oVar.mo14918M(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                            pVar.invoke(oVar, Integer.valueOf((i2 >> 9) & 14));
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
                }), oVar, 56);
            }
            oVar.mo15002m0();
            C8550i1<C15240j2> a2 = ContentColorKt.m25558a();
            C8234k1 k1Var2 = this.$colors;
            boolean z2 = this.$enabled;
            int i4 = this.$$dirty;
            C8572j1[] j1VarArr2 = {a2.mo16141f(k1Var2.mo12752b(z2, oVar, ((i4 >> 15) & 112) | ((i4 >> 15) & 14)).getValue())};
            final C2411u0 u0Var = this.$this_Row;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
            final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$trailingIcon;
            final C11304p<C8592o, Integer, C11079d2> pVar4 = this.$text;
            final int i5 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr2, C8553b.m31048b(oVar, -1728894036, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    float f;
                    float f2;
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-1728894036, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
                        }
                        C8767m e = C2411u0.m10660e(u0Var, C8767m.f23478j, 1.0f, false, 2, (Object) null);
                        if (pVar2 != null) {
                            f = MenuKt.f19476b;
                        } else {
                            f = C16483g.m74435M((float) 0);
                        }
                        float f3 = f;
                        if (pVar3 != null) {
                            f2 = MenuKt.f19476b;
                        } else {
                            f2 = C16483g.m74435M((float) 0);
                        }
                        C8767m o = PaddingKt.m10028o(e, f3, 0.0f, f2, 0.0f, 10, (Object) null);
                        C11304p<C8592o, Integer, C11079d2> pVar = pVar4;
                        int i3 = i5;
                        oVar2.mo14918M(733328855);
                        C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(o);
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
                        Updater.m30188j(b, k, companion.mo44588d());
                        Updater.m30188j(b, dVar, companion.mo44586b());
                        Updater.m30188j(b, layoutDirection, companion.mo44587c());
                        Updater.m30188j(b, c4Var, companion.mo44590f());
                        oVar.mo14972e();
                        f4.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                        pVar.invoke(oVar2, Integer.valueOf(i3 & 14));
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
            }), oVar, 56);
            if (this.$trailingIcon != null) {
                C8550i1<C15240j2> a3 = ContentColorKt.m25558a();
                C8234k1 k1Var3 = this.$colors;
                boolean z3 = this.$enabled;
                int i6 = this.$$dirty;
                C8572j1[] j1VarArr3 = {a3.mo16141f(k1Var3.mo12753c(z3, oVar, ((i6 >> 15) & 112) | ((i6 >> 15) & 14)).getValue())};
                final C11304p<C8592o, Integer, C11079d2> pVar5 = this.$trailingIcon;
                final int i7 = this.$$dirty;
                CompositionLocalKt.m29856b(j1VarArr3, C8553b.m31048b(oVar, 580312062, true, new C11304p<C8592o, Integer, C11079d2>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(580312062, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:204)");
                            }
                            C8767m h = SizeKt.m10108h(C8767m.f23478j, C8302f0.f21080a.mo13525w(), 0.0f, 2, (Object) null);
                            C11304p<C8592o, Integer, C11079d2> pVar = pVar5;
                            int i2 = i7;
                            oVar.mo14918M(733328855);
                            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar, 0);
                            oVar.mo14918M(-1323940314);
                            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                            C11289a<ComposeUiNode> a = companion.mo44585a();
                            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(h);
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
                            Updater.m30188j(b, k, companion.mo44588d());
                            Updater.m30188j(b, dVar, companion.mo44586b());
                            Updater.m30188j(b, layoutDirection, companion.mo44587c());
                            Updater.m30188j(b, c4Var, companion.mo44590f());
                            oVar.mo14972e();
                            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
                            oVar.mo14918M(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                            pVar.invoke(oVar, Integer.valueOf((i2 >> 12) & 14));
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
                }), oVar, 56);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
