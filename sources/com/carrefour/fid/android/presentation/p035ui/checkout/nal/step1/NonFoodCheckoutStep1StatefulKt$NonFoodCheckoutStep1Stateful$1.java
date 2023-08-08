package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1 */
public final class NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1 extends Lambda implements C11300l<C23520c, C11079d2> {
    final /* synthetic */ C23516a $analytics;
    final /* synthetic */ C8700z0<C23547a> $bottomSheetData;
    final /* synthetic */ C8700z0<Boolean> $displayClearBasketConfirmationDialog;
    final /* synthetic */ C8700z0<Throwable> $displayValidationErrorDialog;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ ModalBottomSheetState $quantityListBottomSheetState;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ NonFoodCheckout1ViewModel $viewModel;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1$1", mo22502f = "NonFoodCheckoutStep1Stateful.kt", mo22503i = {}, mo22504l = {120}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1$1 */
    public static final class C235081 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C235081(cVar2, nonFoodCheckout1ViewModel, z0Var, modalBottomSheetState, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel = nonFoodCheckout1ViewModel;
                C8700z0<C23547a> z0Var = z0Var;
                ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                this.label = 1;
                if (NonFoodCheckoutStep1StatefulKt.m104685u((C23520c.C23533f) cVar2, nonFoodCheckout1ViewModel, z0Var, modalBottomSheetState, this) == h) {
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
            return ((C235081) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$1(C11289a<C11079d2> aVar, C8700z0<Throwable> z0Var, NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C8700z0<Boolean> z0Var2, C12074o0 o0Var, C23516a aVar2, C38326b bVar, C8700z0<C23547a> z0Var3, ModalBottomSheetState modalBottomSheetState) {
        super(1);
        this.$onBackPressed = aVar;
        this.$displayValidationErrorDialog = z0Var;
        this.$viewModel = nonFoodCheckout1ViewModel;
        this.$displayClearBasketConfirmationDialog = z0Var2;
        this.$scope = o0Var;
        this.$analytics = aVar2;
        this.$performance = bVar;
        this.$bottomSheetData = z0Var3;
        this.$quantityListBottomSheetState = modalBottomSheetState;
    }

    /* renamed from: a */
    public final void mo68882a(@C12579k C23520c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "action");
        if (Intrinsics.areEqual((Object) cVar, (Object) C23520c.C23527b.f59451a)) {
            this.$onBackPressed.invoke();
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C23520c.C23529d.f59455a)) {
            this.$displayValidationErrorDialog.setValue(null);
        } else if (cVar instanceof C23520c.C23521a) {
            NonFoodCheckoutStep1StatefulKt.m104681q((C23520c.C23521a) cVar, this.$viewModel, this.$displayClearBasketConfirmationDialog);
        } else if (cVar instanceof C23520c.C23533f) {
            C12074o0 o0Var = this.$scope;
            final NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel = this.$viewModel;
            final C8700z0<C23547a> z0Var = this.$bottomSheetData;
            final ModalBottomSheetState modalBottomSheetState = this.$quantityListBottomSheetState;
            final C23520c cVar2 = cVar;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C235081((C11045c<? super C235081>) null), 3, (Object) null);
        } else if (cVar instanceof C23520c.C23528c) {
            this.$analytics.mo68900c(((C23520c.C23528c) cVar).mo68907d());
        } else if (cVar instanceof C23520c.C23530e) {
            NonFoodCheckoutStep1StatefulKt.m104684t((C23520c.C23530e) cVar, this.$performance);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68882a((C23520c) obj);
        return C11079d2.f28267a;
    }
}
