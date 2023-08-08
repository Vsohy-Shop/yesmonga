package kotlinx.coroutines.internal;

import kotlin.C11532s0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.coroutines.internal.v0 */
public final class C12024v0 implements CoroutineContext.C11042b<C12022u0<?>> {
    @C12579k

    /* renamed from: a */
    public final ThreadLocal<?> f29635a;

    public C12024v0(@C12579k ThreadLocal<?> threadLocal) {
        this.f29635a = threadLocal;
    }

    /* renamed from: c */
    public static /* synthetic */ C12024v0 m47982c(C12024v0 v0Var, ThreadLocal<?> threadLocal, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal = v0Var.f29635a;
        }
        return v0Var.mo24411b(threadLocal);
    }

    /* renamed from: a */
    public final ThreadLocal<?> mo24410a() {
        return this.f29635a;
    }

    @C12579k
    /* renamed from: b */
    public final C12024v0 mo24411b(@C12579k ThreadLocal<?> threadLocal) {
        return new C12024v0(threadLocal);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12024v0) && Intrinsics.areEqual((Object) this.f29635a, (Object) ((C12024v0) obj).f29635a);
    }

    public int hashCode() {
        return this.f29635a.hashCode();
    }

    @C12579k
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f29635a + ')';
    }
}
