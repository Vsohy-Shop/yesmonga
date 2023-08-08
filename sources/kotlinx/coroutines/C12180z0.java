package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.internal.C12002l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
/* renamed from: kotlinx.coroutines.z0 */
public final class C12180z0<T> extends C12001k0<T> {
    @C12579k

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f29947e = AtomicIntegerFieldUpdater.newUpdater(C12180z0.class, "_decision");
    @C11394v
    @C11287e
    private volatile int _decision;

    public C12180z0(@C12579k CoroutineContext coroutineContext, @C12579k C11045c<? super T> cVar) {
        super(coroutineContext, cVar);
    }

    @C12579k
    /* renamed from: T1 */
    public static final AtomicIntegerFieldUpdater m48763T1() {
        return f29947e;
    }

    /* renamed from: N1 */
    public void mo23692N1(@C12580l Object obj) {
        if (!mo24794V1()) {
            C12002l.m47871e(IntrinsicsKt__IntrinsicsJvmKt.m42608d(this.f29603d), C11966h0.m47674a(obj, this.f29603d), (C11300l) null, 2, (Object) null);
        }
    }

    @C12580l
    /* renamed from: S1 */
    public final Object mo24792S1() {
        if (mo24795W1()) {
            return C11063b.m42612h();
        }
        Object h = C12041j2.m48073h(mo23620Z0());
        if (!(h instanceof C11721c0)) {
            return h;
        }
        throw ((C11721c0) h).f29065a;
    }

    /* renamed from: U1 */
    public final void mo24793U1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    /* renamed from: V1 */
    public final boolean mo24794V1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29947e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f29947e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: W1 */
    public final boolean mo24795W1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29947e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f29947e.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: w0 */
    public void mo23658w0(@C12580l Object obj) {
        mo23692N1(obj);
    }
}
