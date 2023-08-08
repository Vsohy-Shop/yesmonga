package androidx.compose.material3;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,770:1\n939#2:771\n857#2,5:772\n939#2:777\n857#2,5:778\n76#3:783\n76#3:784\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$animateTooltip$2\n*L\n701#1:771\n701#1:772,5\n720#1:777\n720#1:778,5\n701#1:783\n720#1:784\n*E\n"})
public final class TooltipKt$animateTooltip$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipKt$animateTooltip$2(Transition<Boolean> transition) {
        super(3);
        this.$transition = transition;
    }

    /* renamed from: b */
    public static final float m26874b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: c */
    public static final float m26875c(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo12389a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        float f;
        float f2;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar2.mo14918M(-1498516085);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:699)");
        }
        Transition<Boolean> transition = this.$transition;
        TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = TooltipKt$animateTooltip$2$scale$2.f19951f;
        oVar2.mo14918M(-1338768149);
        C11377x xVar = C11377x.f28521a;
        C1945a1<Float, C1983k> i2 = VectorConvertersKt.m8224i(xVar);
        oVar2.mo14918M(-142660079);
        boolean booleanValue = transition.mo6700h().booleanValue();
        oVar2.mo14918M(-1553362193);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        float f3 = 0.8f;
        float f4 = 1.0f;
        if (booleanValue) {
            f = 1.0f;
        } else {
            f = 0.8f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = transition.mo6706o().booleanValue();
        oVar2.mo14918M(-1553362193);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:717)");
        }
        if (booleanValue2) {
            f3 = 1.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        C8578k2<Float> m = TransitionKt.m8194m(transition, valueOf, Float.valueOf(f3), (C1956d0) tooltipKt$animateTooltip$2$scale$2.invoke(transition.mo6704m(), oVar2, 0), i2, "tooltip transition: scaling", oVar, C20022q.C20025c.f51280k);
        oVar.mo15002m0();
        oVar.mo15002m0();
        Transition<Boolean> transition2 = this.$transition;
        TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = TooltipKt$animateTooltip$2$alpha$2.f19950f;
        oVar2.mo14918M(-1338768149);
        C1945a1<Float, C1983k> i3 = VectorConvertersKt.m8224i(xVar);
        oVar2.mo14918M(-142660079);
        boolean booleanValue3 = transition2.mo6700h().booleanValue();
        oVar2.mo14918M(2073045083);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        }
        if (booleanValue3) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        Float valueOf2 = Float.valueOf(f2);
        boolean booleanValue4 = transition2.mo6706o().booleanValue();
        oVar2.mo14918M(2073045083);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:736)");
        }
        if (!booleanValue4) {
            f4 = 0.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        C8578k2<Float> m2 = TransitionKt.m8194m(transition2, valueOf2, Float.valueOf(f4), (C1956d0) tooltipKt$animateTooltip$2$alpha$2.invoke(transition2.mo6704m(), oVar2, 0), i3, "tooltip transition: alpha", oVar, C20022q.C20025c.f51280k);
        oVar.mo15002m0();
        oVar.mo15002m0();
        C8767m e = C15320t2.m66561e(mVar, m26874b(m), m26874b(m), m26875c(m2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131064, (Object) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12389a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
