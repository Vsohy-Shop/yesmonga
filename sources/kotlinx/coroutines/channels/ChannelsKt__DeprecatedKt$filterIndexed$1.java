package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2}, mo22504l = {211, 212, 212}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, mo22507s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$filterIndexed$1 extends SuspendLambda implements C11304p<C11760r<Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<Integer, Object, C11045c<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<Object> $this_filterIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(ReceiveChannel<Object> receiveChannel, C11305q<? super Integer, Object, ? super C11045c<? super Boolean>, ? extends Object> qVar, C11045c<? super ChannelsKt__DeprecatedKt$filterIndexed$1> cVar) {
        super(2, cVar);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<Object> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$filterIndexed$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 == r5) goto L_0x0040
            if (r1 == r4) goto L_0x0029
            if (r1 != r3) goto L_0x0021
            int r1 = r12.I$0
            java.lang.Object r6 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r13)
            r13 = r12
            goto L_0x0066
        L_0x0021:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0029:
            int r1 = r12.I$0
            java.lang.Object r6 = r12.L$2
            java.lang.Object r7 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.C11760r) r8
            kotlin.C11661u0.m45747n(r13)
            r10 = r1
            r1 = r0
            r0 = r12
            r11 = r7
            r7 = r6
        L_0x003d:
            r6 = r11
            goto L_0x00a7
        L_0x0040:
            int r1 = r12.I$0
            java.lang.Object r6 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r13)
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r12
            goto L_0x007e
        L_0x0053:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.channels.r r13 = (kotlinx.coroutines.channels.C11760r) r13
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r12.$this_filterIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = 0
            r7 = r13
            r13 = r12
            r11 = r6
            r6 = r1
            r1 = r11
        L_0x0066:
            r13.L$0 = r7
            r13.L$1 = r6
            r13.L$2 = r2
            r13.I$0 = r1
            r13.label = r5
            java.lang.Object r8 = r6.mo23863c(r13)
            if (r8 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r11 = r0
            r0 = r13
            r13 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r11
        L_0x007e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r7.next()
            kotlin.jvm.functions.q<java.lang.Integer, java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r9 = r0.$predicate
            int r10 = r6 + 1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r13
            r0.I$0 = r10
            r0.label = r4
            java.lang.Object r6 = r9.invoke(r6, r13, r0)
            if (r6 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r11 = r7
            r7 = r13
            r13 = r6
            goto L_0x003d
        L_0x00a7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00c0
            r0.L$0 = r8
            r0.L$1 = r6
            r0.L$2 = r2
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r13 = r8.mo23757h0(r7, r0)
            if (r13 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r13 = r0
            r0 = r1
            r7 = r8
            r1 = r10
            goto L_0x0066
        L_0x00c5:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
