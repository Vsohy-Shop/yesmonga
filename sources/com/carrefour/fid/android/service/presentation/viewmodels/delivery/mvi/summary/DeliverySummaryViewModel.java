package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.account.C37523i;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.user.C37875c;
import com.carrefour.fid.android.domain.interactors.user.C37884g;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.domain.interactors.ApplyPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetMinimumOrderAmountUseCase;
import com.carrefour.fid.android.service.domain.interactors.GetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliverySummarySideEffect;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010$0#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010&R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010&R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "getMinimumAmountOrder", "getStoreService", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "", "telephone", "validate", "Lcom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase;", "getPendingServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/c;", "getUserAddressUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/c;", "Lcom/carrefour/fid/android/domain/interactors/user/g;", "getUserPhoneUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/g;", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "switchFacilityServiceInBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "Lcom/carrefour/fid/android/service/domain/interactors/ApplyPendingServiceSelectionUseCase;", "applyPendingServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ApplyPendingServiceSelectionUseCase;", "Lcom/carrefour/fid/android/domain/interactors/account/i;", "updateUserAddressUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/i;", "Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase;", "getMinimumOrderAmountUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "delivertyType", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "_serviceState", "Lkotlinx/coroutines/flow/j;", "_anabelKey", "_minimumAmountOrderState", "_validateState", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummarySideEffect;", "_sideEffect", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryState;", "state", "Lkotlinx/coroutines/flow/u;", "getState", "()Lkotlinx/coroutines/flow/u;", "Landroidx/lifecycle/p0;", "savedStateHandle", "<init>", "(Lcom/carrefour/fid/android/service/domain/interactors/GetPendingServiceSelectionUseCase;Lcom/carrefour/fid/android/domain/interactors/user/c;Lcom/carrefour/fid/android/domain/interactors/user/g;Lcom/carrefour/fid/android/domain/interactors/basket/j0;Lcom/carrefour/fid/android/service/domain/interactors/ApplyPendingServiceSelectionUseCase;Lcom/carrefour/fid/android/domain/interactors/account/i;Lcom/carrefour/fid/android/service/domain/interactors/GetMinimumOrderAmountUseCase;Landroidx/lifecycle/p0;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliverySummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/NavArgumentsKt\n*L\n1#1,154:1\n8#2:155\n*S KotlinDebug\n*F\n+ 1 DeliverySummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/summary/DeliverySummaryViewModel\n*L\n45#1:155\n*E\n"})
public final class DeliverySummaryViewModel extends C19476v0 {
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<String> _anabelKey = C11953v.m47628a(null);
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<C28892e<String>> _minimumAmountOrderState;
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<C28892e<StoreService>> _serviceState;
    /* access modifiers changed from: private */
    @C12579k
    public final C11744g<DeliverySummarySideEffect> _sideEffect;
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<C28892e<C11079d2>> _validateState;
    /* access modifiers changed from: private */
    @C12579k
    public final ApplyPendingServiceSelectionUseCase applyPendingServiceSelectionUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final DeliveryType delivertyType;
    /* access modifiers changed from: private */
    @C12579k
    public final GetMinimumOrderAmountUseCase getMinimumOrderAmountUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final GetPendingServiceSelectionUseCase getPendingServiceSelectionUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final C37875c getUserAddressUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final C37884g getUserPhoneUseCase;
    @C12579k
    private final C11907e<DeliverySummarySideEffect> sideEffect;
    @C12579k
    private final C11952u<DeliverySummaryState> state;
    /* access modifiers changed from: private */
    @C12579k
    public final C37578j0 switchFacilityServiceInBasketUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final C37523i updateUserAddressUseCase;

    @Inject
    public DeliverySummaryViewModel(@C12579k GetPendingServiceSelectionUseCase getPendingServiceSelectionUseCase2, @C12579k C37875c cVar, @C12579k C37884g gVar, @C12579k C37578j0 j0Var, @C12579k ApplyPendingServiceSelectionUseCase applyPendingServiceSelectionUseCase2, @C12579k C37523i iVar, @C12579k GetMinimumOrderAmountUseCase getMinimumOrderAmountUseCase2, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(getPendingServiceSelectionUseCase2, "getPendingServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(cVar, "getUserAddressUseCase");
        Intrinsics.checkNotNullParameter(gVar, "getUserPhoneUseCase");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        Intrinsics.checkNotNullParameter(applyPendingServiceSelectionUseCase2, "applyPendingServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(iVar, "updateUserAddressUseCase");
        Intrinsics.checkNotNullParameter(getMinimumOrderAmountUseCase2, "getMinimumOrderAmountUseCase");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.getPendingServiceSelectionUseCase = getPendingServiceSelectionUseCase2;
        this.getUserAddressUseCase = cVar;
        this.getUserPhoneUseCase = gVar;
        this.switchFacilityServiceInBasketUseCase = j0Var;
        this.applyPendingServiceSelectionUseCase = applyPendingServiceSelectionUseCase2;
        this.updateUserAddressUseCase = iVar;
        this.getMinimumOrderAmountUseCase = getMinimumOrderAmountUseCase2;
        Object h = p0Var.mo57648h(NavArgumentsKt.DELIVERY_TYPE);
        Intrinsics.checkNotNull(h);
        this.delivertyType = (DeliveryType) h;
        C28892e.C28896d dVar = C28892e.C28896d.f70785b;
        C11940j<C28892e<StoreService>> a = C11953v.m47628a(dVar);
        this._serviceState = a;
        C11940j<C28892e<String>> a2 = C11953v.m47628a(dVar);
        this._minimumAmountOrderState = a2;
        C11940j<C28892e<C11079d2>> a3 = C11953v.m47628a(dVar);
        this._validateState = a3;
        C11744g<DeliverySummarySideEffect> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this._sideEffect = d;
        this.sideEffect = C11909g.m47490s1(d);
        this.state = C11909g.m47392O1(C11909g.m47360E(a, a2, a3, new DeliverySummaryViewModel$state$1((C11045c<? super DeliverySummaryViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new DeliverySummaryState((C28892e) null, (C28892e) null, (C28892e) null, 7, (DefaultConstructorMarker) null));
        getStoreService();
        getMinimumAmountOrder();
    }

    private final void getMinimumAmountOrder() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DeliverySummaryViewModel$getMinimumAmountOrder$1(this, (C11045c<? super DeliverySummaryViewModel$getMinimumAmountOrder$1>) null), 3, (Object) null);
    }

    @C12579k
    public final C11907e<DeliverySummarySideEffect> getSideEffect() {
        return this.sideEffect;
    }

    @C12579k
    public final C11952u<DeliverySummaryState> getState() {
        return this.state;
    }

    public final void getStoreService() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DeliverySummaryViewModel$getStoreService$1(this, (C11045c<? super DeliverySummaryViewModel$getStoreService$1>) null), 3, (Object) null);
    }

    public final void validate(@C12579k Address address, @C12579k String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DeliverySummaryViewModel$validate$1(this, address, str, (C11045c<? super DeliverySummaryViewModel$validate$1>) null), 3, (Object) null);
    }
}
