package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.C11936l;
import kotlinx.coroutines.selects.SelectImplementation;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", mo22502f = "Delay.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {413}, mo22505m = "invokeSuspend", mo22506n = {"downstream", "values", "lastValue", "ticker"}, mo22507s = {"L$0", "L$1", "L$2", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/flow/f;", "downstream", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,405:1\n55#2,8:406\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n284#1:406,8\n*E\n"})
public final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements C11305q<C12074o0, C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ C11907e<T> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, C11907e<? extends T> eVar, C11045c<? super FlowKt__DelayKt$sample$2> cVar) {
        super(3, cVar);
        this.$periodMillis = j;
        this.$this_sample = eVar;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C12074o0 o0Var, @C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, cVar);
        flowKt__DelayKt$sample$2.L$0 = o0Var;
        flowKt__DelayKt$sample$2.L$1 = fVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11908f fVar;
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        ReceiveChannel receiveChannel2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, (C11045c<? super FlowKt__DelayKt$sample$2$values$1>) null);
            C12074o0 o0Var = (C12074o0) this.L$0;
            ReceiveChannel f = ProduceKt.m46530f(o0Var, (CoroutineContext) null, -1, flowKt__DelayKt$sample$2$values$1, 1, (Object) null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ReceiveChannel z0 = FlowKt__DelayKt.m47030g(o0Var, this.$periodMillis, 0, 2, (Object) null);
            fVar = (C11908f) this.L$1;
            receiveChannel = f;
            objectRef = objectRef2;
            receiveChannel2 = z0;
        } else if (i == 1) {
            receiveChannel2 = (ReceiveChannel) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            fVar = (C11908f) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (objectRef.element != C11936l.f29518c) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.mo24712i(receiveChannel.mo23807U(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannel2, (C11045c<? super FlowKt__DelayKt$sample$2$1$1>) null));
            selectImplementation.mo24712i(receiveChannel2.mo23805T(), new FlowKt__DelayKt$sample$2$1$2(objectRef, fVar, (C11045c<? super FlowKt__DelayKt$sample$2$1$2>) null));
            this.L$0 = fVar;
            this.L$1 = receiveChannel;
            this.L$2 = objectRef;
            this.L$3 = receiveChannel2;
            this.label = 1;
            if (selectImplementation.mo24716w(this) == h) {
                return h;
            }
        }
        return C11079d2.f28267a;
    }
}
