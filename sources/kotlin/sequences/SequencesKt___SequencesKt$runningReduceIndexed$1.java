package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", mo22502f = "_Sequences.kt", mo22503i = {0, 0, 0, 1, 1, 1, 1}, mo22504l = {2377, 2381}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"S", "T", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super S>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<Integer, S, T, S> $operation;
    final /* synthetic */ C11559m<T> $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(C11559m<? extends T> mVar, C11305q<? super Integer, ? super S, ? super T, ? extends S> qVar, C11045c<? super SequencesKt___SequencesKt$runningReduceIndexed$1> cVar) {
        super(2, cVar);
        this.$this_runningReduceIndexed = mVar;
        this.$operation = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, cVar);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super S> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: kotlin.sequences.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$2
            java.lang.Object r4 = r10.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.L$0
            kotlin.sequences.o r5 = (kotlin.sequences.C11561o) r5
            kotlin.C11661u0.m45747n(r11)
            r11 = r10
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0060
        L_0x0022:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002a:
            java.lang.Object r1 = r10.L$2
            java.lang.Object r4 = r10.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r10.L$0
            kotlin.sequences.o r5 = (kotlin.sequences.C11561o) r5
            kotlin.C11661u0.m45747n(r11)
            goto L_0x005f
        L_0x0038:
            kotlin.C11661u0.m45747n(r11)
            java.lang.Object r11 = r10.L$0
            r5 = r11
            kotlin.sequences.o r5 = (kotlin.sequences.C11561o) r5
            kotlin.sequences.m<T> r11 = r10.$this_runningReduceIndexed
            java.util.Iterator r4 = r11.iterator()
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x008f
            java.lang.Object r1 = r4.next()
            r10.L$0 = r5
            r10.L$1 = r4
            r10.L$2 = r1
            r10.label = r3
            java.lang.Object r11 = r5.mo23250b(r1, r10)
            if (r11 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r11 = r10
        L_0x0060:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008f
            kotlin.jvm.functions.q<java.lang.Integer, S, T, S> r6 = r11.$operation
            int r7 = r3 + 1
            if (r3 >= 0) goto L_0x006f
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x006f:
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r3)
            java.lang.Object r8 = r4.next()
            java.lang.Object r3 = r6.invoke(r3, r1, r8)
            r11.L$0 = r5
            r11.L$1 = r4
            r11.L$2 = r3
            r11.I$0 = r7
            r11.label = r2
            java.lang.Object r1 = r5.mo23250b(r3, r11)
            if (r1 != r0) goto L_0x008c
            return r0
        L_0x008c:
            r1 = r3
            r3 = r7
            goto L_0x0060
        L_0x008f:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
