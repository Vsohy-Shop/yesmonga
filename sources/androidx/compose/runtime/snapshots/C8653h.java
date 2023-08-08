package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8541g0;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8541g0
/* renamed from: androidx.compose.runtime.snapshots.h */
public interface C8653h extends CoroutineContext.C11040a {
    @C12579k

    /* renamed from: i */
    public static final C8655b f23209i = C8655b.f23210a;

    /* renamed from: androidx.compose.runtime.snapshots.h$a */
    public static final class C8654a {
        /* renamed from: a */
        public static <R> R m31774a(@C12579k C8653h hVar, R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "operation");
            return CoroutineContext.C11040a.C11041a.m42563a(hVar, r, pVar);
        }

        @C12580l
        /* renamed from: b */
        public static <E extends CoroutineContext.C11040a> E m31775b(@C12579k C8653h hVar, @C12579k CoroutineContext.C11042b<E> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42564b(hVar, bVar);
        }

        @C12579k
        /* renamed from: c */
        public static CoroutineContext m31776c(@C12579k C8653h hVar, @C12579k CoroutineContext.C11042b<?> bVar) {
            Intrinsics.checkNotNullParameter(bVar, "key");
            return CoroutineContext.C11040a.C11041a.m42565c(hVar, bVar);
        }

        @C12579k
        /* renamed from: d */
        public static CoroutineContext m31777d(@C12579k C8653h hVar, @C12579k CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
            return CoroutineContext.C11040a.C11041a.m42566d(hVar, coroutineContext);
        }
    }

    /* renamed from: androidx.compose.runtime.snapshots.h$b */
    public static final class C8655b implements CoroutineContext.C11042b<C8653h> {

        /* renamed from: a */
        public static final /* synthetic */ C8655b f23210a = new C8655b();
    }
}
