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
import kotlinx.coroutines.flow.internal.C11936l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", mo22502f = "Delay.kt", mo22503i = {0}, mo22504l = {242}, mo22505m = "invokeSuspend", mo22506n = {"$this$onFailure_u2dWpGqRn0$iv"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/channels/j;", "", "value", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,405:1\n514#2,6:406\n530#2,4:412\n534#2:418\n1#3:416\n18#4:417\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n238#1:406,6\n239#1:412,4\n239#1:418\n242#1:417\n*E\n"})
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements C11304p<C11749j<? extends Object>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11908f<T> $downstream;
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, C11908f<? super T> fVar, C11045c<? super FlowKt__DelayKt$debounceInternal$1$3$2> cVar) {
        super(2, cVar);
        this.$lastValue = objectRef;
        this.$downstream = fVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, cVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo24091g(@C12579k Object obj, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C11749j.m46631b(obj), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24091g(((C11749j) obj).mo23920o(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            T o = ((C11749j) this.L$0).mo23920o();
            objectRef = this.$lastValue;
            boolean z = o instanceof C11749j.C11752c;
            if (!z) {
                objectRef.element = o;
            }
            C11908f<T> fVar = this.$downstream;
            if (z) {
                Throwable f = C11749j.m46635f(o);
                if (f == null) {
                    T t = objectRef.element;
                    if (t != null) {
                        if (t == C11936l.f29516a) {
                            t = null;
                        }
                        this.L$0 = o;
                        this.L$1 = objectRef;
                        this.label = 1;
                        if (fVar.emit(t, this) == h) {
                            return h;
                        }
                        objectRef2 = objectRef;
                    }
                    objectRef.element = C11936l.f29518c;
                } else {
                    throw f;
                }
            }
            return C11079d2.f28267a;
        } else if (i == 1) {
            objectRef2 = (Ref.ObjectRef) this.L$1;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = objectRef2;
        objectRef.element = C11936l.f29518c;
        return C11079d2.f28267a;
    }
}
