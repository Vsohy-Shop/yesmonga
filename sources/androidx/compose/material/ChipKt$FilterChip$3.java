package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8578k2;
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
public final class ChipKt$FilterChip$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C3039e1 $colors;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8578k2<C15240j2> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $selectedIcon;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$3(C8578k2<C15240j2> k2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, boolean z, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i, C3039e1 e1Var, boolean z2, int i2) {
        super(2);
        this.$contentColor = k2Var;
        this.$leadingIcon = pVar;
        this.$selected = z;
        this.$selectedIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$content = qVar;
        this.$$dirty1 = i;
        this.$colors = e1Var;
        this.$enabled = z2;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(722126431, i2, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
            }
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(this.$contentColor.getValue().mo42833M())))};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$leadingIcon;
            final boolean z = this.$selected;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$selectedIcon;
            final C11304p<C8592o, Integer, C11079d2> pVar3 = this.$trailingIcon;
            final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$content;
            final int i3 = this.$$dirty1;
            final C3039e1 e1Var = this.$colors;
            final boolean z2 = this.$enabled;
            final int i4 = this.$$dirty;
            final C8578k2<C15240j2> k2Var = this.$contentColor;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar2, 1582291359, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1582291359, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
                        }
                        C16361p0 d = C7933t0.f19075a.mo11077c(oVar, 6).mo11089d();
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final boolean z = z;
                        final C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                        final C11304p<C8592o, Integer, C11079d2> pVar3 = pVar3;
                        final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                        final int i2 = i3;
                        final C3039e1 e1Var = e1Var;
                        final boolean z2 = z2;
                        final int i3 = i4;
                        final C8578k2<C15240j2> k2Var = k2Var;
                        TextKt.m14194a(d, C8553b.m31048b(oVar, -1543702066, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                float f;
                                float f2;
                                RowScopeInstance rowScopeInstance;
                                int i2;
                                C8767m mVar;
                                C8592o oVar2 = oVar;
                                int i3 = i;
                                if ((i3 & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-1543702066, i3, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                                    }
                                    C8767m.C8768a aVar = C8767m.f23478j;
                                    C8767m h = SizeKt.m10108h(aVar, 0.0f, C7890p.f18900a.mo10907d(), 1, (Object) null);
                                    if (pVar != null || (z && pVar2 != null)) {
                                        f = C16483g.m74435M((float) 0);
                                    } else {
                                        f = ChipKt.f7577a;
                                    }
                                    float f3 = f;
                                    if (pVar3 == null) {
                                        f2 = ChipKt.f7577a;
                                    } else {
                                        f2 = C16483g.m74435M((float) 0);
                                    }
                                    C8767m o = PaddingKt.m10028o(h, f3, 0.0f, f2, 0.0f, 10, (Object) null);
                                    Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
                                    C8734c.C8735a aVar2 = C8734c.f23406a;
                                    C8734c.C8737c q = aVar2.mo17070q();
                                    C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                                    boolean z = z;
                                    C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                                    C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                                    int i4 = i2;
                                    C11304p<C8592o, Integer, C11079d2> pVar3 = pVar3;
                                    C3039e1 e1Var = e1Var;
                                    boolean z2 = z2;
                                    int i5 = i3;
                                    C11304p<C8592o, Integer, C11079d2> pVar4 = pVar3;
                                    C8578k2<C15240j2> k2Var = k2Var;
                                    oVar2.mo14918M(693286680);
                                    C15560f0 d = RowKt.m10071d(p, q, oVar2, 54);
                                    oVar2.mo14918M(-1323940314);
                                    C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                                    LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                                    C11305q<C2411u0, C8592o, Integer, C11079d2> qVar2 = qVar;
                                    C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                                    int i6 = i4;
                                    C11289a<ComposeUiNode> a = companion.mo44585a();
                                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(o);
                                    C8578k2<C15240j2> k2Var2 = k2Var;
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
                                    f4.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                                    oVar2.mo14918M(2058660585);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f6147a;
                                    oVar2.mo14918M(-1943412077);
                                    if (pVar != null || (z && pVar2 != null)) {
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7578b), oVar2, 6);
                                        oVar2.mo14918M(733328855);
                                        C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
                                        oVar2.mo14918M(-1323940314);
                                        C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                                        LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                                        C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                                        C11289a<ComposeUiNode> a2 = companion.mo44585a();
                                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(aVar);
                                        rowScopeInstance = rowScopeInstance2;
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
                                        Updater.m30188j(b2, k, companion.mo44588d());
                                        Updater.m30188j(b2, dVar2, companion.mo44586b());
                                        Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
                                        Updater.m30188j(b2, c4Var2, companion.mo44590f());
                                        oVar.mo14972e();
                                        f5.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                                        oVar2.mo14918M(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                                        oVar2.mo14918M(649985655);
                                        if (pVar != null) {
                                            C8578k2<C15240j2> b3 = e1Var.mo10749b(z2, z, oVar2, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896));
                                            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m13406a().mo16141f(b3.getValue()), ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(b3.getValue().mo42833M())))}, pVar, oVar2, ((i5 >> 21) & 112) | 8);
                                        }
                                        oVar.mo15002m0();
                                        oVar2.mo14918M(-1943411263);
                                        if (z && pVar2 != null) {
                                            long M = k2Var2.getValue().mo42833M();
                                            oVar2.mo14918M(649986486);
                                            if (pVar != null) {
                                                mVar = C8744d.m32514a(BackgroundKt.m8824c(SizeKt.m10121u(aVar, ChipKt.f7583g), k2Var2.getValue().mo42833M(), C2694o.m12169k()), C2694o.m12169k());
                                                M = e1Var.mo10750c(z2, z, oVar2, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896)).getValue().mo42833M();
                                            } else {
                                                mVar = aVar;
                                            }
                                            oVar.mo15002m0();
                                            C8734c i7 = aVar2.mo17066i();
                                            oVar2.mo14918M(733328855);
                                            C15560f0 k2 = BoxKt.m9849k(i7, false, oVar2, 6);
                                            oVar2.mo14918M(-1323940314);
                                            C16479d dVar3 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                                            LayoutDirection layoutDirection3 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                                            C15863c4 c4Var3 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                                            C11289a<ComposeUiNode> a3 = companion.mo44585a();
                                            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(mVar);
                                            if (!(oVar.mo15017r() instanceof C8428d)) {
                                                ComposablesKt.m29519n();
                                            }
                                            oVar.mo14938T();
                                            if (oVar.mo14997l()) {
                                                oVar2.mo14947W(a3);
                                            } else {
                                                oVar.mo14888A();
                                            }
                                            oVar.mo14941U();
                                            C8592o b4 = Updater.m30180b(oVar);
                                            Updater.m30188j(b4, k2, companion.mo44588d());
                                            Updater.m30188j(b4, dVar3, companion.mo44586b());
                                            Updater.m30188j(b4, layoutDirection3, companion.mo44587c());
                                            Updater.m30188j(b4, c4Var3, companion.mo44590f());
                                            oVar.mo14972e();
                                            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                                            oVar2.mo14918M(2058660585);
                                            CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m13406a().mo16141f(C15240j2.m66071n(M))}, pVar2, oVar2, ((i5 >> 24) & 112) | 8);
                                            oVar.mo15002m0();
                                            oVar.mo14896D();
                                            oVar.mo15002m0();
                                            oVar.mo15002m0();
                                        }
                                        oVar.mo15002m0();
                                        oVar.mo15002m0();
                                        oVar.mo14896D();
                                        oVar.mo15002m0();
                                        oVar.mo15002m0();
                                        i2 = 6;
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7579c), oVar2, 6);
                                    } else {
                                        rowScopeInstance = rowScopeInstance2;
                                        i2 = 6;
                                    }
                                    oVar.mo15002m0();
                                    qVar2.invoke(rowScopeInstance, oVar2, Integer.valueOf((i6 & 112) | i2));
                                    oVar2.mo14918M(-1181292859);
                                    if (pVar4 != null) {
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7580d), oVar2, i2);
                                        pVar4.invoke(oVar2, Integer.valueOf(i6 & 14));
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7580d), oVar2, i2);
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
                        }), oVar, 48);
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
