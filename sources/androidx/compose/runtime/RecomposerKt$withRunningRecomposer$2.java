package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", mo22502f = "Recomposer.kt", mo22503i = {0}, mo22504l = {68, 70}, mo22505m = "invokeSuspend", mo22506n = {"recomposer"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"R", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RecomposerKt$withRunningRecomposer$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super R>, Object> {
    final /* synthetic */ C11305q<C12074o0, Recomposer, C11045c<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", mo22502f = "Recomposer.kt", mo22503i = {}, mo22504l = {67}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"R", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1 */
    public static final class C83971 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C83971(recomposer, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                Recomposer recomposer = recomposer;
                this.label = 1;
                if (recomposer.mo15236M0(this) == h) {
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
            return ((C83971) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(C11305q<? super C12074o0, ? super Recomposer, ? super C11045c<? super R>, ? extends Object> qVar, C11045c<? super RecomposerKt$withRunningRecomposer$2> cVar) {
        super(2, cVar);
        this.$block = qVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, cVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        final Recomposer recomposer;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            recomposer = new Recomposer(o0Var.getCoroutineContext());
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C83971((C11045c<? super C83971>) null), 3, (Object) null);
            C11305q<C12074o0, Recomposer, C11045c<? super R>, Object> qVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = qVar.invoke(o0Var, recomposer, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            recomposer = (Recomposer) this.L$0;
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C11661u0.m45747n(obj);
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        recomposer.mo15244k0();
        this.L$0 = obj;
        this.label = 2;
        if (recomposer.mo15256x0(this) == h) {
            return h;
        }
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super R> cVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
