package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.channels.C11749j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", mo22502f = "Delay.kt", mo22503i = {0}, mo22504l = {394}, mo22505m = "invokeSuspend", mo22506n = {"$this$onSuccess_u2dWpGqRn0$iv"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/channels/j;", "value", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,405:1\n514#2,6:406\n548#2,5:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n393#1:406,6\n395#1:412,5\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements C11304p<C11749j<? extends T>, C11045c<? super Boolean>, Object> {
    final /* synthetic */ C11908f<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(C11908f<? super T> fVar, C11045c<? super FlowKt__DelayKt$timeoutInternal$1$1$1> cVar) {
        super(2, cVar);
        this.$downStream = fVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, cVar);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo24099g(@C12579k Object obj, @C12580l C11045c<? super Boolean> cVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(C11749j.m46631b(obj), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24099g(((C11749j) obj).mo23920o(), (C11045c) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r4.L$0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0036
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0019:
            kotlin.C11661u0.m45747n(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.C11749j) r5
            java.lang.Object r5 = r5.mo23920o()
            kotlinx.coroutines.flow.f<T> r1 = r4.$downStream
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.C11749j.C11752c
            if (r3 != 0) goto L_0x0037
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.emit(r5, r4)
            if (r1 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r0 = r5
        L_0x0036:
            r5 = r0
        L_0x0037:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C11749j.C11750a
            if (r0 == 0) goto L_0x0045
            kotlinx.coroutines.channels.C11749j.m46635f(r5)
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r5
        L_0x0045:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
