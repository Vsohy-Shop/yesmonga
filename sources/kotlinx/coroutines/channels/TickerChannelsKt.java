package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12092r2;
import kotlinx.coroutines.C12156u1;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class TickerChannelsKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.channels.t<? super kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m46555c(long r6, long r8, kotlinx.coroutines.channels.C11763t<? super kotlin.C11079d2> r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.C11763t) r8
            kotlin.C11661u0.m45747n(r11)
        L_0x0034:
            r10 = r8
            goto L_0x0063
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.t r8 = (kotlinx.coroutines.channels.C11763t) r8
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0073
        L_0x0048:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.t r10 = (kotlinx.coroutines.channels.C11763t) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0063
        L_0x0053:
            kotlin.C11661u0.m45747n(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m45925b(r8, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.mo23757h0(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r10
        L_0x0073:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m45925b(r6, r0)
            if (r9 != r1) goto L_0x0034
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m46555c(long, long, kotlinx.coroutines.channels.t, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m46556d(long r18, long r20, kotlinx.coroutines.channels.C11763t<? super kotlin.C11079d2> r22, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r1 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r1.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0079
            if (r3 == r7) goto L_0x006b
            if (r3 == r6) goto L_0x005f
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.t r3 = (kotlinx.coroutines.channels.C11763t) r3
            kotlin.C11661u0.m45747n(r0)
            r11 = r4
            r0 = r5
        L_0x003d:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x0115
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.t r3 = (kotlinx.coroutines.channels.C11763t) r3
            kotlin.C11661u0.m45747n(r0)
            r0 = r5
        L_0x0058:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x00fc
        L_0x005f:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.t r3 = (kotlinx.coroutines.channels.C11763t) r3
            kotlin.C11661u0.m45747n(r0)
            goto L_0x00c2
        L_0x006b:
            long r7 = r1.J$1
            long r9 = r1.J$0
            java.lang.Object r3 = r1.L$0
            kotlinx.coroutines.channels.t r3 = (kotlinx.coroutines.channels.C11763t) r3
            kotlin.C11661u0.m45747n(r0)
            r0 = r3
            r10 = r9
            goto L_0x00a6
        L_0x0079:
            kotlin.C11661u0.m45747n(r0)
            kotlinx.coroutines.b r0 = kotlinx.coroutines.C11720c.m46159b()
            if (r0 == 0) goto L_0x0087
            long r8 = r0.mo23725b()
            goto L_0x008b
        L_0x0087:
            long r8 = java.lang.System.nanoTime()
        L_0x008b:
            long r10 = kotlinx.coroutines.C12075o1.m48189d(r20)
            long r8 = r8 + r10
            r0 = r22
            r1.L$0 = r0
            r10 = r18
            r1.J$0 = r10
            r1.J$1 = r8
            r1.label = r7
            r12 = r20
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.m45925b(r12, r1)
            if (r3 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r7 = r8
        L_0x00a6:
            long r9 = kotlinx.coroutines.C12075o1.m48189d(r10)
        L_0x00aa:
            long r7 = r7 + r9
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            r1.L$0 = r0
            r1.J$0 = r7
            r1.J$1 = r9
            r1.label = r6
            java.lang.Object r3 = r0.mo23757h0(r3, r1)
            if (r3 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            r3 = r0
            r16 = r7
            r7 = r9
            r9 = r16
        L_0x00c2:
            kotlinx.coroutines.b r0 = kotlinx.coroutines.C11720c.m46159b()
            if (r0 == 0) goto L_0x00cd
            long r11 = r0.mo23725b()
            goto L_0x00d1
        L_0x00cd:
            long r11 = java.lang.System.nanoTime()
        L_0x00d1:
            long r13 = r9 - r11
            r4 = 0
            long r13 = kotlin.ranges.C11479u.m44450v(r13, r4)
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0100
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0100
            long r4 = r11 - r9
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r9 = r11 + r4
            long r4 = kotlinx.coroutines.C12075o1.m48188c(r4)
            r1.L$0 = r3
            r1.J$0 = r9
            r1.J$1 = r7
            r0 = 3
            r1.label = r0
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m45925b(r4, r1)
            if (r4 != r2) goto L_0x0058
            return r2
        L_0x00fc:
            r5 = r0
            r0 = r3
            r4 = 4
            goto L_0x00aa
        L_0x0100:
            r0 = 3
            long r4 = kotlinx.coroutines.C12075o1.m48188c(r13)
            r1.L$0 = r3
            r1.J$0 = r9
            r1.J$1 = r7
            r11 = 4
            r1.label = r11
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m45925b(r4, r1)
            if (r4 != r2) goto L_0x003d
            return r2
        L_0x0115:
            r5 = r0
            r0 = r3
            r4 = r11
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.m46556d(long, long, kotlinx.coroutines.channels.t, kotlin.coroutines.c):java.lang.Object");
    }

    @C12092r2
    @C12579k
    /* renamed from: e */
    public static final ReceiveChannel<C11079d2> m46557e(long j, long j2, @C12579k CoroutineContext coroutineContext, @C12579k TickerMode tickerMode) {
        boolean z;
        long j3 = j2;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j3 < 0) {
                z2 = false;
            }
            if (z2) {
                CoroutineContext coroutineContext2 = coroutineContext;
                return ProduceKt.m46527c(C12156u1.f29939a, C11768d1.m46785g().mo7443Q(coroutineContext), 0, new TickerChannelsKt$ticker$3(tickerMode, j, j2, (C11045c<? super TickerChannelsKt$ticker$3>) null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    /* renamed from: f */
    public static /* synthetic */ ReceiveChannel m46558f(long j, long j2, CoroutineContext coroutineContext, TickerMode tickerMode, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        if ((i & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return m46557e(j, j2, coroutineContext, tickerMode);
    }
}
