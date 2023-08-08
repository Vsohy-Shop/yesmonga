package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,200:1\n135#2:201\n135#2:202\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n173#1:201\n194#1:202\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl */
public final class LookaheadLayoutScopeImpl implements C15539b0 {
    @C12580l

    /* renamed from: a */
    public NodeCoordinator f38656a;

    @C12579k
    /* renamed from: a */
    public C8767m mo44304a(@C12579k C8767m mVar, @C12579k C11304p<? super C15617y, ? super C15617y, C11079d2> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "onPlaced");
        if (InspectableValueKt.m71063e()) {
            lVar = new LookaheadLayoutScopeImpl$onPlaced$$inlined$debugInspectorInfo$1(pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new LookaheadLayoutScopeImpl$onPlaced$2(pVar, this));
    }

    @C12579k
    /* renamed from: b */
    public C8767m mo44305b(@C12579k C8767m mVar, @C12579k C11306r<? super C15568h0, ? super C15557e0, ? super C16476b, ? super C16500q, ? extends C15564g0> rVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "measure");
        if (InspectableValueKt.m71063e()) {
            lVar = new C15522xcead6af7(rVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C15614x(rVar, lVar));
    }

    @C12580l
    /* renamed from: c */
    public final NodeCoordinator mo44306c() {
        return this.f38656a;
    }

    /* renamed from: d */
    public final void mo44307d(@C12580l NodeCoordinator nodeCoordinator) {
        this.f38656a = nodeCoordinator;
    }
}
