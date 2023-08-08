package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12080p1;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,141:1\n82#1,11:142\n105#1:153\n82#1,6:154\n106#1,2:160\n92#1:162\n88#1,3:163\n33#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n105#1:142,11\n116#1:153\n116#1:154,6\n116#1:160,2\n116#1:162\n116#1:163,3\n129#1:166,5\n*E\n"})
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @C11532s0
    /* renamed from: a */
    public static final void m46428a(@C12579k ReceiveChannel<?> receiveChannel, @C12580l Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C12080p1.m48273a("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.mo23819a(cancellationException);
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @C12092r2
    /* renamed from: b */
    public static final <E, R> R m46429b(@C12579k C11740d<E> dVar, @C12579k C11300l<? super ReceiveChannel<? extends E>, ? extends R> lVar) {
        ReceiveChannel<E> A = dVar.mo23749A();
        try {
            return lVar.invoke(A);
        } finally {
            C11322b0.m43481d(1);
            ReceiveChannel.DefaultImpls.m46545b(A, (CancellationException) null, 1, (Object) null);
            C11322b0.m43480c(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlinx.coroutines.channels.C11755m.m46690b(r2, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> R m46430c(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> r3) {
        /*
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch:{ all -> 0x0010 }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r1 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return r3
        L_0x0010:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m46430c(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.l):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m46431d(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.C11740d<E> r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super E, kotlin.C11079d2> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x003b }
            r5 = r0
            r0 = r7
            r7 = r2
        L_0x0038:
            r2 = r1
            r1 = r5
            goto L_0x0066
        L_0x003b:
            r6 = move-exception
            goto L_0x008f
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.mo23749A()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x008b }
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0053:
            r0.L$0 = r7     // Catch:{ all -> 0x0088 }
            r0.L$1 = r8     // Catch:{ all -> 0x0088 }
            r0.L$2 = r6     // Catch:{ all -> 0x0088 }
            r0.label = r4     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r6.mo23863c(r0)     // Catch:{ all -> 0x0088 }
            if (r2 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L_0x0038
        L_0x0066:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0085 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0079
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0085 }
            r7.invoke(r8)     // Catch:{ all -> 0x0085 }
            r8 = r0
            r0 = r1
            r1 = r2
            goto L_0x0053
        L_0x0079:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0085 }
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m46545b(r0, r3, r4, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            return r6
        L_0x0085:
            r6 = move-exception
            r7 = r0
            goto L_0x008f
        L_0x0088:
            r6 = move-exception
            r7 = r8
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x008f:
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m46545b(r7, r3, r4, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m46431d(kotlinx.coroutines.channels.d, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m46432e(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super E, kotlin.C11079d2> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r5 = move-exception
            goto L_0x007e
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch:{ all -> 0x007a }
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L_0x004a:
            r0.L$0 = r7     // Catch:{ all -> 0x0035 }
            r0.L$1 = r6     // Catch:{ all -> 0x0035 }
            r0.L$2 = r5     // Catch:{ all -> 0x0035 }
            r0.label = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r5.mo23863c(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r4 = r2
            r2 = r7
            r7 = r4
        L_0x005c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0035 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x006d
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0035 }
            r2.invoke(r7)     // Catch:{ all -> 0x0035 }
            r7 = r2
            goto L_0x004a
        L_0x006d:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r7)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return r5
        L_0x007a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x007e:
            throw r5     // Catch:{ all -> 0x007f }
        L_0x007f:
            r7 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r5)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m46432e(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    /* renamed from: f */
    public static final <E> Object m46433f(C11740d<E> dVar, C11300l<? super E, C11079d2> lVar, C11045c<? super C11079d2> cVar) {
        ReceiveChannel<E> A = dVar.mo23749A();
        try {
            ChannelIterator<E> it = A.iterator();
            while (true) {
                C11322b0.m43482e(3);
                C11322b0.m43482e(0);
                Object c = it.mo23863c((C11045c<? super Boolean>) null);
                C11322b0.m43482e(1);
                if (!((Boolean) c).booleanValue()) {
                    return C11079d2.f28267a;
                }
                lVar.invoke(it.next());
            }
        } finally {
            C11322b0.m43481d(1);
            ReceiveChannel.DefaultImpls.m46545b(A, (CancellationException) null, 1, (Object) null);
            C11322b0.m43480c(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlinx.coroutines.channels.C11755m.m46690b(r3, r4);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m46434g(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r3, kotlin.jvm.functions.C11300l<? super E, kotlin.C11079d2> r4, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r5 = 1
            kotlinx.coroutines.channels.ChannelIterator r0 = r3.iterator()     // Catch:{ all -> 0x0031 }
        L_0x0005:
            r1 = 3
            kotlin.jvm.internal.C11322b0.m43482e(r1)     // Catch:{ all -> 0x0031 }
            r1 = 0
            kotlin.jvm.internal.C11322b0.m43482e(r1)     // Catch:{ all -> 0x0031 }
            r1 = 0
            java.lang.Object r2 = r0.mo23863c(r1)     // Catch:{ all -> 0x0031 }
            kotlin.jvm.internal.C11322b0.m43482e(r5)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0031 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0031 }
            r4.invoke(r1)     // Catch:{ all -> 0x0031 }
            goto L_0x0005
        L_0x0025:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0031 }
            kotlin.jvm.internal.C11322b0.m43481d(r5)
            kotlinx.coroutines.channels.C11755m.m46690b(r3, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r5)
            return r4
        L_0x0031:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r5)
            kotlinx.coroutines.channels.C11755m.m46690b(r3, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m46434g(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object m46437j(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0039 }
            goto L_0x0067
        L_0x0039:
            r7 = move-exception
            r8 = r2
            goto L_0x0089
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            kotlin.C11661u0.m45747n(r8)
            java.util.List r8 = kotlin.collections.C10976s.m41417i()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x0085 }
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L_0x0053:
            r0.L$0 = r5     // Catch:{ all -> 0x0083 }
            r0.L$1 = r4     // Catch:{ all -> 0x0083 }
            r0.L$2 = r8     // Catch:{ all -> 0x0083 }
            r0.L$3 = r7     // Catch:{ all -> 0x0083 }
            r0.label = r3     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r7.mo23863c(r0)     // Catch:{ all -> 0x0083 }
            if (r2 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0067:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0039 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r8 == 0) goto L_0x0078
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0039 }
            r4.add(r8)     // Catch:{ all -> 0x0039 }
            r8 = r2
            goto L_0x0053
        L_0x0078:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0039 }
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r7)
            java.util.List r7 = kotlin.collections.C10976s.m41409a(r5)
            return r7
        L_0x0083:
            r7 = move-exception
            goto L_0x0089
        L_0x0085:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0089:
            throw r7     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.m46437j(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }
}
