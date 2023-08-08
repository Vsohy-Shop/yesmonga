package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.C11079d2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.l */
public final class C12050l extends C11974i2 {
    @C12579k

    /* renamed from: e */
    public final Future<?> f29693e;

    public C12050l(@C12579k Future<?> future) {
        this.f29693e = future;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo23670z((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: z */
    public void mo23670z(@C12580l Throwable th) {
        if (th != null) {
            this.f29693e.cancel(false);
        }
    }
}
