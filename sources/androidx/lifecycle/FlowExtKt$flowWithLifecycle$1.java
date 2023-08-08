package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", mo22502f = "FlowExt.kt", mo22503i = {0}, mo22504l = {91}, mo22505m = "invokeSuspend", mo22506n = {"$this$callbackFlow"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/channels/r;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements C11304p<C11760r<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ C11907e<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", mo22502f = "FlowExt.kt", mo22503i = {}, mo22504l = {92}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    public static final class C193651 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        public static final class C19366a<T> implements C11908f {

            /* renamed from: a */
            public final /* synthetic */ C11760r<T> f49679a;

            public C19366a(C11760r<? super T> rVar) {
                this.f49679a = rVar;
            }

            @C12580l
            public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
                Object h0 = this.f49679a.mo23757h0(t, cVar);
                return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
            }
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C193651(eVar, rVar2, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<T> eVar = eVar;
                C19366a aVar = new C19366a(rVar2);
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

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C193651) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, C11907e<? extends T> eVar, C11045c<? super FlowExtKt$flowWithLifecycle$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = eVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, cVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super T> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11760r rVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C11760r rVar2 = (C11760r) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final C11907e<T> eVar = this.$this_flowWithLifecycle;
            C193651 r5 = new C193651((C11045c<? super C193651>) null);
            this.L$0 = rVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.m90581a(lifecycle, state, r5, this) == h) {
                return h;
            }
            rVar = rVar2;
        } else if (i == 1) {
            rVar = (C11760r) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11763t.C11764a.m46772a(rVar, (Throwable) null, 1, (Object) null);
        return C11079d2.f28267a;
    }
}
