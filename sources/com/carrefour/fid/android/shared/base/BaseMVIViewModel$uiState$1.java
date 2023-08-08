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
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.base.BaseMVIViewModel$uiState$1", mo22502f = "BaseMVIViewModel.kt", mo22503i = {}, mo22504l = {137}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0004H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BaseMVIViewModel$uiState$1 extends SuspendLambda implements C11304p<C11908f<? super S>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseMVIViewModel<S, I> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMVIViewModel$uiState$1(BaseMVIViewModel<S, I> baseMVIViewModel, C11045c<? super BaseMVIViewModel$uiState$1> cVar) {
        super(2, cVar);
        this.this$0 = baseMVIViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BaseMVIViewModel$uiState$1 baseMVIViewModel$uiState$1 = new BaseMVIViewModel$uiState$1(this.this$0, cVar);
        baseMVIViewModel$uiState$1.L$0 = obj;
        return baseMVIViewModel$uiState$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super S> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseMVIViewModel$uiState$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C28505u.C28509d access$getFirstModel$p = this.this$0.firstModel;
            this.label = 1;
            if (((C11908f) this.L$0).emit(access$getFirstModel$p, this) == h) {
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
