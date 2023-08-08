package androidx.compose.material.pullrefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import com.contentsquare.android.api.C14092c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PullRefreshIndicatorKt$PullRefreshIndicator$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$1(boolean z, int i, long j, PullRefreshState pullRefreshState) {
        super(2);
        this.$refreshing = z;
        this.$$dirty = i;
        this.$contentColor = j;
        this.$state = pullRefreshState;
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
                ComposerKt.m29845w0(-194757728, i, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous> (PullRefreshIndicator.kt:91)");
            }
            Boolean valueOf = Boolean.valueOf(this.$refreshing);
            C2023z0 q = C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null);
            final long j = this.$contentColor;
            final int i2 = this.$$dirty;
            final PullRefreshState pullRefreshState = this.$state;
            CrossfadeKt.m7790c(valueOf, (C8767m) null, q, C8553b.m31048b(oVar, -2067838016, true, new C11305q<Boolean, C8592o, Integer, C11079d2>() {
                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                /* renamed from: a */
                public final void mo10920a(boolean z, @C12580l C8592o oVar, int i) {
                    int i2;
                    int i3;
                    boolean z2 = z;
                    C8592o oVar2 = oVar;
                    int i4 = i;
                    if ((i4 & 14) == 0) {
                        if (oVar2.mo14961b(z2)) {
                            i3 = 4;
                        } else {
                            i3 = 2;
                        }
                        i2 = i3 | i4;
                    } else {
                        i2 = i4;
                    }
                    if ((i2 & 91) != 18 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-2067838016, i4, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:95)");
                        }
                        C8767m.C8768a aVar = C8767m.f23478j;
                        C8767m l = SizeKt.m10112l(aVar, 0.0f, 1, (Object) null);
                        C8734c i5 = C8734c.f23406a.mo17066i();
                        long j = j;
                        int i6 = i2;
                        PullRefreshState pullRefreshState = pullRefreshState;
                        oVar2.mo14918M(733328855);
                        C15560f0 k = BoxKt.m9849k(i5, false, oVar2, 6);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(l);
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
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                        float M = C16483g.m74435M(C16483g.m74435M(PullRefreshIndicatorKt.f18917e + PullRefreshIndicatorKt.f18918f) * ((float) 2));
                        if (z2) {
                            oVar2.mo14918M(-2035147561);
                            float j2 = PullRefreshIndicatorKt.f18918f;
                            ProgressIndicatorKt.m13705b(SizeKt.m10087C(aVar, M), j, j2, 0, 0, oVar, ((i6 >> 9) & 112) | 390, 24);
                            oVar.mo15002m0();
                        } else {
                            oVar2.mo14918M(-2035147307);
                            PullRefreshIndicatorKt.m25103b(pullRefreshState, j, SizeKt.m10087C(aVar, M), oVar, ((i6 >> 9) & 112) | C14092c.f34507C0);
                            oVar.mo15002m0();
                        }
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

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    mo10920a(((Boolean) obj).booleanValue(), (C8592o) obj2, ((Number) obj3).intValue());
                    return C11079d2.f28267a;
                }
            }), oVar, (this.$$dirty & 14) | 3456, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
