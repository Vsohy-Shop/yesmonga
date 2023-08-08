package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.BlockedCardAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.BlockedCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard;
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

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0007H\u0001J\t\u0010\u000b\u001a\u00020\u0007H\u0001J\t\u0010\f\u001a\u00020\u0007H\u0001J\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/BlockedCardViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/BlockedCardAnalytics;", "", "loyaltyCardNumber", "Lkotlin/d2;", "fetchUserChannels", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "sendScreenView", "sendTagOnInitSecretCodeClick", "sendTagOnRetryClick", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;", "getUserChannelsUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/BlockedCardAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetUserChannelsUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/BlockedCardAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class BlockedCardViewModel extends BaseMVIViewModel<BlockedCard.UIState, BlockedCard.UserAction> implements BlockedCardAnalytics {
    private final /* synthetic */ BlockedCardAnalyticsDelegate $$delegate_0;
    @C12579k
    private final GetUserChannelsUseCase getUserChannelsUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BlockedCardViewModel(@C12579k GetUserChannelsUseCase getUserChannelsUseCase2, @C12579k BlockedCardAnalyticsDelegate blockedCardAnalyticsDelegate) {
        super(new BlockedCard.UIState(false, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getUserChannelsUseCase2, "getUserChannelsUseCase");
        Intrinsics.checkNotNullParameter(blockedCardAnalyticsDelegate, "analytics");
        this.getUserChannelsUseCase = getUserChannelsUseCase2;
        this.$$delegate_0 = blockedCardAnalyticsDelegate;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchUserChannels(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel$fetchUserChannels$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel$fetchUserChannels$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel$fetchUserChannels$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel$fetchUserChannels$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel$fetchUserChannels$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0064
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.base.u$d r6 = r4.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r6 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard.UIState) r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r6 = r6.copy(r3)
            r4.publishState(r6)
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase r6 = r4.getUserChannelsUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase$Param r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase$Param
            r2.<init>(r5)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m173052invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetUserChannelsUseCase.Param) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain>>>) r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r4
        L_0x0064:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
            r2 = 0
            if (r1 != 0) goto L_0x0086
            java.util.List r6 = (java.util.List) r6
            r0.sendTagOnInitSecretCodeClick()
            com.carrefour.fid.android.shared.base.u$d r6 = r0.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r6 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard.UIState) r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r6 = r6.copy(r2)
            r0.publishState(r6)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UiEvent$ShowDisplayChannels r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UiEvent$ShowDisplayChannels
            r6.<init>(r5)
            r0.emitEvent(r6)
            goto L_0x009b
        L_0x0086:
            com.carrefour.fid.android.shared.base.u$d r5 = r0.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r5 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard.UIState) r5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UIState r5 = r5.copy(r2)
            r0.publishState(r5)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UiEvent$ErrorDisplayChannels r5 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard$UiEvent$ErrorDisplayChannels
            r5.<init>(r1)
            r0.emitEvent(r5)
        L_0x009b:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel.fetchUserChannels(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendScreenView() {
        this.$$delegate_0.sendScreenView();
    }

    public void sendTagOnInitSecretCodeClick() {
        this.$$delegate_0.sendTagOnInitSecretCodeClick();
    }

    public void sendTagOnRetryClick() {
        this.$$delegate_0.sendTagOnRetryClick();
    }

    @C12580l
    public Object processIntent(@C12579k BlockedCard.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (!(userAction instanceof BlockedCard.UserAction.FetchUserChannels)) {
            return C11079d2.f28267a;
        }
        Object fetchUserChannels = fetchUserChannels(((BlockedCard.UserAction.FetchUserChannels) userAction).getLoyaltyCardNumber(), cVar);
        return fetchUserChannels == C11063b.m42612h() ? fetchUserChannels : C11079d2.f28267a;
    }
}
