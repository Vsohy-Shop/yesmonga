package kotlin.coroutines;

import com.urbanairship.iam.events.C9175a;
import kotlin.C11665v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
/* renamed from: kotlin.coroutines.d */
public interface C11047d extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: u0 */
    public static final C11049b f28247u0 = C11049b.f28248a;

    /* renamed from: kotlin.coroutines.d$a */
    public static final class C11048a {
        /* renamed from: a */
        public static <R> R m42585a(@C12579k C11047d dVar, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return CoroutineContext.C11040a.C11041a.m42563a(dVar, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m42586b(@C12579k C11047d dVar, @C12579k CoroutineContext.C11042b<E> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            if (bVar instanceof C11044b) {
                C11044b bVar2 = (C11044b) bVar;
                if (!bVar2.mo22486a(dVar.getKey())) {
                    return null;
                }
                E b = bVar2.mo22487b(dVar);
                if (b instanceof CoroutineContext.C11040a) {
                    return b;
                }
                return null;
            } else if (C11047d.f28247u0 != bVar) {
                return null;
            } else {
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        @C12579k
        /* renamed from: c */
        public static CoroutineContext m42587c(@C12579k C11047d dVar, @C12579k CoroutineContext.C11042b<?> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            if (bVar instanceof C11044b) {
                C11044b bVar2 = (C11044b) bVar;
                if (!bVar2.mo22486a(dVar.getKey()) || bVar2.mo22487b(dVar) == null) {
                    return dVar;
                }
                return EmptyCoroutineContext.f28243a;
            } else if (C11047d.f28247u0 == bVar) {
                return EmptyCoroutineContext.f28243a;
            } else {
                return dVar;
            }
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m42588d(@C12579k C11047d dVar, @C12579k CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
            return CoroutineContext.C11040a.C11041a.m42566d(dVar, coroutineContext);
        }

        /* renamed from: e */
        public static void m42589e(@C12579k C11047d dVar, @C12579k C11045c<?> cVar) {
            Intrinsics.checkNotNullParameter(cVar, "continuation");
        }
    }

    /* renamed from: kotlin.coroutines.d$b */
    public static final class C11049b implements CoroutineContext.C11042b<C11047d> {

        /* renamed from: a */
        public static final /* synthetic */ C11049b f28248a = new C11049b();
    }

    @C12580l
    /* renamed from: b */
    <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar);

    @C12579k
    /* renamed from: f */
    CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar);

    /* renamed from: m */
    void mo22490m(@C12579k C11045c<?> cVar);

    @C12579k
    /* renamed from: o */
    <T> C11045c<T> mo22491o(@C12579k C11045c<? super T> cVar);
}
