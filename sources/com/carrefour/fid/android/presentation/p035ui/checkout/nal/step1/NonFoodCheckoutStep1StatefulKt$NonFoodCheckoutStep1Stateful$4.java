package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.content.Context;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.interactors.basket.C37562d;
import com.carrefour.fid.android.domain.models.CategoryModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics.C23516a;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.C23547a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26144b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.NonFoodCheckout1ViewModel;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.HashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4", mo22502f = "NonFoodCheckoutStep1Stateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4 */
public final class NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C23516a $analytics;
    final /* synthetic */ C8700z0<C23547a> $bottomSheetData;
    final /* synthetic */ Context $context;
    final /* synthetic */ C8700z0<Boolean> $displayClearBasketConfirmationDialog;
    final /* synthetic */ C8700z0<Boolean> $displayValidationButtonLoader;
    final /* synthetic */ C8700z0<Throwable> $displayValidationErrorDialog;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onDisplayError;
    final /* synthetic */ C11304p<String, HashMap<String, CategoryModel>, C11079d2> $onNavigateToCheckoutStep2;
    final /* synthetic */ C11907e<C23515a> $sideEffects;
    final /* synthetic */ C8578k2<C26144b> $stateFlow;
    final /* synthetic */ NonFoodCheckout1ViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4$1", mo22502f = "NonFoodCheckoutStep1Stateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4$1 */
    public static final class C235091 extends SuspendLambda implements C11304p<C23515a, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C235091 r1 = new C235091(z0Var, aVar, pVar, nonFoodCheckout1ViewModel, z0Var2, z0Var3, context, lVar, z0Var4, k2Var, aVar2, cVar);
            r1.L$0 = obj;
            return r1;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C23515a aVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C235091) create(aVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C23515a aVar = (C23515a) this.L$0;
                if (aVar instanceof C23565q) {
                    C8700z0<Boolean> z0Var = z0Var;
                    C11289a<C11079d2> aVar2 = aVar;
                    C11304p<String, HashMap<String, CategoryModel>, C11079d2> pVar = pVar;
                    NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel = nonFoodCheckout1ViewModel;
                    final C8578k2<C26144b> k2Var = k2Var;
                    final C23516a aVar3 = aVar2;
                    NonFoodCheckoutStep1StatefulKt.m104686v((C23565q) aVar, z0Var, aVar2, pVar, nonFoodCheckout1ViewModel, new C11289a<C11079d2>() {
                        public final void invoke() {
                            C37562d dVar = (C37562d) C28897f.m119478b(k2Var.getValue().mo75964e());
                            if (dVar != null) {
                                aVar3.mo68898a(C10978t.m41497a0(dVar.mo114370j().values()), dVar.mo114366g().mo116855w().mo116892u());
                            }
                        }
                    });
                } else if (aVar instanceof C23564p) {
                    NonFoodCheckoutStep1StatefulKt.m104683s((C23564p) aVar, z0Var2, z0Var, z0Var3);
                } else if (aVar instanceof C23563o) {
                    NonFoodCheckoutStep1StatefulKt.m104682r(context, (C23563o) aVar, z0Var, lVar, aVar, z0Var4);
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4(C11907e<? extends C23515a> eVar, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar, C11304p<? super String, ? super HashMap<String, CategoryModel>, C11079d2> pVar, NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel, C8700z0<C23547a> z0Var2, C8700z0<Boolean> z0Var3, Context context, C11300l<? super String, C11079d2> lVar, C8700z0<Throwable> z0Var4, C8578k2<C26144b> k2Var, C23516a aVar2, C11045c<? super NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4> cVar) {
        super(2, cVar);
        this.$sideEffects = eVar;
        this.$displayValidationButtonLoader = z0Var;
        this.$onBackPressed = aVar;
        this.$onNavigateToCheckoutStep2 = pVar;
        this.$viewModel = nonFoodCheckout1ViewModel;
        this.$bottomSheetData = z0Var2;
        this.$displayClearBasketConfirmationDialog = z0Var3;
        this.$context = context;
        this.$onDisplayError = lVar;
        this.$displayValidationErrorDialog = z0Var4;
        this.$stateFlow = k2Var;
        this.$analytics = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4 nonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4 = new NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4(this.$sideEffects, this.$displayValidationButtonLoader, this.$onBackPressed, this.$onNavigateToCheckoutStep2, this.$viewModel, this.$bottomSheetData, this.$displayClearBasketConfirmationDialog, this.$context, this.$onDisplayError, this.$displayValidationErrorDialog, this.$stateFlow, this.$analytics, cVar);
        nonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4.L$0 = obj;
        return nonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C23515a> eVar = this.$sideEffects;
            final C8700z0<Boolean> z0Var = this.$displayValidationButtonLoader;
            final C11289a<C11079d2> aVar = this.$onBackPressed;
            final C11304p<String, HashMap<String, CategoryModel>, C11079d2> pVar = this.$onNavigateToCheckoutStep2;
            final NonFoodCheckout1ViewModel nonFoodCheckout1ViewModel = this.$viewModel;
            final C8700z0<C23547a> z0Var2 = this.$bottomSheetData;
            final C8700z0<Boolean> z0Var3 = this.$displayClearBasketConfirmationDialog;
            final Context context = this.$context;
            final C11300l<String, C11079d2> lVar = this.$onDisplayError;
            final C8700z0<Throwable> z0Var4 = this.$displayValidationErrorDialog;
            final C8578k2<C26144b> k2Var = this.$stateFlow;
            final C23516a aVar2 = this.$analytics;
            C235091 r0 = r3;
            C235091 r3 = new C235091((C11045c<? super C235091>) null);
            C11909g.m47412V0(C11909g.m47448f1(eVar, r0), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((NonFoodCheckoutStep1StatefulKt$NonFoodCheckoutStep1Stateful$4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
