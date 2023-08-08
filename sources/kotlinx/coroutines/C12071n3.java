package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.n3 */
public final class C12071n3 implements CoroutineContext.C11040a, CoroutineContext.C11042b<C12071n3> {
    @C12579k

    /* renamed from: a */
    public static final C12071n3 f29711a = new C12071n3();

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return CoroutineContext.C11040a.C11041a.m42566d(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return CoroutineContext.C11040a.C11041a.m42564b(this, bVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return CoroutineContext.C11040a.C11041a.m42565c(this, bVar);
    }

    @C12579k
    public CoroutineContext.C11042b<?> getKey() {
        return this;
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return CoroutineContext.C11040a.C11041a.m42563a(this, r, pVar);
    }
}
