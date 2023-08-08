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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.base.BaseMVIViewModel$uiState$2", mo22502f = "BaseMVIViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/base/u$d;", "S", "Lcom/carrefour/fid/android/shared/base/u$b;", "I", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BaseMVIViewModel$uiState$2 extends SuspendLambda implements C11304p<S, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseMVIViewModel<S, I> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMVIViewModel$uiState$2(BaseMVIViewModel<S, I> baseMVIViewModel, C11045c<? super BaseMVIViewModel$uiState$2> cVar) {
        super(2, cVar);
        this.this$0 = baseMVIViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        BaseMVIViewModel$uiState$2 baseMVIViewModel$uiState$2 = new BaseMVIViewModel$uiState$2(this.this$0, cVar);
        baseMVIViewModel$uiState$2.L$0 = obj;
        return baseMVIViewModel$uiState$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k S s, @C12580l C11045c<? super C11079d2> cVar) {
        return ((BaseMVIViewModel$uiState$2) create(s, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            BaseMVIViewModel<S, I> baseMVIViewModel = this.this$0;
            int unused = baseMVIViewModel.mo83332c0("state consumed: " + ((C28505u.C28509d) this.L$0));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
