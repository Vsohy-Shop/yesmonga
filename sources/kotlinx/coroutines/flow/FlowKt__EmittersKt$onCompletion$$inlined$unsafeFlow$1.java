package kotlinx.coroutines.flow;

import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n147#2,13:113\n160#2,6:127\n329#3:126\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:126\n*E\n"})
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements C11907e<T> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f29308a;

    /* renamed from: b */
    public final /* synthetic */ C11305q f29309b;

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(C11907e eVar, C11305q qVar) {
        this.f29308a = eVar;
        this.f29309b = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C118231
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C118231) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r9 = (kotlinx.coroutines.flow.internal.SafeCollector) r9
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x0088
        L_0x0034:
            r10 = move-exception
            goto L_0x0092
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00ac
        L_0x0046:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.C11908f) r9
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x0067
        L_0x0052:
            r9 = move-exception
            goto L_0x0098
        L_0x0054:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.e r10 = r8.f29308a     // Catch:{ all -> 0x0096 }
            r0.L$0 = r8     // Catch:{ all -> 0x0096 }
            r0.L$1 = r9     // Catch:{ all -> 0x0096 }
            r0.label = r5     // Catch:{ all -> 0x0096 }
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch:{ all -> 0x0096 }
            if (r10 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r8
        L_0x0067:
            kotlinx.coroutines.flow.internal.SafeCollector r10 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            kotlin.jvm.functions.q r9 = r2.f29309b     // Catch:{ all -> 0x008e }
            r0.L$0 = r10     // Catch:{ all -> 0x008e }
            r0.L$1 = r6     // Catch:{ all -> 0x008e }
            r0.label = r3     // Catch:{ all -> 0x008e }
            r2 = 6
            kotlin.jvm.internal.C11322b0.m43482e(r2)     // Catch:{ all -> 0x008e }
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch:{ all -> 0x008e }
            r0 = 7
            kotlin.jvm.internal.C11322b0.m43482e(r0)     // Catch:{ all -> 0x008e }
            if (r9 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r9 = r10
        L_0x0088:
            r9.releaseIntercepted()
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x008e:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0092:
            r9.releaseIntercepted()
            throw r10
        L_0x0096:
            r9 = move-exception
            r2 = r8
        L_0x0098:
            kotlinx.coroutines.flow.x r10 = new kotlinx.coroutines.flow.x
            r10.<init>(r9)
            kotlin.jvm.functions.q r2 = r2.f29309b
            r0.L$0 = r9
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt__EmittersKt.m47054c(r10, r2, r9, r0)
            if (r10 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}
