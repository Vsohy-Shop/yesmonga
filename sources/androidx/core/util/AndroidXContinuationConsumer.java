package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo22516d2 = {"Landroidx/core/util/AndroidXContinuationConsumer;", "T", "Landroidx/core/util/d;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "value", "Lkotlin/d2;", "accept", "(Ljava/lang/Object;)V", "", "toString", "Lkotlin/coroutines/c;", "continuation", "Lkotlin/coroutines/c;", "<init>", "(Lkotlin/coroutines/c;)V", "core-ktx_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements C17970d<T> {
    @C12579k
    private final C11045c<T> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidXContinuationConsumer(@C12579k C11045c<? super T> cVar) {
        super(false);
        Intrinsics.checkNotNullParameter(cVar, "continuation");
        this.continuation = cVar;
    }

    public void accept(T t) {
        if (compareAndSet(false, true)) {
            C11045c<T> cVar = this.continuation;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(t));
        }
    }

    @C12579k
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
