package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C12015r;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.c */
public final class C12103c extends C12108h {
    @C12579k

    /* renamed from: w */
    public static final C12103c f29799w = new C12103c();

    public C12103c() {
        super(C12114n.f29823c, C12114n.f29824d, C12114n.f29825e, C12114n.f29821a);
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        if (i >= C12114n.f29823c) {
            return this;
        }
        return super.mo23566V(i);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* renamed from: t0 */
    public final void mo24652t0() {
        super.close();
    }

    @C12579k
    public String toString() {
        return "Dispatchers.Default";
    }
}
