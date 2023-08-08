package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,116:1\n135#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n50#1:117\n*E\n"})
public final class HoverableKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m8950a(@C12579k C8767m mVar, @C12579k C2243g gVar, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(gVar, "interactionSource");
        if (InspectableValueKt.m71063e()) {
            lVar = new HoverableKt$hoverable$$inlined$debugInspectorInfo$1(gVar, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new HoverableKt$hoverable$2(gVar, z));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m8951b(C8767m mVar, C2243g gVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m8950a(mVar, gVar, z);
    }
}
