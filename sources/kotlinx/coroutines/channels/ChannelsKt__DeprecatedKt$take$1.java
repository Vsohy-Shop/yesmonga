package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {254, 255}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "remaining", "$this$produce", "remaining"}, mo22507s = {"L$0", "I$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
public final class ChannelsKt__DeprecatedKt$take$1 extends SuspendLambda implements C11304p<C11760r<Object>, C11045c<? super C11079d2>, Object> {

    /* renamed from: $n */
    final /* synthetic */ int f29144$n;
    final /* synthetic */ ReceiveChannel<Object> $this_take;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$take$1(int i, ReceiveChannel<Object> receiveChannel, C11045c<? super ChannelsKt__DeprecatedKt$take$1> cVar) {
        super(2, cVar);
        this.f29144$n = i;
        this.$this_take = receiveChannel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new ChannelsKt__DeprecatedKt$take$1(this.f29144$n, this.$this_take, cVar);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<Object> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$take$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            int r1 = r8.I$0
            java.lang.Object r4 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r9)
            r9 = r5
            r5 = r8
            goto L_0x0082
        L_0x001f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0027:
            int r1 = r8.I$0
            java.lang.Object r4 = r8.L$1
            kotlinx.coroutines.channels.ChannelIterator r4 = (kotlinx.coroutines.channels.ChannelIterator) r4
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.r r5 = (kotlinx.coroutines.channels.C11760r) r5
            kotlin.C11661u0.m45747n(r9)
            r6 = r8
            goto L_0x0065
        L_0x0036:
            kotlin.C11661u0.m45747n(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.C11760r) r9
            int r1 = r8.f29144$n
            if (r1 != 0) goto L_0x0044
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0044:
            if (r1 < 0) goto L_0x0048
            r4 = r3
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            if (r4 == 0) goto L_0x008c
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r8.$this_take
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
            r5 = r8
        L_0x0052:
            r5.L$0 = r9
            r5.L$1 = r4
            r5.I$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.mo23863c(r5)
            if (r6 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r7 = r5
            r5 = r9
            r9 = r6
            r6 = r7
        L_0x0065:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0089
            java.lang.Object r9 = r4.next()
            r6.L$0 = r5
            r6.L$1 = r4
            r6.I$0 = r1
            r6.label = r2
            java.lang.Object r9 = r5.mo23757h0(r9, r6)
            if (r9 != r0) goto L_0x0080
            return r0
        L_0x0080:
            r9 = r5
            r5 = r6
        L_0x0082:
            int r1 = r1 + -1
            if (r1 != 0) goto L_0x0052
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x0089:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x008c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Requested element count "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = " is less than zero."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
