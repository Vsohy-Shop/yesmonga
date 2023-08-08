package androidx.compose.material.pullrefresh;

import androidx.compose.material.C3044g0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n146#2:77\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n42#1:76\n42#1:77\n*E\n"})
public final class PullRefreshIndicatorTransformKt {
    @C3044g0
    @C12579k
    /* renamed from: a */
    public static final C8767m m25115a(@C12579k C8767m mVar, @C12579k PullRefreshState pullRefreshState, boolean z) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pullRefreshState, "state");
        if (InspectableValueKt.m71063e()) {
            lVar = new C7894xed34cb43(pullRefreshState, z);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return InspectableValueKt.m71062d(mVar, lVar, C15320t2.m66557a(DrawModifierKt.m32438c(C8767m.f23478j, C7895xe053f546.f18926f), new C7896xe053f547(pullRefreshState, z)));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m25116b(C8767m mVar, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m25115a(mVar, pullRefreshState, z);
    }
}
