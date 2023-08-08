package kotlin.coroutines;

import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.coroutines.f */
public final class C11052f {
    @C12580l
    @C11429q
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final <E extends CoroutineContext.C11040a> E m42600a(@C12579k CoroutineContext.C11040a aVar, @C12579k CoroutineContext.C11042b<E> bVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "key");
        if (bVar instanceof C11044b) {
            C11044b bVar2 = (C11044b) bVar;
            if (!bVar2.mo22486a(aVar.getKey())) {
                return null;
            }
            E b = bVar2.mo22487b(aVar);
            if (b instanceof CoroutineContext.C11040a) {
                return b;
            }
            return null;
        } else if (aVar.getKey() == bVar) {
            return aVar;
        } else {
            return null;
        }
    }

    @C11429q
    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final CoroutineContext m42601b(@C12579k CoroutineContext.C11040a aVar, @C12579k CoroutineContext.C11042b<?> bVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "key");
        if (bVar instanceof C11044b) {
            C11044b bVar2 = (C11044b) bVar;
            if (!bVar2.mo22486a(aVar.getKey()) || bVar2.mo22487b(aVar) == null) {
                return aVar;
            }
            return EmptyCoroutineContext.f28243a;
        } else if (aVar.getKey() == bVar) {
            return EmptyCoroutineContext.f28243a;
        } else {
            return aVar;
        }
    }
}
