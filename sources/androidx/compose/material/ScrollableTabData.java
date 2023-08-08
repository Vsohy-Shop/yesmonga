package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ScrollableTabData {
    @C12579k

    /* renamed from: a */
    public final ScrollState f7811a;
    @C12579k

    /* renamed from: b */
    public final C12074o0 f7812b;
    @C12580l

    /* renamed from: c */
    public Integer f7813c;

    public ScrollableTabData(@C12579k ScrollState scrollState, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        this.f7811a = scrollState;
        this.f7812b = o0Var;
    }

    /* renamed from: b */
    public final int mo10373b(C7906r1 r1Var, C16479d dVar, int i, List<C7906r1> list) {
        int n2 = dVar.mo7429n2(((C7906r1) CollectionsKt___CollectionsKt.m40653k3(list)).mo10997b()) + i;
        int q = n2 - this.f7811a.mo7257q();
        return C11479u.m44334I(dVar.mo7429n2(r1Var.mo10996a()) - ((q / 2) - (dVar.mo7429n2(r1Var.mo10998c()) / 2)), 0, C11479u.m44447u(n2 - q, 0));
    }

    /* renamed from: c */
    public final void mo10374c(@C12579k C16479d dVar, int i, @C12579k List<C7906r1> list, int i2) {
        int b;
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(list, "tabPositions");
        Integer num = this.f7813c;
        if (num == null || num.intValue() != i2) {
            this.f7813c = Integer.valueOf(i2);
            C7906r1 r1Var = (C7906r1) CollectionsKt___CollectionsKt.m40559R2(list, i2);
            if (r1Var != null && this.f7811a.mo7258r() != (b = mo10373b(r1Var, dVar, i, list))) {
                C11723c2 unused = C12038j.m48061f(this.f7812b, (CoroutineContext) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(this, b, (C11045c<? super ScrollableTabData$onLaidOut$1$1>) null), 3, (Object) null);
            }
        }
    }
}
