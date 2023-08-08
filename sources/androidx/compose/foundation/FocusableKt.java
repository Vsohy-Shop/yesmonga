package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.focus.C15070k;
import androidx.compose.p004ui.focus.C15077q;
import androidx.compose.p004ui.platform.C15971t0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"})
public final class FocusableKt {
    @C12579k

    /* renamed from: a */
    public static final C15971t0 f5737a;

    static {
        C11300l lVar;
        if (InspectableValueKt.m71063e()) {
            lVar = new FocusableKt$special$$inlined$debugInspectorInfo$1();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        f5737a = new C15971t0(lVar);
    }

    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C8767m m8918a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return C15070k.m64750b(C15077q.m64794a(mVar.mo17224k3(f5737a), FocusableKt$focusGroup$1.f5738f));
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m8919b(@C12579k C8767m mVar, boolean z, @C12580l C2243g gVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new FocusableKt$focusable$$inlined$debugInspectorInfo$1(z, gVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new FocusableKt$focusable$2(gVar, z));
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m8920c(C8767m mVar, boolean z, C2243g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            gVar = null;
        }
        return m8919b(mVar, z, gVar);
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m8921d(@C12579k C8767m mVar, boolean z, @C12580l C2243g gVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2072x7ba24b5b(z, gVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new FocusableKt$focusableInNonTouchMode$2(z, gVar));
    }
}
