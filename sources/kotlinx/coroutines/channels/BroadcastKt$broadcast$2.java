package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", mo22502f = "Broadcast.kt", mo22503i = {0, 1}, mo22504l = {56, 57}, mo22505m = "invokeSuspend", mo22506n = {"$this$broadcast", "$this$broadcast"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BroadcastKt$broadcast$2 extends SuspendLambda implements C11304p<C11760r<? super E>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ReceiveChannel<E> $channel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastKt$broadcast$2(ReceiveChannel<? extends E> receiveChannel, C11045c<? super BroadcastKt$broadcast$2> cVar) {
        super(2, cVar);
        this.$channel = receiveChannel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.$channel, cVar);
        broadcastKt$broadcast$2.L$0 = obj;
        return broadcastKt$broadcast$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super E> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BroadcastKt$broadcast$2) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r8)
            r8 = r4
            goto L_0x003d
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0023:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r8)
            r5 = r7
            goto L_0x004f
        L_0x0030:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.C11760r) r8
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r7.$channel
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
        L_0x003d:
            r4 = r7
        L_0x003e:
            r4.L$0 = r8
            r4.L$1 = r1
            r4.label = r3
            java.lang.Object r5 = r1.mo23863c(r4)
            if (r5 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r6 = r4
            r4 = r8
            r8 = r5
            r5 = r6
        L_0x004f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006b
            java.lang.Object r8 = r1.next()
            r5.L$0 = r4
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r8 = r4.mo23757h0(r8, r5)
            if (r8 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r8 = r4
            r4 = r5
            goto L_0x003e
        L_0x006b:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
