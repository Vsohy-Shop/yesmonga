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
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo22502f = "PausingDispatcher.kt", mo22503i = {0}, mo22504l = {203}, mo22505m = "invokeSuspend", mo22506n = {"controller"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super T>, Object> {
    final /* synthetic */ C11304p<C12074o0, C11045c<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, C11045c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C19462r rVar;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11723c2 c2Var = (C11723c2) ((C12074o0) this.L$0).getCoroutineContext().mo7444b(C11723c2.f29067w0);
            if (c2Var != null) {
                C19430j0 j0Var = new C19430j0();
                C19462r rVar2 = new C19462r(this.$this_whenStateAtLeast, this.$minState, j0Var.f49808c, c2Var);
                try {
                    C11304p<C12074o0, C11045c<? super T>, Object> pVar = this.$block;
                    this.L$0 = rVar2;
                    this.label = 1;
                    obj = C11965h.m47673h(j0Var, pVar, this);
                    if (obj == h) {
                        return h;
                    }
                    rVar = rVar2;
                } catch (Throwable th) {
                    th = th;
                    rVar = rVar2;
                    rVar.mo57662b();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            rVar = (C19462r) this.L$0;
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rVar.mo57662b();
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super T> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
