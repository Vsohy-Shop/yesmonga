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

@C11067d(mo22501c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", mo22502f = "_Sequences.kt", mo22503i = {0, 1, 1, 1}, mo22504l = {2318, 2323}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, mo22507s = {"L$0", "L$0", "L$1", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ C11305q<Integer, R, T, R> $operation;
    final /* synthetic */ C11559m<T> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(R r, C11559m<? extends T> mVar, C11305q<? super Integer, ? super R, ? super T, ? extends R> qVar, C11045c<? super SequencesKt___SequencesKt$runningFoldIndexed$1> cVar) {
        super(2, cVar);
        this.$initial = r;
        this.$this_runningFoldIndexed = mVar;
        this.$operation = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super R> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.sequences.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r9.I$0
            java.lang.Object r3 = r9.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r9.L$1
            java.lang.Object r5 = r9.L$0
            kotlin.sequences.o r5 = (kotlin.sequences.C11561o) r5
            kotlin.C11661u0.m45747n(r10)
            r10 = r4
            r4 = r1
            goto L_0x004f
        L_0x0020:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0028:
            java.lang.Object r1 = r9.L$0
            kotlin.sequences.o r1 = (kotlin.sequences.C11561o) r1
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0045
        L_0x0030:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            kotlin.sequences.o r1 = (kotlin.sequences.C11561o) r1
            R r10 = r9.$initial
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = r1.mo23250b(r10, r9)
            if (r10 != r0) goto L_0x0045
            return r0
        L_0x0045:
            R r10 = r9.$initial
            kotlin.sequences.m<T> r3 = r9.$this_runningFoldIndexed
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = r1
        L_0x004f:
            r1 = r9
        L_0x0050:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r3.next()
            kotlin.jvm.functions.q<java.lang.Integer, R, T, R> r7 = r1.$operation
            int r8 = r4 + 1
            if (r4 >= 0) goto L_0x0063
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x0063:
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r4)
            java.lang.Object r4 = r7.invoke(r4, r10, r6)
            r1.L$0 = r5
            r1.L$1 = r4
            r1.L$2 = r3
            r1.I$0 = r8
            r1.label = r2
            java.lang.Object r10 = r5.mo23250b(r4, r1)
            if (r10 != r0) goto L_0x007c
            return r0
        L_0x007c:
            r10 = r4
            r4 = r8
            goto L_0x0050
        L_0x007f:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
