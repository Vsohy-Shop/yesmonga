package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1;

import com.carrefour.fid.android.domain.interactors.basket.C37562d;
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
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1", mo22502f = "NonFoodCheckout1ViewModel.kt", mo22503i = {}, mo22504l = {115}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNonFoodCheckout1ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckout1ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NonFoodCheckout1ViewModel$observeBasketOffers$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,213:1\n230#2,5:214\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckout1ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step1/NonFoodCheckout1ViewModel$observeBasketOffers$1\n*L\n114#1:214,5\n*E\n"})
public final class NonFoodCheckout1ViewModel$observeBasketOffers$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ NonFoodCheckout1ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckout1ViewModel$observeBasketOffers$1(NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C11045c<? super NonFoodCheckout1ViewModel$observeBasketOffers$1> cVar) {
        super(2, cVar);
        this.this$0 = nonFoodCheckout1ViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new NonFoodCheckout1ViewModel$observeBasketOffers$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object value;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11940j k0 = this.this$0.f63921n;
            do {
                value = k0.getValue();
                C28892e eVar = (C28892e) value;
            } while (!k0.mo24216e(value, C28892e.C28894b.f70781b));
            C11907e<Result<C37562d>> f = this.this$0.f63909b.invoke(this.this$0.f63919l);
            final NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel = this.this$0;
            C261422 r1 = new C11908f<Result<? extends C37562d>>() {
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                    	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                    */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x009f A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
                @org.jetbrains.annotations.C12580l
                public final java.lang.Object emit(@org.jetbrains.annotations.C12579k java.lang.Object r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r12
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2$emit$1
                        r0.<init>(r10, r12)
                    L_0x0018:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0045
                        if (r2 != r3) goto L_0x003d
                        java.lang.Object r11 = r0.L$5
                        java.lang.Object r2 = r0.L$4
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.C11940j) r2
                        java.lang.Object r4 = r0.L$3
                        com.carrefour.fid.android.domain.interactors.basket.d r4 = (com.carrefour.fid.android.domain.interactors.basket.C37562d) r4
                        java.lang.Object r5 = r0.L$2
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel) r5
                        java.lang.Object r6 = r0.L$1
                        java.lang.Object r7 = r0.L$0
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1$2 r7 = (com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1.C261422) r7
                        kotlin.C11661u0.m45747n(r12)
                        goto L_0x00a0
                    L_0x003d:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L_0x0045:
                        kotlin.C11661u0.m45747n(r12)
                        kotlin.Result r11 = (kotlin.Result) r11
                        java.lang.Object r11 = r11.mo21858l()
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r12 = r3
                        boolean r2 = kotlin.Result.m38710j(r11)
                        if (r2 == 0) goto L_0x00b2
                        r2 = r11
                        com.carrefour.fid.android.domain.interactors.basket.d r2 = (com.carrefour.fid.android.domain.interactors.basket.C37562d) r2
                        kotlinx.coroutines.flow.j r4 = r12.f63921n
                    L_0x005d:
                        java.lang.Object r5 = r4.getValue()
                        r6 = r5
                        com.carrefour.fid.android.shared.type.e r6 = (com.carrefour.fid.android.shared.type.C28892e) r6
                        com.carrefour.fid.android.shared.type.e$c r6 = new com.carrefour.fid.android.shared.type.e$c
                        r6.<init>(r2)
                        boolean r5 = r4.mo24216e(r5, r6)
                        if (r5 == 0) goto L_0x005d
                        kotlinx.coroutines.flow.j r4 = r12.f63922o
                        r7 = r10
                        r6 = r11
                        r5 = r12
                        r9 = r4
                        r4 = r2
                        r2 = r9
                    L_0x0079:
                        java.lang.Object r11 = r2.getValue()
                        r12 = r11
                        java.lang.Boolean r12 = (java.lang.Boolean) r12
                        r12.booleanValue()
                        com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase r12 = r5.f63916i
                        com.carrefour.fid.android.domain.models.basket.Basket r8 = r4.mo114366g()
                        r0.L$0 = r7
                        r0.L$1 = r6
                        r0.L$2 = r5
                        r0.L$3 = r4
                        r0.L$4 = r2
                        r0.L$5 = r11
                        r0.label = r3
                        java.lang.Object r12 = r12.invoke(r8, r0)
                        if (r12 != r1) goto L_0x00a0
                        return r1
                    L_0x00a0:
                        java.lang.Boolean r12 = (java.lang.Boolean) r12
                        boolean r12 = r12.booleanValue()
                        java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r12)
                        boolean r11 = r2.mo24216e(r11, r12)
                        if (r11 == 0) goto L_0x0079
                        r11 = r6
                        goto L_0x00b3
                    L_0x00b2:
                        r7 = r10
                    L_0x00b3:
                        com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel r12 = r3
                        java.lang.Throwable r11 = kotlin.Result.m38705e(r11)
                        if (r11 == 0) goto L_0x00d1
                        kotlinx.coroutines.flow.j r12 = r12.f63921n
                    L_0x00bf:
                        java.lang.Object r0 = r12.getValue()
                        r1 = r0
                        com.carrefour.fid.android.shared.type.e r1 = (com.carrefour.fid.android.shared.type.C28892e) r1
                        com.carrefour.fid.android.shared.type.e$a r1 = new com.carrefour.fid.android.shared.type.e$a
                        r1.<init>(r11)
                        boolean r0 = r12.mo24216e(r0, r1)
                        if (r0 == 0) goto L_0x00bf
                    L_0x00d1:
                        kotlin.d2 r11 = kotlin.C11079d2.f28267a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel$observeBasketOffers$1.C261422.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (f.collect(r1, this) == h) {
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
        return ((NonFoodCheckout1ViewModel$observeBasketOffers$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
