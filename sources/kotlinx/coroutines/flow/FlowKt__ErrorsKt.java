package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,224:1\n106#2:225\n106#2:227\n1#3:226\n162#4:228\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n58#1:225\n132#1:227\n221#1:228\n*E\n"})
public final /* synthetic */ class FlowKt__ErrorsKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47065a(@C12579k C11907e<? extends T> eVar, @C12579k C11305q<? super C11908f<? super T>, ? super Throwable, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(eVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47066b(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11907e<? extends T> r4, @org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.label = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m47068d(r5, r4)
            if (r6 != 0) goto L_0x0076
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = m47067c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            kotlin.C11414o.m43942a(r4, r5)
            throw r4
        L_0x0072:
            kotlin.C11414o.m43942a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.m47066b(kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: c */
    public static final boolean m47067c(Throwable th, CoroutineContext coroutineContext) {
        C11723c2 c2Var = (C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0);
        if (c2Var == null || !c2Var.isCancelled()) {
            return false;
        }
        return m47068d(th, c2Var.mo23653u());
    }

    /* renamed from: d */
    public static final boolean m47068d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual((Object) th2, (Object) th);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m47069e(@C12579k C11907e<? extends T> eVar, long j, @C12579k C11304p<? super Throwable, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C11909g.m47508y1(eVar, new FlowKt__ErrorsKt$retry$3(j, pVar, (C11045c<? super FlowKt__ErrorsKt$retry$3>) null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j).toString());
    }

    /* renamed from: f */
    public static /* synthetic */ C11907e m47070f(C11907e eVar, long j, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            pVar = new FlowKt__ErrorsKt$retry$1((C11045c<? super FlowKt__ErrorsKt$retry$1>) null);
        }
        return C11909g.m47502w1(eVar, j, pVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47071g(@C12579k C11907e<? extends T> eVar, @C12579k C11306r<? super C11908f<? super T>, ? super Throwable, ? super Long, ? super C11045c<? super Boolean>, ? extends Object> rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eVar, rVar);
    }
}
