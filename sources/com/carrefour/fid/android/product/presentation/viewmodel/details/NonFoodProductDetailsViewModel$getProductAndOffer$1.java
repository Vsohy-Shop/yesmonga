package com.carrefour.fid.android.product.presentation.viewmodel.details;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$getProductAndOffer$1", mo22502f = "NonFoodProductDetailsViewModel.kt", mo22503i = {}, mo22504l = {111, 115}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodProductDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel$getProductAndOffer$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,142:1\n230#2,5:143\n230#2,5:148\n230#2,5:153\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel$getProductAndOffer$1\n*L\n114#1:143,5\n117#1:148,5\n120#1:153,5\n*E\n"})
public final class NonFoodProductDetailsViewModel$getProductAndOffer$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ NonFoodProductDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsViewModel$getProductAndOffer$1(NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C11045c<? super NonFoodProductDetailsViewModel$getProductAndOffer$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodProductDetailsViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodProductDetailsViewModel$getProductAndOffer$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x007d
        L_0x0018:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0020:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004a
        L_0x0024:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r6 = r5.this$0
            java.lang.String r6 = r6.f68084e
            if (r6 != 0) goto L_0x004d
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r6 = r5.this$0
            kotlinx.coroutines.channels.g r6 = r6.f68087h
            com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b r1 = new com.carrefour.fid.android.product.presentation.viewmodel.details.mvi.a$b
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r4 = "Gtin not provided"
            r2.<init>(r4)
            r1.<init>(r2)
            r5.label = r3
            java.lang.Object r6 = r6.mo23757h0(r1, r5)
            if (r6 != r0) goto L_0x004a
            return r0
        L_0x004a:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x004d:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.j r6 = r6.f68085f
        L_0x0053:
            java.lang.Object r1 = r6.getValue()
            r3 = r1
            com.carrefour.fid.android.shared.type.e r3 = (com.carrefour.fid.android.shared.type.C28892e) r3
            com.carrefour.fid.android.shared.type.e$b r3 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            boolean r1 = r6.mo24216e(r1, r3)
            if (r1 == 0) goto L_0x0053
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r6 = r5.this$0
            com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase r6 = r6.f68080a
            com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase$Param r1 = new com.carrefour.fid.android.domain.interactors.product.GetProductDetailsNalUseCase$Param
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r3 = r5.this$0
            java.lang.String r3 = r3.f68084e
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            java.lang.Object r6 = r6.m172966invokegIAlus(r1, r5)
            if (r6 != r0) goto L_0x007d
            return r0
        L_0x007d:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r0 = r5.this$0
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x009e
            r1 = r6
            com.carrefour.fid.android.domain.models.product.detail.a r1 = (com.carrefour.fid.android.domain.models.product.detail.C38106a) r1
            kotlinx.coroutines.flow.j r0 = r0.f68085f
        L_0x008c:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            com.carrefour.fid.android.shared.type.e r3 = (com.carrefour.fid.android.shared.type.C28892e) r3
            com.carrefour.fid.android.shared.type.e$c r3 = new com.carrefour.fid.android.shared.type.e$c
            r3.<init>(r1)
            boolean r2 = r0.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x008c
        L_0x009e:
            com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel r0 = r5.this$0
            java.lang.Throwable r6 = kotlin.Result.m38705e(r6)
            if (r6 == 0) goto L_0x00bc
            kotlinx.coroutines.flow.j r0 = r0.f68085f
        L_0x00aa:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.carrefour.fid.android.shared.type.e r2 = (com.carrefour.fid.android.shared.type.C28892e) r2
            com.carrefour.fid.android.shared.type.e$a r2 = new com.carrefour.fid.android.shared.type.e$a
            r2.<init>(r6)
            boolean r1 = r0.mo24216e(r1, r2)
            if (r1 == 0) goto L_0x00aa
        L_0x00bc:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel$getProductAndOffer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodProductDetailsViewModel$getProductAndOffer$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
