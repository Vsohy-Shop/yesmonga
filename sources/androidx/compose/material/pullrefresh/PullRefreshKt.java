package androidx.compose.material.pullrefresh;

import androidx.compose.material.C3044g0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,119:1\n135#2:120\n146#2:121\n135#2:122\n146#2:123\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:120\n47#1:121\n82#1:122\n82#1:123\n*E\n"})
public final class PullRefreshKt {
    @C3044g0
    @C12579k
    /* renamed from: b */
    public static final C8767m m25121b(@C12579k C8767m mVar, @C12579k PullRefreshState pullRefreshState, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pullRefreshState, "state");
        if (InspectableValueKt.m71063e()) {
            lVar = new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(pullRefreshState, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return InspectableValueKt.m71062d(mVar, lVar, m25122c(C8767m.f23478j, new PullRefreshKt$pullRefresh$2$1(pullRefreshState), new PullRefreshKt$pullRefresh$2$2(pullRefreshState), z));
    }

    @C3044g0
    @C12579k
    /* renamed from: c */
    public static final C8767m m25122c(@C12579k C8767m mVar, @C12579k C11300l<? super Float, Float> lVar, @C12579k C11304p<? super Float, ? super C11045c<? super Float>, ? extends Object> pVar, boolean z) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onPull");
        Intrinsics.checkNotNullParameter(pVar, "onRelease");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(lVar, pVar, z);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return InspectableValueKt.m71062d(mVar, lVar2, NestedScrollModifierKt.m68305b(C8767m.f23478j, new PullRefreshNestedScrollConnection(lVar, pVar, z), (NestedScrollDispatcher) null, 2, (Object) null));
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m25123d(C8767m mVar, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m25121b(mVar, pullRefreshState, z);
    }

    /* renamed from: e */
    public static /* synthetic */ C8767m m25124e(C8767m mVar, C11300l lVar, C11304p pVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m25122c(mVar, lVar, pVar, z);
    }
}
