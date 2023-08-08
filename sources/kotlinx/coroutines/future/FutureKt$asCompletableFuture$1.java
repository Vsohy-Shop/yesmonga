package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12154u0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FutureKt$asCompletableFuture$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ CompletableFuture<T> $future;
    final /* synthetic */ C12154u0<T> $this_asCompletableFuture;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FutureKt$asCompletableFuture$1(CompletableFuture<T> completableFuture, C12154u0<? extends T> u0Var) {
        super(1);
        this.$future = completableFuture;
        this.$this_asCompletableFuture = u0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        try {
            this.$future.complete(this.$this_asCompletableFuture.mo24778n());
        } catch (Throwable th2) {
            this.$future.completeExceptionally(th2);
        }
    }
}
