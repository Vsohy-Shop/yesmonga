package kotlinx.coroutines.internal;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C11701a;
import kotlinx.coroutines.C11966h0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.k0 */
public class C12001k0<T> extends C11701a<T> implements C11066c {
    @C12579k
    @C11287e

    /* renamed from: d */
    public final C11045c<T> f29603d;

    public C12001k0(@C12579k CoroutineContext coroutineContext, @C12579k C11045c<? super T> cVar) {
        super(coroutineContext, true, true);
        this.f29603d = cVar;
    }

    /* renamed from: N1 */
    public void mo23692N1(@C12580l Object obj) {
        C11045c<T> cVar = this.f29603d;
        cVar.resumeWith(C11966h0.m47674a(obj, cVar));
    }

    /* renamed from: f1 */
    public final boolean mo23631f1() {
        return true;
    }

    @C12580l
    public final C11066c getCallerFrame() {
        C11045c<T> cVar = this.f29603d;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12580l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: w0 */
    public void mo23658w0(@C12580l Object obj) {
        C12002l.m47871e(IntrinsicsKt__IntrinsicsJvmKt.m42608d(this.f29603d), C11966h0.m47674a(obj, this.f29603d), (C11300l) null, 2, (Object) null);
    }
}
