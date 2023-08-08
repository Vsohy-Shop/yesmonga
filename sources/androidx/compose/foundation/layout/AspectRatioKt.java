package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,218:1\n135#2:219\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n62#1:219\n*E\n"})
public final class AspectRatioKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m9819a(@C12579k C8767m mVar, float f, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new AspectRatioModifier(f, z, lVar));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m9820b(C8767m mVar, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m9819a(mVar, f, z);
    }
}
