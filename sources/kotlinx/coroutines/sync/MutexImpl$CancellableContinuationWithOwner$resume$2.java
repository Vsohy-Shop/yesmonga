package kotlinx.coroutines.sync;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MutexImpl$CancellableContinuationWithOwner$resume$2 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ MutexImpl this$0;
    final /* synthetic */ MutexImpl.CancellableContinuationWithOwner this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        super(1);
        this.this$0 = mutexImpl;
        this.this$1 = cancellableContinuationWithOwner;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k Throwable th) {
        this.this$0.mo24740g(this.this$1.f29900b);
    }
}
