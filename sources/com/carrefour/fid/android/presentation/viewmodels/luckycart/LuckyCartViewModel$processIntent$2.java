package com.carrefour.fid.android.presentation.viewmodels.luckycart;

import com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartTicketUseCase;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.presentation.models.mapper.C38503e;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$processIntent$2", mo22502f = "LuckyCartViewModel.kt", mo22503i = {}, mo22504l = {37}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class LuckyCartViewModel$processIntent$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ LuckyCartViewModel.C26617b $intent;
    int label;
    final /* synthetic */ LuckyCartViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartViewModel$processIntent$2(LuckyCartViewModel luckyCartViewModel, LuckyCartViewModel.C26617b bVar, C11045c<? super LuckyCartViewModel$processIntent$2> cVar) {
        super(2, cVar);
        this.this$0 = luckyCartViewModel;
        this.$intent = bVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new LuckyCartViewModel$processIntent$2(this.this$0, this.$intent, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            GetLuckyCartTicketUseCase d0 = this.this$0.f65012a;
            GetLuckyCartTicketUseCase.C37704a aVar = new GetLuckyCartTicketUseCase.C37704a(((LuckyCartViewModel.C26617b.C26619b) this.$intent).mo77364f(), ((LuckyCartViewModel.C26617b.C26619b) this.$intent).mo77362e());
            this.label = 1;
            obj2 = d0.m172972invokegIAlus(aVar, this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LuckyCartViewModel luckyCartViewModel = this.this$0;
        if (Result.m38705e(obj2) == null) {
            luckyCartViewModel.publishState(new LuckyCartViewModel.C26613a.C26616c(C38503e.m159751a((LuckyCartTicketDomain) obj2)));
        } else {
            luckyCartViewModel.publishState(LuckyCartViewModel.C26613a.C26615b.f65016c);
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((LuckyCartViewModel$processIntent$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
