package kotlin.coroutines;

import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.C11040a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11429q
@C11665v0(version = "1.3")
/* renamed from: kotlin.coroutines.b */
public abstract class C11044b<B extends CoroutineContext.C11040a, E extends B> implements CoroutineContext.C11042b<E> {
    @C12579k

    /* renamed from: a */
    public final C11300l<CoroutineContext.C11040a, E> f28245a;
    @C12579k

    /* renamed from: b */
    public final CoroutineContext.C11042b<?> f28246b;

    public C11044b(@C12579k CoroutineContext.C11042b<B> bVar, @C12579k C11300l<? super CoroutineContext.C11040a, ? extends E> lVar) {
        Intrinsics.checkNotNullParameter(bVar, "baseKey");
        Intrinsics.checkNotNullParameter(lVar, "safeCast");
        this.f28245a = lVar;
        this.f28246b = bVar instanceof C11044b ? ((C11044b) bVar).f28246b : bVar;
    }

    /* renamed from: a */
    public final boolean mo22486a(@C12579k CoroutineContext.C11042b<?> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "key");
        if (bVar == this || this.f28246b == bVar) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: b */
    public final E mo22487b(@C12579k CoroutineContext.C11040a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "element");
        return (CoroutineContext.C11040a) this.f28245a.invoke(aVar);
    }
}
