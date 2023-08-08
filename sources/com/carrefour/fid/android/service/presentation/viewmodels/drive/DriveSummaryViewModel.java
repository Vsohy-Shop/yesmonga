package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveSummaryAnalyticsReporter;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
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
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0!8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel;", "Landroidx/lifecycle/v0;", "", "anabel", "Lkotlinx/coroutines/c2;", "fetchSummary", "Lkotlin/d2;", "onRetry", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "driveType", "validate", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;", "getFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "setServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "switchFacilityServiceInBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveSummaryAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveSummaryAnalyticsReporter;", "getAnalytics", "()Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveSummaryAnalyticsReporter;", "Landroidx/lifecycle/p0;", "savedStateHandle", "Landroidx/lifecycle/p0;", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryState;", "_state", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/u;", "dataState", "Lkotlinx/coroutines/flow/u;", "getDataState", "()Lkotlinx/coroutines/flow/u;", "", "_validateEnabled", "validateEnabled", "getValidateEnabled", "Lkotlinx/coroutines/channels/g;", "_navigateToHomeEvent", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/flow/e;", "navigateToHomeEvent", "Lkotlinx/coroutines/flow/e;", "getNavigateToHomeEvent", "()Lkotlinx/coroutines/flow/e;", "<init>", "(Lcom/carrefour/fid/android/service/domain/interactors/ServiceGetFacilityDetailsByAnabelKeyUseCase;Lcom/carrefour/fid/android/domain/interactors/service/s;Lcom/carrefour/fid/android/domain/interactors/basket/j0;Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveSummaryAnalyticsReporter;Landroidx/lifecycle/p0;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveSummaryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel\n+ 2 NavArguments.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/NavArgumentsKt\n*L\n1#1,105:1\n6#2:106\n6#2:107\n*S KotlinDebug\n*F\n+ 1 DriveSummaryViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryViewModel\n*L\n46#1:106\n50#1:107\n*E\n"})
public final class DriveSummaryViewModel extends C19476v0 {
    /* access modifiers changed from: private */
    @C12579k
    public final C11744g<C11079d2> _navigateToHomeEvent;
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<C28892e<DriveSummaryState>> _state;
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<Boolean> _validateEnabled;
    @C12579k
    private final DriveSummaryAnalyticsReporter analytics;
    @C12579k
    private final C11952u<C28892e<DriveSummaryState>> dataState;
    /* access modifiers changed from: private */
    @C12579k
    public final ServiceGetFacilityDetailsByAnabelKeyUseCase getFacilityDetailsByAnabelKeyUseCase;
    @C12579k
    private final C11907e<C11079d2> navigateToHomeEvent;
    @C12579k
    private final C19456p0 savedStateHandle;
    /* access modifiers changed from: private */
    @C12579k
    public final C37836s setServiceSelectionUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final C37578j0 switchFacilityServiceInBasketUseCase;
    @C12579k
    private final C11952u<Boolean> validateEnabled;

    @Inject
    public DriveSummaryViewModel(@C12579k ServiceGetFacilityDetailsByAnabelKeyUseCase serviceGetFacilityDetailsByAnabelKeyUseCase, @C12579k C37836s sVar, @C12579k C37578j0 j0Var, @C12579k DriveSummaryAnalyticsReporter driveSummaryAnalyticsReporter, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(serviceGetFacilityDetailsByAnabelKeyUseCase, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(sVar, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        Intrinsics.checkNotNullParameter(driveSummaryAnalyticsReporter, "analytics");
        Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
        this.getFacilityDetailsByAnabelKeyUseCase = serviceGetFacilityDetailsByAnabelKeyUseCase;
        this.setServiceSelectionUseCase = sVar;
        this.switchFacilityServiceInBasketUseCase = j0Var;
        this.analytics = driveSummaryAnalyticsReporter;
        this.savedStateHandle = p0Var;
        C11940j<C28892e<DriveSummaryState>> a = C11953v.m47628a(C28892e.C28894b.f70781b);
        this._state = a;
        this.dataState = C11909g.m47470m(a);
        C11940j<Boolean> a2 = C11953v.m47628a(Boolean.TRUE);
        this._validateEnabled = a2;
        this.validateEnabled = C11909g.m47470m(a2);
        C11744g<C11079d2> d = C11748i.m46625d(1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this._navigateToHomeEvent = d;
        this.navigateToHomeEvent = C11909g.m47490s1(d);
        Object h = p0Var.mo57648h(NavArgumentsKt.ANABEL_KEY);
        Intrinsics.checkNotNull(h);
        fetchSummary((String) h);
    }

    private final C11723c2 fetchSummary(String str) {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveSummaryViewModel$fetchSummary$1(this, str, (C11045c<? super DriveSummaryViewModel$fetchSummary$1>) null), 3, (Object) null);
    }

    @C12579k
    public final DriveSummaryAnalyticsReporter getAnalytics() {
        return this.analytics;
    }

    @C12579k
    public final C11952u<C28892e<DriveSummaryState>> getDataState() {
        return this.dataState;
    }

    @C12579k
    public final C11907e<C11079d2> getNavigateToHomeEvent() {
        return this.navigateToHomeEvent;
    }

    @C12579k
    public final C11952u<Boolean> getValidateEnabled() {
        return this.validateEnabled;
    }

    public final void onRetry() {
        Object h = this.savedStateHandle.mo57648h(NavArgumentsKt.ANABEL_KEY);
        Intrinsics.checkNotNull(h);
        fetchSummary((String) h);
    }

    @C12579k
    public final C11723c2 validate(@C12579k DriveType driveType) {
        Intrinsics.checkNotNullParameter(driveType, "driveType");
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveSummaryViewModel$validate$1(this, driveType, (C11045c<? super DriveSummaryViewModel$validate$1>) null), 3, (Object) null);
    }
}
