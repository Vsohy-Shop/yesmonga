package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.internal.C12000k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n*L\n1#1,386:1\n1#2:387\n19#3:388\n*S KotlinDebug\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n380#1:388\n*E\n"})
/* renamed from: kotlinx.coroutines.r */
public final class C12089r {
    @C12177y1
    /* renamed from: a */
    public static final void m48294a(@C12579k C12072o<?> oVar, @C12579k C11962g1 g1Var) {
        oVar.mo24529C(new C11967h1(g1Var));
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C12078p<T> m48295b(@C12579k C11045c<? super T> cVar) {
        if (!(cVar instanceof C12000k)) {
            return new C12078p<>(cVar, 1);
        }
        C12078p<T> m = ((C12000k) cVar).mo24368m();
        if (m != null) {
            if (!m.mo24553P()) {
                m = null;
            }
            if (m != null) {
                return m;
            }
        }
        return new C12078p<>(cVar, 2);
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Object m48296c(@C12579k C11300l<? super C12072o<? super T>, C11079d2> lVar, @C12579k C11045c<? super T> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        lVar.invoke(pVar);
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* renamed from: d */
    public static final <T> Object m48297d(C11300l<? super C12072o<? super T>, C11079d2> lVar, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        lVar.invoke(pVar);
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        C11322b0.m43482e(1);
        return y;
    }

    @C12580l
    /* renamed from: e */
    public static final <T> Object m48298e(@C12579k C11300l<? super C12078p<? super T>, C11079d2> lVar, @C12579k C11045c<? super T> cVar) {
        C12078p<? super T> b = m48295b(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
        try {
            lVar.invoke(b);
            Object y = b.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            return y;
        } catch (Throwable th) {
            b.mo24552M();
            throw th;
        }
    }

    /* renamed from: f */
    public static final <T> Object m48299f(C11300l<? super C12078p<? super T>, C11079d2> lVar, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        C12078p<? super T> b = m48295b(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
        try {
            lVar.invoke(b);
            Object y = b.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            C11322b0.m43482e(1);
            return y;
        } catch (Throwable th) {
            b.mo24552M();
            throw th;
        }
    }
}
