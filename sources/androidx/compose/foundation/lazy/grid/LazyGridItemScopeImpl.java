package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.foundation.C2855v;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16494m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyGridItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,55:1\n135#2:56\n*S KotlinDebug\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n*L\n33#1:56\n*E\n"})
public final class LazyGridItemScopeImpl implements C2496k {
    @C12579k

    /* renamed from: a */
    public static final LazyGridItemScopeImpl f6505a = new LazyGridItemScopeImpl();

    @C2855v
    @C12579k
    /* renamed from: a */
    public C8767m mo8454a(@C12579k C8767m mVar, @C12579k C1956d0<C16494m> d0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2472xd9ad5526(d0Var);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2482a(d0Var, lVar));
    }
}
