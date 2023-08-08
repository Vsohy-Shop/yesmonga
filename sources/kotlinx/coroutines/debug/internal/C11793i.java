package kotlinx.coroutines.debug.internal;

import kotlin.C11532s0;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.coroutines.debug.internal.i */
public final class C11793i implements C11066c {
    @C12580l

    /* renamed from: a */
    public final C11066c f29256a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final StackTraceElement f29257b;

    public C11793i(@C12580l C11066c cVar, @C12579k StackTraceElement stackTraceElement) {
        this.f29256a = cVar;
        this.f29257b = stackTraceElement;
    }

    @C12580l
    public C11066c getCallerFrame() {
        return this.f29256a;
    }

    @C12579k
    public StackTraceElement getStackTraceElement() {
        return this.f29257b;
    }
}
