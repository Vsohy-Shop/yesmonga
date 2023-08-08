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

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, mo22504l = {487, 469, 471}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, mo22507s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@"}, mo22516d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n468#1:480\n468#1:481,6\n468#1:487,2\n468#1:489\n468#1:490,3\n*E\n"})
public final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements C11304p<C11760r<? super V>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ReceiveChannel<R> $other;
    final /* synthetic */ ReceiveChannel<E> $this_zip;
    final /* synthetic */ C11304p<E, R, V> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, C11304p<? super E, ? super R, ? extends V> pVar, C11045c<? super ChannelsKt__DeprecatedKt$zip$2> cVar) {
        super(2, cVar);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, cVar);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super V> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x007d
            if (r1 == r4) goto L_0x005e
            if (r1 == r3) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r1 = r13.L$4
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r13.L$3
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r13.L$2
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            java.lang.Object r8 = r13.L$1
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.C11760r) r9
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x011b }
            r10 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r13
            goto L_0x0104
        L_0x0030:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0038:
            java.lang.Object r1 = r13.L$5
            java.lang.Object r6 = r13.L$4
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r13.L$3
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r13.L$2
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            java.lang.Object r9 = r13.L$1
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r10 = r13.L$0
            kotlinx.coroutines.channels.r r10 = (kotlinx.coroutines.channels.C11760r) r10
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x005a }
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r13
            goto L_0x00dd
        L_0x005a:
            r14 = move-exception
            r6 = r7
            goto L_0x011c
        L_0x005e:
            java.lang.Object r1 = r13.L$4
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r13.L$3
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r13.L$2
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            java.lang.Object r8 = r13.L$1
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r13.L$0
            kotlinx.coroutines.channels.r r9 = (kotlinx.coroutines.channels.C11760r) r9
            kotlin.C11661u0.m45747n(r14)     // Catch:{ all -> 0x011b }
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r13
            goto L_0x00b5
        L_0x007d:
            kotlin.C11661u0.m45747n(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.channels.r r14 = (kotlinx.coroutines.channels.C11760r) r14
            kotlinx.coroutines.channels.ReceiveChannel<R> r1 = r13.$other
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            kotlinx.coroutines.channels.ReceiveChannel<E> r6 = r13.$this_zip
            kotlin.jvm.functions.p<E, R, V> r7 = r13.$transform
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x011b }
            r9 = r14
            r14 = r13
            r12 = r8
            r8 = r1
            r1 = r12
        L_0x0097:
            r14.L$0 = r9     // Catch:{ all -> 0x011b }
            r14.L$1 = r8     // Catch:{ all -> 0x011b }
            r14.L$2 = r7     // Catch:{ all -> 0x011b }
            r14.L$3 = r6     // Catch:{ all -> 0x011b }
            r14.L$4 = r1     // Catch:{ all -> 0x011b }
            r14.L$5 = r5     // Catch:{ all -> 0x011b }
            r14.label = r4     // Catch:{ all -> 0x011b }
            java.lang.Object r10 = r1.mo23863c(r14)     // Catch:{ all -> 0x011b }
            if (r10 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r12 = r0
            r0 = r14
            r14 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r1
            r1 = r12
        L_0x00b5:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x005a }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x005a }
            if (r14 == 0) goto L_0x0115
            java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x005a }
            r0.L$0 = r10     // Catch:{ all -> 0x005a }
            r0.L$1 = r9     // Catch:{ all -> 0x005a }
            r0.L$2 = r8     // Catch:{ all -> 0x005a }
            r0.L$3 = r7     // Catch:{ all -> 0x005a }
            r0.L$4 = r6     // Catch:{ all -> 0x005a }
            r0.L$5 = r14     // Catch:{ all -> 0x005a }
            r0.label = r3     // Catch:{ all -> 0x005a }
            java.lang.Object r11 = r9.mo23863c(r0)     // Catch:{ all -> 0x005a }
            if (r11 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r12 = r7
            r7 = r14
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r12
        L_0x00dd:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0112 }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0112 }
            if (r14 == 0) goto L_0x010a
            java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x0112 }
            java.lang.Object r14 = r9.invoke(r7, r14)     // Catch:{ all -> 0x0112 }
            r0.L$0 = r11     // Catch:{ all -> 0x0112 }
            r0.L$1 = r10     // Catch:{ all -> 0x0112 }
            r0.L$2 = r9     // Catch:{ all -> 0x0112 }
            r0.L$3 = r8     // Catch:{ all -> 0x0112 }
            r0.L$4 = r6     // Catch:{ all -> 0x0112 }
            r0.L$5 = r5     // Catch:{ all -> 0x0112 }
            r0.label = r2     // Catch:{ all -> 0x0112 }
            java.lang.Object r14 = r11.mo23757h0(r14, r0)     // Catch:{ all -> 0x0112 }
            if (r14 != r1) goto L_0x0102
            return r1
        L_0x0102:
            r7 = r9
            r9 = r11
        L_0x0104:
            r14 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            r8 = r10
            goto L_0x0097
        L_0x010a:
            r14 = r0
            r0 = r1
            r1 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            goto L_0x0097
        L_0x0112:
            r14 = move-exception
            r6 = r8
            goto L_0x011c
        L_0x0115:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005a }
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r5)
            return r14
        L_0x011b:
            r14 = move-exception
        L_0x011c:
            throw r14     // Catch:{ all -> 0x011d }
        L_0x011d:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
