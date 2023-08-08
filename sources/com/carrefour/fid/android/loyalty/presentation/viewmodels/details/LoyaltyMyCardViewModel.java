package com.carrefour.fid.android.loyalty.presentation.viewmodels.details;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard;
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

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/LoyaltyMyCardViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UIState;", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction;", "Lkotlin/d2;", "fetchLoyaltyCard", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "intent", "processIntent", "(Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/details/mvi/LoyaltyMyCard$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "getLoyaltyCardNumberFromPreferencesUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class LoyaltyMyCardViewModel extends BaseMVIViewModel<LoyaltyMyCard.UIState, LoyaltyMyCard.UserAction> {
    @C12579k
    private final GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public LoyaltyMyCardViewModel(@C12579k GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase2) {
        super(new LoyaltyMyCard.UIState((String) null, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getLoyaltyCardNumberFromPreferencesUseCase2, "getLoyaltyCardNumberFromPreferencesUseCase");
        this.getLoyaltyCardNumberFromPreferencesUseCase = getLoyaltyCardNumberFromPreferencesUseCase2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchLoyaltyCard(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel$fetchLoyaltyCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel$fetchLoyaltyCard$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel$fetchLoyaltyCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel$fetchLoyaltyCard$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel$fetchLoyaltyCard$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard$UIState r1 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard.UIState) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x005a
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.shared.base.u$d r5 = r4.getCurrentState()
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard$UIState r5 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard.UIState) r5
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase r2 = r4.getLoyaltyCardNumberFromPreferencesUseCase
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r2.m173042invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x005a:
            boolean r2 = kotlin.Result.m38709i(r5)
            if (r2 == 0) goto L_0x0061
            r5 = 0
        L_0x0061:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0067
            java.lang.String r5 = ""
        L_0x0067:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.details.mvi.LoyaltyMyCard$UIState r5 = r1.copy(r5)
            r0.publishState(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.details.LoyaltyMyCardViewModel.fetchLoyaltyCard(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    public Object processIntent(@C12579k LoyaltyMyCard.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (!Intrinsics.areEqual((Object) userAction, (Object) LoyaltyMyCard.UserAction.FetchLoyaltyCard.INSTANCE)) {
            return C11079d2.f28267a;
        }
        Object fetchLoyaltyCard = fetchLoyaltyCard(cVar);
        return fetchLoyaltyCard == C11063b.m42612h() ? fetchLoyaltyCard : C11079d2.f28267a;
    }
}
