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

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 2}, mo22504l = {164, 169, 170}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, mo22507s = {"L$0", "I$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
public final class ChannelsKt__DeprecatedKt$drop$1 extends SuspendLambda implements C11304p<C11760r<Object>, C11045c<? super C11079d2>, Object> {

    /* renamed from: $n */
    final /* synthetic */ int f29143$n;
    final /* synthetic */ ReceiveChannel<Object> $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel<Object> receiveChannel, C11045c<? super ChannelsKt__DeprecatedKt$drop$1> cVar) {
        super(2, cVar);
        this.f29143$n = i;
        this.$this_drop = receiveChannel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f29143$n, this.$this_drop, cVar);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<Object> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
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
            if (r1 == 0) goto L_0x004e
            if (r1 == r4) goto L_0x003b
            if (r1 == r3) goto L_0x002a
            if (r1 != r2) goto L_0x0022
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r10)
            r10 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x009f
        L_0x0022:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002a:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.channels.r r4 = (kotlinx.coroutines.channels.C11760r) r4
            kotlin.C11661u0.m45747n(r10)
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x00af
        L_0x003b:
            int r1 = r9.I$0
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
            goto L_0x007e
        L_0x004e:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.channels.r r10 = (kotlinx.coroutines.channels.C11760r) r10
            int r1 = r9.f29143$n
            if (r1 < 0) goto L_0x005b
            r5 = r4
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            if (r5 == 0) goto L_0x00cd
            if (r1 <= 0) goto L_0x0097
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r5 = r9.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r6 = r10
            r10 = r9
        L_0x0068:
            r10.L$0 = r6
            r10.L$1 = r5
            r10.I$0 = r1
            r10.label = r4
            java.lang.Object r7 = r5.mo23863c(r10)
            if (r7 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r8 = r0
            r0 = r10
            r10 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L_0x007e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0095
            r6.next()
            int r10 = r5 + -1
            if (r10 != 0) goto L_0x008e
            goto L_0x0095
        L_0x008e:
            r5 = r6
            r6 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
            goto L_0x0068
        L_0x0095:
            r10 = r7
            goto L_0x0099
        L_0x0097:
            r1 = r0
            r0 = r9
        L_0x0099:
            kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r0.$this_drop
            kotlinx.coroutines.channels.ChannelIterator r4 = r4.iterator()
        L_0x009f:
            r0.L$0 = r10
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = r4.mo23863c(r0)
            if (r5 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x00af:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ca
            java.lang.Object r10 = r4.next()
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r10 = r5.mo23757h0(r10, r0)
            if (r10 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            r10 = r5
            goto L_0x009f
        L_0x00ca:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00cd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Requested element count "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = " is less than zero."
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
