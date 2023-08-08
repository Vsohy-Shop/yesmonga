package androidx.compose.material3;

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
    public final ScrollState f19609a;
    @C12579k

    /* renamed from: b */
    public final C12074o0 f19610b;
    @C12580l

    /* renamed from: c */
    public Integer f19611c;

    public ScrollableTabData(@C12579k ScrollState scrollState, @C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        this.f19609a = scrollState;
        this.f19610b = o0Var;
    }

    /* renamed from: b */
    public final int mo11816b(C8184c3 c3Var, C16479d dVar, int i, List<C8184c3> list) {
        int n2 = dVar.mo7429n2(((C8184c3) CollectionsKt___CollectionsKt.m40653k3(list)).mo12512b()) + i;
        int q = n2 - this.f19609a.mo7257q();
        return C11479u.m44334I(dVar.mo7429n2(c3Var.mo12511a()) - ((q / 2) - (dVar.mo7429n2(c3Var.mo12513c()) / 2)), 0, C11479u.m44447u(n2 - q, 0));
    }

    /* renamed from: c */
    public final void mo11817c(@C12579k C16479d dVar, int i, @C12579k List<C8184c3> list, int i2) {
        int b;
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(list, "tabPositions");
        Integer num = this.f19611c;
        if (num == null || num.intValue() != i2) {
            this.f19611c = Integer.valueOf(i2);
            C8184c3 c3Var = (C8184c3) CollectionsKt___CollectionsKt.m40559R2(list, i2);
            if (c3Var != null && this.f19609a.mo7258r() != (b = mo11816b(c3Var, dVar, i, list))) {
                C11723c2 unused = C12038j.m48061f(this.f19610b, (CoroutineContext) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(this, b, (C11045c<? super ScrollableTabData$onLaidOut$1$1>) null), 3, (Object) null);
            }
        }
    }
}
