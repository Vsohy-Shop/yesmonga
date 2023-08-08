package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.b */
public final class C11737b {
    @C12092r2
    @C12579k
    /* renamed from: a */
    public static final <E> C11763t<E> m46563a(@C12579k C12074o0 o0Var, @C12579k CoroutineContext coroutineContext, int i, @C12579k CoroutineStart coroutineStart, @C12580l C11300l<? super Throwable, C11079d2> lVar, @C12579k C11304p<? super C11738c<E>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11747h hVar;
        CoroutineContext e = CoroutineContextKt.m45901e(o0Var, coroutineContext);
        C11744g d = C11748i.m46625d(i, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        if (coroutineStart.mo23572w()) {
            hVar = new LazyActorCoroutine(e, d, pVar);
        } else {
            hVar = new C11736a(e, d, true);
        }
        if (lVar != null) {
            hVar.mo23589D(lVar);
        }
        hVar.mo23695R1(coroutineStart, hVar, pVar);
        return hVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C11763t m46564b(C12074o0 o0Var, CoroutineContext coroutineContext, int i, CoroutineStart coroutineStart, C11300l lVar, C11304p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return m46563a(o0Var, coroutineContext2, i3, coroutineStart2, lVar, pVar);
    }
}
