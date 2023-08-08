package kotlinx.coroutines.channels;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12156u1;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n82#2,11:480\n82#2,11:491\n82#2,11:502\n82#2,11:513\n105#2:524\n82#2,6:525\n106#2:531\n92#2:532\n107#2:533\n88#2,3:534\n82#2,11:537\n105#2:548\n82#2,6:549\n106#2,2:555\n92#2:557\n88#2,3:558\n82#2,11:561\n82#2,11:572\n82#2,11:583\n105#2:594\n82#2,6:595\n106#2,2:601\n92#2:603\n88#2,3:604\n105#2:607\n82#2,6:608\n106#2,2:614\n92#2:616\n88#2,3:617\n105#2:620\n82#2,6:621\n106#2,2:627\n92#2:629\n88#2,3:630\n105#2:633\n82#2,6:634\n106#2,2:640\n92#2:642\n88#2,3:643\n105#2:646\n82#2,6:647\n106#2,2:653\n92#2:655\n88#2,3:656\n82#2,11:659\n105#2:670\n82#2,6:671\n106#2,2:677\n92#2:679\n88#2,3:680\n82#2,11:683\n82#2,11:694\n82#2,11:705\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n34#1:480,11\n49#1:491,11\n63#1:502,11\n73#1:513,11\n84#1:524\n84#1:525,6\n84#1:531\n84#1:532\n84#1:533\n84#1:534,3\n95#1:537,11\n110#1:548\n110#1:549,6\n110#1:555,2\n110#1:557\n110#1:558,3\n121#1:561,11\n134#1:572,11\n147#1:583,11\n232#1:594\n232#1:595,6\n232#1:601,2\n232#1:603\n232#1:604,3\n241#1:607\n241#1:608,6\n241#1:614,2\n241#1:616\n241#1:617,3\n277#1:620\n277#1:621,6\n277#1:627,2\n277#1:629\n277#1:630,3\n285#1:633\n285#1:634,6\n285#1:640,2\n285#1:642\n285#1:643,3\n298#1:646\n298#1:647,6\n298#1:653,2\n298#1:655\n298#1:656,3\n403#1:659,11\n411#1:670\n411#1:671,6\n411#1:677,2\n411#1:679\n411#1:680,3\n418#1:683,11\n432#1:694,11\n446#1:705,11\n*E\n"})
public final /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46438A(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.C11045c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.L$0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0037 }
            goto L_0x0067
        L_0x0037:
            r7 = move-exception
            goto L_0x009a
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            kotlin.C11661u0.m45747n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch:{ all -> 0x0096 }
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L_0x0053:
            r0.L$0 = r9     // Catch:{ all -> 0x0037 }
            r0.L$1 = r2     // Catch:{ all -> 0x0037 }
            r0.L$2 = r8     // Catch:{ all -> 0x0037 }
            r0.L$3 = r7     // Catch:{ all -> 0x0037 }
            r0.label = r3     // Catch:{ all -> 0x0037 }
            java.lang.Object r4 = r7.mo23863c(r0)     // Catch:{ all -> 0x0037 }
            if (r4 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r4
            r4 = r9
            r9 = r6
        L_0x0067:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0037 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0037 }
            r5 = 0
            if (r9 == 0) goto L_0x008b
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0037 }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r9)     // Catch:{ all -> 0x0037 }
            if (r9 == 0) goto L_0x0084
            int r7 = r2.element     // Catch:{ all -> 0x0037 }
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r7)     // Catch:{ all -> 0x0037 }
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r5)
            return r7
        L_0x0084:
            int r9 = r2.element     // Catch:{ all -> 0x0037 }
            int r9 = r9 + r3
            r2.element = r9     // Catch:{ all -> 0x0037 }
            r9 = r4
            goto L_0x0053
        L_0x008b:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0037 }
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r7)
            return r7
        L_0x0096:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x009a:
            throw r7     // Catch:{ all -> 0x009b }
        L_0x009b:
            r9 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46438A(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d A[SYNTHETIC, Splitter:B:44:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46439B(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.C11045c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r6 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0036 }
            goto L_0x008a
        L_0x0036:
            r6 = move-exception
            r2 = r4
            goto L_0x00a8
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0042:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x004e }
            goto L_0x0068
        L_0x004e:
            r6 = move-exception
            goto L_0x00a8
        L_0x0050:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch:{ all -> 0x00a5 }
            r0.L$0 = r6     // Catch:{ all -> 0x00a5 }
            r0.L$1 = r7     // Catch:{ all -> 0x00a5 }
            r0.label = r4     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r7.mo23863c(r0)     // Catch:{ all -> 0x00a5 }
            if (r2 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L_0x0068:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x004e }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x009d
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x004e }
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x0077:
            r0.L$0 = r6     // Catch:{ all -> 0x00a5 }
            r0.L$1 = r2     // Catch:{ all -> 0x00a5 }
            r0.L$2 = r7     // Catch:{ all -> 0x00a5 }
            r0.label = r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r2.mo23863c(r0)     // Catch:{ all -> 0x00a5 }
            if (r4 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L_0x008a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0036 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0098
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0036 }
            r6 = r4
            goto L_0x0077
        L_0x0098:
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r7)
            return r6
        L_0x009d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch:{ all -> 0x004e }
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch:{ all -> 0x004e }
            throw r6     // Catch:{ all -> 0x004e }
        L_0x00a5:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x00a8:
            throw r6     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r7 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46439B(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46440C(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, kotlin.coroutines.C11045c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.L$0
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x003b }
            goto L_0x0075
        L_0x003b:
            r7 = move-exception
            goto L_0x00a3
        L_0x003e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0046:
            kotlin.C11661u0.m45747n(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r2 = -1
            r9.element = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r7.iterator()     // Catch:{ all -> 0x009f }
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L_0x005f:
            r0.L$0 = r9     // Catch:{ all -> 0x003b }
            r0.L$1 = r4     // Catch:{ all -> 0x003b }
            r0.L$2 = r2     // Catch:{ all -> 0x003b }
            r0.L$3 = r8     // Catch:{ all -> 0x003b }
            r0.L$4 = r7     // Catch:{ all -> 0x003b }
            r0.label = r3     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r7.mo23863c(r0)     // Catch:{ all -> 0x003b }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r6 = r5
            r5 = r9
            r9 = r6
        L_0x0075:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x003b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x0092
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x003b }
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)     // Catch:{ all -> 0x003b }
            if (r9 == 0) goto L_0x008b
            int r9 = r2.element     // Catch:{ all -> 0x003b }
            r4.element = r9     // Catch:{ all -> 0x003b }
        L_0x008b:
            int r9 = r2.element     // Catch:{ all -> 0x003b }
            int r9 = r9 + r3
            r2.element = r9     // Catch:{ all -> 0x003b }
            r9 = r5
            goto L_0x005f
        L_0x0092:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003b }
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r7)
            int r7 = r4.element
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r7)
            return r7
        L_0x009f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00a3:
            throw r7     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r9 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46440C(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46441D(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.C11045c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0037 }
            goto L_0x008f
        L_0x0037:
            r7 = move-exception
            r2 = r4
            goto L_0x00a4
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x004f }
            goto L_0x0069
        L_0x004f:
            r7 = move-exception
            goto L_0x00a4
        L_0x0051:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch:{ all -> 0x00a1 }
            r0.L$0 = r7     // Catch:{ all -> 0x00a1 }
            r0.L$1 = r8     // Catch:{ all -> 0x00a1 }
            r0.label = r4     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r8.mo23863c(r0)     // Catch:{ all -> 0x00a1 }
            if (r2 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0069:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004f }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004f }
            if (r8 != 0) goto L_0x0075
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r5)
            return r5
        L_0x0075:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x004f }
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x007c:
            r0.L$0 = r7     // Catch:{ all -> 0x00a1 }
            r0.L$1 = r2     // Catch:{ all -> 0x00a1 }
            r0.L$2 = r8     // Catch:{ all -> 0x00a1 }
            r0.label = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r4 = r2.mo23863c(r0)     // Catch:{ all -> 0x00a1 }
            if (r4 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L_0x008f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0037 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0037 }
            if (r8 == 0) goto L_0x009d
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0037 }
            r7 = r4
            goto L_0x007c
        L_0x009d:
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r5)
            return r7
        L_0x00a1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x00a4:
            throw r7     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46441D(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    @C11532s0
    /* renamed from: E */
    public static final <E, R> ReceiveChannel<R> m46442E(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super R>, ? extends Object> pVar) {
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$map$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$map$1>) null), 6, (Object) null);
    }

    /* renamed from: F */
    public static /* synthetic */ ReceiveChannel m46443F(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46671J(receiveChannel, coroutineContext, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: G */
    public static final <E, R> ReceiveChannel<R> m46444G(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11305q<? super Integer, ? super E, ? super C11045c<? super R>, ? extends Object> qVar) {
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, qVar, (C11045c<? super ChannelsKt__DeprecatedKt$mapIndexed$1>) null), 6, (Object) null);
    }

    /* renamed from: H */
    public static /* synthetic */ ReceiveChannel m46445H(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11305q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46673L(receiveChannel, coroutineContext, qVar);
    }

    /* renamed from: J */
    public static /* synthetic */ ReceiveChannel m46447J(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11305q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46730y(C11755m.m46673L(receiveChannel, coroutineContext, qVar));
    }

    /* renamed from: L */
    public static /* synthetic */ ReceiveChannel m46449L(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46730y(C11755m.m46671J(receiveChannel, coroutineContext, pVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC, Splitter:B:34:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46450M(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.C11045c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            java.util.Comparator r4 = (java.util.Comparator) r4
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0041 }
            r7 = r0
            r0 = r8
            r8 = r2
        L_0x003d:
            r2 = r1
            r1 = r7
            goto L_0x00a4
        L_0x0041:
            r8 = move-exception
            r9 = r2
            goto L_0x00c3
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r0.L$0
            java.util.Comparator r2 = (java.util.Comparator) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x005d }
            goto L_0x007b
        L_0x005d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0060:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch:{ all -> 0x00bf }
            r0.L$0 = r9     // Catch:{ all -> 0x00bf }
            r0.L$1 = r8     // Catch:{ all -> 0x00bf }
            r0.L$2 = r10     // Catch:{ all -> 0x00bf }
            r0.label = r4     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r10.mo23863c(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L_0x007b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x005d }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x0087
            kotlinx.coroutines.channels.C11755m.m46690b(r9, r5)
            return r5
        L_0x0087:
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x005d }
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x008f:
            r0.L$0 = r4     // Catch:{ all -> 0x00bf }
            r0.L$1 = r8     // Catch:{ all -> 0x00bf }
            r0.L$2 = r9     // Catch:{ all -> 0x00bf }
            r0.L$3 = r10     // Catch:{ all -> 0x00bf }
            r0.label = r3     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r9.mo23863c(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L_0x003d
        L_0x00a4:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00bf }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x00bb
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00bf }
            int r6 = r4.compare(r0, r10)     // Catch:{ all -> 0x00bf }
            if (r6 >= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r0
        L_0x00b8:
            r0 = r1
            r1 = r2
            goto L_0x008f
        L_0x00bb:
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r5)
            return r0
        L_0x00bf:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00c3:
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r10 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46450M(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC, Splitter:B:34:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46451N(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, kotlin.coroutines.C11045c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.L$3
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            java.util.Comparator r4 = (java.util.Comparator) r4
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0041 }
            r7 = r0
            r0 = r8
            r8 = r2
        L_0x003d:
            r2 = r1
            r1 = r7
            goto L_0x00a4
        L_0x0041:
            r8 = move-exception
            r9 = r2
            goto L_0x00c3
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r0.L$0
            java.util.Comparator r2 = (java.util.Comparator) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x005d }
            goto L_0x007b
        L_0x005d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0060:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch:{ all -> 0x00bf }
            r0.L$0 = r9     // Catch:{ all -> 0x00bf }
            r0.L$1 = r8     // Catch:{ all -> 0x00bf }
            r0.L$2 = r10     // Catch:{ all -> 0x00bf }
            r0.label = r4     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r10.mo23863c(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L_0x007b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x005d }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x0087
            kotlinx.coroutines.channels.C11755m.m46690b(r9, r5)
            return r5
        L_0x0087:
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x005d }
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x008f:
            r0.L$0 = r4     // Catch:{ all -> 0x00bf }
            r0.L$1 = r8     // Catch:{ all -> 0x00bf }
            r0.L$2 = r9     // Catch:{ all -> 0x00bf }
            r0.L$3 = r10     // Catch:{ all -> 0x00bf }
            r0.label = r3     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r9.mo23863c(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L_0x003d
        L_0x00a4:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00bf }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x00bb
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00bf }
            int r6 = r4.compare(r0, r10)     // Catch:{ all -> 0x00bf }
            if (r6 <= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r0
        L_0x00b8:
            r0 = r1
            r1 = r2
            goto L_0x008f
        L_0x00bb:
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r5)
            return r0
        L_0x00bf:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00c3:
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r10 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46451N(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        kotlinx.coroutines.channels.C11755m.m46690b(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46452O(kotlinx.coroutines.channels.ReceiveChannel r4, kotlin.coroutines.C11045c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch:{ all -> 0x005a }
            r0.L$0 = r4     // Catch:{ all -> 0x005a }
            r0.label = r3     // Catch:{ all -> 0x005a }
            java.lang.Object r5 = r5.mo23863c(r0)     // Catch:{ all -> 0x005a }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x005a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x005a }
            if (r5 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)     // Catch:{ all -> 0x005a }
            r0 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r0)
            return r5
        L_0x005a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46452O(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e A[SYNTHETIC, Splitter:B:39:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096 A[SYNTHETIC, Splitter:B:42:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46454Q(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.C11045c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x0081
        L_0x0032:
            r6 = move-exception
            r2 = r0
            goto L_0x00a1
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x004a }
            goto L_0x0064
        L_0x004a:
            r6 = move-exception
            goto L_0x00a1
        L_0x004c:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch:{ all -> 0x009e }
            r0.L$0 = r6     // Catch:{ all -> 0x009e }
            r0.L$1 = r7     // Catch:{ all -> 0x009e }
            r0.label = r4     // Catch:{ all -> 0x009e }
            java.lang.Object r2 = r7.mo23863c(r0)     // Catch:{ all -> 0x009e }
            if (r2 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L_0x0064:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x004a }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x004a }
            r0.L$0 = r2     // Catch:{ all -> 0x004a }
            r0.L$1 = r7     // Catch:{ all -> 0x004a }
            r0.label = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r6 = r6.mo23863c(r0)     // Catch:{ all -> 0x004a }
            if (r6 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0081:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0032 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0032 }
            if (r7 != 0) goto L_0x008e
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r7)
            return r6
        L_0x008e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch:{ all -> 0x0032 }
            throw r6     // Catch:{ all -> 0x0032 }
        L_0x0096:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch:{ all -> 0x004a }
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch:{ all -> 0x004a }
            throw r6     // Catch:{ all -> 0x004a }
        L_0x009e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x00a1:
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r7 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46454Q(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[SYNTHETIC, Splitter:B:32:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46455R(kotlinx.coroutines.channels.ReceiveChannel r7, kotlin.coroutines.C11045c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0033 }
            goto L_0x0086
        L_0x0033:
            r7 = move-exception
            r2 = r0
            goto L_0x0099
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x004b }
            goto L_0x0065
        L_0x004b:
            r7 = move-exception
            goto L_0x0099
        L_0x004d:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch:{ all -> 0x0096 }
            r0.L$0 = r7     // Catch:{ all -> 0x0096 }
            r0.L$1 = r8     // Catch:{ all -> 0x0096 }
            r0.label = r4     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r8.mo23863c(r0)     // Catch:{ all -> 0x0096 }
            if (r2 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0065:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004b }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004b }
            if (r8 != 0) goto L_0x0071
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r5)
            return r5
        L_0x0071:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x004b }
            r0.L$0 = r2     // Catch:{ all -> 0x004b }
            r0.L$1 = r8     // Catch:{ all -> 0x004b }
            r0.label = r3     // Catch:{ all -> 0x004b }
            java.lang.Object r7 = r7.mo23863c(r0)     // Catch:{ all -> 0x004b }
            if (r7 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0086:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0033 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x0092
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r5)
            return r5
        L_0x0092:
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r5)
            return r7
        L_0x0096:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x0099:
            throw r7     // Catch:{ all -> 0x009a }
        L_0x009a:
            r8 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46455R(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: T */
    public static /* synthetic */ ReceiveChannel m46457T(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$take$1(i, receiveChannel, (C11045c<? super ChannelsKt__DeprecatedKt$take$1>) null), 6, (Object) null);
    }

    /* renamed from: V */
    public static /* synthetic */ ReceiveChannel m46459V(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$takeWhile$1>) null), 6, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11532s0
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends kotlinx.coroutines.channels.C11763t<? super E>> java.lang.Object m46460W(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, @org.jetbrains.annotations.C12579k C r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.t r2 = (kotlinx.coroutines.channels.C11763t) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0053 }
        L_0x0037:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L_0x005c
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.t r2 = (kotlinx.coroutines.channels.C11763t) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0053 }
            goto L_0x0070
        L_0x0053:
            r6 = move-exception
            goto L_0x0096
        L_0x0055:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x0092 }
        L_0x005c:
            r0.L$0 = r7     // Catch:{ all -> 0x0092 }
            r0.L$1 = r6     // Catch:{ all -> 0x0092 }
            r0.L$2 = r8     // Catch:{ all -> 0x0092 }
            r0.label = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r8.mo23863c(r0)     // Catch:{ all -> 0x0092 }
            if (r2 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L_0x0070:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0053 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0053 }
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0053 }
            r0.L$0 = r2     // Catch:{ all -> 0x0053 }
            r0.L$1 = r7     // Catch:{ all -> 0x0053 }
            r0.L$2 = r6     // Catch:{ all -> 0x0053 }
            r0.label = r3     // Catch:{ all -> 0x0053 }
            java.lang.Object r8 = r2.mo23757h0(r8, r0)     // Catch:{ all -> 0x0053 }
            if (r8 != r1) goto L_0x0037
            return r1
        L_0x008b:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0053 }
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            return r2
        L_0x0092:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0096:
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r8 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46460W(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.t, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11532s0
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object m46461X(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, @org.jetbrains.annotations.C12579k C r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
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
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r5 = move-exception
            goto L_0x0078
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch:{ all -> 0x0074 }
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
            r2.add(r7)     // Catch:{ all -> 0x0035 }
            r7 = r2
            goto L_0x004a
        L_0x006d:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            r5 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r5)
            return r2
        L_0x0074:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0078:
            throw r5     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r7 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46461X(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11532s0
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object m46462Y(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r6, @org.jetbrains.annotations.C12579k M r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            goto L_0x0082
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x007e }
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x004a:
            r0.L$0 = r8     // Catch:{ all -> 0x0035 }
            r0.L$1 = r7     // Catch:{ all -> 0x0035 }
            r0.L$2 = r6     // Catch:{ all -> 0x0035 }
            r0.label = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r6.mo23863c(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x005c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x0077
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0035 }
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r8.mo21849e()     // Catch:{ all -> 0x0035 }
            java.lang.Object r8 = r8.mo21851f()     // Catch:{ all -> 0x0035 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0035 }
            r8 = r2
            goto L_0x004a
        L_0x0077:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            return r2
        L_0x007e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0082:
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r8 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46462Y(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        kotlinx.coroutines.channels.C11755m.m46690b(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46464a(kotlinx.coroutines.channels.ReceiveChannel r4, kotlin.coroutines.C11045c r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.C11661u0.m45747n(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch:{ all -> 0x004c }
            r0.L$0 = r4     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = r5.mo23863c(r0)     // Catch:{ all -> 0x004c }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r0)
            return r5
        L_0x004c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46464a(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    @C11532s0
    /* renamed from: b */
    public static final C11300l<Throwable, C11079d2> m46466b(@C12579k ReceiveChannel<?> receiveChannel) {
        return new ChannelsKt__DeprecatedKt$consumes$1(receiveChannel);
    }

    @C12580l
    @C11532s0
    /* renamed from: b0 */
    public static final <E> Object m46467b0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k C11045c<? super Set<E>> cVar) {
        return C11755m.m46699f0(receiveChannel, new LinkedHashSet(), cVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: c */
    public static final C11300l<Throwable, C11079d2> m46468c(@C12579k ReceiveChannel<?>... receiveChannelArr) {
        return new ChannelsKt__DeprecatedKt$consumesAll$1(receiveChannelArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46470d(kotlinx.coroutines.channels.ReceiveChannel r6, kotlin.coroutines.C11045c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r6 = move-exception
            goto L_0x0085
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch:{ all -> 0x0082 }
            r4 = r7
            r7 = r6
            r6 = r2
        L_0x004e:
            r0.L$0 = r4     // Catch:{ all -> 0x007f }
            r0.L$1 = r7     // Catch:{ all -> 0x007f }
            r0.L$2 = r6     // Catch:{ all -> 0x007f }
            r0.label = r3     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = r6.mo23863c(r0)     // Catch:{ all -> 0x007f }
            if (r2 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r5 = r2
            r2 = r7
            r7 = r5
        L_0x0060:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0035 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x0072
            r6.next()     // Catch:{ all -> 0x0035 }
            int r7 = r4.element     // Catch:{ all -> 0x0035 }
            int r7 = r7 + r3
            r4.element = r7     // Catch:{ all -> 0x0035 }
            r7 = r2
            goto L_0x004e
        L_0x0072:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r6)
            int r6 = r4.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            return r6
        L_0x007f:
            r6 = move-exception
            r2 = r7
            goto L_0x0085
        L_0x0082:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x0085:
            throw r6     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r7 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46470d(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e0 */
    public static /* synthetic */ ReceiveChannel m46473e0(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, (C11045c<? super ChannelsKt__DeprecatedKt$withIndex$1>) null), 6, (Object) null);
    }

    @C12579k
    @C11532s0
    /* renamed from: f */
    public static final <E, K> ReceiveChannel<E> m46474f(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super K>, ? extends Object> pVar) {
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$distinctBy$1>) null), 6, (Object) null);
    }

    /* renamed from: g */
    public static /* synthetic */ ReceiveChannel m46476g(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46708k(receiveChannel, coroutineContext, pVar);
    }

    @C12579k
    @C11532s0
    /* renamed from: g0 */
    public static final <E, R, V> ReceiveChannel<V> m46477g0(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k ReceiveChannel<? extends R> receiveChannel2, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super R, ? extends V> pVar) {
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46702h(receiveChannel, receiveChannel2), new ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$zip$2>) null), 6, (Object) null);
    }

    /* renamed from: h0 */
    public static /* synthetic */ ReceiveChannel m46479h0(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46721q0(receiveChannel, receiveChannel2, coroutineContext, pVar);
    }

    /* renamed from: i */
    public static /* synthetic */ ReceiveChannel m46480i(ReceiveChannel receiveChannel, int i, CoroutineContext coroutineContext, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$drop$1(i, receiveChannel, (C11045c<? super ChannelsKt__DeprecatedKt$drop$1>) null), 6, (Object) null);
    }

    /* renamed from: k */
    public static /* synthetic */ ReceiveChannel m46482k(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$dropWhile$1>) null), 6, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46483l(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, kotlin.coroutines.C11045c r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.C11661u0.m45747n(r11)     // Catch:{ all -> 0x0039 }
            goto L_0x0064
        L_0x0039:
            r9 = move-exception
            goto L_0x00b1
        L_0x003c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0044:
            kotlin.C11661u0.m45747n(r11)
            if (r10 < 0) goto L_0x0099
            kotlinx.coroutines.channels.ChannelIterator r11 = r9.iterator()     // Catch:{ all -> 0x0095 }
            r2 = 0
        L_0x004e:
            r0.L$0 = r9     // Catch:{ all -> 0x0095 }
            r0.L$1 = r11     // Catch:{ all -> 0x0095 }
            r0.I$0 = r10     // Catch:{ all -> 0x0095 }
            r0.I$1 = r2     // Catch:{ all -> 0x0095 }
            r0.label = r5     // Catch:{ all -> 0x0095 }
            java.lang.Object r6 = r11.mo23863c(r0)     // Catch:{ all -> 0x0095 }
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L_0x0064:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0039 }
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x007d
            java.lang.Object r11 = r2.next()     // Catch:{ all -> 0x0039 }
            int r7 = r9 + 1
            if (r10 != r9) goto L_0x0079
            r9 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r9)
            return r11
        L_0x0079:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L_0x004e
        L_0x007d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r11.<init>()     // Catch:{ all -> 0x0039 }
            r11.append(r4)     // Catch:{ all -> 0x0039 }
            r11.append(r10)     // Catch:{ all -> 0x0039 }
            r11.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0039 }
            r9.<init>(r10)     // Catch:{ all -> 0x0039 }
            throw r9     // Catch:{ all -> 0x0039 }
        L_0x0095:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto L_0x00b1
        L_0x0099:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0095 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r0.<init>()     // Catch:{ all -> 0x0095 }
            r0.append(r4)     // Catch:{ all -> 0x0095 }
            r0.append(r10)     // Catch:{ all -> 0x0095 }
            r0.append(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0095 }
            r11.<init>(r10)     // Catch:{ all -> 0x0095 }
            throw r11     // Catch:{ all -> 0x0095 }
        L_0x00b1:
            throw r9     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r10 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46483l(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072 A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46484m(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, kotlin.coroutines.C11045c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x003c }
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r1
            r1 = r0
            r0 = r7
            goto L_0x006a
        L_0x003c:
            r8 = move-exception
            goto L_0x008a
        L_0x003e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0046:
            kotlin.C11661u0.m45747n(r10)
            if (r9 >= 0) goto L_0x004f
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r4)
            return r4
        L_0x004f:
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch:{ all -> 0x0087 }
            r2 = 0
        L_0x0054:
            r0.L$0 = r8     // Catch:{ all -> 0x0087 }
            r0.L$1 = r10     // Catch:{ all -> 0x0087 }
            r0.I$0 = r9     // Catch:{ all -> 0x0087 }
            r0.I$1 = r2     // Catch:{ all -> 0x0087 }
            r0.label = r3     // Catch:{ all -> 0x0087 }
            java.lang.Object r5 = r10.mo23863c(r0)     // Catch:{ all -> 0x0087 }
            if (r5 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r7
        L_0x006a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0087 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r10 == 0) goto L_0x0083
            java.lang.Object r10 = r0.next()     // Catch:{ all -> 0x0087 }
            int r6 = r2 + 1
            if (r9 != r2) goto L_0x007e
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r4)
            return r10
        L_0x007e:
            r10 = r0
            r0 = r1
            r1 = r5
            r2 = r6
            goto L_0x0054
        L_0x0083:
            kotlinx.coroutines.channels.C11755m.m46690b(r8, r4)
            return r4
        L_0x0087:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L_0x008a:
            throw r8     // Catch:{ all -> 0x008b }
        L_0x008b:
            r9 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46484m(kotlinx.coroutines.channels.ReceiveChannel, int, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    @C11532s0
    /* renamed from: n */
    public static final <E> ReceiveChannel<E> m46485n(@C12579k ReceiveChannel<? extends E> receiveChannel, @C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super E, ? super C11045c<? super Boolean>, ? extends Object> pVar) {
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$filter$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$filter$1>) null), 6, (Object) null);
    }

    /* renamed from: o */
    public static /* synthetic */ ReceiveChannel m46486o(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46724s(receiveChannel, coroutineContext, pVar);
    }

    /* renamed from: q */
    public static /* synthetic */ ReceiveChannel m46488q(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11305q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, qVar, (C11045c<? super ChannelsKt__DeprecatedKt$filterIndexed$1>) null), 6, (Object) null);
    }

    /* renamed from: s */
    public static /* synthetic */ ReceiveChannel m46490s(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return C11755m.m46724s(receiveChannel, coroutineContext, new ChannelsKt__DeprecatedKt$filterNot$1(pVar, (C11045c<? super ChannelsKt__DeprecatedKt$filterNot$1>) null));
    }

    @C12579k
    @C11532s0
    /* renamed from: t */
    public static final <E> ReceiveChannel<E> m46491t(@C12579k ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> t = m46486o(receiveChannel, (CoroutineContext) null, new ChannelsKt__DeprecatedKt$filterNotNull$1((C11045c<? super ChannelsKt__DeprecatedKt$filterNotNull$1>) null), 1, (Object) null);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46492u(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, kotlin.coroutines.C11045c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
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
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r5 = move-exception
            goto L_0x007a
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch:{ all -> 0x0076 }
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
            if (r7 == 0) goto L_0x006f
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x006d
            r2.add(r7)     // Catch:{ all -> 0x0035 }
        L_0x006d:
            r7 = r2
            goto L_0x004a
        L_0x006f:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0035 }
            r5 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r5)
            return r2
        L_0x0076:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x007a:
            throw r5     // Catch:{ all -> 0x007b }
        L_0x007b:
            r7 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46492u(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075 A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[Catch:{ all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46493v(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.C11763t r7, kotlin.coroutines.C11045c r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.t r2 = (kotlinx.coroutines.channels.C11763t) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x008a
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.t r2 = (kotlinx.coroutines.channels.C11763t) r2
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x006d
        L_0x0050:
            r6 = move-exception
            goto L_0x0099
        L_0x0052:
            kotlin.C11661u0.m45747n(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch:{ all -> 0x0095 }
        L_0x0059:
            r0.L$0 = r7     // Catch:{ all -> 0x0095 }
            r0.L$1 = r6     // Catch:{ all -> 0x0095 }
            r0.L$2 = r8     // Catch:{ all -> 0x0095 }
            r0.label = r4     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r8.mo23863c(r0)     // Catch:{ all -> 0x0095 }
            if (r2 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L_0x006d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0050 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r8 == 0) goto L_0x008e
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0050 }
            if (r8 == 0) goto L_0x008a
            r0.L$0 = r2     // Catch:{ all -> 0x0050 }
            r0.L$1 = r7     // Catch:{ all -> 0x0050 }
            r0.L$2 = r6     // Catch:{ all -> 0x0050 }
            r0.label = r3     // Catch:{ all -> 0x0050 }
            java.lang.Object r8 = r2.mo23757h0(r8, r0)     // Catch:{ all -> 0x0050 }
            if (r8 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L_0x0059
        L_0x008e:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0050 }
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            return r2
        L_0x0095:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0099:
            throw r6     // Catch:{ all -> 0x009a }
        L_0x009a:
            r8 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46493v(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.t, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[SYNTHETIC, Splitter:B:27:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46494w(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.C11045c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0053
        L_0x0031:
            r5 = move-exception
            goto L_0x006f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch:{ all -> 0x006c }
            r0.L$0 = r5     // Catch:{ all -> 0x006c }
            r0.L$1 = r6     // Catch:{ all -> 0x006c }
            r0.label = r3     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r6.mo23863c(r0)     // Catch:{ all -> 0x006c }
            if (r0 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x0053:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0064
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x0031 }
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r6)
            return r5
        L_0x0064:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch:{ all -> 0x0031 }
            throw r5     // Catch:{ all -> 0x0031 }
        L_0x006c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x006f:
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r6 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46494w(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC, Splitter:B:27:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.C11395k(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m46495x(kotlinx.coroutines.channels.ReceiveChannel r5, kotlin.coroutines.C11045c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0053
        L_0x0031:
            r5 = move-exception
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch:{ all -> 0x0068 }
            r0.L$0 = r5     // Catch:{ all -> 0x0068 }
            r0.L$1 = r6     // Catch:{ all -> 0x0068 }
            r0.label = r3     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r6.mo23863c(r0)     // Catch:{ all -> 0x0068 }
            if (r0 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x0053:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r6 != 0) goto L_0x0060
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r1)
            return r1
        L_0x0060:
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x0031 }
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r1)
            return r5
        L_0x0068:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x006b:
            throw r5     // Catch:{ all -> 0x006c }
        L_0x006c:
            r6 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.m46495x(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: z */
    public static /* synthetic */ ReceiveChannel m46497z(ReceiveChannel receiveChannel, CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C11768d1.m46785g();
        }
        return ProduceKt.m46531g(C12156u1.f29939a, coroutineContext, 0, (CoroutineStart) null, C11755m.m46700g(receiveChannel), new ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, pVar, (C11045c<? super ChannelsKt__DeprecatedKt$flatMap$1>) null), 6, (Object) null);
    }
}
