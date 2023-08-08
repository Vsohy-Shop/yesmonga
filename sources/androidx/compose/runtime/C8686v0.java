package androidx.compose.runtime;

import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.v0 */
public interface C8686v0 extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: h */
    public static final C8688b f23251h = C8688b.f23252a;

    /* renamed from: androidx.compose.runtime.v0$a */
    public static final class C8687a {
        /* renamed from: a */
        public static <R> R m31917a(@C12579k C8686v0 v0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return CoroutineContext.C11040a.C11041a.m42563a(v0Var, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m31918b(@C12579k C8686v0 v0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42564b(v0Var, bVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: c */
        public static CoroutineContext.C11042b<?> m31919c(@C12579k C8686v0 v0Var) {
            return C8686v0.super.getKey();
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m31920d(@C12579k C8686v0 v0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42565c(v0Var, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static CoroutineContext m31921e(@C12579k C8686v0 v0Var, @C12579k CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
            return CoroutineContext.C11040a.C11041a.m42566d(v0Var, coroutineContext);
        }
    }

    /* renamed from: androidx.compose.runtime.v0$b */
    public static final class C8688b implements CoroutineContext.C11042b<C8686v0> {

        /* renamed from: a */
        public static final /* synthetic */ C8688b f23252a = new C8688b();
    }

    @C12580l
    /* renamed from: B */
    <R> Object mo14872B(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar);

    @C12579k
    CoroutineContext.C11042b<?> getKey() {
        return f23251h;
    }
}
