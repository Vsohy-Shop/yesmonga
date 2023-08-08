package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11928e;
import kotlinx.coroutines.flow.internal.C11932i;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.h */
public final /* synthetic */ class C11910h {
    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m47513b(@C12579k C11907e<? extends T> eVar, int i, @C12579k BufferOverflow bufferOverflow) {
        boolean z;
        BufferOverflow bufferOverflow2;
        int i2;
        boolean z2 = true;
        if (i >= 0 || i == -2 || i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
                z2 = false;
            }
            if (z2) {
                if (i == -1) {
                    bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    bufferOverflow2 = bufferOverflow;
                }
                if (eVar instanceof C11932i) {
                    return C11932i.C11933a.m47599a((C11932i) eVar, (CoroutineContext) null, i2, bufferOverflow2, 1, (Object) null);
                }
                return new C11928e(eVar, (CoroutineContext) null, i2, bufferOverflow2, 2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ C11907e m47514c(C11907e eVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return m47515d(eVar, i, (BufferOverflow) null, 2, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C11907e m47515d(C11907e eVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return C11909g.m47476o(eVar, i, bufferOverflow);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47516e(@C12579k C11907e<? extends T> eVar) {
        if (eVar instanceof C11903a) {
            return eVar;
        }
        return new CancellableFlowImpl(eVar);
    }

    /* renamed from: f */
    public static final void m47517f(CoroutineContext coroutineContext) {
        boolean z;
        if (coroutineContext.mo7444b(C11723c2.f29067w0) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47518g(@C12579k C11907e<? extends T> eVar) {
        return m47515d(eVar, -1, (BufferOverflow) null, 2, (Object) null);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47519h(@C12579k C11907e<? extends T> eVar, @C12579k CoroutineContext coroutineContext) {
        m47517f(coroutineContext);
        if (Intrinsics.areEqual((Object) coroutineContext, (Object) EmptyCoroutineContext.f28243a)) {
            return eVar;
        }
        if (eVar instanceof C11932i) {
            return C11932i.C11933a.m47599a((C11932i) eVar, coroutineContext, 0, (BufferOverflow) null, 6, (Object) null);
        }
        return new C11928e(eVar, coroutineContext, 0, (BufferOverflow) null, 12, (DefaultConstructorMarker) null);
    }
}
