package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n36#2:1195\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n76#4:1202\n102#4,2:1203\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInOut$1\n*L\n955#1:1181\n967#1:1188\n969#1:1195\n955#1:1182,6\n967#1:1189,6\n969#1:1196,6\n955#1:1202\n955#1:1203,2\n*E\n"})
public final class EnterExitTransitionKt$slideInOut$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ C8578k2<C2043s> $slideIn;
    final /* synthetic */ C8578k2<C2043s> $slideOut;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, C8578k2<C2043s> k2Var, C8578k2<C2043s> k2Var2, String str) {
        super(3);
        this.$transition = transition;
        this.$slideIn = k2Var;
        this.$slideOut = k2Var2;
        this.$labelPrefix = str;
    }

    /* renamed from: b */
    public static final boolean m7869b(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: c */
    public static final void m7870c(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo6535a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(158379472);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(158379472, i, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)");
        }
        Transition<EnterExitState> transition = this.$transition;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(transition);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        if (this.$transition.mo6700h() == this.$transition.mo6706o() && !this.$transition.mo6711t()) {
            m7870c(z0Var, false);
        } else if (!(this.$slideIn.getValue() == null && this.$slideOut.getValue() == null)) {
            m7870c(z0Var, true);
        }
        if (m7869b(z0Var)) {
            Transition<EnterExitState> transition2 = this.$transition;
            C1945a1<C16494m, C1986l> g = VectorConvertersKt.m8222g(C16494m.f40890b);
            String str = this.$labelPrefix;
            oVar.mo14918M(-492369756);
            Object N2 = oVar.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N2 == aVar.mo16277a()) {
                N2 = str + " slide";
                oVar.mo14893C(N2);
            }
            oVar.mo15002m0();
            Transition.C1925a<C16494m, C1986l> l = TransitionKt.m8193l(transition2, g, (String) N2, oVar, 448, 0);
            Transition<EnterExitState> transition3 = this.$transition;
            C8578k2<C2043s> k2Var = this.$slideIn;
            C8578k2<C2043s> k2Var2 = this.$slideOut;
            oVar.mo14918M(1157296644);
            boolean n02 = oVar.mo15006n0(transition3);
            Object N3 = oVar.mo14921N();
            if (n02 || N3 == aVar.mo16277a()) {
                N3 = new SlideModifier(l, k2Var, k2Var2);
                oVar.mo14893C(N3);
            }
            oVar.mo15002m0();
            mVar = mVar.mo17224k3((SlideModifier) N3);
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6535a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
