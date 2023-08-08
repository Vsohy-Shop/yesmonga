package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo22516d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/d2;", "run", "", "toString", "Lkotlin/coroutines/c;", "continuation", "Lkotlin/coroutines/c;", "<init>", "(Lkotlin/coroutines/c;)V", "core-ktx_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    @C12579k
    private final C11045c<C11079d2> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationRunnable(@C12579k C11045c<? super C11079d2> cVar) {
        super(false);
        Intrinsics.checkNotNullParameter(cVar, "continuation");
        this.continuation = cVar;
    }

    public void run() {
        if (compareAndSet(false, true)) {
            C11045c<C11079d2> cVar = this.continuation;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    @C12579k
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
