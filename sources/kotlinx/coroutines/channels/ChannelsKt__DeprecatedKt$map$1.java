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

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {487, 333, 333}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, mo22507s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo22516d2 = {"E", "R", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n332#1:480\n332#1:481,6\n332#1:487,2\n332#1:489\n332#1:490,3\n*E\n"})
public final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements C11304p<C11760r<? super R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_map;
    final /* synthetic */ C11304p<E, C11045c<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<? extends E> receiveChannel, C11304p<? super E, ? super C11045c<? super R>, ? extends Object> pVar, C11045c<? super ChannelsKt__DeprecatedKt$map$1> cVar) {
        super(2, cVar);
        this.$this_map = receiveChannel;
        this.$transform = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, cVar);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super R> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
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
            if (r1 == 0) goto L_0x0063
            if (r1 == r5) goto L_0x004e
            if (r1 == r4) goto L_0x0030
            if (r1 != r3) goto L_0x0028
            java.lang.Object r1 = r12.L$3
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r12.L$2
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.L$1
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.C11760r) r8
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x00cf }
            r13 = r8
            r8 = r12
            goto L_0x0076
        L_0x0028:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0030:
            java.lang.Object r1 = r12.L$4
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.C11760r) r1
            java.lang.Object r6 = r12.L$3
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r12.L$2
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r12.L$1
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            java.lang.Object r9 = r12.L$0
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.C11760r) r9
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x004a }
            r10 = r12
            goto L_0x00b0
        L_0x004a:
            r13 = move-exception
            r6 = r7
            goto L_0x00d0
        L_0x004e:
            java.lang.Object r1 = r12.L$3
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r12.L$2
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r12.L$1
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            java.lang.Object r8 = r12.L$0
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.C11760r) r8
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x00cf }
            r9 = r12
            goto L_0x008b
        L_0x0063:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            kotlinx.coroutines.channels.r r13 = (kotlinx.coroutines.channels.C11760r) r13
            kotlinx.coroutines.channels.ReceiveChannel<E> r6 = r12.$this_map
            kotlin.jvm.functions.p<E, kotlin.coroutines.c<? super R>, java.lang.Object> r1 = r12.$transform
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch:{ all -> 0x00cf }
            r8 = r12
            r11 = r7
            r7 = r1
            r1 = r11
        L_0x0076:
            r8.L$0 = r13     // Catch:{ all -> 0x00cf }
            r8.L$1 = r7     // Catch:{ all -> 0x00cf }
            r8.L$2 = r6     // Catch:{ all -> 0x00cf }
            r8.L$3 = r1     // Catch:{ all -> 0x00cf }
            r8.label = r5     // Catch:{ all -> 0x00cf }
            java.lang.Object r9 = r1.mo23863c(r8)     // Catch:{ all -> 0x00cf }
            if (r9 != r0) goto L_0x0087
            return r0
        L_0x0087:
            r11 = r8
            r8 = r13
            r13 = r9
            r9 = r11
        L_0x008b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x00cf }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x00cf }
            if (r13 == 0) goto L_0x00c9
            java.lang.Object r13 = r1.next()     // Catch:{ all -> 0x00cf }
            r9.L$0 = r8     // Catch:{ all -> 0x00cf }
            r9.L$1 = r7     // Catch:{ all -> 0x00cf }
            r9.L$2 = r6     // Catch:{ all -> 0x00cf }
            r9.L$3 = r1     // Catch:{ all -> 0x00cf }
            r9.L$4 = r8     // Catch:{ all -> 0x00cf }
            r9.label = r4     // Catch:{ all -> 0x00cf }
            java.lang.Object r13 = r7.invoke(r13, r9)     // Catch:{ all -> 0x00cf }
            if (r13 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L_0x00b0:
            r10.L$0 = r9     // Catch:{ all -> 0x004a }
            r10.L$1 = r8     // Catch:{ all -> 0x004a }
            r10.L$2 = r7     // Catch:{ all -> 0x004a }
            r10.L$3 = r6     // Catch:{ all -> 0x004a }
            r10.L$4 = r2     // Catch:{ all -> 0x004a }
            r10.label = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r13 = r1.mo23757h0(r13, r10)     // Catch:{ all -> 0x004a }
            if (r13 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r1 = r6
            r6 = r7
            r7 = r8
            r13 = r9
            r8 = r10
            goto L_0x0076
        L_0x00c9:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00cf }
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r2)
            return r13
        L_0x00cf:
            r13 = move-exception
        L_0x00d0:
            throw r13     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
