package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.y */
public final class C12175y<T> extends JobSupport implements C12169x<T> {
    public C12175y(@C12580l C11723c2 c2Var) {
        super(true);
        mo23625c1(c2Var);
    }

    /* renamed from: G */
    public boolean mo24789G(T t) {
        return mo23639l1(t);
    }

    @C12579k
    /* renamed from: R */
    public C12126e<T> mo24777R() {
        C12126e<?> T0 = mo23616T0();
        Intrinsics.checkNotNull(T0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return T0;
    }

    /* renamed from: V0 */
    public boolean mo23617V0() {
        return true;
    }

    /* renamed from: i */
    public boolean mo24790i(@C12579k Throwable th) {
        return mo23639l1(new C11721c0(th, false, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: n */
    public T mo24778n() {
        return mo23609N0();
    }

    @C12580l
    /* renamed from: v */
    public Object mo24780v(@C12579k C11045c<? super T> cVar) {
        Object x0 = mo23661x0(cVar);
        C11063b.m42612h();
        return x0;
    }
}
