package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;

@C12177y1
/* renamed from: kotlinx.coroutines.flow.internal.i */
public interface C11932i<T> extends C11907e<T> {

    /* renamed from: kotlinx.coroutines.flow.internal.i$a */
    public static final class C11933a {
        /* renamed from: a */
        public static /* synthetic */ C11907e m47599a(C11932i iVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = EmptyCoroutineContext.f28243a;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return iVar.mo24201c(coroutineContext, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @C12579k
    /* renamed from: c */
    C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow);
}
