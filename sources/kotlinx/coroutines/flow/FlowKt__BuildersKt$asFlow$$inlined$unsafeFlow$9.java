package kotlinx.coroutines.flow;

import kotlin.jvm.internal.C11363r0;
import kotlin.ranges.C11466l;

@C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n185#2:113\n186#2,2:115\n188#2:118\n1855#3:114\n1856#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n185#1:114\n185#1:117\n*E\n"})
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9 implements C11907e<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C11466l f29292a;

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(C11466l lVar) {
        this.f29292a = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super java.lang.Integer> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.C118161
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1 r0 = (kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.C118161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1 r0 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            kotlin.C11661u0.m45747n(r7)
            r7 = r2
            goto L_0x0046
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.C11661u0.m45747n(r7)
            kotlin.ranges.l r7 = r5.f29292a
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0046:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0064
            r2 = r6
            kotlin.collections.k0 r2 = (kotlin.collections.C10953k0) r2
            int r2 = r2.mo6374c()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r2)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r2 = r7.emit(r2, r0)
            if (r2 != r1) goto L_0x0046
            return r1
        L_0x0064:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }
}
