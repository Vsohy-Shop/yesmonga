package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LazyStaggeredGridMeasureResultKt {
    @C12580l
    /* renamed from: a */
    public static final C2596e m11664a(@C12579k C2600i iVar, int i) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (iVar.mo8949i().isEmpty()) {
            return null;
        }
        int index = ((C2596e) CollectionsKt___CollectionsKt.m40706w2(iVar.mo8949i())).getIndex();
        boolean z = false;
        if (i <= ((C2596e) CollectionsKt___CollectionsKt.m40653k3(iVar.mo8949i())).getIndex() && index <= i) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return (C2596e) CollectionsKt___CollectionsKt.m40559R2(iVar.mo8949i(), CollectionsKt__CollectionsKt.m40468w(iVar.mo8949i(), 0, 0, new LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(i), 3, (Object) null));
    }
}
