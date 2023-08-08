package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11289a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class InterruptibleKt {

    /* renamed from: a */
    public static final int f29010a = 0;

    /* renamed from: b */
    public static final int f29011b = 1;

    /* renamed from: c */
    public static final int f29012c = 2;

    /* renamed from: d */
    public static final int f29013d = 3;

    @C12580l
    /* renamed from: b */
    public static final <T> Object m45932b(@C12579k CoroutineContext coroutineContext, @C12579k C11289a<? extends T> aVar, @C12579k C11045c<? super T> cVar) {
        return C11965h.m47673h(coroutineContext, new InterruptibleKt$runInterruptible$2(aVar, (C11045c<? super InterruptibleKt$runInterruptible$2>) null), cVar);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m45933c(CoroutineContext coroutineContext, C11289a aVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        return m45932b(coroutineContext, aVar, cVar);
    }

    /* renamed from: d */
    public static final <T> T m45934d(CoroutineContext coroutineContext, C11289a<? extends T> aVar) {
        C12042j3 j3Var;
        try {
            j3Var = new C12042j3(C11804f2.m46951B(coroutineContext));
            j3Var.mo24474e();
            T invoke = aVar.invoke();
            j3Var.mo24470a();
            return invoke;
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        } catch (Throwable th) {
            j3Var.mo24470a();
            throw th;
        }
    }
}
