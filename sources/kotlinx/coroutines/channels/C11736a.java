package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12051l0;
import kotlinx.coroutines.C12080p1;
import kotlinx.coroutines.C12090r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.a */
public class C11736a<E> extends C11747h<E> implements C11738c<E> {
    public C11736a(@C12579k CoroutineContext coroutineContext, @C12579k C11744g<E> gVar, boolean z) {
        super(coroutineContext, gVar, false, z);
        mo23625c1((C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0));
    }

    /* renamed from: a1 */
    public boolean mo23622a1(@C12579k Throwable th) {
        C12051l0.m48104b(getContext(), th);
        return true;
    }

    /* renamed from: v1 */
    public void mo23657v1(@C12580l Throwable th) {
        C11744g S1 = mo23916S1();
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C12080p1.m48273a(C12090r0.m48300a(this) + " was cancelled", th);
            }
        }
        S1.mo23819a(cancellationException);
    }
}
