package kotlinx.coroutines.channels;

import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12044k0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.C12156u1;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,202:1\n48#2,4:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n51#1:203,4\n*E\n"})
public final class BroadcastKt {

    @C11363r0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,110:1\n51#2:111\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.BroadcastKt$a */
    public static final class C11730a extends C11043a implements C12044k0 {
        public C11730a(C12044k0.C12046b bVar) {
            super(bVar);
        }

        /* renamed from: P */
        public void mo23719P(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
        }
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @C12092r2
    @C12579k
    /* renamed from: a */
    public static final <E> C11740d<E> m46219a(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, int i, @C12579k CoroutineStart coroutineStart, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12579k @C10863b C11304p<? super C11760r<? super E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11743f fVar;
        CoroutineContext e = CoroutineContextKt.m45901e(o0Var, coroutineContext);
        C11740d a = C11742e.m46576a(i);
        if (coroutineStart.mo23572w()) {
            fVar = new C11758p(e, a, pVar);
        } else {
            fVar = new C11743f(e, a, true);
        }
        if (lVar != null) {
            fVar.mo23589D(lVar);
        }
        fVar.mo23695R1(coroutineStart, fVar, pVar);
        return fVar;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @C12092r2
    @C12579k
    /* renamed from: b */
    public static final <E> C11740d<E> m46220b(@C12579k ReceiveChannel<? extends E> receiveChannel, int i, @C12579k CoroutineStart coroutineStart) {
        return m46221c(C12079p0.m48272m(C12079p0.m48272m(C12156u1.f29939a, C11768d1.m46785g()), new C11730a(C12044k0.f29686v0)), (CoroutineContext) null, i, coroutineStart, new BroadcastKt$broadcast$1(receiveChannel), new BroadcastKt$broadcast$2(receiveChannel, (C11045c<? super BroadcastKt$broadcast$2>) null), 1, (Object) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C11740d m46221c(C12074o0 o0Var, CoroutineContext coroutineContext, int i, CoroutineStart coroutineStart, C11300l lVar, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return m46219a(o0Var, coroutineContext2, i3, coroutineStart2, lVar, pVar);
    }

    /* renamed from: d */
    public static /* synthetic */ C11740d m46222d(ReceiveChannel receiveChannel, int i, CoroutineStart coroutineStart, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return m46220b(receiveChannel, i, coroutineStart);
    }
}
