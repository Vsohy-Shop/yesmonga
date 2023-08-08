package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15320t2;
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
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n936#2,4:148\n857#2,5:152\n36#3:157\n460#3,13:183\n473#3,3:197\n1057#4,6:158\n67#5,6:164\n73#5:196\n77#5:201\n75#6:170\n76#6,11:172\n89#6:200\n76#7:171\n76#8:202\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157\n132#1:183,13\n132#1:197,3\n132#1:158,6\n132#1:164,6\n132#1:196\n132#1:201\n132#1:170\n132#1:172,11\n132#1:200\n132#1:171\n129#1:202\n*E\n"})
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C1956d0<Float> $animationSpec;
    final /* synthetic */ C11305q<T, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, int i, C1956d0<Float> d0Var, T t, C11305q<? super T, ? super C8592o, ? super Integer, C11079d2> qVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i;
        this.$animationSpec = d0Var;
        this.$stateForContent = t;
        this.$content = qVar;
    }

    /* renamed from: b */
    public static final float m7793b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
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
                ComposerKt.m29845w0(-1426421288, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            Transition<T> transition = this.$this_Crossfade;
            CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(this.$animationSpec);
            T t = this.$stateForContent;
            int i3 = this.$$dirty & 14;
            oVar2.mo14918M(-1338768149);
            C1945a1<Float, C1983k> i4 = VectorConvertersKt.m8224i(C11377x.f28521a);
            int i5 = i3 & 14;
            int i6 = i3 << 3;
            int i7 = (i6 & 57344) | i5 | (i6 & 896) | (i6 & 7168);
            oVar2.mo14918M(-142660079);
            T h = transition.mo6700h();
            int i8 = (i7 >> 9) & 112;
            oVar2.mo14918M(-438678252);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-438678252, i8, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f = Intrinsics.areEqual((Object) h, (Object) t) ? 1.0f : 0.0f;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            Float valueOf = Float.valueOf(f);
            T o = transition.mo6706o();
            oVar2.mo14918M(-438678252);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-438678252, i8, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f2 = Intrinsics.areEqual((Object) o, (Object) t) ? 1.0f : 0.0f;
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            C8578k2<Float> m = TransitionKt.m8194m(transition, valueOf, Float.valueOf(f2), (C1956d0) crossfadeKt$Crossfade$5$1$alpha$2.invoke(transition.mo6704m(), oVar2, Integer.valueOf((i7 >> 3) & 112)), i4, "FloatAnimation", oVar, (i7 & 14) | (57344 & (i7 << 9)) | ((i7 << 6) & 458752));
            oVar.mo15002m0();
            oVar.mo15002m0();
            C8767m.C8768a aVar = C8767m.f23478j;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(m);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new CrossfadeKt$Crossfade$5$1$1$1(m);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            C8767m a = C15320t2.m66557a(aVar, (C11300l) N);
            C11305q<T, C8592o, Integer, C11079d2> qVar = this.$content;
            T t2 = this.$stateForContent;
            int i9 = this.$$dirty;
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(a);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            oVar2.mo14918M(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            qVar.invoke(t2, oVar2, Integer.valueOf((i9 >> 9) & 112));
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
}
