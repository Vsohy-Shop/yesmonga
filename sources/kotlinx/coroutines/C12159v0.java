package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.v0 */
public class C12159v0<T> extends C11701a<T> implements C12154u0<T> {
    public C12159v0(@C12579k CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    /* renamed from: S1 */
    public static /* synthetic */ <T> Object m48717S1(C12159v0<T> v0Var, C11045c<? super T> cVar) {
        Object x0 = v0Var.mo23661x0(cVar);
        C11063b.m42612h();
        return x0;
    }

    @C12579k
    /* renamed from: R */
    public C12126e<T> mo24777R() {
        C12126e<?> T0 = mo23616T0();
        Intrinsics.checkNotNull(T0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return T0;
    }

    /* renamed from: n */
    public T mo24778n() {
        return mo23609N0();
    }

    @C12580l
    /* renamed from: v */
    public Object mo24780v(@C12579k C11045c<? super T> cVar) {
        return m48717S1(this, cVar);
    }
}
