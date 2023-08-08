package com.carrefour.fid.android.shared.base;

import com.carrefour.fid.android.shared.base.C28505u;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.base.BaseMVIViewModel$emitEvent$1", mo22502f = "BaseMVIViewModel.kt", mo22503i = {}, mo22504l = {172}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BaseMVIViewModel$emitEvent$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C28505u.C28506a $event;
    int label;
    final /* synthetic */ BaseMVIViewModel<S, I> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMVIViewModel$emitEvent$1(BaseMVIViewModel<S, I> baseMVIViewModel, C28505u.C28506a aVar, C11045c<? super BaseMVIViewModel$emitEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = baseMVIViewModel;
        this.$event = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new BaseMVIViewModel$emitEvent$1(this.this$0, this.$event, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11911i access$get_uiEvent$p = this.this$0._uiEvent;
            C28505u.C28506a aVar = this.$event;
            this.label = 1;
            if (access$get_uiEvent$p.emit(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        BaseMVIViewModel<S, I> baseMVIViewModel = this.this$0;
        C28505u.C28506a aVar2 = this.$event;
        int unused = baseMVIViewModel.mo83332c0("event emitted: " + aVar2);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseMVIViewModel$emitEvent$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
