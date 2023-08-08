package kotlinx.coroutines.flow;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n53#2,3:113\n66#2,4:116\n*E\n"})
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements C11907e<T> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f29332a;

    /* renamed from: b */
    public final /* synthetic */ int f29333b;

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(C11907e eVar, int i) {
        this.f29332a = eVar;
        this.f29333b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C118321
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C118321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
            kotlin.C11661u0.m45747n(r8)     // Catch:{ AbortFlowException -> 0x0051 }
            goto L_0x0055
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.C11661u0.m45747n(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.flow.e r2 = r6.f29332a     // Catch:{ AbortFlowException -> 0x0051 }
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch:{ AbortFlowException -> 0x0051 }
            int r5 = r6.f29333b     // Catch:{ AbortFlowException -> 0x0051 }
            r4.<init>(r8, r5, r7)     // Catch:{ AbortFlowException -> 0x0051 }
            r0.L$0 = r7     // Catch:{ AbortFlowException -> 0x0051 }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x0051 }
            java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ AbortFlowException -> 0x0051 }
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0051:
            r8 = move-exception
            kotlinx.coroutines.flow.internal.C11931h.m47597b(r8, r7)
        L_0x0055:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}
