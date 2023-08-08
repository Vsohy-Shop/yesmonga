package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.C11079d2;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.k */
public final class C12043k extends C12060m {
    @C12579k

    /* renamed from: a */
    public final Future<?> f29685a;

    public C12043k(@C12579k Future<?> future) {
        this.f29685a = future;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24071j((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: j */
    public void mo24071j(@C12580l Throwable th) {
        if (th != null) {
            this.f29685a.cancel(false);
        }
    }

    @C12579k
    public String toString() {
        return "CancelFutureOnCancel[" + this.f29685a + C12361b.f30261l;
    }
}
