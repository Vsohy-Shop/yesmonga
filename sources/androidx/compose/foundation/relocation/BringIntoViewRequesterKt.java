package androidx.compose.foundation.relocation;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,154:1\n135#2:155\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n*L\n103#1:155\n*E\n"})
public final class BringIntoViewRequesterKt {
    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2672d m12020a() {
        return new BringIntoViewRequesterImpl();
    }

    @C2855v
    @C12579k
    /* renamed from: b */
    public static final C8767m m12021b(@C12579k C8767m mVar, @C12579k C2672d dVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "bringIntoViewRequester");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2662xf3bab713(dVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new BringIntoViewRequesterKt$bringIntoViewRequester$2(dVar));
    }
}
