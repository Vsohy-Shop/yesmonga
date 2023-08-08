package kotlinx.coroutines.flow;

import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n182#2,7:113\n189#2,7:121\n329#3:120\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n188#1:120\n*E\n"})
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements C11907e<T> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f29310a;

    /* renamed from: b */
    public final /* synthetic */ C11304p f29311b;

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(C11907e eVar, C11304p pVar) {
        this.f29310a = eVar;
        this.f29311b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.C118241
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.C118241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0094
        L_0x0030:
            r8 = move-exception
            goto L_0x0098
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            java.lang.Object r7 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) r4
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006d
        L_0x004a:
            kotlin.C11661u0.m45747n(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r8.element = r4
            kotlinx.coroutines.flow.e r2 = r6.f29310a
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1 r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1
            r5.<init>(r8, r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r2 = r2.collect(r5, r0)
            if (r2 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x006d:
            boolean r7 = r7.element
            if (r7 == 0) goto L_0x009c
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            r7.<init>(r2, r8)
            kotlin.jvm.functions.p r8 = r4.f29311b     // Catch:{ all -> 0x0030 }
            r0.L$0 = r7     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.L$1 = r2     // Catch:{ all -> 0x0030 }
            r0.L$2 = r2     // Catch:{ all -> 0x0030 }
            r0.label = r3     // Catch:{ all -> 0x0030 }
            r2 = 6
            kotlin.jvm.internal.C11322b0.m43482e(r2)     // Catch:{ all -> 0x0030 }
            java.lang.Object r8 = r8.invoke(r7, r0)     // Catch:{ all -> 0x0030 }
            r0 = 7
            kotlin.jvm.internal.C11322b0.m43482e(r0)     // Catch:{ all -> 0x0030 }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7.releaseIntercepted()
            goto L_0x009c
        L_0x0098:
            r7.releaseIntercepted()
            throw r8
        L_0x009c:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}
