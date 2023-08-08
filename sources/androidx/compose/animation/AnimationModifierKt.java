package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,162:1\n135#2:163\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n72#1:163\n*E\n"})
public final class AnimationModifierKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m7765a(@C12579k C8767m mVar, @C12579k C1956d0<C16500q> d0Var, @C12580l C11304p<? super C16500q, ? super C16500q, C11079d2> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        if (InspectableValueKt.m71063e()) {
            lVar = new C1904x5f44a391(d0Var, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new AnimationModifierKt$animateContentSize$2(pVar, d0Var));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m7766b(C8767m mVar, C1956d0 d0Var, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        if ((i & 2) != 0) {
            pVar = null;
        }
        return m7765a(mVar, d0Var, pVar);
    }
}
