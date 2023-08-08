package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.channels.C11760r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", mo22502f = "Delay.kt", mo22503i = {0, 1, 2}, mo22504l = {313, 315, 316}, mo22505m = "invokeSuspend", mo22506n = {"$this$produce", "$this$produce", "$this$produce"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements C11304p<C11760r<? super C11079d2>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ long $initialDelayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$3(long j, long j2, C11045c<? super FlowKt__DelayKt$fixedPeriodTicker$3> cVar) {
        super(2, cVar);
        this.$initialDelayMillis = j;
        this.$delayMillis = j2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.$initialDelayMillis, this.$delayMillis, cVar);
        flowKt__DelayKt$fixedPeriodTicker$3.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super C11079d2> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$3) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.channels.r} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0011
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
        L_0x0011:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.C11760r) r1
            kotlin.C11661u0.m45747n(r8)
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.C11760r) r1
            kotlin.C11661u0.m45747n(r8)
            r8 = r7
            goto L_0x0051
        L_0x002a:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.C11760r) r1
            long r5 = r7.$initialDelayMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m45925b(r5, r7)
            if (r8 != r0) goto L_0x003f
            return r0
        L_0x003f:
            r8 = r7
        L_0x0040:
            kotlinx.coroutines.channels.t r4 = r1.mo23914g()
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r4.mo23757h0(r5, r8)
            if (r4 != r0) goto L_0x0051
            return r0
        L_0x0051:
            long r4 = r8.$delayMillis
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m45925b(r4, r8)
            if (r4 != r0) goto L_0x0040
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
