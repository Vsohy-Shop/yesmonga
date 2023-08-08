package androidx.compose.foundation.interaction;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDragInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n25#2:96\n50#2:103\n49#2:104\n1114#3,6:97\n1114#3,6:105\n*S KotlinDebug\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n*L\n81#1:96\n82#1:103\n82#1:104\n81#1:97,6\n82#1:105,6\n*E\n"})
public final class DragInteractionKt {
    @C8540g
    @C12579k
    /* renamed from: a */
    public static final C8578k2<Boolean> m9671a(@C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        oVar.mo14918M(101276833);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(101276833, i, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:79)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8700z0 z0Var = (C8700z0) N;
        int i2 = i & 14;
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(eVar) | oVar.mo15006n0(z0Var);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new DragInteractionKt$collectIsDraggedAsState$1$1(eVar, z0Var, (C11045c<? super DragInteractionKt$collectIsDraggedAsState$1$1>) null);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        EffectsKt.m29896h(eVar, (C11304p) N2, oVar, i2 | 64);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return z0Var;
    }
}
