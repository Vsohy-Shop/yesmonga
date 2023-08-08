package com.carrefour.fid.android.presentation.viewmodels.account.list.memo;

import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel$processIntent$2", mo22502f = "MemoListViewModel.kt", mo22503i = {}, mo22504l = {105, 106, 107, 108, 109, 110, 111}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MemoListViewModel$processIntent$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ MemoListViewModel.C25826e $intent;
    int label;
    final /* synthetic */ MemoListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListViewModel$processIntent$2(MemoListViewModel.C25826e eVar, MemoListViewModel memoListViewModel, C11045c<? super MemoListViewModel$processIntent$2> cVar) {
        super(2, cVar);
        this.$intent = eVar;
        this.this$0 = memoListViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new MemoListViewModel$processIntent$2(this.$intent, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        switch (this.label) {
            case 0:
                C11661u0.m45747n(obj);
                MemoListViewModel.C25826e eVar = this.$intent;
                if (eVar instanceof MemoListViewModel.C25826e.C25830d) {
                    MemoListViewModel memoListViewModel = this.this$0;
                    this.label = 1;
                    if (memoListViewModel.mo74920o0(this) == h) {
                        return h;
                    }
                } else if (eVar instanceof MemoListViewModel.C25826e.C25827a) {
                    MemoListViewModel memoListViewModel2 = this.this$0;
                    C38495l d = ((MemoListViewModel.C25826e.C25827a) eVar).mo74980d();
                    this.label = 2;
                    if (memoListViewModel2.mo74917l0(d, this) == h) {
                        return h;
                    }
                } else if (eVar instanceof MemoListViewModel.C25826e.C25828b) {
                    MemoListViewModel memoListViewModel3 = this.this$0;
                    boolean d2 = ((MemoListViewModel.C25826e.C25828b) eVar).mo74986d();
                    this.label = 3;
                    if (memoListViewModel3.mo74918m0(d2, this) == h) {
                        return h;
                    }
                } else if (eVar instanceof MemoListViewModel.C25826e.C25832f) {
                    MemoListViewModel memoListViewModel4 = this.this$0;
                    C38495l d3 = ((MemoListViewModel.C25826e.C25832f) eVar).mo74992d();
                    this.label = 4;
                    if (memoListViewModel4.mo74924s0(d3, this) == h) {
                        return h;
                    }
                } else if (eVar instanceof MemoListViewModel.C25826e.C25833g) {
                    MemoListViewModel memoListViewModel5 = this.this$0;
                    C38495l d4 = ((MemoListViewModel.C25826e.C25833g) eVar).mo74998d();
                    this.label = 5;
                    if (memoListViewModel5.mo74926u0(d4, this) == h) {
                        return h;
                    }
                } else if (Intrinsics.areEqual((Object) eVar, (Object) MemoListViewModel.C25826e.C25831e.f63259b)) {
                    MemoListViewModel memoListViewModel6 = this.this$0;
                    this.label = 6;
                    if (memoListViewModel6.mo74921p0(this) == h) {
                        return h;
                    }
                } else if (Intrinsics.areEqual((Object) eVar, (Object) MemoListViewModel.C25826e.C25829c.f63255b)) {
                    MemoListViewModel memoListViewModel7 = this.this$0;
                    this.label = 7;
                    if (memoListViewModel7.mo74919n0(this) == h) {
                        return h;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C11661u0.m45747n(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((MemoListViewModel$processIntent$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
