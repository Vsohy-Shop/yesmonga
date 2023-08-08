package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.channels.C11753k;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* renamed from: kotlinx.coroutines.sync.c */
public final class C12142c extends C12003l0<C12142c> {
    @C12579k

    /* renamed from: e */
    public final AtomicReferenceArray f29930e = new AtomicReferenceArray(SemaphoreKt.f29929f);

    public C12142c(long j, @C12580l C12142c cVar, int i) {
        super(j, cVar, i);
    }

    /* renamed from: p */
    public int mo23932p() {
        return SemaphoreKt.f29929f;
    }

    /* renamed from: q */
    public void mo23933q(int i, @C12580l Throwable th, @C12579k CoroutineContext coroutineContext) {
        mo24774v().set(i, SemaphoreKt.f29928e);
        mo24381r();
    }

    /* renamed from: t */
    public final boolean mo24771t(int i, @C12580l Object obj, @C12580l Object obj2) {
        return C11753k.m46648a(mo24774v(), i, obj, obj2);
    }

    @C12579k
    public String toString() {
        return "SemaphoreSegment[id=" + this.f29607c + ", hashCode=" + hashCode() + C12361b.f30261l;
    }

    @C12580l
    /* renamed from: u */
    public final Object mo24773u(int i) {
        return mo24774v().get(i);
    }

    @C12579k
    /* renamed from: v */
    public final AtomicReferenceArray mo24774v() {
        return this.f29930e;
    }

    @C12580l
    /* renamed from: w */
    public final Object mo24775w(int i, @C12580l Object obj) {
        return mo24774v().getAndSet(i, obj);
    }

    /* renamed from: x */
    public final void mo24776x(int i, @C12580l Object obj) {
        mo24774v().set(i, obj);
    }
}
