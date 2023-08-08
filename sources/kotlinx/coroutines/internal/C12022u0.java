package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.u0 */
public final class C12022u0<T> implements C11726c3<T> {

    /* renamed from: a */
    public final T f29628a;
    @C12579k

    /* renamed from: b */
    public final ThreadLocal<T> f29629b;
    @C12579k

    /* renamed from: c */
    public final CoroutineContext.C11042b<?> f29630c;

    public C12022u0(T t, @C12579k ThreadLocal<T> threadLocal) {
        this.f29628a = t;
        this.f29629b = threadLocal;
        this.f29630c = new C12024v0(threadLocal);
    }

    /* renamed from: F */
    public void mo15332F(@C12579k CoroutineContext coroutineContext, T t) {
        this.f29629b.set(t);
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C11726c3.C11727a.m46198d(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        if (!Intrinsics.areEqual((Object) getKey(), (Object) bVar)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return Intrinsics.areEqual((Object) getKey(), (Object) bVar) ? EmptyCoroutineContext.f28243a : this;
    }

    @C12579k
    public CoroutineContext.C11042b<?> getKey() {
        return this.f29630c;
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C11726c3.C11727a.m46195a(this, r, pVar);
    }

    /* renamed from: p0 */
    public T mo15336p0(@C12579k CoroutineContext coroutineContext) {
        T t = this.f29629b.get();
        this.f29629b.set(this.f29628a);
        return t;
    }

    @C12579k
    public String toString() {
        return "ThreadLocal(value=" + this.f29628a + ", threadLocal = " + this.f29629b + ')';
    }
}
