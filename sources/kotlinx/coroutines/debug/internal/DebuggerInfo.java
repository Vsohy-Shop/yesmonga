package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11532s0;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12061m0;
import kotlinx.coroutines.C12067n0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "", "coroutineId", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "f", "state", "h", "lastObservedThreadState", "e", "lastObservedThreadName", "d", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "c", "()Ljava/util/List;", "sequenceNumber", "J", "g", "()J", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11532s0
public final class DebuggerInfo implements Serializable {
    @C12580l
    private final Long coroutineId;
    @C12580l
    private final String dispatcher;
    @C12579k
    private final List<StackTraceElement> lastObservedStackTrace;
    @C12580l
    private final String lastObservedThreadName;
    @C12580l
    private final String lastObservedThreadState;
    @C12580l
    private final String name;
    private final long sequenceNumber;
    @C12579k
    private final String state;

    public DebuggerInfo(@C12579k DebugCoroutineInfoImpl debugCoroutineInfoImpl, @C12579k CoroutineContext coroutineContext) {
        Long l;
        String str;
        String str2;
        String str3;
        Thread.State state2;
        C12061m0 m0Var = (C12061m0) coroutineContext.mo7444b(C12061m0.f29706c);
        String str4 = null;
        if (m0Var != null) {
            l = Long.valueOf(m0Var.mo24511V());
        } else {
            l = null;
        }
        this.coroutineId = l;
        C11047d dVar = (C11047d) coroutineContext.mo7444b(C11047d.f28247u0);
        if (dVar != null) {
            str = dVar.toString();
        } else {
            str = null;
        }
        this.dispatcher = str;
        C12067n0 n0Var = (C12067n0) coroutineContext.mo7444b(C12067n0.f29709c);
        if (n0Var != null) {
            str2 = n0Var.mo24524V();
        } else {
            str2 = null;
        }
        this.name = str2;
        this.state = debugCoroutineInfoImpl.mo23989g();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        if (thread == null || (state2 = thread.getState()) == null) {
            str3 = null;
        } else {
            str3 = state2.toString();
        }
        this.lastObservedThreadState = str3;
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : str4;
        this.lastObservedStackTrace = debugCoroutineInfoImpl.mo23990h();
        this.sequenceNumber = debugCoroutineInfoImpl.f29215b;
    }

    @C12580l
    /* renamed from: a */
    public final Long mo24048a() {
        return this.coroutineId;
    }

    @C12580l
    /* renamed from: b */
    public final String mo24049b() {
        return this.dispatcher;
    }

    @C12579k
    /* renamed from: c */
    public final List<StackTraceElement> mo24050c() {
        return this.lastObservedStackTrace;
    }

    @C12580l
    /* renamed from: d */
    public final String mo24051d() {
        return this.lastObservedThreadName;
    }

    @C12580l
    /* renamed from: e */
    public final String mo24052e() {
        return this.lastObservedThreadState;
    }

    @C12580l
    /* renamed from: f */
    public final String mo24053f() {
        return this.name;
    }

    /* renamed from: g */
    public final long mo24054g() {
        return this.sequenceNumber;
    }

    @C12579k
    /* renamed from: h */
    public final String mo24055h() {
        return this.state;
    }
}
