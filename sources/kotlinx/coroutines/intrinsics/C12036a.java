package kotlinx.coroutines.intrinsics;

import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.internal.C12002l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
/* renamed from: kotlinx.coroutines.intrinsics.a */
public final class C12036a {
    /* renamed from: a */
    public static final void m48043a(C11045c<?> cVar, Throwable th) {
        Result.C10852a aVar = Result.f28060a;
        cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m48044b(C11045c<?> cVar, C11289a<C11079d2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            m48043a(cVar, th);
        }
    }

    /* renamed from: c */
    public static final void m48045c(@C12579k C11045c<? super C11079d2> cVar, @C12579k C11045c<?> cVar2) {
        try {
            C11045c<? super C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar);
            Result.C10852a aVar = Result.f28060a;
            C12002l.m47871e(d, Result.m38702b(C11079d2.f28267a), (C11300l) null, 2, (Object) null);
        } catch (Throwable th) {
            m48043a(cVar2, th);
        }
    }

    @C12177y1
    /* renamed from: d */
    public static final <T> void m48046d(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        try {
            C11045c<C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42606b(lVar, cVar));
            Result.C10852a aVar = Result.f28060a;
            C12002l.m47871e(d, Result.m38702b(C11079d2.f28267a), (C11300l) null, 2, (Object) null);
        } catch (Throwable th) {
            m48043a(cVar, th);
        }
    }

    /* renamed from: e */
    public static final <R, T> void m48047e(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
        try {
            C11045c<C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, r, cVar));
            Result.C10852a aVar = Result.f28060a;
            C12002l.m47870d(d, Result.m38702b(C11079d2.f28267a), lVar);
        } catch (Throwable th) {
            m48043a(cVar, th);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m48048f(C11304p pVar, Object obj, C11045c cVar, C11300l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m48047e(pVar, obj, cVar, lVar);
    }
}
