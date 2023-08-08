package kotlinx.coroutines.flow;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n176#2:113\n177#2,2:115\n179#2:118\n13607#3:114\n13608#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n176#1:114\n176#1:117\n*E\n"})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8 implements C11907e<Long> {

    /* renamed from: a */
    public final /* synthetic */ long[] f29291a;

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(long[] jArr) {
        this.f29291a = jArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super java.lang.Long> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.C118151
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.C118151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r9 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            long[] r4 = (long[]) r4
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.C11908f) r5
            kotlin.C11661u0.m45747n(r10)
            r10 = r5
            goto L_0x0063
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            kotlin.C11661u0.m45747n(r10)
            long[] r10 = r8.f29291a
            int r2 = r10.length
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r4
            r4 = r7
        L_0x004a:
            if (r2 >= r9) goto L_0x0065
            r5 = r4[r2]
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.C11064a.m42621g(r5)
            r0.L$0 = r10
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r9
            r0.label = r3
            java.lang.Object r5 = r10.emit(r5, r0)
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            int r2 = r2 + r3
            goto L_0x004a
        L_0x0065:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}
