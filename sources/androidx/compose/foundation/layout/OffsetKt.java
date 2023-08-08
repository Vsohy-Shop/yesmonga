package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8547h2;
import androidx.constraintlayout.core.motion.utils.C16717v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n135#2:228\n135#2:230\n135#2:232\n135#2:233\n155#3:229\n155#3:231\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n55#1:228\n83#1:230\n114#1:232\n145#1:233\n50#1:229\n78#1:231\n*E\n"})
public final class OffsetKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m9995a(@C12579k C8767m mVar, @C12579k C11300l<? super C16479d, C16494m> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C16717v.C16720c.f42211R);
        if (InspectableValueKt.m71063e()) {
            lVar2 = new OffsetKt$absoluteOffset$$inlined$debugInspectorInfo$1(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new OffsetPxModifier(lVar, false, lVar2));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m9996b(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$absoluteOffset");
        if (InspectableValueKt.m71063e()) {
            lVar = new OffsetKt$absoluteOffsetVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new OffsetModifier(f, f2, false, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m9997c(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        return m9996b(mVar, f, f2);
    }

    @C12579k
    /* renamed from: d */
    public static final C8767m m9998d(@C12579k C8767m mVar, @C12579k C11300l<? super C16479d, C16494m> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C16717v.C16720c.f42211R);
        if (InspectableValueKt.m71063e()) {
            lVar2 = new OffsetKt$offset$$inlined$debugInspectorInfo$1(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new OffsetPxModifier(lVar, true, lVar2));
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final C8767m m9999e(@C12579k C8767m mVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$offset");
        if (InspectableValueKt.m71063e()) {
            lVar = new OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new OffsetModifier(f, f2, true, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m10000f(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.m74435M((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C16483g.m74435M((float) 0);
        }
        return m9999e(mVar, f, f2);
    }
}
