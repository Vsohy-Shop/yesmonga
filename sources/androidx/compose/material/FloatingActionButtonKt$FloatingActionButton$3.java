package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FloatingActionButtonKt$FloatingActionButton$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ long $contentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$3(long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$contentColor = j;
        this.$content = pVar;
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
                ComposerKt.m29845w0(1972871863, i, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
            }
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C15240j2.m66047A(this.$contentColor)))};
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 1867794295, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1867794295, i, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:100)");
                        }
                        C16361p0 e = C7933t0.f19075a.mo11077c(oVar, 6).mo11090e();
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final int i2 = i2;
                        TextKt.m14194a(e, C8553b.m31048b(oVar, -1567914264, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                if ((i & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-1567914264, i, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:101)");
                                    }
                                    C8767m g = SizeKt.m10107g(C8767m.f23478j, FloatingActionButtonKt.f7674a, FloatingActionButtonKt.f7674a);
                                    C8734c i2 = C8734c.f23406a.mo17066i();
                                    C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                                    int i3 = i2;
                                    oVar.mo14918M(733328855);
                                    C15560f0 k = BoxKt.m9849k(i2, false, oVar, 6);
                                    oVar.mo14918M(-1323940314);
                                    C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                                    LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                                    C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                                    C11289a<ComposeUiNode> a = companion.mo44585a();
                                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(g);
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
                                    pVar.invoke(oVar, Integer.valueOf((i3 >> 21) & 14));
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
