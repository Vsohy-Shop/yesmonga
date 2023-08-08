package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.q */
public final class C11947q<T> {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final C11907e<T> f29530a;
    @C11287e

    /* renamed from: b */
    public final int f29531b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final BufferOverflow f29532c;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final CoroutineContext f29533d;

    public C11947q(@C12579k C11907e<? extends T> eVar, int i, @C12579k BufferOverflow bufferOverflow, @C12579k CoroutineContext coroutineContext) {
        this.f29530a = eVar;
        this.f29531b = i;
        this.f29532c = bufferOverflow;
        this.f29533d = coroutineContext;
    }
}
