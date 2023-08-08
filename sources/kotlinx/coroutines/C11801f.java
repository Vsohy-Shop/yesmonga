package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: kotlinx.coroutines.f */
public final class C11801f<T> extends C11701a<T> {
    @C12579k

    /* renamed from: d */
    public final Thread f29270d;
    @C12580l

    /* renamed from: e */
    public final C12047k1 f29271e;

    public C11801f(@C12579k CoroutineContext coroutineContext, @C12579k Thread thread, @C12580l C12047k1 k1Var) {
        super(coroutineContext, true, true);
        this.f29270d = thread;
        this.f29271e = k1Var;
    }

    /* renamed from: S1 */
    public final T mo24079S1() {
        long j;
        C11079d2 d2Var;
        C11715b b = C11720c.m46159b();
        if (b != null) {
            b.mo23727d();
        }
        try {
            C12047k1 k1Var = this.f29271e;
            C11721c0 c0Var = null;
            if (k1Var != null) {
                C12047k1.m48086t0(k1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                C12047k1 k1Var2 = this.f29271e;
                if (k1Var2 != null) {
                    j = k1Var2.mo24478D0();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!mo23636j()) {
                    C11715b b2 = C11720c.m46159b();
                    if (b2 != null) {
                        b2.mo23726c(this, j);
                        d2Var = C11079d2.f28267a;
                    } else {
                        d2Var = null;
                    }
                    if (d2Var == null) {
                        LockSupport.parkNanos(this, j);
                    }
                } else {
                    C12047k1 k1Var3 = this.f29271e;
                    if (k1Var3 != null) {
                        C12047k1.m48085b0(k1Var3, false, 1, (Object) null);
                    }
                    C11715b b3 = C11720c.m46159b();
                    if (b3 != null) {
                        b3.mo23731h();
                    }
                    T h = C12041j2.m48073h(mo23620Z0());
                    if (h instanceof C11721c0) {
                        c0Var = (C11721c0) h;
                    }
                    if (c0Var == null) {
                        return h;
                    }
                    throw c0Var.f29065a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo23666z0(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C11715b b4 = C11720c.m46159b();
            if (b4 != null) {
                b4.mo23731h();
            }
            throw th;
        }
    }

    /* renamed from: f1 */
    public boolean mo23631f1() {
        return true;
    }

    /* renamed from: w0 */
    public void mo23658w0(@C12580l Object obj) {
        C11079d2 d2Var;
        if (!Intrinsics.areEqual((Object) Thread.currentThread(), (Object) this.f29270d)) {
            Thread thread = this.f29270d;
            C11715b b = C11720c.m46159b();
            if (b != null) {
                b.mo23730g(thread);
                d2Var = C11079d2.f28267a;
            } else {
                d2Var = null;
            }
            if (d2Var == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}
