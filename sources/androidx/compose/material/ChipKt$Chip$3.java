package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
public final class ChipKt$Chip$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C7886o $colors;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C8578k2<C15240j2> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(C8578k2<C15240j2> k2Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C7886o oVar, boolean z, int i, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$contentColor$delegate = k2Var;
        this.$leadingIcon = pVar;
        this.$colors = oVar;
        this.$enabled = z;
        this.$$dirty = i;
        this.$content = qVar;
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
                ComposerKt.m29845w0(139076687, i, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
            }
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(ChipKt.m13371b(this.$contentColor$delegate))))};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$leadingIcon;
            final C7886o oVar2 = this.$colors;
            final boolean z = this.$enabled;
            final int i2 = this.$$dirty;
            final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$content;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 667535631, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(667535631, i, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:109)");
                        }
                        C16361p0 d = C7933t0.f19075a.mo11077c(oVar, 6).mo11089d();
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final C7886o oVar2 = oVar2;
                        final boolean z = z;
                        final int i2 = i2;
                        final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                        TextKt.m14194a(d, C8553b.m31048b(oVar, -1131213696, true, new C11304p<C8592o, Integer, C11079d2>() {
                            /* renamed from: a */
                            public static final long m13379a(C8578k2<C15240j2> k2Var) {
                                return k2Var.getValue().mo42833M();
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                float f;
                                C8592o oVar2 = oVar;
                                int i2 = i;
                                if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-1131213696, i2, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:112)");
                                    }
                                    C8767m.C8768a aVar = C8767m.f23478j;
                                    C8767m h = SizeKt.m10108h(aVar, 0.0f, C7890p.f18900a.mo10907d(), 1, (Object) null);
                                    if (pVar == null) {
                                        f = ChipKt.f7577a;
                                    } else {
                                        f = C16483g.m74435M((float) 0);
                                    }
                                    C8767m o = PaddingKt.m10028o(h, f, 0.0f, ChipKt.f7577a, 0.0f, 10, (Object) null);
                                    Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
                                    C8734c.C8737c q = C8734c.f23406a.mo17070q();
                                    C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                                    C7886o oVar3 = oVar2;
                                    boolean z = z;
                                    int i3 = i2;
                                    C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                                    oVar2.mo14918M(693286680);
                                    C15560f0 d = RowKt.m10071d(p, q, oVar2, 54);
                                    oVar2.mo14918M(-1323940314);
                                    C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                                    LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                                    C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                                    C11289a<ComposeUiNode> a = companion.mo44585a();
                                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o);
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
                                    f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                                    oVar2.mo14918M(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                                    oVar2.mo14918M(2084788907);
                                    if (pVar != null) {
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7578b), oVar2, 6);
                                        C8578k2<C15240j2> c = oVar3.mo10894c(z, oVar2, ((i3 >> 6) & 14) | ((i3 >> 15) & 112));
                                        CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m13406a().mo16141f(C15240j2.m66071n(m13379a(c))), ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(m13379a(c))))}, pVar, oVar2, ((i3 >> 18) & 112) | 8);
                                        C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f7579c), oVar2, 6);
                                    }
                                    oVar.mo15002m0();
                                    qVar.invoke(rowScopeInstance, oVar2, Integer.valueOf(((i3 >> 21) & 112) | 6));
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
            }), oVar, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
