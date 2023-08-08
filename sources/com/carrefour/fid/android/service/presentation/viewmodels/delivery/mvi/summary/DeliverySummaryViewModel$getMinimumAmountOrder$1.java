package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1", mo22502f = "DeliverySummaryViewModel.kt", mo22503i = {}, mo22504l = {91}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DeliverySummaryViewModel$getMinimumAmountOrder$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ DeliverySummaryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliverySummaryViewModel$getMinimumAmountOrder$1(DeliverySummaryViewModel deliverySummaryViewModel, C11045c<? super DeliverySummaryViewModel$getMinimumAmountOrder$1> cVar) {
        super(2, cVar);
        this.this$0 = deliverySummaryViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DeliverySummaryViewModel$getMinimumAmountOrder$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e t0 = C11909g.m47492t0(this.this$0._anabelKey);
            final DeliverySummaryViewModel deliverySummaryViewModel = this.this$0;
            C284351 r1 = new C11908f<String>() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                @org.jetbrains.annotations.C12580l
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1 r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1 r0 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1$emit$1
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x003b
                        if (r2 != r3) goto L_0x0033
                        java.lang.Object r6 = r0.L$0
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1$1 r6 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1.C284351) r6
                        kotlin.C11661u0.m45747n(r7)
                        kotlin.Result r7 = (kotlin.Result) r7
                        java.lang.Object r7 = r7.mo21858l()
                        goto L_0x005b
                    L_0x0033:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x003b:
                        kotlin.C11661u0.m45747n(r7)
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r7 = r3
                        com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase r7 = r7.getMinimumOrderAmountUseCase
                        com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$Params r2 = new com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase$Params
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r4 = r3
                        com.carrefour.fid.android.service.presentation.model.DeliveryType r4 = r4.delivertyType
                        r2.<init>(r6, r4)
                        r0.L$0 = r5
                        r0.label = r3
                        java.lang.Object r7 = r7.m172837invokegIAlus((com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
                        if (r7 != r1) goto L_0x005a
                        return r1
                    L_0x005a:
                        r6 = r5
                    L_0x005b:
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r0 = r3
                        boolean r1 = kotlin.Result.m38710j(r7)
                        if (r1 == 0) goto L_0x007c
                        r1 = r7
                        java.lang.String r1 = (java.lang.String) r1
                        kotlinx.coroutines.flow.j r0 = r0._minimumAmountOrderState
                    L_0x006a:
                        java.lang.Object r2 = r0.getValue()
                        r3 = r2
                        com.carrefour.fid.android.shared.type.e r3 = (com.carrefour.fid.android.shared.type.C28892e) r3
                        com.carrefour.fid.android.shared.type.e$c r3 = new com.carrefour.fid.android.shared.type.e$c
                        r3.<init>(r1)
                        boolean r2 = r0.mo24216e(r2, r3)
                        if (r2 == 0) goto L_0x006a
                    L_0x007c:
                        com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel r6 = r3
                        java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
                        if (r7 == 0) goto L_0x00ac
                        kotlinx.coroutines.flow.j r0 = r6._minimumAmountOrderState
                    L_0x0088:
                        java.lang.Object r1 = r0.getValue()
                        r2 = r1
                        com.carrefour.fid.android.shared.type.e r2 = (com.carrefour.fid.android.shared.type.C28892e) r2
                        com.carrefour.fid.android.shared.type.e$a r2 = new com.carrefour.fid.android.shared.type.e$a
                        r2.<init>(r7)
                        boolean r1 = r0.mo24216e(r1, r2)
                        if (r1 == 0) goto L_0x0088
                        kotlinx.coroutines.flow.j r1 = r6._anabelKey
                    L_0x009e:
                        java.lang.Object r6 = r1.getValue()
                        r7 = r6
                        java.lang.String r7 = (java.lang.String) r7
                        r7 = 0
                        boolean r6 = r1.mo24216e(r6, r7)
                        if (r6 == 0) goto L_0x009e
                    L_0x00ac:
                        kotlin.d2 r6 = kotlin.C11079d2.f28267a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.DeliverySummaryViewModel$getMinimumAmountOrder$1.C284351.emit(java.lang.String, kotlin.coroutines.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (t0.collect(r1, this) == h) {
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
        return ((DeliverySummaryViewModel$getMinimumAmountOrder$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
