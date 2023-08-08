package androidx.compose.p004ui;

import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.ui.n */
public interface C8773n extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: k */
    public static final C8775b f23491k = C8775b.f23492a;

    /* renamed from: androidx.compose.ui.n$a */
    public static final class C8774a {
        /* renamed from: a */
        public static <R> R m32642a(@C12579k C8773n nVar, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return CoroutineContext.C11040a.C11041a.m42563a(nVar, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m32643b(@C12579k C8773n nVar, @C12579k CoroutineContext.C11042b<E> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42564b(nVar, bVar);
        }

        @C12579k
        /* renamed from: c */
        public static CoroutineContext m32644c(@C12579k C8773n nVar, @C12579k CoroutineContext.C11042b<?> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42565c(nVar, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m32645d(@C12579k C8773n nVar, @C12579k CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
            return CoroutineContext.C11040a.C11041a.m42566d(nVar, coroutineContext);
        }
    }

    /* renamed from: androidx.compose.ui.n$b */
    public static final class C8775b implements CoroutineContext.C11042b<C8773n> {

        /* renamed from: a */
        public static final /* synthetic */ C8775b f23492a = new C8775b();
    }

    @C12579k
    CoroutineContext.C11042b<?> getKey() {
        return f23491k;
    }

    /* renamed from: w */
    float mo7447w();
}
