package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C12015r;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.o */
public final class C12115o extends CoroutineDispatcher {
    @C12579k

    /* renamed from: c */
    public static final C12115o f29831c = new C12115o();

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        C12103c.f29799w.mo24663c0(runnable, C12114n.f29830j, false);
    }

    @C12177y1
    /* renamed from: T */
    public void mo23564T(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        C12103c.f29799w.mo24663c0(runnable, C12114n.f29830j, true);
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        C12015r.m47943a(i);
        if (i >= C12114n.f29824d) {
            return this;
        }
        return super.mo23566V(i);
    }
}
