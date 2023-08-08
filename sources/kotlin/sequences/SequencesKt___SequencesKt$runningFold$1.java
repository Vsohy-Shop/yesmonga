package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", mo22502f = "_Sequences.kt", mo22503i = {0, 1, 1}, mo22504l = {2290, 2294}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "$this$sequence", "accumulator"}, mo22507s = {"L$0", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"T", "R", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ C11304p<R, T, R> $operation;
    final /* synthetic */ C11559m<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFold$1(R r, C11559m<? extends T> mVar, C11304p<? super R, ? super T, ? extends R> pVar, C11045c<? super SequencesKt___SequencesKt$runningFold$1> cVar) {
        super(2, cVar);
        this.$initial = r;
        this.$this_runningFold = mVar;
        this.$operation = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super R> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.sequences.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r7.L$1
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.C11661u0.m45747n(r8)
            r8 = r3
            goto L_0x004c
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            java.lang.Object r1 = r7.L$0
            kotlin.sequences.o r1 = (kotlin.sequences.C11561o) r1
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0042
        L_0x002d:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlin.sequences.o r1 = (kotlin.sequences.C11561o) r1
            R r8 = r7.$initial
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r1.mo23250b(r8, r7)
            if (r8 != r0) goto L_0x0042
            return r0
        L_0x0042:
            R r8 = r7.$initial
            kotlin.sequences.m<T> r3 = r7.$this_runningFold
            java.util.Iterator r3 = r3.iterator()
            r4 = r1
            r1 = r3
        L_0x004c:
            r3 = r7
        L_0x004d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r1.next()
            kotlin.jvm.functions.p<R, T, R> r6 = r3.$operation
            java.lang.Object r8 = r6.invoke(r8, r5)
            r3.L$0 = r4
            r3.L$1 = r8
            r3.L$2 = r1
            r3.label = r2
            java.lang.Object r5 = r4.mo23250b(r8, r3)
            if (r5 != r0) goto L_0x004d
            return r0
        L_0x006c:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
