package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.models.product.detail.OfferDetail;
import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28120e;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28122f;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetailsStateful$actioner$1 */
public final class C27844x933e815b extends Lambda implements C11300l<C27870j, C11079d2> {
    final /* synthetic */ C28123g $analyticsViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ C12074o0 $coroutineScope;
    final /* synthetic */ C8700z0<OfferDetail> $currentOfferSelectedState;
    final /* synthetic */ C8700z0<C27906t> $errorVariant;
    final /* synthetic */ C11300l<Integer, C11079d2> $handleComponentExpandComplete;
    final /* synthetic */ ModalBottomSheetState $modalBottomSheetState;
    final /* synthetic */ C8700z0<C27864i> $modalBottomSheetType;
    final /* synthetic */ C28120e $offerTypeAnalyticsMapper;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onDeliveryChoiceInfoRedirection;
    final /* synthetic */ C11289a<C11079d2> $onHeartClicked;
    final /* synthetic */ C11300l<ReinsuranceType, C11079d2> $onReinsuranceClicked;
    final /* synthetic */ C11289a<C11079d2> $onServiceSelectionRequired;
    final /* synthetic */ C11289a<C11079d2> $onSignInRequired;
    final /* synthetic */ C11300l<String, C11079d2> $onWebRedirection;
    final /* synthetic */ C28122f $priceAnalyticsMapper;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ NonFoodProductDetailsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27844x933e815b(C11289a<C11079d2> aVar, NonFoodProductDetailsViewModel nonFoodProductDetailsViewModel, C11300l<? super Integer, C11079d2> lVar, C11300l<? super String, C11079d2> lVar2, C8700z0<C27864i> z0Var, ModalBottomSheetState modalBottomSheetState, C8700z0<OfferDetail> z0Var2, C11300l<? super Boolean, C11079d2> lVar3, C12074o0 o0Var, SnackbarHostState snackbarHostState, C8700z0<C27906t> z0Var3, C28123g gVar, C28122f fVar, C28120e eVar, Context context, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11300l<? super ReinsuranceType, C11079d2> lVar4, C12074o0 o0Var2) {
        super(1);
        this.$onBackPressed = aVar;
        this.$viewModel = nonFoodProductDetailsViewModel;
        this.$handleComponentExpandComplete = lVar;
        this.$onWebRedirection = lVar2;
        this.$modalBottomSheetType = z0Var;
        this.$modalBottomSheetState = modalBottomSheetState;
        this.$currentOfferSelectedState = z0Var2;
        this.$onDeliveryChoiceInfoRedirection = lVar3;
        this.$scope = o0Var;
        this.$snackbarHostState = snackbarHostState;
        this.$errorVariant = z0Var3;
        this.$analyticsViewModel = gVar;
        this.$priceAnalyticsMapper = fVar;
        this.$offerTypeAnalyticsMapper = eVar;
        this.$context = context;
        this.$onHeartClicked = aVar2;
        this.$onServiceSelectionRequired = aVar3;
        this.$onSignInRequired = aVar4;
        this.$onReinsuranceClicked = lVar4;
        this.$coroutineScope = o0Var2;
    }

    /* renamed from: a */
    public final void mo80876a(@C12579k C27870j jVar) {
        String message;
        Intrinsics.checkNotNullParameter(jVar, "it");
        if (Intrinsics.areEqual((Object) jVar, (Object) C27870j.C27876c.f67509a)) {
            this.$onBackPressed.invoke();
        } else if (Intrinsics.areEqual((Object) jVar, (Object) C27870j.C27879f.f67515a)) {
            this.$viewModel.mo81701k0();
        } else if (jVar instanceof C27870j.C27875b) {
            this.$handleComponentExpandComplete.invoke(Integer.valueOf(((C27870j.C27875b) jVar).mo80996d()));
        } else if (jVar instanceof C27870j.C27880g) {
            this.$onWebRedirection.invoke(((C27870j.C27880g) jVar).mo81008d());
        } else if (jVar instanceof C27870j.C27881h) {
            NonFoodProductDetailsScreenKt.m116848K((C27870j.C27881h) jVar, this.$modalBottomSheetType, this.$modalBottomSheetState, this.$currentOfferSelectedState, this.$onDeliveryChoiceInfoRedirection, this.$scope);
        } else if (jVar instanceof C27870j.C27871a) {
            NonFoodProductDetailsScreenKt.m116847J((C27870j.C27871a) jVar, this.$modalBottomSheetType, this.$modalBottomSheetState, this.$snackbarHostState, this.$errorVariant, this.$viewModel, this.$analyticsViewModel, this.$priceAnalyticsMapper, this.$offerTypeAnalyticsMapper, this.$context, this.$scope);
        } else if (jVar instanceof C27870j.C27878e) {
            this.$onHeartClicked.invoke();
        } else if (jVar instanceof C27870j.C27877d) {
            C27870j.C27877d dVar = (C27870j.C27877d) jVar;
            Throwable d = dVar.mo81002d();
            if (d instanceof RequireServiceSelectionThrowable) {
                this.$onServiceSelectionRequired.invoke();
            } else if (d instanceof RequireSignInThrowable) {
                this.$onSignInRequired.invoke();
            } else {
                Throwable d2 = dVar.mo81002d();
                if (d2 != null && (message = d2.getMessage()) != null) {
                    C8700z0<C27906t> z0Var = this.$errorVariant;
                    Context context = this.$context;
                    C12074o0 o0Var = this.$coroutineScope;
                    SnackbarHostState snackbarHostState = this.$snackbarHostState;
                    z0Var.setValue(C27905s.m117073a(dVar.mo81002d(), context));
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C27845xe32975b5(snackbarHostState, message, (C11045c<? super C27845xe32975b5>) null), 3, (Object) null);
                }
            }
        } else if (jVar instanceof C27870j.C27887i.C27888a) {
            this.$onReinsuranceClicked.invoke(((C27870j.C27887i.C27888a) jVar).mo81030d());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80876a((C27870j) obj);
        return C11079d2.f28267a;
    }
}
