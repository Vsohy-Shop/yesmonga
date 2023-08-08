package kotlin.coroutines;

import com.urbanairship.iam.events.C9175a;
import kotlin.C11665v0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
public interface CoroutineContext {

    public static final class DefaultImpls {
        @C12579k
        /* renamed from: a */
        public static CoroutineContext m42559a(@C12579k CoroutineContext coroutineContext, @C12579k CoroutineContext coroutineContext2) {
            Intrinsics.checkNotNullParameter(coroutineContext2, C9175a.f24932Y);
            if (coroutineContext2 == EmptyCoroutineContext.f28243a) {
                return coroutineContext;
            }
            return (CoroutineContext) coroutineContext2.mo7446l(coroutineContext, CoroutineContext$plus$1.f28242f);
        }
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    public interface C11040a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        public static final class C11041a {
            /* renamed from: a */
            public static <R> R m42563a(@C12579k C11040a aVar, R r, @C12579k C11304p<? super R, ? super C11040a, ? extends R> pVar) {
                Intrinsics.checkNotNullParameter(pVar, "operation");
                return pVar.invoke(r, aVar);
            }

            @C12580l
            /* renamed from: b */
            public static <E extends C11040a> E m42564b(@C12579k C11040a aVar, @C12579k C11042b<E> bVar) {
                Intrinsics.checkNotNullParameter(bVar, "key");
                if (!Intrinsics.areEqual((Object) aVar.getKey(), (Object) bVar)) {
                    return null;
                }
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            @C12579k
            /* renamed from: c */
            public static CoroutineContext m42565c(@C12579k C11040a aVar, @C12579k C11042b<?> bVar) {
                Intrinsics.checkNotNullParameter(bVar, "key");
                if (Intrinsics.areEqual((Object) aVar.getKey(), (Object) bVar)) {
                    return EmptyCoroutineContext.f28243a;
                }
                return aVar;
            }

            @C12579k
            /* renamed from: d */
            public static CoroutineContext m42566d(@C12579k C11040a aVar, @C12579k CoroutineContext coroutineContext) {
                Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
                return DefaultImpls.m42559a(aVar, coroutineContext);
            }
        }

        @C12580l
        /* renamed from: b */
        <E extends C11040a> E mo7444b(@C12579k C11042b<E> bVar);

        @C12579k
        /* renamed from: f */
        CoroutineContext mo7445f(@C12579k C11042b<?> bVar);

        @C12579k
        C11042b<?> getKey();

        /* renamed from: l */
        <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super C11040a, ? extends R> pVar);
    }

    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    public interface C11042b<E extends C11040a> {
    }

    @C12579k
    /* renamed from: Q */
    CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext);

    @C12580l
    /* renamed from: b */
    <E extends C11040a> E mo7444b(@C12579k C11042b<E> bVar);

    @C12579k
    /* renamed from: f */
    CoroutineContext mo7445f(@C12579k C11042b<?> bVar);

    /* renamed from: l */
    <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super C11040a, ? extends R> pVar);
}
