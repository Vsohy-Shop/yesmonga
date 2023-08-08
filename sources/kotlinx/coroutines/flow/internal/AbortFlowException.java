package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo22516d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lkotlinx/coroutines/flow/f;", "a", "Lkotlinx/coroutines/flow/f;", "owner", "<init>", "(Lkotlinx/coroutines/flow/f;)V", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFlowExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,30:1\n26#2:31\n*S KotlinDebug\n*F\n+ 1 FlowExceptions.kt\nkotlinx/coroutines/flow/internal/AbortFlowException\n*L\n17#1:31\n*E\n"})
public final class AbortFlowException extends CancellationException {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final transient C11908f<?> f29469a;

    public AbortFlowException(@C12579k C11908f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f29469a = fVar;
    }

    @C12579k
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
