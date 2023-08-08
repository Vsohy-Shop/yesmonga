package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2761b0;
import androidx.compose.foundation.text.C2846t;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.profileinstaller.C20022q;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SelectionContainerKt$SelectionContainer$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $children;
    final /* synthetic */ SelectionManager $manager;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ SelectionRegistrarImpl $registrarImpl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3(SelectionRegistrarImpl selectionRegistrarImpl, C8767m mVar, SelectionManager selectionManager, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(2);
        this.$registrarImpl = selectionRegistrarImpl;
        this.$modifier = mVar;
        this.$manager = selectionManager;
        this.$children = pVar;
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
                ComposerKt.m29845w0(-123806316, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:94)");
            }
            C8572j1[] j1VarArr = {SelectionRegistrarKt.m12853a().mo16141f(this.$registrarImpl)};
            final C8767m mVar = this.$modifier;
            final SelectionManager selectionManager = this.$manager;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$children;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 935424596, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(935424596, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
                        }
                        C8767m k3 = mVar.mo17224k3(selectionManager.mo9626C());
                        final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        final int i2 = i2;
                        final SelectionManager selectionManager = selectionManager;
                        SimpleLayoutKt.m12856a(k3, C8553b.m31048b(oVar, 1375295262, true, new C11304p<C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C8592o) obj, ((Number) obj2).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12580l C8592o oVar, int i) {
                                C2830i F;
                                C15094f fVar;
                                ResolvedTextDirection resolvedTextDirection;
                                C8592o oVar2 = oVar;
                                int i2 = i;
                                if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(1375295262, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:98)");
                                    }
                                    pVar.invoke(oVar2, Integer.valueOf((i2 >> 9) & 14));
                                    if (C2761b0.m12554a() && selectionManager.mo9625B() && (F = selectionManager.mo9629F()) != null) {
                                        SelectionManager selectionManager = selectionManager;
                                        List L = CollectionsKt__CollectionsKt.m40448L(Boolean.TRUE, Boolean.FALSE);
                                        int size = L.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            boolean booleanValue = ((Boolean) L.get(i3)).booleanValue();
                                            Boolean valueOf = Boolean.valueOf(booleanValue);
                                            oVar2.mo14918M(1157296644);
                                            boolean n0 = oVar2.mo15006n0(valueOf);
                                            Object N = oVar.mo14921N();
                                            if (n0 || N == C8592o.f23032a.mo16277a()) {
                                                N = selectionManager.mo9634K(booleanValue);
                                                oVar2.mo14893C(N);
                                            }
                                            oVar.mo15002m0();
                                            C2846t tVar = (C2846t) N;
                                            if (booleanValue) {
                                                fVar = selectionManager.mo9631H();
                                            } else {
                                                fVar = selectionManager.mo9673y();
                                            }
                                            if (booleanValue) {
                                                resolvedTextDirection = F.mo9872h().mo9882f();
                                            } else {
                                                resolvedTextDirection = F.mo9870f().mo9882f();
                                            }
                                            if (fVar != null) {
                                                AndroidSelectionHandles_androidKt.m12666c(fVar.mo42242A(), booleanValue, resolvedTextDirection, F.mo9871g(), SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, tVar, new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(tVar, (C11045c<? super SelectionContainerKt$SelectionContainer$3$1$1$1$1$1>) null)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, oVar, C20022q.C20025c.f51280k);
                                            }
                                        }
                                    }
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), oVar, 48, 0);
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
