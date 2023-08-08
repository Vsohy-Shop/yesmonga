package com.carrefour.fid.android.loyalty.presentation.viewmodels.attach;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.AttachCardAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.AttachCardAnalyticsDelegate;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B!\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005H\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u0001J\u0011\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u0001J\u001b\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0002\u0004\n\u0002\b\u0019¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/AttachCardViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalytics;", "Lkotlin/d2;", "checkExistingCard", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "cardNumber", "submitCard", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "numberCard", "checkCardValidity", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$CardInfo;", "cardInfo", "updateCardInfo", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$CardInfo;Lkotlin/coroutines/c;)Ljava/lang/Object;", "attachLoyaltyCardLater", "contactCustomerService", "sendTagClickFindCardNumber", "sendTagClickValidCardNumber", "sendTagPutCardNumberEdt", "sendTagPutCardNumberScan", "sendTagScreenView", "", "typeCard", "sendTagValidationAttachCard", "trackActiveFidPopIn", "trackTerminalCardPopIn", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase;", "getMemberCardUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "", "isCheckingCard", "Z", "Lkotlinx/coroutines/flow/i;", "_cardInfo", "Lkotlinx/coroutines/flow/i;", "getCardInfo", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/attach/mvi/AttachCard$UiState$CardInfo;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalyticsDelegate;", "attachCardAnalytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/presentation/analytics/AttachCardAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class AttachCardViewModel extends BaseMVIViewModel<AttachCard.UiState, AttachCard.UserAction> implements AttachCardAnalytics {
    private final /* synthetic */ AttachCardAnalyticsDelegate $$delegate_0;
    @C12579k
    private final C11911i<AttachCard.UiState.CardInfo> _cardInfo = C11945o.m47609a(1, 0, BufferOverflow.DROP_OLDEST);
    @C12579k
    private final GetMemberCardUseCase getMemberCardUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;
    private boolean isCheckingCard;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AttachCardViewModel(@C12579k GetMemberCardUseCase getMemberCardUseCase2, @C12579k C37878e eVar, @C12579k AttachCardAnalyticsDelegate attachCardAnalyticsDelegate) {
        super(AttachCard.UiState.InitState.INSTANCE, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getMemberCardUseCase2, "getMemberCardUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(attachCardAnalyticsDelegate, "attachCardAnalytics");
        this.getMemberCardUseCase = getMemberCardUseCase2;
        this.getUserInfoUseCase = eVar;
        this.$$delegate_0 = attachCardAnalyticsDelegate;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object checkCardValidity(java.lang.String r11, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r10 = this;
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r0 = r10.getCardInfo()
            r7 = 1
            r8 = 0
            r9 = 16
            if (r0 == 0) goto L_0x001f
            int r1 = r11.length()
            if (r1 < r9) goto L_0x0012
            r4 = r7
            goto L_0x0013
        L_0x0012:
            r4 = r8
        L_0x0013:
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r0 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.CardInfo.copy$default(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            int r11 = r11.length()
            if (r11 < r9) goto L_0x0027
            r4 = r7
            goto L_0x0028
        L_0x0027:
            r4 = r8
        L_0x0028:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r11 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0033:
            java.lang.Object r11 = r10.updateCardInfo(r0, r12)
            java.lang.Object r12 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r11 != r12) goto L_0x003e
            return r11
        L_0x003e:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel.checkCardValidity(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object checkExistingCard(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$checkExistingCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$checkExistingCard$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$checkExistingCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$checkExistingCard$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$checkExistingCard$1
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel) r0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00b5
        L_0x0034:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel) r2
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0065
        L_0x004a:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r15 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r15.<init>(r5)
            r14.publishState(r15)
            com.carrefour.fid.android.domain.interactors.user.e r15 = r14.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r15 = r15.m172966invokegIAlus(r2, r0)
            if (r15 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r14
        L_0x0065:
            boolean r5 = kotlin.Result.m38710j(r15)
            if (r5 == 0) goto L_0x00bc
            r5 = r15
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r6 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r6.<init>(r3)
            r2.publishState(r6)
            java.util.List r5 = r5.mo116669w()
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r5)
            com.carrefour.fid.android.domain.models.account.UserCards r5 = (com.carrefour.fid.android.domain.models.account.UserCards) r5
            if (r5 == 0) goto L_0x00bc
            java.lang.String r5 = r5.mo116763k()
            if (r5 == 0) goto L_0x00bc
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r6 = r2.getCardInfo()
            if (r6 == 0) goto L_0x009a
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 2
            r12 = 0
            r7 = r5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r6 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.CardInfo.copy$default(r6, r7, r8, r9, r10, r11, r12)
            if (r6 != 0) goto L_0x00a6
        L_0x009a:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r13 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 2
            r12 = 0
            r6 = r13
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x00a6:
            r0.L$0 = r2
            r0.L$1 = r15
            r0.label = r4
            java.lang.Object r0 = r2.updateCardInfo(r6, r0)
            if (r0 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r1 = r15
            r0 = r2
        L_0x00b5:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$CardDetected r15 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiEvent.CardDetected.INSTANCE
            r0.emitEvent(r15)
            r2 = r0
            r15 = r1
        L_0x00bc:
            java.lang.Throwable r15 = kotlin.Result.m38705e(r15)
            if (r15 == 0) goto L_0x00ca
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r15 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r15.<init>(r3)
            r2.publishState(r15)
        L_0x00ca:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel.checkExistingCard(kotlin.coroutines.c):java.lang.Object");
    }

    private final AttachCard.UiState.CardInfo getCardInfo() {
        return (AttachCard.UiState.CardInfo) CollectionsKt___CollectionsKt.m40479B2(this._cardInfo.mo24203d());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object submitCard(java.lang.String r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$submitCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$submitCard$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$submitCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$submitCard$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$submitCard$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x00a9
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0043:
            java.lang.Object r13 = r0.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel) r2
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0091
        L_0x004f:
            kotlin.C11661u0.m45747n(r14)
            boolean r14 = r12.isCheckingCard
            if (r14 == 0) goto L_0x0059
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0059:
            r12.isCheckingCard = r4
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r14 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r14.<init>(r4)
            r12.publishState(r14)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r5 = r12.getCardInfo()
            if (r5 == 0) goto L_0x0076
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 10
            r11 = 0
            r6 = r13
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r14 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.CardInfo.copy$default(r5, r6, r7, r8, r9, r10, r11)
            if (r14 != 0) goto L_0x0083
        L_0x0076:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r14 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 10
            r11 = 0
            r5 = r14
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x0083:
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r14 = r12.updateCardInfo(r14, r0)
            if (r14 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r2 = r12
        L_0x0091:
            r2.sendTagPutCardNumberScan()
            com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase r14 = r2.getMemberCardUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$Param r5 = new com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$Param
            r5.<init>(r13)
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = r14.m173048invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase.Param) r5, (kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain>>) r0)
            if (r14 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r0 = r2
        L_0x00a9:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r14)
            r2 = 0
            if (r1 != 0) goto L_0x00c6
            com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain r14 = (com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain) r14
            r0.sendTagClickValidCardNumber()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$NavigateToSecretCode r14 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$NavigateToSecretCode
            r14.<init>(r13)
            r0.emitEvent(r14)
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r13 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r13.<init>(r2)
            r0.publishState(r13)
            goto L_0x00fe
        L_0x00c6:
            boolean r13 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.InactivePassCardError
            if (r13 == 0) goto L_0x00d0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$InactivePassCard r13 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.InactivePassCard.INSTANCE
            r0.publishState(r13)
            goto L_0x00f6
        L_0x00d0:
            boolean r13 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.InvalidCardError
            if (r13 == 0) goto L_0x00dd
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$IsValidCard r13 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$IsValidCard
            r13.<init>(r4)
            r0.publishState(r13)
            goto L_0x00f6
        L_0x00dd:
            boolean r13 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.TerminalError
            if (r13 == 0) goto L_0x00e7
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$TerminalCardError r13 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiEvent.TerminalCardError.INSTANCE
            r0.emitEvent(r13)
            goto L_0x00f6
        L_0x00e7:
            boolean r13 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.ActiveFidError
            if (r13 == 0) goto L_0x00f1
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$ActiveFidCardError r13 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiEvent.ActiveFidCardError.INSTANCE
            r0.emitEvent(r13)
            goto L_0x00f6
        L_0x00f1:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiEvent$NetworkError r13 = com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiEvent.NetworkError.INSTANCE
            r0.emitEvent(r13)
        L_0x00f6:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading r13 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$Loading
            r13.<init>(r2)
            r0.publishState(r13)
        L_0x00fe:
            r0.isCheckingCard = r2
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel.submitCard(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateCardInfo(com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.CardInfo r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$updateCardInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$updateCardInfo$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$updateCardInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$updateCardInfo$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel$updateCardInfo$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo r5 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard.UiState.CardInfo) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo> r6 = r4._cardInfo
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            r0.publishState(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.AttachCardViewModel.updateCardInfo(com.carrefour.fid.android.loyalty.presentation.viewmodels.attach.mvi.AttachCard$UiState$CardInfo, kotlin.coroutines.c):java.lang.Object");
    }

    public void attachLoyaltyCardLater() {
        this.$$delegate_0.attachLoyaltyCardLater();
    }

    public void contactCustomerService() {
        this.$$delegate_0.contactCustomerService();
    }

    public void sendTagClickFindCardNumber() {
        this.$$delegate_0.sendTagClickFindCardNumber();
    }

    public void sendTagClickValidCardNumber() {
        this.$$delegate_0.sendTagClickValidCardNumber();
    }

    public void sendTagPutCardNumberEdt() {
        this.$$delegate_0.sendTagPutCardNumberEdt();
    }

    public void sendTagPutCardNumberScan() {
        this.$$delegate_0.sendTagPutCardNumberScan();
    }

    public void sendTagScreenView() {
        this.$$delegate_0.sendTagScreenView();
    }

    public void sendTagValidationAttachCard(int i) {
        this.$$delegate_0.sendTagValidationAttachCard(i);
    }

    public void trackActiveFidPopIn() {
        this.$$delegate_0.trackActiveFidPopIn();
    }

    public void trackTerminalCardPopIn() {
        this.$$delegate_0.trackTerminalCardPopIn();
    }

    @C12580l
    public Object processIntent(@C12579k AttachCard.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof AttachCard.UserAction.CheckExistingCard) {
            Object checkExistingCard = checkExistingCard(cVar);
            return checkExistingCard == C11063b.m42612h() ? checkExistingCard : C11079d2.f28267a;
        } else if (userAction instanceof AttachCard.UserAction.CheckCardValidity) {
            Object checkCardValidity = checkCardValidity(((AttachCard.UserAction.CheckCardValidity) userAction).getCardNumber(), cVar);
            return checkCardValidity == C11063b.m42612h() ? checkCardValidity : C11079d2.f28267a;
        } else if (!(userAction instanceof AttachCard.UserAction.ProcessCardNumber)) {
            return C11079d2.f28267a;
        } else {
            Object submitCard = submitCard(((AttachCard.UserAction.ProcessCardNumber) userAction).getCard(), cVar);
            return submitCard == C11063b.m42612h() ? submitCard : C11079d2.f28267a;
        }
    }
}
