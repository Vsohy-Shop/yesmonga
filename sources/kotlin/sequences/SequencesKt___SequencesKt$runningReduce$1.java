package kotlin.sequences;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", mo22502f = "_Sequences.kt", mo22503i = {0, 0, 0, 1, 1, 1}, mo22504l = {2348, 2351}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"S", "T", "Lkotlin/sequences/o;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super S>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<S, T, S> $operation;
    final /* synthetic */ C11559m<T> $this_runningReduce;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(C11559m<? extends T> mVar, C11304p<? super S, ? super T, ? extends S> pVar, C11045c<? super SequencesKt___SequencesKt$runningReduce$1> cVar) {
        super(2, cVar);
        this.$this_runningReduce = mVar;
        this.$operation = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, cVar);
        sequencesKt___SequencesKt$runningReduce$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super S> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.sequences.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x000e
            if (r1 != r2) goto L_0x001c
        L_0x000e:
            java.lang.Object r1 = r7.L$2
            java.lang.Object r3 = r7.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004c
        L_0x001c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0024:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            r4 = r8
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.sequences.m<T> r8 = r7.$this_runningReduce
            java.util.Iterator r8 = r8.iterator()
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r8.next()
            r7.L$0 = r4
            r7.L$1 = r8
            r7.L$2 = r1
            r7.label = r3
            java.lang.Object r3 = r4.mo23250b(r1, r7)
            if (r3 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r3 = r8
        L_0x004c:
            r8 = r7
        L_0x004d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x006c
            kotlin.jvm.functions.p<S, T, S> r5 = r8.$operation
            java.lang.Object r6 = r3.next()
            java.lang.Object r1 = r5.invoke(r1, r6)
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.mo23250b(r1, r8)
            if (r5 != r0) goto L_0x004d
            return r0
        L_0x006c:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
