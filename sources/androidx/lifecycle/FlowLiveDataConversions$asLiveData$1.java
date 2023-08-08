package androidx.lifecycle;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", mo22502f = "FlowLiveData.kt", mo22503i = {}, mo22504l = {80}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Landroidx/lifecycle/d0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements C11304p<C19403d0<T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11907e<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$a */
    public static final class C19370a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ C19403d0<T> f49680a;

        public C19370a(C19403d0<T> d0Var) {
            this.f49680a = d0Var;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            Object emit = this.f49680a.emit(t, cVar);
            return emit == C11063b.m42612h() ? emit : C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(C11907e<? extends T> eVar, C11045c<? super FlowLiveDataConversions$asLiveData$1> cVar) {
        super(2, cVar);
        this.$this_asLiveData = eVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, cVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C19403d0<T> d0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(d0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e<T> eVar = this.$this_asLiveData;
            C19370a aVar = new C19370a((C19403d0) this.L$0);
            this.label = 1;
            if (eVar.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
