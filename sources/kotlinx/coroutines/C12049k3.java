package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import kotlinx.coroutines.internal.C12001k0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.k3 */
public final class C12049k3<U, T extends U> extends C12001k0<T> implements Runnable {
    @C11287e

    /* renamed from: e */
    public final long f29692e;

    public C12049k3(long j, @C12579k C11045c<? super U> cVar) {
        super(cVar.getContext(), cVar);
        this.f29692e = j;
    }

    @C12579k
    /* renamed from: o1 */
    public String mo23642o1() {
        return super.mo23642o1() + "(timeMillis=" + this.f29692e + ')';
    }

    public void run() {
        mo23666z0(TimeoutKt.m46060a(this.f29692e, DelayKt.m45927d(getContext()), this));
    }
}
