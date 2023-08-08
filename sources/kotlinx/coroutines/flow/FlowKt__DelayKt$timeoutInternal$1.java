package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", mo22502f = "Delay.kt", mo22503i = {0, 0}, mo22504l = {414}, mo22505m = "invokeSuspend", mo22506n = {"downStream", "values"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/flow/f;", "downStream", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n31#2:406\n32#2:415\n55#3,8:407\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n391#1:406\n391#1:415\n391#1:407,8\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements C11305q<C12074o0, C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1(long j, C11907e<? extends T> eVar, C11045c<? super FlowKt__DelayKt$timeoutInternal$1> cVar) {
        super(3, cVar);
        this.$timeout = j;
        this.$this_timeoutInternal = eVar;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C12074o0 o0Var, @C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, cVar);
        flowKt__DelayKt$timeoutInternal$1.L$0 = o0Var;
        flowKt__DelayKt$timeoutInternal$1.L$1 = fVar;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            long r4 = r11.J$0
            java.lang.Object r1 = r11.L$1
            kotlinx.coroutines.channels.ReceiveChannel r1 = (kotlinx.coroutines.channels.ReceiveChannel) r1
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.C11908f) r6
            kotlin.C11661u0.m45747n(r12)
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r11
            goto L_0x0084
        L_0x001f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0027:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.o0 r12 = (kotlinx.coroutines.C12074o0) r12
            java.lang.Object r1 = r11.L$1
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            long r4 = r11.$timeout
            kotlin.time.e$a r6 = kotlin.time.C11636e.f28954b
            long r6 = r6.mo23447W()
            int r4 = kotlin.time.C11636e.m45457Q(r4, r6)
            if (r4 <= 0) goto L_0x0095
            kotlinx.coroutines.flow.e<T> r4 = r11.$this_timeoutInternal
            r5 = 0
            r6 = 2
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C11910h.m47515d(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.ReceiveChannel r12 = kotlinx.coroutines.flow.C11909g.m47478o1(r4, r12)
            long r4 = r11.$timeout
            r6 = r1
            r1 = r12
            r12 = r11
        L_0x0051:
            kotlinx.coroutines.selects.SelectImplementation r7 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r8 = r12.getContext()
            r7.<init>(r8)
            kotlinx.coroutines.selects.e r8 = r1.mo23807U()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r9 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r9.<init>(r6, r3)
            r7.mo24712i(r8, r9)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r8.<init>(r4, r3)
            kotlinx.coroutines.selects.C12121a.m48522b(r7, r4, r8)
            r12.L$0 = r6
            r12.L$1 = r1
            r12.J$0 = r4
            r12.label = r2
            java.lang.Object r7 = r7.mo24716w(r12)
            if (r7 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r5 = r4
            r4 = r1
            r1 = r10
        L_0x0084:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x008f
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x008f:
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r6 = r7
            goto L_0x0051
        L_0x0095:
            kotlinx.coroutines.TimeoutCancellationException r12 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
