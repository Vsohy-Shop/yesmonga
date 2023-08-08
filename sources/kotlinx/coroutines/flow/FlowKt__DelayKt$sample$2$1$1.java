package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.C11749j;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.C11936l;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", mo22502f = "Delay.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/channels/j;", "", "result", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,405:1\n514#2,6:406\n530#2,4:412\n534#2:417\n1#3:416\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n287#1:406,6\n288#1:412,4\n288#1:417\n*E\n"})
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements C11304p<C11749j<? extends Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<C11079d2> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> objectRef, ReceiveChannel<C11079d2> receiveChannel, C11045c<? super FlowKt__DelayKt$sample$2$1$1> cVar) {
        super(2, cVar);
        this.$lastValue = objectRef;
        this.$ticker = receiveChannel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, cVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo24095g(@C12579k Object obj, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(C11749j.m46631b(obj), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24095g(((C11749j) obj).mo23920o(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            T o = ((C11749j) this.L$0).mo23920o();
            Ref.ObjectRef<Object> objectRef = this.$lastValue;
            boolean z = o instanceof C11749j.C11752c;
            if (!z) {
                objectRef.element = o;
            }
            ReceiveChannel<C11079d2> receiveChannel = this.$ticker;
            if (z) {
                Throwable f = C11749j.m46635f(o);
                if (f == null) {
                    receiveChannel.mo23819a(new ChildCancelledException());
                    objectRef.element = C11936l.f29518c;
                } else {
                    throw f;
                }
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
