package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.f1 */
public final class C11803f1 implements C11962g1 {
    @C12579k

    /* renamed from: a */
    public final Future<?> f29272a;

    public C11803f1(@C12579k Future<?> future) {
        this.f29272a = future;
    }

    /* renamed from: g */
    public void mo23720g() {
        this.f29272a.cancel(false);
    }

    @C12579k
    public String toString() {
        return "DisposableFutureHandle[" + this.f29272a + C12361b.f30261l;
    }
}
