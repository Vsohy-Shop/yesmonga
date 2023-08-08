package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.internal.f */
public final class C11929f implements CoroutineContext {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final Throwable f29511a;

    /* renamed from: b */
    public final /* synthetic */ CoroutineContext f29512b;

    public C11929f(@C12579k Throwable th, @C12579k CoroutineContext coroutineContext) {
        this.f29511a = th;
        this.f29512b = coroutineContext;
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return this.f29512b.mo7443Q(coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return this.f29512b.mo7444b(bVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return this.f29512b.mo7445f(bVar);
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return this.f29512b.mo7446l(r, pVar);
    }
}
