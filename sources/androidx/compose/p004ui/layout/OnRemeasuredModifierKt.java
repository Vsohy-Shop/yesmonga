package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOnRemeasuredModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,96:1\n135#2:97\n*S KotlinDebug\n*F\n+ 1 OnRemeasuredModifier.kt\nandroidx/compose/ui/layout/OnRemeasuredModifierKt\n*L\n50#1:97\n*E\n"})
/* renamed from: androidx.compose.ui.layout.OnRemeasuredModifierKt */
public final class OnRemeasuredModifierKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m69010a(@C12579k C8767m mVar, @C12579k C11300l<? super C16500q, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onSizeChanged");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C15526x4cc3abe0(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C15602t0(lVar, lVar2));
    }
}
