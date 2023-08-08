package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.service.domain.interactors.GetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getStoreService$1", mo22502f = "DeliverySummaryViewModel.kt", mo22503i = {}, mo22504l = {74}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliverySummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel$getStoreService$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,154:1\n230#2,5:155\n230#2,5:160\n230#2,5:165\n230#2,5:170\n230#2,5:175\n230#2,5:180\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel$getStoreService$1\n*L\n73#1:155,5\n75#1:160,5\n78#1:165,5\n80#1:170,5\n83#1:175,5\n84#1:180,5\n*E\n"})
public final class DeliverySummaryViewModel$getStoreService$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ DeliverySummaryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryViewModel$getStoreService$1(DeliverySummaryViewModel deliverySummaryViewModel, C11045c<? super DeliverySummaryViewModel$getStoreService$1> cVar) {
        super(2, cVar);
        this.this$0 = deliverySummaryViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DeliverySummaryViewModel$getStoreService$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        String str;
        Object value4;
        Object value5;
        Object value6;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j access$get_serviceState$p = this.this$0._serviceState;
            do {
                value6 = access$get_serviceState$p.getValue();
                C28892e eVar = (C28892e) value6;
            } while (!access$get_serviceState$p.mo24216e(value6, C28892e.C28894b.f70781b));
            GetPendingServiceSelectionUseCase access$getGetPendingServiceSelectionUseCase$p = this.this$0.getPendingServiceSelectionUseCase;
            this.label = 1;
            obj2 = access$getGetPendingServiceSelectionUseCase$p.m172838invokeIoAF18A(this);
            if (obj2 == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
            obj2 = ((Result) obj).mo21858l();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DeliverySummaryViewModel deliverySummaryViewModel = this.this$0;
        if (Result.m38710j(obj2)) {
            C38162k kVar = (C38162k) obj2;
            C11940j access$get_serviceState$p2 = deliverySummaryViewModel._serviceState;
            do {
                value3 = access$get_serviceState$p2.getValue();
                C28892e eVar2 = (C28892e) value3;
            } while (!access$get_serviceState$p2.mo24216e(value3, new C28892e.C28895c(kVar.mo119354f())));
            C38163l e = kVar.mo119352e();
            if (e != null) {
                str = e.mo119393w();
            } else {
                str = null;
            }
            if (str != null) {
                C11940j access$get_anabelKey$p = deliverySummaryViewModel._anabelKey;
                do {
                    value5 = access$get_anabelKey$p.getValue();
                    String str2 = (String) value5;
                } while (!access$get_anabelKey$p.mo24216e(value5, str));
            } else {
                C11940j access$get_minimumAmountOrderState$p = deliverySummaryViewModel._minimumAmountOrderState;
                do {
                    value4 = access$get_minimumAmountOrderState$p.getValue();
                    C28892e eVar3 = (C28892e) value4;
                } while (!access$get_minimumAmountOrderState$p.mo24216e(value4, new C28892e.C28893a((Throwable) null)));
            }
        }
        DeliverySummaryViewModel deliverySummaryViewModel2 = this.this$0;
        Throwable e2 = Result.m38705e(obj2);
        if (e2 != null) {
            C11940j access$get_serviceState$p3 = deliverySummaryViewModel2._serviceState;
            do {
                value = access$get_serviceState$p3.getValue();
                C28892e eVar4 = (C28892e) value;
            } while (!access$get_serviceState$p3.mo24216e(value, new C28892e.C28893a(e2)));
            C11940j access$get_anabelKey$p2 = deliverySummaryViewModel2._anabelKey;
            do {
                value2 = access$get_anabelKey$p2.getValue();
                String str3 = (String) value2;
            } while (!access$get_anabelKey$p2.mo24216e(value2, null));
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DeliverySummaryViewModel$getStoreService$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
