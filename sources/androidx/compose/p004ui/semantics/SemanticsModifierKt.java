package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n114#1:148\n142#1:149\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierKt */
public final class SemanticsModifierKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m71866a(@C12579k C8767m mVar, @C12579k C11300l<? super C16044q, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "properties");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C16020x10017f64(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C16038l(false, true, lVar, lVar2));
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m71867b(@C12579k C8767m mVar, boolean z, @C12579k C11300l<? super C16044q, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "properties");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1(z, lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C16038l(z, false, lVar, lVar2));
    }

    /* renamed from: c */
    public static /* synthetic */ C8767m m71868c(C8767m mVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m71867b(mVar, z, lVar);
    }
}
