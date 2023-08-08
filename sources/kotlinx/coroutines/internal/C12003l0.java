package kotlinx.coroutines.internal;

import androidx.core.internal.view.C17673a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12087q2;
import kotlinx.coroutines.internal.C12003l0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.l0 */
public abstract class C12003l0<S extends C12003l0<S>> extends C11990f<S> implements C12087q2 {
    @C12579k

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f29606d = AtomicIntegerFieldUpdater.newUpdater(C12003l0.class, "cleanedAndPointers");
    @C11287e

    /* renamed from: c */
    public final long f29607c;
    @C11394v
    private volatile int cleanedAndPointers;

    public C12003l0(long j, @C12580l S s, int i) {
        super(s);
        this.f29607c = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: h */
    public boolean mo24355h() {
        if (f29606d.get(this) != mo23932p() || mo24356i()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo24380o() {
        if (f29606d.addAndGet(this, C17673a.f46025c) != mo23932p() || mo24356i()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public abstract int mo23932p();

    /* renamed from: q */
    public abstract void mo23933q(int i, @C12580l Throwable th, @C12579k CoroutineContext coroutineContext);

    /* renamed from: r */
    public final void mo24381r() {
        if (f29606d.incrementAndGet(this) == mo23932p()) {
            mo24359l();
        }
    }

    /* renamed from: s */
    public final boolean mo24382s() {
        int i;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29606d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != mo23932p() || mo24356i()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
