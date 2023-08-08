package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, mo22516d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/j0;", "b", "Lkotlinx/coroutines/c2;", "a", "Lkotlinx/coroutines/c2;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/c2;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
public final class TimeoutCancellationException extends CancellationException implements C12039j0<TimeoutCancellationException> {
    @C12580l
    @C11287e

    /* renamed from: a */
    public final transient C11723c2 f29035a;

    public TimeoutCancellationException(@C12579k String str, @C12580l C11723c2 c2Var) {
        super(str);
        this.f29035a = c2Var;
    }

    @C12579k
    /* renamed from: b */
    public TimeoutCancellationException mo23577a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f29035a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }

    public TimeoutCancellationException(@C12579k String str) {
        this(str, (C11723c2) null);
    }
}
