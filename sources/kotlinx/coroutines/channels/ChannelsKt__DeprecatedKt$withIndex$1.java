package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10942h0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {370, 371}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "index", "$this$produce", "index"}, mo22507s = {"L$0", "I$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/collections/h0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements C11304p<C11760r<? super C10942h0<Object>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel<Object> receiveChannel, C11045c<? super ChannelsKt__DeprecatedKt$withIndex$1> cVar) {
        super(2, cVar);
        this.$this_withIndex = receiveChannel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, cVar);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super C10942h0<Object>> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            int r1 = r11.I$0
            java.lang.Object r4 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r12)
            r12 = r5
            r5 = r11
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x0047
        L_0x0021:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0029:
            int r1 = r11.I$0
            java.lang.Object r4 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r12)
            r6 = r11
            goto L_0x005d
        L_0x0038:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.r r12 = (kotlinx.coroutines.channels.C11760r) r12
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r11.$this_withIndex
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r4 = 0
            r5 = r11
        L_0x0047:
            r5.L$0 = r12
            r5.L$1 = r1
            r5.I$0 = r4
            r5.label = r3
            java.lang.Object r6 = r1.mo23863c(r5)
            if (r6 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r9 = r5
            r5 = r12
            r12 = r6
            r6 = r9
            r10 = r4
            r4 = r1
            r1 = r10
        L_0x005d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0084
            java.lang.Object r12 = r4.next()
            kotlin.collections.h0 r7 = new kotlin.collections.h0
            int r8 = r1 + 1
            r7.<init>(r1, r12)
            r6.L$0 = r5
            r6.L$1 = r4
            r6.I$0 = r8
            r6.label = r2
            java.lang.Object r12 = r5.mo23757h0(r7, r6)
            if (r12 != r0) goto L_0x007f
            return r0
        L_0x007f:
            r1 = r4
            r12 = r5
            r5 = r6
            r4 = r8
            goto L_0x0047
        L_0x0084:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
