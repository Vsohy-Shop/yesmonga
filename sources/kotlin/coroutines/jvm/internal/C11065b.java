package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.coroutines.jvm.internal.b */
public final class C11065b implements C11045c<Object> {
    @C12579k

    /* renamed from: a */
    public static final C11065b f28258a = new C11065b();

    @C12579k
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(@C12579k Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @C12579k
    public String toString() {
        return "This continuation is already complete";
    }
}
