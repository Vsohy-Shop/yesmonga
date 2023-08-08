package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.j3 */
public final class C12042j3 implements C11300l<Throwable, C11079d2> {
    @C12579k

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f29681d = AtomicIntegerFieldUpdater.newUpdater(C12042j3.class, "_state");
    @C11394v
    private volatile int _state;
    @C12579k

    /* renamed from: a */
    public final C11723c2 f29682a;

    /* renamed from: b */
    public final Thread f29683b = Thread.currentThread();
    @C12580l

    /* renamed from: c */
    public C11962g1 f29684c;

    public C12042j3(@C12579k C11723c2 c2Var) {
        this.f29682a = c2Var;
    }

    /* renamed from: a */
    public final void mo24470a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29681d;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        mo24471b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f29681d.compareAndSet(this, i, 1)) {
                C11962g1 g1Var = this.f29684c;
                if (g1Var != null) {
                    g1Var.mo23720g();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void mo24471b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: c */
    public void mo24472c(@C12580l Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f29681d;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i == 0) {
                atomicIntegerFieldUpdater = f29681d;
            } else if (i != 1 && i != 2 && i != 3) {
                mo24471b(i);
                throw new KotlinNothingValueException();
            } else {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f29683b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void mo24473d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    /* renamed from: e */
    public final void mo24474e() {
        int i;
        this.f29684c = this.f29682a.mo23650t(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29681d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    mo24471b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f29681d.compareAndSet(this, i, 0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24472c((Throwable) obj);
        return C11079d2.f28267a;
    }
}
