package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", mo22502f = "Deprecated.kt", mo22503i = {0, 1, 1, 2, 3, 4}, mo22504l = {181, 182, 183, 187, 188}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, mo22507s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements C11304p<C11760r<Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<Object, C11045c<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<Object> $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(ReceiveChannel<Object> receiveChannel, C11304p<Object, ? super C11045c<? super Boolean>, ? extends Object> pVar, C11045c<? super ChannelsKt__DeprecatedKt$dropWhile$1> cVar) {
        super(2, cVar);
        this.$this_dropWhile = receiveChannel;
        this.$predicate = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<Object> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x0070
            if (r1 == r6) goto L_0x0060
            if (r1 == r5) goto L_0x004e
            if (r1 == r4) goto L_0x0042
            if (r1 == r3) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r12.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r13)
            r13 = r1
            r9 = r4
            r1 = r0
            r0 = r12
            goto L_0x00d9
        L_0x0029:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0031:
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r12.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r13)
            r9 = r4
            r4 = r1
            r1 = r0
            r0 = r12
            goto L_0x00e9
        L_0x0042:
            java.lang.Object r1 = r12.L$0
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.C11760r) r1
            kotlin.C11661u0.m45747n(r13)
            r10 = r1
            r1 = r0
            r0 = r12
            goto L_0x00cc
        L_0x004e:
            java.lang.Object r1 = r12.L$2
            java.lang.Object r8 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r12.L$0
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.C11760r) r9
            kotlin.C11661u0.m45747n(r13)
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r12
            goto L_0x00b5
        L_0x0060:
            java.lang.Object r1 = r12.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.C11760r) r8
            kotlin.C11661u0.m45747n(r13)
            r9 = r8
            r8 = r1
            r1 = r0
            r0 = r12
            goto L_0x0094
        L_0x0070:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.channels.r r13 = (kotlinx.coroutines.channels.C11760r) r13
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r12.$this_dropWhile
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r8 = r13
            r13 = r12
        L_0x007f:
            r13.L$0 = r8
            r13.L$1 = r1
            r13.L$2 = r7
            r13.label = r6
            java.lang.Object r9 = r1.mo23863c(r13)
            if (r9 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r11 = r0
            r0 = r13
            r13 = r9
            r9 = r8
            r8 = r1
            r1 = r11
        L_0x0094:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00d3
            java.lang.Object r13 = r8.next()
            kotlin.jvm.functions.p<java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r10 = r0.$predicate
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r13
            r0.label = r5
            java.lang.Object r10 = r10.invoke(r13, r0)
            if (r10 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r11 = r9
            r9 = r13
            r13 = r10
            r10 = r11
        L_0x00b5:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x00ce
            r0.L$0 = r10
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r13 = r10.mo23757h0(r9, r0)
            if (r13 != r1) goto L_0x00cc
            return r1
        L_0x00cc:
            r9 = r10
            goto L_0x00d3
        L_0x00ce:
            r13 = r0
            r0 = r1
            r1 = r8
            r8 = r10
            goto L_0x007f
        L_0x00d3:
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r13 = r0.$this_dropWhile
            kotlinx.coroutines.channels.ChannelIterator r13 = r13.iterator()
        L_0x00d9:
            r0.L$0 = r9
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r4 = r13.mo23863c(r0)
            if (r4 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            r11 = r4
            r4 = r13
            r13 = r11
        L_0x00e9:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0104
            java.lang.Object r13 = r4.next()
            r0.L$0 = r9
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r13 = r9.mo23757h0(r13, r0)
            if (r13 != r1) goto L_0x0102
            return r1
        L_0x0102:
            r13 = r4
            goto L_0x00d9
        L_0x0104:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
