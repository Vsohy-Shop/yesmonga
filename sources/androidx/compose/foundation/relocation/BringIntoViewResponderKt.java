package androidx.compose.foundation.relocation;

import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n135#2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n*L\n102#1:200\n*E\n"})
public final class BringIntoViewResponderKt {
    @C2855v
    @C12579k
    /* renamed from: b */
    public static final C8767m m12029b(@C12579k C8767m mVar, @C12579k C2673e eVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "responder");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2665x692369d3(eVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new BringIntoViewResponderKt$bringIntoViewResponder$2(eVar));
    }

    /* renamed from: c */
    public static final boolean m12030c(C15098i iVar, C15098i iVar2) {
        if (iVar.mo42279t() > iVar2.mo42279t() || iVar.mo42249B() > iVar2.mo42249B() || iVar.mo42283x() < iVar2.mo42283x() || iVar.mo42271j() < iVar2.mo42271j()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final C15098i m12031d(C15588o oVar, C15588o oVar2, C15098i iVar) {
        return iVar.mo42261S(oVar.mo44437n0(oVar2, false).mo42251E());
    }
}
