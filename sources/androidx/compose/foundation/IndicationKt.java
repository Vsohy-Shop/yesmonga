package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"})
public final class IndicationKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C2104a0> f5748a = CompositionLocalKt.m29859e(IndicationKt$LocalIndication$1.f5749f);

    @C12579k
    /* renamed from: a */
    public static final C8550i1<C2104a0> m8972a() {
        return f5748a;
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m8973b(@C12579k C8767m mVar, @C12579k C2241e eVar, @C12580l C2104a0 a0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        if (InspectableValueKt.m71063e()) {
            lVar = new IndicationKt$indication$$inlined$debugInspectorInfo$1(a0Var, eVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new IndicationKt$indication$2(a0Var, eVar));
    }
}
