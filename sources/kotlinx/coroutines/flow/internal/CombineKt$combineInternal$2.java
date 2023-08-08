package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", mo22502f = "Combine.kt", mo22503i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, mo22504l = {54, 76, 79}, mo22505m = "invokeSuspend", mo22506n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, mo22507s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, mo22516d2 = {"R", "T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CombineKt$combineInternal$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<T[]> $arrayFactory;
    final /* synthetic */ C11907e<T>[] $flows;
    final /* synthetic */ C11908f<R> $this_combineInternal;
    final /* synthetic */ C11305q<C11908f<? super R>, T[], C11045c<? super C11079d2>, Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(C11907e<? extends T>[] eVarArr, C11289a<T[]> aVar, C11305q<? super C11908f<? super R>, ? super T[], ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11908f<? super R> fVar, C11045c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.$flows = eVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = fVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, cVar);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e6 A[LOOP:1: B:26:0x00e6->B:32:0x0109, LOOP_START, PHI: r6 r10 
      PHI: (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:23:0x00e1, B:32:0x0109] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v3 kotlin.collections.h0) = (r10v2 kotlin.collections.h0), (r10v16 kotlin.collections.h0) binds: [B:23:0x00e1, B:32:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0072
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.C11744g) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.C11661u0.m45747n(r23)
            r21 = r2
            r2 = r7
            r7 = r8
            r13 = r9
            r8 = r0
            goto L_0x015d
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.C11744g) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.C11661u0.m45747n(r23)
            r21 = r2
            r2 = r7
            r7 = r8
            r13 = r9
            r8 = r0
            goto L_0x00c3
        L_0x0051:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.C11744g) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.C11661u0.m45747n(r23)
            r10 = r23
            kotlinx.coroutines.channels.j r10 = (kotlinx.coroutines.channels.C11749j) r10
            java.lang.Object r10 = r10.mo23920o()
            r15 = r2
            r2 = r7
            r7 = r8
            r8 = r0
            goto L_0x00db
        L_0x0072:
            kotlin.C11661u0.m45747n(r23)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
            kotlinx.coroutines.flow.e<T>[] r6 = r0.$flows
            int r12 = r6.length
            if (r12 != 0) goto L_0x0081
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0081:
            java.lang.Object[] r13 = new java.lang.Object[r12]
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.flow.internal.C11936l.f29517b
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            kotlin.collections.C10956m.m41313w2(r6, r7, r8, r9, r10, r11)
            r6 = 6
            r7 = 0
            kotlinx.coroutines.channels.g r20 = kotlinx.coroutines.channels.C11748i.m46625d(r12, r7, r7, r6, r7)
            java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
            r11.<init>(r12)
            r21 = 0
            r10 = r21
        L_0x009c:
            if (r10 >= r12) goto L_0x00bd
            r7 = 0
            r8 = 0
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r9 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            kotlinx.coroutines.flow.e<T>[] r15 = r0.$flows
            r19 = 0
            r14 = r9
            r16 = r10
            r17 = r11
            r18 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            r14 = 3
            r15 = 0
            r6 = r2
            r10 = r14
            r14 = r11
            r11 = r15
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r6, r7, r8, r9, r10, r11)
            int r10 = r16 + 1
            r11 = r14
            goto L_0x009c
        L_0x00bd:
            byte[] r2 = new byte[r12]
            r8 = r0
            r6 = r12
            r7 = r20
        L_0x00c3:
            int r9 = r21 + 1
            byte r9 = (byte) r9
            r8.L$0 = r13
            r8.L$1 = r7
            r8.L$2 = r2
            r8.I$0 = r6
            r8.I$1 = r9
            r8.label = r5
            java.lang.Object r10 = r7.mo23815Y(r8)
            if (r10 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            r15 = r9
            r9 = r13
        L_0x00db:
            java.lang.Object r10 = kotlinx.coroutines.channels.C11749j.m46637h(r10)
            kotlin.collections.h0 r10 = (kotlin.collections.C10942h0) r10
            if (r10 != 0) goto L_0x00e6
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00e6:
            int r11 = r10.mo22279e()
            r12 = r9[r11]
            java.lang.Object r10 = r10.mo22281f()
            r9[r11] = r10
            kotlinx.coroutines.internal.o0 r10 = kotlinx.coroutines.flow.internal.C11936l.f29517b
            if (r12 != r10) goto L_0x00f8
            int r6 = r6 + -1
        L_0x00f8:
            byte r10 = r2[r11]
            if (r10 == r15) goto L_0x010b
            byte r10 = (byte) r15
            r2[r11] = r10
            java.lang.Object r10 = r7.mo23811W()
            java.lang.Object r10 = kotlinx.coroutines.channels.C11749j.m46637h(r10)
            kotlin.collections.h0 r10 = (kotlin.collections.C10942h0) r10
            if (r10 != 0) goto L_0x00e6
        L_0x010b:
            if (r6 != 0) goto L_0x0160
            kotlin.jvm.functions.a<T[]> r10 = r8.$arrayFactory
            java.lang.Object r10 = r10.invoke()
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            if (r10 != 0) goto L_0x0132
            kotlin.jvm.functions.q<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r10 = r8.$transform
            kotlinx.coroutines.flow.f<R> r11 = r8.$this_combineInternal
            r8.L$0 = r9
            r8.L$1 = r7
            r8.L$2 = r2
            r8.I$0 = r6
            r8.I$1 = r15
            r8.label = r4
            java.lang.Object r10 = r10.invoke(r11, r9, r8)
            if (r10 != r1) goto L_0x012e
            return r1
        L_0x012e:
            r13 = r9
            r21 = r15
            goto L_0x00c3
        L_0x0132:
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r11 = r9
            r12 = r10
            r4 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            kotlin.collections.C10956m.m41237l1(r11, r12, r13, r14, r15, r16, r17)
            kotlin.jvm.functions.q<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r11 = r8.$transform
            kotlinx.coroutines.flow.f<R> r12 = r8.$this_combineInternal
            r8.L$0 = r9
            r8.L$1 = r7
            r8.L$2 = r2
            r8.I$0 = r6
            r8.I$1 = r4
            r8.label = r3
            java.lang.Object r10 = r11.invoke(r12, r10, r8)
            if (r10 != r1) goto L_0x0161
            return r1
        L_0x015d:
            r4 = 2
            goto L_0x00c3
        L_0x0160:
            r4 = r15
        L_0x0161:
            r21 = r4
            r13 = r9
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CombineKt$combineInternal$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
