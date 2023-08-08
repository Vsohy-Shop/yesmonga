package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11306r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$state$1", mo22502f = "DeliverySummaryViewModel.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H@"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeService", "", "minimumAmountOrder", "Lkotlin/d2;", "validate", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DeliverySummaryViewModel$state$1 extends SuspendLambda implements C11306r<C28892e<? extends StoreService>, C28892e<? extends String>, C28892e<? extends C11079d2>, C11045c<? super DeliverySummaryState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public DeliverySummaryViewModel$state$1(C11045c<? super DeliverySummaryViewModel$state$1> cVar) {
        super(4, cVar);
    }

    @C12580l
    public final Object invoke(@C12579k C28892e<StoreService> eVar, @C12579k C28892e<String> eVar2, @C12579k C28892e<C11079d2> eVar3, @C12580l C11045c<? super DeliverySummaryState> cVar) {
        DeliverySummaryViewModel$state$1 deliverySummaryViewModel$state$1 = new DeliverySummaryViewModel$state$1(cVar);
        deliverySummaryViewModel$state$1.L$0 = eVar;
        deliverySummaryViewModel$state$1.L$1 = eVar2;
        deliverySummaryViewModel$state$1.L$2 = eVar3;
        return deliverySummaryViewModel$state$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return new DeliverySummaryState((C28892e) this.L$0, (C28892e) this.L$1, (C28892e) this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
