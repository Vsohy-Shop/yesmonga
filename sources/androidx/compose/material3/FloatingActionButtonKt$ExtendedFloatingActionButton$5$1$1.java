package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,619:1\n75#2,6:620\n81#2:652\n85#2:657\n75#3:626\n76#3,11:628\n89#3:656\n76#4:627\n460#5,13:639\n473#5,3:653\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1\n*L\n378#1:620,6\n378#1:652\n378#1:657\n378#1:626\n378#1:628,11\n378#1:656\n378#1:627\n378#1:639,13\n378#1:653,3\n*E\n"})
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1 extends Lambda implements C11305q<AnimatedVisibilityScope, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$5$1$1(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i) {
        super(3);
        this.$text = pVar;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo11580a(@C12579k AnimatedVisibilityScope animatedVisibilityScope, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "$this$AnimatedVisibility");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(176242764, i, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:376)");
        }
        C8767m.C8768a aVar = C8767m.f23478j;
        C8767m a = SemanticsModifierKt.m71866a(aVar, C80311.f19434f);
        C11304p<C8592o, Integer, C11079d2> pVar = this.$text;
        int i2 = this.$$dirty;
        oVar.mo14918M(693286680);
        C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), oVar, 0);
        oVar.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a2 = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(a);
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(a2);
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
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
        oVar.mo14918M(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
        C2428y0.m10726a(SizeKt.m10092H(aVar, FloatingActionButtonKt.f19429b), oVar, 6);
        pVar.invoke(oVar, Integer.valueOf(i2 & 14));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo11580a((AnimatedVisibilityScope) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
