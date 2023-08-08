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

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {344, 345, 345}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, mo22507s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"E", "R", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements C11304p<C11760r<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
    final /* synthetic */ C11305q<Integer, E, C11045c<? super R>, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<? extends E> receiveChannel, C11305q<? super Integer, ? super E, ? super C11045c<? super R>, ? extends Object> qVar, C11045c<? super ChannelsKt__DeprecatedKt$mapIndexed$1> cVar) {
        super(2, cVar);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, cVar);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super R> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r4) goto L_0x003d
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r12)
            r12 = r6
            r6 = r11
            goto L_0x005e
        L_0x0021:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0029:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r12)
            r8 = r11
            goto L_0x009b
        L_0x003d:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r12)
            r7 = r11
            goto L_0x0071
        L_0x004c:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.r r12 = (kotlinx.coroutines.channels.C11760r) r12
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r11.$this_mapIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = 0
            r6 = r11
            r10 = r5
            r5 = r1
            r1 = r10
        L_0x005e:
            r6.L$0 = r12
            r6.L$1 = r5
            r6.I$0 = r1
            r6.label = r4
            java.lang.Object r7 = r5.mo23863c(r6)
            if (r7 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r10 = r6
            r6 = r12
            r12 = r7
            r7 = r10
        L_0x0071:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00b1
            java.lang.Object r12 = r5.next()
            kotlin.jvm.functions.q<java.lang.Integer, E, kotlin.coroutines.c<? super R>, java.lang.Object> r8 = r7.$transform
            int r9 = r1 + 1
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r1)
            r7.L$0 = r6
            r7.L$1 = r5
            r7.L$2 = r6
            r7.I$0 = r9
            r7.label = r3
            java.lang.Object r12 = r8.invoke(r1, r12, r7)
            if (r12 != r0) goto L_0x0096
            return r0
        L_0x0096:
            r8 = r7
            r1 = r9
            r7 = r6
            r6 = r5
            r5 = r7
        L_0x009b:
            r8.L$0 = r7
            r8.L$1 = r6
            r9 = 0
            r8.L$2 = r9
            r8.I$0 = r1
            r8.label = r2
            java.lang.Object r12 = r5.mo23757h0(r12, r8)
            if (r12 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            r5 = r6
            r12 = r7
            r6 = r8
            goto L_0x005e
        L_0x00b1:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
