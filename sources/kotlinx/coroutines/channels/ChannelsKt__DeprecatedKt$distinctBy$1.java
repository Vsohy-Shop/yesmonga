package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2, 2}, mo22504l = {387, 388, 390}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"E", "K", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$distinctBy$1 extends SuspendLambda implements C11304p<C11760r<? super E>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<E, C11045c<? super K>, Object> $selector;
    final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$distinctBy$1(ReceiveChannel<? extends E> receiveChannel, C11304p<? super E, ? super C11045c<? super K>, ? extends Object> pVar, C11045c<? super ChannelsKt__DeprecatedKt$distinctBy$1> cVar) {
        super(2, cVar);
        this.$this_distinctBy = receiveChannel;
        this.$selector = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, cVar);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super E> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$distinctBy$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
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
            if (r1 == 0) goto L_0x005a
            if (r1 == r4) goto L_0x0045
            if (r1 == r3) goto L_0x002d
            if (r1 != r2) goto L_0x0025
            java.lang.Object r1 = r11.L$3
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            goto L_0x00cb
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002d:
            java.lang.Object r1 = r11.L$3
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$1
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r12)
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r11
            goto L_0x00ae
        L_0x0045:
            java.lang.Object r1 = r11.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r5 = r11.L$1
            java.util.HashSet r5 = (java.util.HashSet) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r12)
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r11
            goto L_0x008a
        L_0x005a:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.r r12 = (kotlinx.coroutines.channels.C11760r) r12
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r11.$this_distinctBy
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r6 = r12
            r12 = r11
            r10 = r5
            r5 = r1
            r1 = r10
        L_0x0071:
            r12.L$0 = r6
            r12.L$1 = r5
            r12.L$2 = r1
            r7 = 0
            r12.L$3 = r7
            r12.label = r4
            java.lang.Object r7 = r1.mo23863c(r12)
            if (r7 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r10
        L_0x008a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00d8
            java.lang.Object r12 = r5.next()
            kotlin.jvm.functions.p<E, kotlin.coroutines.c<? super K>, java.lang.Object> r8 = r0.$selector
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r12
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r12, r0)
            if (r8 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r7
            r7 = r10
        L_0x00ae:
            boolean r9 = r7.contains(r12)
            if (r9 != 0) goto L_0x00d2
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r5
            r0.L$3 = r12
            r0.label = r2
            java.lang.Object r6 = r8.mo23757h0(r6, r0)
            if (r6 != r1) goto L_0x00c5
            return r1
        L_0x00c5:
            r6 = r7
            r7 = r8
            r10 = r1
            r1 = r12
            r12 = r0
            r0 = r10
        L_0x00cb:
            r6.add(r1)
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x0071
        L_0x00d2:
            r12 = r0
            r0 = r1
            r1 = r5
            r5 = r7
            r6 = r8
            goto L_0x0071
        L_0x00d8:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
