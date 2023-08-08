package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.a2 */
public final class C11705a2 extends C11769d2 {
    @C12579k

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f29038f = AtomicIntegerFieldUpdater.newUpdater(C11705a2.class, "_invoked");
    @C11394v
    private volatile int _invoked;
    @C12579k

    /* renamed from: e */
    public final C11300l<Throwable, C11079d2> f29039e;

    public C11705a2(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29039e = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo23670z((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: z */
    public void mo23670z(@C12580l Throwable th) {
        if (f29038f.compareAndSet(this, 0, 1)) {
            this.f29039e.invoke(th);
        }
    }
}
