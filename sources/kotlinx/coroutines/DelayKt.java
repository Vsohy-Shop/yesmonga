package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11479u;
import kotlin.time.C11636e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n314#2,11:174\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n106#1:163,11\n127#1:174,11\n*E\n"})
public final class DelayKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m45924a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            kotlin.C11661u0.m45747n(r4)
            goto L_0x0052
        L_0x0031:
            kotlin.C11661u0.m45747n(r4)
            r0.label = r3
            kotlinx.coroutines.p r4 = new kotlinx.coroutines.p
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)
            r4.<init>(r2, r3)
            r4.mo24537e0()
            java.lang.Object r4 = r4.mo24572y()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r4 != r2) goto L_0x004f
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.m45924a(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: b */
    public static final Object m45925b(long j, @C12579k C11045c<? super C11079d2> cVar) {
        if (j <= 0) {
            return C11079d2.f28267a;
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        if (j < Long.MAX_VALUE) {
            m45927d(pVar.getContext()).mo23711p(j, pVar);
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: c */
    public static final Object m45926c(long j, @C12579k C11045c<? super C11079d2> cVar) {
        Object b = m45925b(m45928e(j), cVar);
        return b == C11063b.m42612h() ? b : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: d */
    public static final C12164w0 m45927d(@C12579k CoroutineContext coroutineContext) {
        CoroutineContext.C11040a b = coroutineContext.mo7444b(C11047d.f28247u0);
        C12164w0 w0Var = b instanceof C12164w0 ? (C12164w0) b : null;
        return w0Var == null ? C12144t0.m48662a() : w0Var;
    }

    /* renamed from: e */
    public static final long m45928e(long j) {
        if (C11636e.m45457Q(j, C11636e.f28954b.mo23447W()) > 0) {
            return C11479u.m44450v(C11636e.m45480k1(j), 1);
        }
        return 0;
    }
}
