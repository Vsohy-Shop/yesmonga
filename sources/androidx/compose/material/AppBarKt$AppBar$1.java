package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
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
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppBarKt$AppBar$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11305q<C2411u0, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C2366i0 $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$AppBar$1(C2366i0 i0Var, C11305q<? super C2411u0, ? super C8592o, ? super Integer, C11079d2> qVar, int i) {
        super(2);
        this.$contentPadding = i0Var;
        this.$content = qVar;
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
                ComposerKt.m29845w0(-1027830352, i, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
            }
            C8572j1[] j1VarArr = {ContentAlphaKt.m13404a().mo16141f(Float.valueOf(C7904r.f18969a.mo10993d(oVar, 6)))};
            final C2366i0 i0Var = this.$contentPadding;
            final C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = this.$content;
            final int i2 = this.$$dirty;
            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, 1296061040, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(1296061040, i, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:520)");
                        }
                        C8767m o = SizeKt.m10115o(PaddingKt.m10023j(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), i0Var), AppBarKt.f7503a);
                        Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
                        C8734c.C8737c q = C8734c.f23406a.mo17070q();
                        C11305q<C2411u0, C8592o, Integer, C11079d2> qVar = qVar;
                        int i2 = ((i2 >> 9) & 7168) | 432;
                        oVar.mo14918M(693286680);
                        int i3 = i2 >> 3;
                        C15560f0 d = RowKt.m10071d(p, q, oVar, (i3 & 112) | (i3 & 14));
                        oVar.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o);
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
