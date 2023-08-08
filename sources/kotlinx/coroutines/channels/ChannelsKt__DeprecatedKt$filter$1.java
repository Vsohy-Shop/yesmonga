package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", mo22502f = "Deprecated.kt", mo22503i = {0, 1, 1, 2}, mo22504l = {198, 199, 199}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "$this$produce", "e", "$this$produce"}, mo22507s = {"L$0", "L$0", "L$2", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"E", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ChannelsKt__DeprecatedKt$filter$1 extends SuspendLambda implements C11304p<C11760r<? super E>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<E, C11045c<? super Boolean>, Object> $predicate;
    final /* synthetic */ ReceiveChannel<E> $this_filter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$filter$1(ReceiveChannel<? extends E> receiveChannel, C11304p<? super E, ? super C11045c<? super Boolean>, ? extends Object> pVar, C11045c<? super ChannelsKt__DeprecatedKt$filter$1> cVar) {
        super(2, cVar);
        this.$this_filter = receiveChannel;
        this.$predicate = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$filter$1 channelsKt__DeprecatedKt$filter$1 = new ChannelsKt__DeprecatedKt$filter$1(this.$this_filter, this.$predicate, cVar);
        channelsKt__DeprecatedKt$filter$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filter$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super E> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$filter$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r5) goto L_0x0038
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0056
        L_0x001e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0026:
            java.lang.Object r1 = r10.L$2
            java.lang.Object r6 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r10.L$0
            kotlinx.coroutines.channels.r r7 = (kotlinx.coroutines.channels.C11760r) r7
            kotlin.C11661u0.m45747n(r11)
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r10
            goto L_0x008d
        L_0x0038:
            java.lang.Object r1 = r10.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r10.L$0
            kotlinx.coroutines.channels.r r6 = (kotlinx.coroutines.channels.C11760r) r6
            kotlin.C11661u0.m45747n(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L_0x006c
        L_0x0048:
            kotlin.C11661u0.m45747n(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.channels.r r11 = (kotlinx.coroutines.channels.C11760r) r11
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r10.$this_filter
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r6 = r11
        L_0x0056:
            r11 = r10
        L_0x0057:
            r11.L$0 = r6
            r11.L$1 = r1
            r11.L$2 = r2
            r11.label = r5
            java.lang.Object r7 = r1.mo23863c(r11)
            if (r7 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L_0x006c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a9
            java.lang.Object r11 = r6.next()
            kotlin.jvm.functions.p<E, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r11, r0)
            if (r8 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r9 = r7
            r7 = r11
            r11 = r8
            r8 = r9
        L_0x008d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00a4
            r0.L$0 = r8
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r11 = r8.mo23757h0(r7, r0)
            if (r11 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            goto L_0x0057
        L_0x00a9:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
