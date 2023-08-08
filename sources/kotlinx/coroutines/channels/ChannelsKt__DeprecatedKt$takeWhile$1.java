package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", mo22502f = "Deprecated.kt", mo22503i = {0, 1, 1, 2}, mo22504l = {269, 270, 271}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "$this$produce", "e", "$this$produce"}, mo22507s = {"L$0", "L$0", "L$2", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$takeWhile$1 extends SuspendLambda implements C11304p<C11760r<Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<Object, C11045c<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<Object> $this_takeWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$takeWhile$1(ReceiveChannel<Object> receiveChannel, C11304p<Object, ? super C11045c<? super Boolean>, ? extends Object> pVar, C11045c<? super ChannelsKt__DeprecatedKt$takeWhile$1> cVar) {
        super(2, cVar);
        this.$this_takeWhile = receiveChannel;
        this.$predicate = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new ChannelsKt__DeprecatedKt$takeWhile$1(this.$this_takeWhile, this.$predicate, cVar);
        channelsKt__DeprecatedKt$takeWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<Object> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$takeWhile$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r4) goto L_0x0038
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0056
        L_0x001d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0025:
            java.lang.Object r1 = r9.L$2
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r10)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x008c
        L_0x0038:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x006a
        L_0x0048:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.r r10 = (kotlinx.coroutines.channels.C11760r) r10
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r9.$this_takeWhile
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = r10
        L_0x0056:
            r10 = r9
        L_0x0057:
            r10.L$0 = r5
            r10.L$1 = r1
            r10.label = r4
            java.lang.Object r6 = r1.mo23863c(r10)
            if (r6 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L_0x006a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ac
            java.lang.Object r10 = r5.next()
            kotlin.jvm.functions.p<java.lang.Object, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r7 = r0.$predicate
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r10
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r10, r0)
            if (r7 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r8 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L_0x008c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0097
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x0097:
            r0.L$0 = r7
            r0.L$1 = r6
            r10 = 0
            r0.L$2 = r10
            r0.label = r2
            java.lang.Object r10 = r7.mo23757h0(r5, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r10 = r0
            r0 = r1
            r1 = r6
            r5 = r7
            goto L_0x0057
        L_0x00ac:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
