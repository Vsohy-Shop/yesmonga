package androidx.compose.p004ui;

import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nZIndexModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n*S KotlinDebug\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n45#1:77\n*E\n"})
/* renamed from: androidx.compose.ui.ZIndexModifierKt */
public final class ZIndexModifierKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m32294a(@C12579k C8767m mVar, float f) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1(f);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new ZIndexModifier(f, lVar));
    }
}
