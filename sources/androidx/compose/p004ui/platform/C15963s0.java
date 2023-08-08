package androidx.compose.p004ui.platform;

import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.s0 */
public interface C15963s0 extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: o */
    public static final C15965b f39662o = C15965b.f39663a;

    /* renamed from: androidx.compose.ui.platform.s0$a */
    public static final class C15964a {
        /* renamed from: a */
        public static <R> R m71729a(@C12579k C15963s0 s0Var, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return CoroutineContext.C11040a.C11041a.m42563a(s0Var, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m71730b(@C12579k C15963s0 s0Var, @C12579k CoroutineContext.C11042b<E> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42564b(s0Var, bVar);
        }

        @Deprecated
        @C12579k
        /* renamed from: c */
        public static CoroutineContext.C11042b<?> m71731c(@C12579k C15963s0 s0Var) {
            return C15963s0.super.getKey();
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m71732d(@C12579k C15963s0 s0Var, @C12579k CoroutineContext.C11042b<?> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42565c(s0Var, bVar);
        }

        @C12579k
        /* renamed from: e */
        public static CoroutineContext m71733e(@C12579k C15963s0 s0Var, @C12579k CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
            return CoroutineContext.C11040a.C11041a.m42566d(s0Var, coroutineContext);
        }
    }

    /* renamed from: androidx.compose.ui.platform.s0$b */
    public static final class C15965b implements CoroutineContext.C11042b<C15963s0> {

        /* renamed from: a */
        public static final /* synthetic */ C15965b f39663a = new C15965b();
    }

    @C12580l
    /* renamed from: Z */
    <R> Object mo45950Z(@C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar, @C12579k C11045c<? super R> cVar);

    @C12579k
    CoroutineContext.C11042b<?> getKey() {
        return f39662o;
    }
}
