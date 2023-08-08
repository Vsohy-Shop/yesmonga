package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12022u0;
import kotlinx.coroutines.internal.C12024v0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n266#1:289\n1#2:290\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n287#1:289\n*E\n"})
/* renamed from: kotlinx.coroutines.d3 */
public final class C11770d3 {
    @C12579k
    /* renamed from: a */
    public static final <T> C11726c3<T> m46788a(@C12579k ThreadLocal<T> threadLocal, T t) {
        return new C12022u0(t, threadLocal);
    }

    /* renamed from: b */
    public static /* synthetic */ C11726c3 m46789b(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return m46788a(threadLocal, obj);
    }

    @C12580l
    /* renamed from: c */
    public static final Object m46790c(@C12579k ThreadLocal<?> threadLocal, @C12579k C11045c<? super C11079d2> cVar) {
        boolean z;
        if (cVar.getContext().mo7444b(new C12024v0(threadLocal)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C11079d2.f28267a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + cVar.getContext()).toString());
    }

    /* renamed from: d */
    public static final Object m46791d(ThreadLocal<?> threadLocal, C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(3);
        throw null;
    }

    @C12580l
    /* renamed from: e */
    public static final Object m46792e(@C12579k ThreadLocal<?> threadLocal, @C12579k C11045c<? super Boolean> cVar) {
        return C11064a.m42615a(cVar.getContext().mo7444b(new C12024v0(threadLocal)) != null);
    }

    /* renamed from: f */
    public static final Object m46793f(ThreadLocal<?> threadLocal, C11045c<? super Boolean> cVar) {
        C11322b0.m43482e(3);
        throw null;
    }
}
