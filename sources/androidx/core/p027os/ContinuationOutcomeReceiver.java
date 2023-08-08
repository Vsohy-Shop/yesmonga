package androidx.core.p027os;

import android.os.OutcomeReceiver;
import androidx.annotation.C0376v0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo22516d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "Lkotlin/d2;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lkotlin/coroutines/c;", "continuation", "Lkotlin/coroutines/c;", "<init>", "(Lkotlin/coroutines/c;)V", "core-ktx_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
@C0376v0(31)
/* renamed from: androidx.core.os.ContinuationOutcomeReceiver */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    @C12579k
    private final C11045c<R> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationOutcomeReceiver(@C12579k C11045c<? super R> cVar) {
        super(false);
        Intrinsics.checkNotNullParameter(cVar, "continuation");
        this.continuation = cVar;
    }

    public void onError(@C12579k E e) {
        Intrinsics.checkNotNullParameter(e, "error");
        if (compareAndSet(false, true)) {
            C11045c<R> cVar = this.continuation;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(C11661u0.m45734a(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            C11045c<R> cVar = this.continuation;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(r));
        }
    }

    @C12579k
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
