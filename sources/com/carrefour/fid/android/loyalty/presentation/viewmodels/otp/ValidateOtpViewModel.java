package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.ValidateOtpAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.ValidateOtpAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\t\u0010\r\u001a\u00020\bH\u0001J\u001b\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ValidateOtpViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/ValidateOtpAnalytics;", "", "otpCode", "loyaltyCardNumber", "Lkotlin/d2;", "validationOtpCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "digitNumber", "checkDigitNumber", "sendTagClickNotReceiveMyCode", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ValidateOtpUseCase;", "validateOtpUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ValidateOtpUseCase;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/ValidateOtpAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/ValidateOtpUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/ValidateOtpAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class ValidateOtpViewModel extends BaseMVIViewModel<ValidateOtp.UIState, ValidateOtp.UserAction> implements ValidateOtpAnalytics {
    private final /* synthetic */ ValidateOtpAnalyticsDelegate $$delegate_0;
    @C12579k
    private final ValidateOtpUseCase validateOtpUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ValidateOtpViewModel(@C12579k ValidateOtpUseCase validateOtpUseCase2, @C12579k ValidateOtpAnalyticsDelegate validateOtpAnalyticsDelegate) {
        super(new ValidateOtp.UIState(false, false, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(validateOtpUseCase2, "validateOtpUseCase");
        Intrinsics.checkNotNullParameter(validateOtpAnalyticsDelegate, "analytics");
        this.validateOtpUseCase = validateOtpUseCase2;
        this.$$delegate_0 = validateOtpAnalyticsDelegate;
    }

    private final void checkDigitNumber(String str) {
        boolean z;
        ValidateOtp.UIState uIState = (ValidateOtp.UIState) getCurrentState();
        if (str.length() != 6) {
            z = true;
        } else {
            z = false;
        }
        publishState(uIState.copy(false, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object validationOtpCode(java.lang.String r8, java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel$validationOtpCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel$validationOtpCode$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel$validationOtpCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel$validationOtpCode$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel$validationOtpCode$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r6) goto L_0x003b
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel r8 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel) r8
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x0068
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.shared.base.u$d r10 = r7.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UIState r10 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp.UIState) r10
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UIState r10 = com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp.UIState.copy$default(r10, r6, r5, r4, r3)
            r7.publishState(r10)
            com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase r10 = r7.validateOtpUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase$Param
            r2.<init>(r9, r8)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r10.m173072invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
            if (r10 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r8 = r7
        L_0x0068:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r10)
            if (r0 != 0) goto L_0x0079
            java.lang.String r10 = (java.lang.String) r10
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UiEvent$NavigateToCreateSecretCode r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UiEvent$NavigateToCreateSecretCode
            r0.<init>(r10, r9)
            r8.emitEvent(r0)
            goto L_0x008e
        L_0x0079:
            com.carrefour.fid.android.shared.base.u$d r9 = r8.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UIState r9 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp.UIState) r9
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UIState r9 = com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp.UIState.copy$default(r9, r5, r5, r4, r3)
            r8.publishState(r9)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UiEvent$ErrorValidateOtp r9 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp$UiEvent$ErrorValidateOtp
            r9.<init>(r0)
            r8.emitEvent(r9)
        L_0x008e:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel.validationOtpCode(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendTagClickNotReceiveMyCode() {
        this.$$delegate_0.sendTagClickNotReceiveMyCode();
    }

    @C12580l
    public Object processIntent(@C12579k ValidateOtp.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof ValidateOtp.UserAction.ValidationOtpCode) {
            ValidateOtp.UserAction.ValidationOtpCode validationOtpCode = (ValidateOtp.UserAction.ValidationOtpCode) userAction;
            Object validationOtpCode2 = validationOtpCode(validationOtpCode.getOtpCode(), validationOtpCode.getLoyaltyCardNumber(), cVar);
            return validationOtpCode2 == C11063b.m42612h() ? validationOtpCode2 : C11079d2.f28267a;
        }
        if (userAction instanceof ValidateOtp.UserAction.CheckDigitNumber) {
            checkDigitNumber(((ValidateOtp.UserAction.CheckDigitNumber) userAction).getDigitNumber());
        }
        return C11079d2.f28267a;
    }
}
