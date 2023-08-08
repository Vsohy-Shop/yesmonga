package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.channels.C11749j;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SimpleActor<T> {
    @C12579k

    /* renamed from: a */
    public final C12074o0 f47390a;
    @C12579k

    /* renamed from: b */
    public final C11304p<T, C11045c<? super C11079d2>, Object> f47391b;
    @C12579k

    /* renamed from: c */
    public final C11744g<T> f47392c = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
    @C12579k

    /* renamed from: d */
    public final AtomicInteger f47393d = new AtomicInteger(0);

    public SimpleActor(@C12579k C12074o0 o0Var, @C12579k final C11300l<? super Throwable, C11079d2> lVar, @C12579k final C11304p<? super T, ? super Throwable, C11079d2> pVar, @C12579k C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar2) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(lVar, "onComplete");
        Intrinsics.checkNotNullParameter(pVar, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(pVar2, "consumeMessage");
        this.f47390a = o0Var;
        this.f47391b = pVar2;
        C11723c2 c2Var = (C11723c2) o0Var.getCoroutineContext().mo7444b(C11723c2.f29067w0);
        if (c2Var != null) {
            c2Var.mo23589D(new C11300l<Throwable, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12580l Throwable th) {
                    C11079d2 d2Var;
                    lVar.invoke(th);
                    this.f47392c.mo23756d0(th);
                    do {
                        Object h = C11749j.m46637h(this.f47392c.mo23811W());
                        if (h == null) {
                            d2Var = null;
                            continue;
                        } else {
                            pVar.invoke(h, th);
                            d2Var = C11079d2.f28267a;
                            continue;
                        }
                    } while (d2Var != null);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo53539e(T t) {
        Object L = this.f47392c.mo23751L(t);
        if (L instanceof C11749j.C11750a) {
            Throwable f = C11749j.m46635f(L);
            if (f == null) {
                f = new ClosedSendChannelException("Channel was closed normally");
            }
            throw f;
        } else if (!C11749j.m46642m(L)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f47393d.getAndIncrement() == 0) {
            C11723c2 unused = C12038j.m48061f(this.f47390a, (CoroutineContext) null, (CoroutineStart) null, new SimpleActor$offer$2(this, (C11045c<? super SimpleActor$offer$2>) null), 3, (Object) null);
        }
    }
}
