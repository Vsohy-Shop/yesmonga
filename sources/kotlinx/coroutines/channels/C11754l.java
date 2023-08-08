package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12077o3;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* renamed from: kotlinx.coroutines.channels.l */
public final class C11754l<E> extends C12003l0<C11754l<E>> {
    @C12580l

    /* renamed from: e */
    public final BufferedChannel<E> f29174e;
    @C12579k

    /* renamed from: f */
    public final AtomicReferenceArray f29175f = new AtomicReferenceArray(BufferedChannelKt.f29117b * 2);

    public C11754l(long j, @C12580l C11754l<E> lVar, @C12580l BufferedChannel<E> bufferedChannel, int i) {
        super(j, lVar, i);
        this.f29174e = bufferedChannel;
    }

    /* renamed from: A */
    public final E mo23928A(int i) {
        E x = mo23938x(i);
        mo23935u(i);
        return x;
    }

    /* renamed from: B */
    public final void mo23929B(int i, Object obj) {
        this.f29175f.lazySet(i * 2, obj);
    }

    /* renamed from: C */
    public final void mo23930C(int i, @C12580l Object obj) {
        this.f29175f.set((i * 2) + 1, obj);
    }

    /* renamed from: D */
    public final void mo23931D(int i, E e) {
        mo23929B(i, e);
    }

    /* renamed from: p */
    public int mo23932p() {
        return BufferedChannelKt.f29117b;
    }

    /* renamed from: q */
    public void mo23933q(int i, @C12580l Throwable th, @C12579k CoroutineContext coroutineContext) {
        boolean z;
        C12009o0 o0Var;
        C11300l<E, C11079d2> lVar;
        C11300l<E, C11079d2> lVar2;
        int i2 = BufferedChannelKt.f29117b;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i -= i2;
        }
        Object x = mo23938x(i);
        while (true) {
            Object y = mo23939y(i);
            if ((y instanceof C12077o3) || (y instanceof C11765u)) {
                if (z) {
                    o0Var = BufferedChannelKt.f29127l;
                } else {
                    o0Var = BufferedChannelKt.f29128m;
                }
                if (mo23934t(i, y, o0Var)) {
                    mo23935u(i);
                    mo23940z(i, !z);
                    if (z && (lVar = mo23937w().f29090b) != null) {
                        OnUndeliveredElementKt.m47763b(lVar, x, coroutineContext);
                        return;
                    }
                    return;
                }
            } else if (y == BufferedChannelKt.f29127l || y == BufferedChannelKt.f29128m) {
                mo23935u(i);
            } else if (!(y == BufferedChannelKt.f29124i || y == BufferedChannelKt.f29123h)) {
                if (y != BufferedChannelKt.f29126k && y != BufferedChannelKt.f29121f && y != BufferedChannelKt.m46421z()) {
                    throw new IllegalStateException(("unexpected state: " + y).toString());
                }
                return;
            }
        }
        mo23935u(i);
        if (z && (lVar2 = mo23937w().f29090b) != null) {
            OnUndeliveredElementKt.m47763b(lVar2, x, coroutineContext);
        }
    }

    /* renamed from: t */
    public final boolean mo23934t(int i, @C12580l Object obj, @C12580l Object obj2) {
        return C11753k.m46648a(this.f29175f, (i * 2) + 1, obj, obj2);
    }

    /* renamed from: u */
    public final void mo23935u(int i) {
        mo23929B(i, (Object) null);
    }

    @C12580l
    /* renamed from: v */
    public final Object mo23936v(int i, @C12580l Object obj) {
        return this.f29175f.getAndSet((i * 2) + 1, obj);
    }

    @C12579k
    /* renamed from: w */
    public final BufferedChannel<E> mo23937w() {
        BufferedChannel<E> bufferedChannel = this.f29174e;
        Intrinsics.checkNotNull(bufferedChannel);
        return bufferedChannel;
    }

    /* renamed from: x */
    public final E mo23938x(int i) {
        return this.f29175f.get(i * 2);
    }

    @C12580l
    /* renamed from: y */
    public final Object mo23939y(int i) {
        return this.f29175f.get((i * 2) + 1);
    }

    /* renamed from: z */
    public final void mo23940z(int i, boolean z) {
        if (z) {
            mo23937w().mo23787J1((this.f29607c * ((long) BufferedChannelKt.f29117b)) + ((long) i));
        }
        mo24381r();
    }
}
