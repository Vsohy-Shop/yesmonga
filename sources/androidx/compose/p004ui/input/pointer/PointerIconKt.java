package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,101:1\n135#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n74#1:102\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt */
public final class PointerIconKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m68352a(@C12579k C8767m mVar, @C12579k C15496s sVar, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(sVar, "icon");
        if (InspectableValueKt.m71063e()) {
            lVar = new PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(sVar, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new PointerIconKt$pointerHoverIcon$2(sVar, z));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m68353b(C8767m mVar, C15496s sVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m68352a(mVar, sVar, z);
    }
}
