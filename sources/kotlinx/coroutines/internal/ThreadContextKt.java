package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ThreadContextKt {
    @C12579k
    @C11287e

    /* renamed from: a */
    public static final C12009o0 f29563a = new C12009o0("NO_THREAD_ELEMENTS");
    @C12579k

    /* renamed from: b */
    public static final C11304p<Object, CoroutineContext.C11040a, Object> f29564b = ThreadContextKt$countAll$1.f29567f;
    @C12579k

    /* renamed from: c */
    public static final C11304p<C11726c3<?>, CoroutineContext.C11040a, C11726c3<?>> f29565c = ThreadContextKt$findOne$1.f29568f;
    @C12579k

    /* renamed from: d */
    public static final C11304p<C12035z0, CoroutineContext.C11040a, C12035z0> f29566d = ThreadContextKt$updateState$1.f29569f;

    /* renamed from: a */
    public static final void m47766a(@C12579k CoroutineContext coroutineContext, @C12580l Object obj) {
        if (obj != f29563a) {
            if (obj instanceof C12035z0) {
                ((C12035z0) obj).mo24468b(coroutineContext);
                return;
            }
            Object l = coroutineContext.mo7446l(null, f29565c);
            Intrinsics.checkNotNull(l, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C11726c3) l).mo15332F(coroutineContext, obj);
        }
    }

    @C12579k
    /* renamed from: b */
    public static final Object m47767b(@C12579k CoroutineContext coroutineContext) {
        Object l = coroutineContext.mo7446l(0, f29564b);
        Intrinsics.checkNotNull(l);
        return l;
    }

    @C12580l
    /* renamed from: c */
    public static final Object m47768c(@C12579k CoroutineContext coroutineContext, @C12580l Object obj) {
        if (obj == null) {
            obj = m47767b(coroutineContext);
        }
        if (obj == 0) {
            return f29563a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.mo7446l(new C12035z0(coroutineContext, ((Number) obj).intValue()), f29566d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((C11726c3) obj).mo15336p0(coroutineContext);
    }
}
