package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", mo22502f = "TransformableState.kt", mo22503i = {}, mo22504l = {249}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DefaultTransformableState$transform$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C2209p, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", mo22502f = "TransformableState.kt", mo22503i = {}, mo22504l = {252}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/p;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1 */
    public static final class C21391 extends SuspendLambda implements C11304p<C2209p, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21391 r0 = new C21391(defaultTransformableState, pVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C2209p pVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C21391) create(pVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C2209p pVar = (C2209p) this.L$0;
                defaultTransformableState.f5857d.setValue(C11064a.m42615a(true));
                C11304p<C2209p, C11045c<? super C11079d2>, Object> pVar2 = pVar;
                this.label = 1;
                if (pVar2.invoke(pVar, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                try {
                    C11661u0.m45747n(obj);
                } catch (Throwable th) {
                    defaultTransformableState.f5857d.setValue(C11064a.m42615a(false));
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultTransformableState.f5857d.setValue(C11064a.m42615a(false));
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, C11304p<? super C2209p, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super DefaultTransformableState$transform$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            MutatorMutex d = this.this$0.f5856c;
            C2209p e = this.this$0.f5855b;
            MutatePriority mutatePriority = this.$transformPriority;
            final DefaultTransformableState defaultTransformableState = this.this$0;
            final C11304p<C2209p, C11045c<? super C11079d2>, Object> pVar = this.$block;
            C21391 r4 = new C21391((C11045c<? super C21391>) null);
            this.label = 1;
            if (d.mo7230f(e, mutatePriority, r4, this) == h) {
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
        return ((DefaultTransformableState$transform$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
