package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.intrinsics.C12036a;
import kotlinx.coroutines.selects.C12128g;
import kotlinx.coroutines.selects.C12129h;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LazyActorCoroutine<E> extends C11736a<E> {
    @C12579k

    /* renamed from: e */
    public C11045c<? super C11079d2> f29146e;

    public LazyActorCoroutine(@C12579k CoroutineContext coroutineContext, @C12579k C11744g<E> gVar, @C12579k C11304p<? super C11738c<E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        super(coroutineContext, gVar, false);
        this.f29146e = IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, this, this);
    }

    /* renamed from: U1 */
    public static /* synthetic */ void m46516U1() {
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        start();
        return super.mo23751L(e);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    public boolean mo23791M(E e) {
        start();
        return super.mo23791M(e);
    }

    /* renamed from: V1 */
    public final void mo23905V1(C12131j<?> jVar, Object obj) {
        mo23662x1();
        super.mo23833h().mo24728a().invoke(this, jVar, obj);
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        boolean d0 = super.mo23756d0(th);
        start();
        return d0;
    }

    @C12579k
    /* renamed from: h */
    public C12128g<E, C11763t<E>> mo23833h() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.f29147a;
        Intrinsics.checkNotNull(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C12129h(this, (C11305q) C11370u0.m43701q(lazyActorCoroutine$onSend$1, 3), super.mo23833h().mo24730c(), (C11305q) null, 8, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        start();
        Object h0 = super.mo23757h0(e, cVar);
        if (h0 == C11063b.m42612h()) {
            return h0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: x1 */
    public void mo23662x1() {
        C12036a.m48045c(this.f29146e, this);
    }
}
