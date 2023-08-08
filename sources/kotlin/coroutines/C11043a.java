package kotlin.coroutines;

import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
/* renamed from: kotlin.coroutines.a */
public abstract class C11043a implements CoroutineContext.C11040a {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext.C11042b<?> f28244a;

    public C11043a(@C12579k CoroutineContext.C11042b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        this.f28244a = bVar;
    }

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
        return this.f28244a;
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return CoroutineContext.C11040a.C11041a.m42563a(this, r, pVar);
    }
}
