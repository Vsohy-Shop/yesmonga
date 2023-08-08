package kotlinx.coroutines;

import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.C11044b;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12000k;
import kotlinx.coroutines.internal.C12012q;
import kotlinx.coroutines.internal.C12015r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class CoroutineDispatcher extends C11043a implements C11047d {
    @C12579k

    /* renamed from: b */
    public static final Key f29001b = new Key((DefaultConstructorMarker) null);

    @C11429q
    public static final class Key extends C11044b<C11047d, CoroutineDispatcher> {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Key() {
            super(C11047d.f28247u0, C116921.f29002f);
        }
    }

    public CoroutineDispatcher() {
        super(C11047d.f28247u0);
    }

    /* renamed from: O */
    public abstract void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable);

    @C12177y1
    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        mo23563O(coroutineContext, runnable);
    }

    /* renamed from: U */
    public boolean mo23565U(@C12579k CoroutineContext coroutineContext) {
        return true;
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        return new C12012q(this, i);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @C12579k
    /* renamed from: X */
    public final CoroutineDispatcher mo23567X(@C12579k CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C11047d.C11048a.m42586b(this, bVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C11047d.C11048a.m42587c(this, bVar);
    }

    /* renamed from: m */
    public final void mo22490m(@C12579k C11045c<?> cVar) {
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C12000k) cVar).mo24375u();
    }

    @C12579k
    /* renamed from: o */
    public final <T> C11045c<T> mo22491o(@C12579k C11045c<? super T> cVar) {
        return new C12000k(this, cVar);
    }

    @C12579k
    public String toString() {
        return C12090r0.m48300a(this) + '@' + C12090r0.m48301b(this);
    }
}
