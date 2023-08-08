package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12154u0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TasksKt$asTask$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ C31029b $cancellation;
    final /* synthetic */ C31049l<T> $source;
    final /* synthetic */ C12154u0<T> $this_asTask;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TasksKt$asTask$1(C31029b bVar, C12154u0<? extends T> u0Var, C31049l<T> lVar) {
        super(1);
        this.$cancellation = bVar;
        this.$this_asTask = u0Var;
        this.$source = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.mo87708a();
            return;
        }
        Throwable s = this.$this_asTask.mo24779s();
        if (s == null) {
            this.$source.mo87743c(this.$this_asTask.mo24778n());
            return;
        }
        C31049l<T> lVar = this.$source;
        Exception exc = s instanceof Exception ? (Exception) s : null;
        if (exc == null) {
            exc = new RuntimeExecutionException(s);
        }
        lVar.mo87742b(exc);
    }
}
