package androidx.compose.foundation.interaction;

import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.interaction.h */
public final class C2244h implements C2243g {
    @C12579k

    /* renamed from: a */
    public final C11911i<C2240d> f5997a = C11945o.m47610b(0, 16, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    @C12580l
    /* renamed from: a */
    public Object mo7604a(@C12579k C2240d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object emit = mo7603c().emit(dVar, cVar);
        return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
    }

    /* renamed from: b */
    public boolean mo7605b(@C12579k C2240d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "interaction");
        return mo7603c().mo24198a(dVar);
    }

    @C12579k
    /* renamed from: d */
    public C11911i<C2240d> mo7603c() {
        return this.f5997a;
    }
}
