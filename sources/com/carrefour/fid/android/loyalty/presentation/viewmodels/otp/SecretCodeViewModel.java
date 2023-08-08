package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B9\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\t\u0010\u0017\u001a\u00020\tH\u0001J\t\u0010\u0018\u001a\u00020\tH\u0001J\u0011\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005H\u0001J\t\u0010\u001b\u001a\u00020\tH\u0001J\t\u0010\u001c\u001a\u00020\tH\u0001J\t\u0010\u001d\u001a\u00020\tH\u0001J\u001b\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010!\u001a\u00020\tR\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00065"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/SecretCodeViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalytics;", "", "loyaltyCardId", "otpCode", "newSecretCode", "Lkotlin/d2;", "updateSecretCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyAuthentication", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyAuthResult", "linkLoyaltyCard", "refreshToken", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "digitNumber", "checkDigitNumber", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$PartialState;", "partialState", "publishState", "sendAirshipTagCardCreated", "sendScreenViewCreateSecretCode", "cardNumber", "sendTagCardCreated", "sendTagClickInitSecretCode", "trackClickActivateSuccess", "trackScreenActivateCard", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "sendAirshipEvent", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase;", "updateSecretCodeUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "loyaltyAuthenticationUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase;", "linkLoyaltyCardUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase;", "Lcom/carrefour/fid/android/domain/interactors/account/g;", "refreshTokenUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/g;", "Lcom/carrefour/fid/android/tracking/a;", "audienceTrackingAdapter", "Lcom/carrefour/fid/android/tracking/a;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase;Lcom/carrefour/fid/android/domain/interactors/account/g;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class SecretCodeViewModel extends BaseMVIViewModel<SecretCode.UIState, SecretCode.UserAction> implements InitSecretCodeAnalytics {
    private final /* synthetic */ InitSecretCodeAnalyticsDelegate $$delegate_0;
    @C12579k
    private final C28994a audienceTrackingAdapter;
    @C12579k
    private final LinkLoyaltyCardUseCase linkLoyaltyCardUseCase;
    @C12579k
    private final LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase;
    @C12579k
    private final C37521g refreshTokenUseCase;
    @C12579k
    private final UpdateSecretCodeUseCase updateSecretCodeUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public SecretCodeViewModel(@C12579k UpdateSecretCodeUseCase updateSecretCodeUseCase2, @C12579k LoyaltyAuthenticationUseCase loyaltyAuthenticationUseCase2, @C12579k LinkLoyaltyCardUseCase linkLoyaltyCardUseCase2, @C12579k C37521g gVar, @C12579k C28994a aVar, @C12579k InitSecretCodeAnalyticsDelegate initSecretCodeAnalyticsDelegate) {
        super(new SecretCode.UIState(false, false, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(updateSecretCodeUseCase2, "updateSecretCodeUseCase");
        Intrinsics.checkNotNullParameter(loyaltyAuthenticationUseCase2, "loyaltyAuthenticationUseCase");
        Intrinsics.checkNotNullParameter(linkLoyaltyCardUseCase2, "linkLoyaltyCardUseCase");
        Intrinsics.checkNotNullParameter(gVar, "refreshTokenUseCase");
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(initSecretCodeAnalyticsDelegate, "analytics");
        this.updateSecretCodeUseCase = updateSecretCodeUseCase2;
        this.loyaltyAuthenticationUseCase = loyaltyAuthenticationUseCase2;
        this.linkLoyaltyCardUseCase = linkLoyaltyCardUseCase2;
        this.refreshTokenUseCase = gVar;
        this.audienceTrackingAdapter = aVar;
        this.$$delegate_0 = initSecretCodeAnalyticsDelegate;
    }

    private final void checkDigitNumber(String str) {
        boolean z;
        SecretCode.UIState uIState = (SecretCode.UIState) getCurrentState();
        if (str.length() != 4) {
            z = true;
        } else {
            z = false;
        }
        publishState(uIState.copy(false, z));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object linkLoyaltyCard(java.lang.String r6, java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$linkLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$linkLoyaltyCard$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$linkLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$linkLoyaltyCard$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$linkLoyaltyCard$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel r6 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel) r6
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0058
        L_0x0042:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase r8 = r5.linkLoyaltyCardUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$Param
            r2.<init>(r6, r7)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r8.m173056invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r5
        L_0x0058:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r7)
            if (r8 != 0) goto L_0x006c
            java.lang.String r7 = (java.lang.String) r7
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.refreshToken(r0)
            if (r6 != r1) goto L_0x007d
            return r1
        L_0x006c:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r7 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r0 = 0
            r7.<init>(r0)
            r6.publishState(r7)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode r7 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode
            r7.<init>(r8)
            r6.emitEvent(r7)
        L_0x007d:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel.linkLoyaltyCard(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object loyaltyAuthentication(java.lang.String r6, java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$loyaltyAuthentication$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$loyaltyAuthentication$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$loyaltyAuthentication$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$loyaltyAuthentication$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$loyaltyAuthentication$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0099
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel r7 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0072
        L_0x0046:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.shared.base.u$d r8 = r5.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UIState r8 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode.UIState) r8
            boolean r8 = r8.isLoading()
            if (r8 != 0) goto L_0x005d
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r8 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r8.<init>(r4)
            r5.publishState(r8)
        L_0x005d:
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase r8 = r5.loyaltyAuthenticationUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param
            r2.<init>(r6, r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r8.m173058invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r7 = r5
        L_0x0072:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r8)
            if (r2 != 0) goto L_0x0088
            java.lang.String r8 = (java.lang.String) r8
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r7.linkLoyaltyCard(r8, r6, r0)
            if (r6 != r1) goto L_0x0099
            return r1
        L_0x0088:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r8 = 0
            r6.<init>(r8)
            r7.publishState(r6)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode
            r6.<init>(r2)
            r7.emitEvent(r6)
        L_0x0099:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel.loyaltyAuthentication(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    private final void publishState(SecretCode.PartialState partialState) {
        reduceAndPublishState(SecretCode.INSTANCE.getReducer(), partialState);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object refreshToken(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$refreshToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$refreshToken$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$refreshToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$refreshToken$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$refreshToken$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.account.g r5 = r4.refreshTokenUseCase
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r5)
            r2 = 0
            if (r1 != 0) goto L_0x007f
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r1 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r1.<init>(r2)
            r0.publishState(r1)
            if (r5 == 0) goto L_0x006f
            r0.sendAirshipTagCardCreated()
            r0.sendAirshipEvent()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ShowNextDestination r5 = com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode.UiEvent.ShowNextDestination.INSTANCE
            r0.emitEvent(r5)
            goto L_0x008f
        L_0x006f:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "failed to refresh token"
            r1.<init>(r2)
            r5.<init>(r1)
            r0.emitEvent(r5)
            goto L_0x008f
        L_0x007f:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r5.<init>(r2)
            r0.publishState(r5)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode
            r5.<init>(r1)
            r0.emitEvent(r5)
        L_0x008f:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel.refreshToken(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSecretCode(java.lang.String r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$updateSecretCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$updateSecretCode$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$updateSecretCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$updateSecretCode$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel$updateSecretCode$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0096
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$2
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel r7 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel) r7
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006d
        L_0x004b:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r9 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r9.<init>(r4)
            r5.publishState(r9)
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase r9 = r5.updateSecretCodeUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$Param
            r2.<init>(r6, r7, r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m173070invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>>) r0)
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r7 = r5
        L_0x006d:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r9)
            if (r2 != 0) goto L_0x0085
            java.lang.String r9 = (java.lang.String) r9
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r6 = r7.loyaltyAuthentication(r6, r8, r0)
            if (r6 != r1) goto L_0x0096
            return r1
        L_0x0085:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$PartialState$Loading
            r8 = 0
            r6.<init>(r8)
            r7.publishState(r6)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode$UiEvent$ErrorUpdateSecretCode
            r6.<init>(r2)
            r7.emitEvent(r6)
        L_0x0096:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel.updateSecretCode(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public final void sendAirshipEvent() {
        this.audienceTrackingAdapter.mo32669d(C13758b.f33445f0, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33447g0, C28932h.f70914a.mo84245o())));
    }

    public void sendAirshipTagCardCreated() {
        this.$$delegate_0.sendAirshipTagCardCreated();
    }

    public void sendScreenViewCreateSecretCode() {
        this.$$delegate_0.sendScreenViewCreateSecretCode();
    }

    public void sendTagCardCreated(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
        this.$$delegate_0.sendTagCardCreated(str);
    }

    public void sendTagClickInitSecretCode() {
        this.$$delegate_0.sendTagClickInitSecretCode();
    }

    public void trackClickActivateSuccess() {
        this.$$delegate_0.trackClickActivateSuccess();
    }

    public void trackScreenActivateCard() {
        this.$$delegate_0.trackScreenActivateCard();
    }

    @C12580l
    public Object processIntent(@C12579k SecretCode.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof SecretCode.UserAction.UpdateSecretCode) {
            SecretCode.UserAction.UpdateSecretCode updateSecretCode = (SecretCode.UserAction.UpdateSecretCode) userAction;
            if (updateSecretCode.getOtpCode().length() == 0) {
                Object loyaltyAuthentication = loyaltyAuthentication(updateSecretCode.getLoyaltyCard(), updateSecretCode.getSecretCode(), cVar);
                return loyaltyAuthentication == C11063b.m42612h() ? loyaltyAuthentication : C11079d2.f28267a;
            }
            Object updateSecretCode2 = updateSecretCode(updateSecretCode.getLoyaltyCard(), updateSecretCode.getOtpCode(), updateSecretCode.getSecretCode(), cVar);
            return updateSecretCode2 == C11063b.m42612h() ? updateSecretCode2 : C11079d2.f28267a;
        }
        if (userAction instanceof SecretCode.UserAction.CheckDigitNumber) {
            checkDigitNumber(((SecretCode.UserAction.CheckDigitNumber) userAction).getDigitNumber());
        }
        return C11079d2.f28267a;
    }
}
