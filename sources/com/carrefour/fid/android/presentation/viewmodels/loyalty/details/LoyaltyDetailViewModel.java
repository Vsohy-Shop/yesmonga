package com.carrefour.fid.android.presentation.viewmodels.loyalty.details;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.domain.interactors.GetLoyaltyBonusListUseCase;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.domain.interactors.account.C37515a;
import com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.C37827o;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.loyalty.domain.interactors.ClearLoyaltyUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B¢\u0001\b\u0007\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z\u0012\u0006\u0010a\u001a\u00020^\u0012\u0006\u0010e\u001a\u00020b\u0012\u0006\u0010i\u001a\u00020f\u0012\u0006\u0010m\u001a\u00020j\u0012\u0006\u0010q\u001a\u00020n\u0012\u0006\u0010u\u001a\u00020r\u0012\u0006\u0010y\u001a\u00020v\u0012\u0006\u0010}\u001a\u00020z\u0012\u0007\u0010\u0001\u001a\u00020~\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u001b\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0016\u0010\u001f\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0013\u0010 \u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\b\u0010!\u001a\u00020\u0007H\u0002J\u0013\u0010\"\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u0013\u0010#\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u000bJ\u0013\u0010%\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u000bJ\u0015\u0010&\u001a\u0004\u0018\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000bJ\u001b\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020$H\u0002J\u0013\u0010+\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u000bJ\u0013\u0010,\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u000bJ\u0013\u0010-\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u000bJ#\u00100\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0011\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0001J\t\u00105\u001a\u00020\u0007H\u0001J\t\u00106\u001a\u00020\u0007H\u0001J\t\u00107\u001a\u00020\u0007H\u0001J\t\u00108\u001a\u00020\u0007H\u0001J\u0011\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0001J\t\u0010<\u001a\u00020\u0007H\u0001J\u0017\u0010>\u001a\u00020\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0001J\t\u0010?\u001a\u00020\u0007H\u0001J\t\u0010@\u001a\u00020\u0007H\u0001J\t\u0010A\u001a\u00020\u0007H\u0001J\u0011\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0010H\u0001J\u001b\u0010D\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u0001\u001a\u00020~8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00178BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$j;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$k;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalytics;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$k$c;", "intent", "Lkotlin/d2;", "K0", "(Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$k$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "z0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/UserCards;", "cardModel", "H0", "(Lcom/carrefour/fid/android/domain/models/account/UserCards;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "fidCardNumber", "G0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/c2;", "D0", "A0", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$g;", "couponsUiState", "U0", "(Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$g;Lkotlin/coroutines/c;)Ljava/lang/Object;", "B0", "", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "cmsPrimeList", "C0", "J0", "L0", "I0", "y0", "", "M0", "F0", "hasPrimeFid", "T0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "N0", "P0", "O0", "Q0", "secureToken", "url", "R0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "couponNumber", "sendCouponsTracking", "sendDetachedCardTracking", "sendTagCancelClearData", "sendTagClickLoyaltyCardButton", "sendTagClickModifySecretCode", "Lcom/carrefour/fid/android/loyalty/core/type/CardType;", "cardType", "sendTagConfirmClearData", "sendTagOnServiceStationsClick", "primeFisList", "sendTagPrimeFidList", "sendTagScreenView", "tagChallengeFid", "tagChallengeFidClick", "eventLabel", "tagRescuePrimeCMS", "S0", "(Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$k;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;", "a", "Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;", "getGazStationsCampaignUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "b", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;", "c", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;", "getLoyaltyClubsUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetLoyaltyBonusListUseCase;", "d", "Lcom/carrefour/fid/android/cms/domain/interactors/GetLoyaltyBonusListUseCase;", "getLoyaltyBonusListUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "e", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "hasCardFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;", "f", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;", "saveHasPrimeFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ClearLoyaltyUseCase;", "g", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ClearLoyaltyUseCase;", "clearLoyaltyUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyChannelsUseCase;", "h", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyChannelsUseCase;", "getLoyaltyChannelsUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "i", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "j", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "fetchCouponsUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "k", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/domain/interactors/account/a;", "l", "Lcom/carrefour/fid/android/domain/interactors/account/a;", "clearCachedUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "m", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "serviceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/o;", "n", "Lcom/carrefour/fid/android/domain/interactors/service/o;", "isSelectedServiceDeliveryUseCaseUseCase", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "o", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "getSecureTokenUseCase", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "p", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "remoteLogUseCase", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;", "q", "Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;", "getArsenalJOBannerUseCase", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate;", "r", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate;", "loyaltyDetailAnalytics", "Lkotlinx/coroutines/flow/i;", "s", "Lkotlinx/coroutines/flow/i;", "_currentCouponState", "E0", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$g;", "currentCouponState", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/gazStation/GetGazStationsCampaignUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;Lcom/carrefour/fid/android/cms/domain/interactors/GetLoyaltyBonusListUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/ClearLoyaltyUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyChannelsUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/domain/interactors/account/a;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/service/o;Lcom/carrefour/fid/android/domain/interactors/utilities/b;Lcom/carrefour/fid/android/domain/interactors/logm/a;Lcom/carrefour/fid/android/domain/interactors/arsenal/GetArsenalJOBannerUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyDetailAnalyticsDelegate;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoyaltyDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyDetailViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"})
public final class LoyaltyDetailViewModel extends BaseMVIViewModel<C26562a.C26590j, C26562a.C26601k> implements LoyaltyDetailAnalytics {

    /* renamed from: t */
    public static final int f64874t = 8;
    @C12579k

    /* renamed from: a */
    public final GetGazStationsCampaignUseCase f64875a;
    @C12579k

    /* renamed from: b */
    public final GetLoyaltyBalanceUseCase f64876b;
    @C12579k

    /* renamed from: c */
    public final GetLoyaltyClubsUseCase f64877c;
    @C12579k

    /* renamed from: d */
    public final GetLoyaltyBonusListUseCase f64878d;
    @C12579k

    /* renamed from: e */
    public final FidelityHasCardFidUseCase f64879e;
    @C12579k

    /* renamed from: f */
    public final SaveHasPrimeFidUseCase f64880f;
    @C12579k

    /* renamed from: g */
    public final ClearLoyaltyUseCase f64881g;
    @C12579k

    /* renamed from: h */
    public final GetLoyaltyChannelsUseCase f64882h;
    @C12579k

    /* renamed from: i */
    public final C37878e f64883i;
    @C12579k

    /* renamed from: j */
    public final FetchCouponsUseCase f64884j;
    @C12579k

    /* renamed from: k */
    public final LoginRepository f64885k;
    @C12579k

    /* renamed from: l */
    public final C37515a f64886l;
    @C12579k

    /* renamed from: m */
    public final C37823k f64887m;
    @C12579k

    /* renamed from: n */
    public final C37827o f64888n;
    @C12579k

    /* renamed from: o */
    public final C37888b f64889o;
    @C12579k

    /* renamed from: p */
    public final C37694a f64890p;
    @C12579k

    /* renamed from: q */
    public final GetArsenalJOBannerUseCase f64891q;
    @C12579k

    /* renamed from: r */
    public final LoyaltyDetailAnalyticsDelegate f64892r;
    @C12579k

    /* renamed from: s */
    public final C11911i<C26562a.C26569g> f64893s = C11945o.m47609a(1, 0, BufferOverflow.DROP_OLDEST);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public LoyaltyDetailViewModel(@C12579k GetGazStationsCampaignUseCase getGazStationsCampaignUseCase, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, @C12579k GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, @C12579k GetLoyaltyBonusListUseCase getLoyaltyBonusListUseCase, @C12579k FidelityHasCardFidUseCase fidelityHasCardFidUseCase, @C12579k SaveHasPrimeFidUseCase saveHasPrimeFidUseCase, @C12579k ClearLoyaltyUseCase clearLoyaltyUseCase, @C12579k GetLoyaltyChannelsUseCase getLoyaltyChannelsUseCase, @C12579k C37878e eVar, @C12579k FetchCouponsUseCase fetchCouponsUseCase, @C12579k LoginRepository loginRepository, @C12579k C37515a aVar, @C12579k C37823k kVar, @C12579k C37827o oVar, @C12579k C37888b bVar, @C12579k C37694a aVar2, @C12579k GetArsenalJOBannerUseCase getArsenalJOBannerUseCase, @C12579k LoyaltyDetailAnalyticsDelegate loyaltyDetailAnalyticsDelegate) {
        super(C26562a.C26590j.C26597g.f64976b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        GetGazStationsCampaignUseCase getGazStationsCampaignUseCase2 = getGazStationsCampaignUseCase;
        GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase2 = getLoyaltyBalanceUseCase;
        GetLoyaltyClubsUseCase getLoyaltyClubsUseCase2 = getLoyaltyClubsUseCase;
        GetLoyaltyBonusListUseCase getLoyaltyBonusListUseCase2 = getLoyaltyBonusListUseCase;
        FidelityHasCardFidUseCase fidelityHasCardFidUseCase2 = fidelityHasCardFidUseCase;
        SaveHasPrimeFidUseCase saveHasPrimeFidUseCase2 = saveHasPrimeFidUseCase;
        ClearLoyaltyUseCase clearLoyaltyUseCase2 = clearLoyaltyUseCase;
        GetLoyaltyChannelsUseCase getLoyaltyChannelsUseCase2 = getLoyaltyChannelsUseCase;
        C37878e eVar2 = eVar;
        C37823k kVar2 = kVar;
        C37694a aVar3 = aVar2;
        Intrinsics.checkNotNullParameter(getGazStationsCampaignUseCase2, "getGazStationsCampaignUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase2, "getLoyaltyBalanceUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyClubsUseCase2, "getLoyaltyClubsUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyBonusListUseCase2, "getLoyaltyBonusListUseCase");
        Intrinsics.checkNotNullParameter(fidelityHasCardFidUseCase2, "hasCardFidUseCase");
        Intrinsics.checkNotNullParameter(saveHasPrimeFidUseCase2, "saveHasPrimeFidUseCase");
        Intrinsics.checkNotNullParameter(clearLoyaltyUseCase2, "clearLoyaltyUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyChannelsUseCase2, "getLoyaltyChannelsUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(fetchCouponsUseCase, "fetchCouponsUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(aVar, "clearCachedUserInfoUseCase");
        Intrinsics.checkNotNullParameter(kVar2, "serviceSelectionUseCase");
        Intrinsics.checkNotNullParameter(oVar, "isSelectedServiceDeliveryUseCaseUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getSecureTokenUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "remoteLogUseCase");
        Intrinsics.checkNotNullParameter(getArsenalJOBannerUseCase, "getArsenalJOBannerUseCase");
        Intrinsics.checkNotNullParameter(loyaltyDetailAnalyticsDelegate, "loyaltyDetailAnalytics");
        C37823k kVar3 = kVar2;
        this.f64875a = getGazStationsCampaignUseCase2;
        this.f64876b = getLoyaltyBalanceUseCase2;
        this.f64877c = getLoyaltyClubsUseCase2;
        this.f64878d = getLoyaltyBonusListUseCase2;
        this.f64879e = fidelityHasCardFidUseCase2;
        this.f64880f = saveHasPrimeFidUseCase2;
        this.f64881g = clearLoyaltyUseCase2;
        this.f64882h = getLoyaltyChannelsUseCase2;
        this.f64883i = eVar2;
        this.f64884j = fetchCouponsUseCase;
        this.f64885k = loginRepository;
        this.f64886l = aVar;
        this.f64887m = kVar;
        this.f64888n = oVar;
        this.f64889o = bVar;
        this.f64890p = aVar2;
        this.f64891q = getArsenalJOBannerUseCase;
        this.f64892r = loyaltyDetailAnalyticsDelegate;
    }

    /* renamed from: A0 */
    public final C11723c2 mo77219A0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyDetailViewModel$fetchCoupons$1(this, (C11045c<? super LoyaltyDetailViewModel$fetchCoupons$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77220B0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClub$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClub$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClub$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchLoyaltyClub$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x00b0
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0097
        L_0x004a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0072
        L_0x0052:
            kotlin.C11661u0.m45747n(r7)
            boolean r7 = r6.mo77232N0()
            if (r7 != 0) goto L_0x0066
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r7 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$h r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26578h.f64939a
            r7.<init>(r0)
            r6.emitEvent(r7)
            goto L_0x00b5
        L_0x0066:
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.mo77231M0(r0)
            if (r7 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r6
        L_0x0072:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0085
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r7 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$g r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26577g.f64937a
            r7.<init>(r0)
            r2.emitEvent(r7)
            goto L_0x00b5
        L_0x0085:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$i r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26599i.f64980b
            r2.publishState(r7)
            com.carrefour.fid.android.cms.domain.interactors.GetLoyaltyBonusListUseCase r7 = r2.f64878d
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.m173129invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x0097
            return r1
        L_0x0097:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x00a3
            java.util.List r7 = (java.util.List) r7
            r2.mo77221C0(r7)
            goto L_0x00b5
        L_0x00a3:
            r0.L$0 = r2
            r0.label = r3
            r7 = 0
            java.lang.Object r7 = r2.mo77238T0(r7, r0)
            if (r7 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r0 = r2
        L_0x00b0:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$f r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26590j.C26596f.f64974b
            r0.publishState(r7)
        L_0x00b5:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77220B0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: C0 */
    public final void mo77221C0(List<LoyaltyBonus> list) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyDetailViewModel$fetchLoyaltyClubs$1(this, list, (C11045c<? super LoyaltyDetailViewModel$fetchLoyaltyClubs$1>) null), 3, (Object) null);
    }

    /* renamed from: D0 */
    public final C11723c2 mo77222D0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyDetailViewModel$fetchServiceStationsCampaign$1(this, (C11045c<? super LoyaltyDetailViewModel$fetchServiceStationsCampaign$1>) null), 3, (Object) null);
    }

    /* renamed from: E0 */
    public final C26562a.C26569g mo77223E0() {
        C26562a.C26569g gVar = (C26562a.C26569g) CollectionsKt___CollectionsKt.m40479B2(this.f64893s.mo24203d());
        return gVar == null ? new C26562a.C26566d(0) : gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77224F0(kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.account.UserCards> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getFidCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getFidCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getFidCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getFidCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getFidCard$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.user.e r5 = r4.f64883i
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x005a
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r0 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r5 = r5.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r5 = r0.getMostRecentAndSecuredLoyaltyCard(r5)
            return r5
        L_0x005a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77224F0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77225G0(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getJOBannerData$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getJOBannerData$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getJOBannerData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getJOBannerData$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getJOBannerData$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase r6 = r4.f64891q
            com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.arsenal.GetArsenalJOBannerUseCase$a
            r2.<init>(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.m172940invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r5 = r4
        L_0x0051:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            if (r0 != 0) goto L_0x006a
            com.carrefour.fid.android.domain.models.ArsenalJOBanner r6 = (com.carrefour.fid.android.domain.models.ArsenalJOBanner) r6
            com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate r0 = r5.f64892r
            java.lang.String r1 = r6.getOpCode()
            r0.tagArsenalDisplayed(r1)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$h r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$h
            r0.<init>(r6)
            r5.publishState(r0)
        L_0x006a:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77225G0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77226H0(com.carrefour.fid.android.domain.models.account.UserCards r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getLoyaltyBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getLoyaltyBalance$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getLoyaltyBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getLoyaltyBalance$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$getLoyaltyBalance$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r6 = (com.carrefour.fid.android.domain.models.account.UserCards) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005b
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r7 = r5.f64876b
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r2 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
            java.lang.String r4 = r6.mo116763k()
            r2.<init>(r4)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r0)
            if (r7 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r5
        L_0x005b:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r7)
            if (r1 != 0) goto L_0x007c
            java.lang.Number r7 = (java.lang.Number) r7
            double r1 = r7.doubleValue()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b r7 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b
            java.lang.String r3 = r6.mo116763k()
            java.lang.String r6 = r6.mo116759h()
            com.carrefour.fid.android.loyalty.core.type.CardType r6 = com.carrefour.fid.android.loyalty.core.type.CardType.valueOf(r6)
            r7.<init>(r3, r6, r1)
            r0.publishState(r7)
            goto L_0x00d2
        L_0x007c:
            boolean r7 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutNotAcceptedCardFidThrowable
            if (r7 == 0) goto L_0x0097
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b r7 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b
            java.lang.String r1 = r6.mo116763k()
            java.lang.String r6 = r6.mo116759h()
            com.carrefour.fid.android.loyalty.core.type.CardType r6 = com.carrefour.fid.android.loyalty.core.type.CardType.valueOf(r6)
            r2 = 0
            r7.<init>(r1, r6, r2)
            r0.publishState(r7)
            goto L_0x00d2
        L_0x0097:
            boolean r6 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutCardFidNotSecuredThrowable
            if (r6 == 0) goto L_0x00a6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$d r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26574d.f64931a
            r6.<init>(r7)
            r0.emitEvent(r6)
            goto L_0x00d2
        L_0x00a6:
            boolean r6 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutCardFidThrowable
            if (r6 == 0) goto L_0x00b5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$c r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26573c.f64929a
            r6.<init>(r7)
            r0.emitEvent(r6)
            goto L_0x00d2
        L_0x00b5:
            boolean r6 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutBalanceThrowable
            if (r6 == 0) goto L_0x00c4
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$a r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26571a.f64925a
            r6.<init>(r7)
            r0.emitEvent(r6)
            goto L_0x00d2
        L_0x00c4:
            boolean r6 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutBalanceFidThrowable
            if (r6 == 0) goto L_0x00d2
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$b r7 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26572b.f64927a
            r6.<init>(r7)
            r0.emitEvent(r6)
        L_0x00d2:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77226H0(com.carrefour.fid.android.domain.models.account.UserCards, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77227I0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleChangeSecretCode$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleChangeSecretCode$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleChangeSecretCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleChangeSecretCode$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleChangeSecretCode$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r1 = (com.carrefour.fid.android.domain.models.account.UserCards) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x008a
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0059
        L_0x004a:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.mo77224F0(r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r7
        L_0x0059:
            com.carrefour.fid.android.domain.models.account.UserCards r8 = (com.carrefour.fid.android.domain.models.account.UserCards) r8
            if (r8 != 0) goto L_0x0065
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$a r8 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26580a.f64941a
            r2.emitEvent(r8)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0065:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$c r4 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$c r5 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26565c.f64917a
            r4.<init>(r5)
            r2.publishState(r4)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase r4 = r2.f64882h
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase$Params r5 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase$Params
            java.lang.String r6 = r8.mo116763k()
            r5.<init>(r6)
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r0 = r4.m173044invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyChannelsUseCase.Params) r5, (kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.UserChannelsMediaDomain>>>) r0)
            if (r0 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r1 = r8
            r8 = r0
            r0 = r2
        L_0x008a:
            boolean r2 = kotlin.Result.m38710j(r8)
            if (r2 == 0) goto L_0x00a5
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$h r3 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$h
            if (r2 != 0) goto L_0x009b
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x009b:
            java.lang.String r1 = r1.mo116763k()
            r3.<init>(r2, r1)
            r0.emitEvent(r3)
        L_0x00a5:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x00b0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$a r8 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26580a.f64941a
            r0.emitEvent(r8)
        L_0x00b0:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$c r8 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$b r1 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26564b.f64915a
            r8.<init>(r1)
            r0.publishState(r8)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77227I0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC, Splitter:B:24:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77228J0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleDetachCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleDetachCard$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleDetachCard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleDetachCard$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleDetachCard$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0065
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.mo21858l()
            goto L_0x0056
        L_0x0045:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.domain.interactors.ClearLoyaltyUseCase r6 = r5.f64881g
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.m173033invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r5
        L_0x0056:
            r2.sendDetachedCardTracking()
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r2.mo77224F0(r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r0 = r2
        L_0x0065:
            com.carrefour.fid.android.domain.models.account.UserCards r6 = (com.carrefour.fid.android.domain.models.account.UserCards) r6
            if (r6 == 0) goto L_0x0094
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = r6.mo116759h()     // Catch:{ all -> 0x0078 }
            com.carrefour.fid.android.loyalty.core.type.CardType r6 = com.carrefour.fid.android.loyalty.core.type.CardType.valueOf(r6)     // Catch:{ all -> 0x0078 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0078 }
            goto L_0x0083
        L_0x0078:
            r6 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0083:
            boolean r1 = kotlin.Result.m38709i(r6)
            if (r1 == 0) goto L_0x008a
            r6 = 0
        L_0x008a:
            com.carrefour.fid.android.loyalty.core.type.CardType r6 = (com.carrefour.fid.android.loyalty.core.type.CardType) r6
            if (r6 != 0) goto L_0x0091
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0091:
            r0.sendTagConfirmClearData(r6)
        L_0x0094:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$d r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26583d.f64947a
            r0.emitEvent(r6)
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77228J0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77229K0(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26604c r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleJOBannerClick$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleJOBannerClick$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleJOBannerClick$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleJOBannerClick$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$handleJOBannerClick$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r8 = r0.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.L$2
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$c r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26604c) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0096
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$c r8 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26604c) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0074
        L_0x0054:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.utilities.b r9 = r7.f64889o
            com.carrefour.fid.android.domain.interactors.utilities.b$a r2 = new com.carrefour.fid.android.domain.interactors.utilities.b$a
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r7.f64885k
            java.lang.String r5 = r5.mo31350b()
            java.lang.String r6 = "ARSENAL"
            r2.<init>(r5, r6)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r7
        L_0x0074:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00b1
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r8.mo77348g()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r4
            r0.label = r3
            java.lang.Object r0 = r2.mo77236R0(r4, r5, r0)
            if (r0 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r1 = r9
            r0 = r2
            r2 = r8
            r8 = r4
        L_0x0096:
            com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyDetailAnalyticsDelegate r9 = r0.f64892r
            java.lang.String r3 = r2.mo77349h()
            r9.tagArsenalClick(r3)
            java.lang.String r9 = r2.mo77348g()
            java.lang.String r2 = r2.mo77347f()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$i r3 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$i
            r3.<init>(r8, r9, r2)
            r0.emitEvent(r3)
            r2 = r0
            r9 = r1
        L_0x00b1:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r9)
            if (r8 == 0) goto L_0x00bc
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$j r8 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26589j.f64962a
            r2.emitEvent(r8)
        L_0x00bc:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77229K0(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$c, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: L0 */
    public final void mo77230L0() {
        sendTagOnServiceStationsClick();
        emitEvent(C26562a.C26579i.C26584e.f64949a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77231M0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$hasCardFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$hasCardFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$hasCardFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$hasCardFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$hasCardFid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase r5 = r4.f64879e
            r0.label = r3
            java.lang.Object r5 = r5.m173037invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77231M0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: N0 */
    public final boolean mo77232N0() {
        return C13181d.m57146e(this.f64885k.mo31354f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77233O0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDeliverySelected$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDeliverySelected$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDeliverySelected$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDeliverySelected$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDeliverySelected$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.o r5 = r4.f64888n
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0055
            boolean r5 = r5.booleanValue()
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77233O0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77234P0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDriveSelected$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDriveSelected$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDriveSelected$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDriveSelected$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isDriveSelected$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r0 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0050
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r6 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            com.carrefour.fid.android.domain.interactors.service.k r2 = r5.f64887m
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r2.m172965invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0050:
            boolean r1 = kotlin.Result.m38709i(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            r6 = r2
        L_0x0058:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            if (r6 == 0) goto L_0x0066
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = r6.mo119354f()
            if (r6 == 0) goto L_0x0066
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r2 = r6.mo119176T()
        L_0x0066:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77234P0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77235Q0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isInStoreOnly$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isInStoreOnly$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isInStoreOnly$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isInStoreOnly$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$isInStoreOnly$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x005f
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004b
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.mo77234P0(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0068
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.mo77233O0(r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77235Q0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77236R0(java.lang.String r27, java.lang.String r28, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$logSecureTokenForArsenal$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$logSecureTokenForArsenal$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$logSecureTokenForArsenal$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$logSecureTokenForArsenal$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$logSecureTokenForArsenal$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            r1.mo21858l()
            goto L_0x009e
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            kotlin.C11661u0.m45747n(r1)
            r1 = 40
            r4 = r27
            java.lang.String r1 = kotlin.text.StringsKt___StringsKt.takeLast((java.lang.String) r4, (int) r1)
            boolean r4 = kotlin.text.C11622t.isBlank(r1)
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            com.carrefour.fid.android.domain.interactors.logm.a r4 = r0.f64890p
            com.carrefour.fid.android.domain.models.logm.LogMAction r8 = com.carrefour.fid.android.domain.models.logm.LogMAction.ARSENAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "**"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r21 = r6.toString()
            com.carrefour.fid.android.domain.models.logm.LogMSeverity r16 = com.carrefour.fid.android.domain.models.logm.LogMSeverity.INFO
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "token STS from web service for "
            r1.append(r6)
            r6 = r28
            r1.append(r6)
            java.lang.String r20 = r1.toString()
            com.carrefour.fid.android.domain.models.logm.LogMEntry r1 = new com.carrefour.fid.android.domain.models.logm.LogMEntry
            r6 = r1
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 105981(0x19dfd, float:1.48511E-40)
            r25 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.label = r5
            java.lang.Object r1 = r4.m172966invokegIAlus(r1, r2)
            if (r1 != r3) goto L_0x009e
            return r3
        L_0x009e:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77236R0(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r5.emitEvent(new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26585f(((java.lang.Boolean) r6).booleanValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e3, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0123, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0139, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processIntent(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$processIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$processIntent$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$processIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$processIntent$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$processIntent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004b;
                case 2: goto L_0x0047;
                case 3: goto L_0x003f;
                case 4: goto L_0x003a;
                case 5: goto L_0x0035;
                case 6: goto L_0x0030;
                case 7: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0134
        L_0x0030:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0121
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0102
        L_0x003a:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x00e1
        L_0x003f:
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x00a6
        L_0x0047:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0079
        L_0x004b:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0064
        L_0x004f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$f r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26607f.f64999a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0067
            r5 = 1
            r0.label = r5
            java.lang.Object r5 = r4.mo77253z0(r0)
            if (r5 != r1) goto L_0x0064
            return r1
        L_0x0064:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0067:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$h r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26609h.f65003a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x007c
            r5 = 2
            r0.label = r5
            java.lang.Object r5 = r4.mo77220B0(r0)
            if (r5 != r1) goto L_0x0079
            return r1
        L_0x0079:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x007c:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$i r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26610i.f65005a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0089
            r4.mo77222D0()
            goto L_0x0137
        L_0x0089:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$d r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26605d.f64995a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00c3
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$g r5 = r4.mo77223E0()
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26566d
            if (r6 == 0) goto L_0x00b6
            r0.L$0 = r4
            r5 = 3
            r0.label = r5
            java.lang.Object r6 = r4.mo77235Q0(r0)
            if (r6 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            r5 = r4
        L_0x00a6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$f r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$f
            r0.<init>(r6)
            r5.emitEvent(r0)
            goto L_0x0137
        L_0x00b6:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$e r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26567e.f64921a
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0137
            r4.mo77219A0()
            goto L_0x0137
        L_0x00c3:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$g r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26608g.f65001a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00cf
            r4.mo77219A0()
            goto L_0x0137
        L_0x00cf:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$e r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26606e.f64997a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00e4
            r5 = 4
            r0.label = r5
            java.lang.Object r5 = r4.mo77228J0(r0)
            if (r5 != r1) goto L_0x00e1
            return r1
        L_0x00e1:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x00e4:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$j r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26611j.f65007a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x00f0
            r4.mo77230L0()
            goto L_0x0137
        L_0x00f0:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$a r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26602a.f64987a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0105
            r5 = 5
            r0.label = r5
            java.lang.Object r5 = r4.mo77227I0(r0)
            if (r5 != r1) goto L_0x0102
            return r1
        L_0x0102:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0105:
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26612k
            if (r6 == 0) goto L_0x010f
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$g r5 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26579i.C26586g.f64953a
            r4.emitEvent(r5)
            goto L_0x0137
        L_0x010f:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$b r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26603b.f64989a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0124
            r5 = 6
            r0.label = r5
            java.lang.Object r5 = r4.mo77252y0(r0)
            if (r5 != r1) goto L_0x0121
            return r1
        L_0x0121:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0124:
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26604c
            if (r6 == 0) goto L_0x0137
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k$c r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26601k.C26604c) r5
            r6 = 7
            r0.label = r6
            java.lang.Object r5 = r4.mo77229K0(r5, r0)
            if (r5 != r1) goto L_0x0134
            return r1
        L_0x0134:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        L_0x0137:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.processIntent(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$k, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77238T0(boolean r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$saveHasPrimeFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$saveHasPrimeFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$saveHasPrimeFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$saveHasPrimeFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$saveHasPrimeFid$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.mo21858l()
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase r6 = r4.f64880f
            com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$Params r2 = new com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$Params
            r2.<init>(r5)
            r0.label = r3
            java.lang.Object r5 = r6.m173064invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>>) r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77238T0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77239U0(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26569g r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$updateCouponUiState$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$updateCouponUiState$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$updateCouponUiState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$updateCouponUiState$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$updateCouponUiState$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$g r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26569g) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$g> r6 = r4.f64893s
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$d r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$d
            r6.<init>(r5)
            r0.publishState(r6)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77239U0(com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$g, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendCouponsTracking(int i) {
        this.f64892r.sendCouponsTracking(i);
    }

    public void sendDetachedCardTracking() {
        this.f64892r.sendDetachedCardTracking();
    }

    public void sendTagCancelClearData() {
        this.f64892r.sendTagCancelClearData();
    }

    public void sendTagClickLoyaltyCardButton() {
        this.f64892r.sendTagClickLoyaltyCardButton();
    }

    public void sendTagClickModifySecretCode() {
        this.f64892r.sendTagClickModifySecretCode();
    }

    public void sendTagConfirmClearData(@C12579k CardType cardType) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f64892r.sendTagConfirmClearData(cardType);
    }

    public void sendTagOnServiceStationsClick() {
        this.f64892r.sendTagOnServiceStationsClick();
    }

    public void sendTagPrimeFidList(@C12579k List<LoyaltyBonus> list) {
        Intrinsics.checkNotNullParameter(list, "primeFisList");
        this.f64892r.sendTagPrimeFidList(list);
    }

    public void sendTagScreenView() {
        this.f64892r.sendTagScreenView();
    }

    public void tagChallengeFid() {
        this.f64892r.tagChallengeFid();
    }

    public void tagChallengeFidClick() {
        this.f64892r.tagChallengeFidClick();
    }

    public void tagRescuePrimeCMS(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        this.f64892r.tagRescuePrimeCMS(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77252y0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$clearUserData$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$clearUserData$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$clearUserData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$clearUserData$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$clearUserData$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            r5.mo21858l()
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0036:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.account.a r5 = r4.f64886l
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77252y0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77253z0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCardAndLoyaltyBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCardAndLoyaltyBalance$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCardAndLoyaltyBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCardAndLoyaltyBalance$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel$fetchCardAndLoyaltyBalance$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0068
            if (r2 == r6) goto L_0x0060
            if (r2 == r5) goto L_0x0050
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.account.UserCards r0 = (com.carrefour.fid.android.domain.models.account.UserCards) r0
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00ed
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x003f:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.domain.models.account.UserCards r2 = (com.carrefour.fid.android.domain.models.account.UserCards) r2
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r4 = (com.carrefour.fid.android.domain.models.account.UserCards) r4
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r5 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r5
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00dd
        L_0x0050:
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.domain.models.account.UserCards r2 = (com.carrefour.fid.android.domain.models.account.UserCards) r2
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.domain.models.account.UserCards r5 = (com.carrefour.fid.android.domain.models.account.UserCards) r5
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r6 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r6
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00b5
        L_0x0060:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0077
        L_0x0068:
            kotlin.C11661u0.m45747n(r12)
            r0.L$0 = r11
            r0.label = r6
            java.lang.Object r12 = r11.mo77224F0(r0)
            if (r12 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r2 = r11
        L_0x0077:
            com.carrefour.fid.android.domain.models.account.UserCards r12 = (com.carrefour.fid.android.domain.models.account.UserCards) r12
            if (r12 == 0) goto L_0x00ed
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b r6 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$j$b
            java.lang.String r7 = r12.mo116763k()
            java.lang.String r8 = r12.mo116759h()
            com.carrefour.fid.android.loyalty.core.type.CardType r8 = com.carrefour.fid.android.loyalty.core.type.CardType.valueOf(r8)
            r9 = 0
            r6.<init>(r7, r8, r9)
            r2.publishState(r6)
            boolean r6 = r2.mo77232N0()
            if (r6 != 0) goto L_0x00a2
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r12 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$h r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26578h.f64939a
            r12.<init>(r0)
            r2.emitEvent(r12)
            goto L_0x00ed
        L_0x00a2:
            r0.L$0 = r2
            r0.L$1 = r12
            r0.L$2 = r12
            r0.label = r5
            java.lang.Object r5 = r2.mo77231M0(r0)
            if (r5 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r6 = r2
            r2 = r12
            r12 = r5
            r5 = r2
        L_0x00b5:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00c8
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c r12 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$i$c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.a$h$g r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a.C26570h.C26577g.f64937a
            r12.<init>(r0)
            r6.emitEvent(r12)
            goto L_0x00ed
        L_0x00c8:
            java.lang.String r12 = r2.mo116763k()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r12 = r6.mo77225G0(r12, r0)
            if (r12 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r4 = r5
            r5 = r6
        L_0x00dd:
            r0.L$0 = r4
            r12 = 0
            r0.L$1 = r12
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r12 = r5.mo77226H0(r2, r0)
            if (r12 != r1) goto L_0x00ed
            return r1
        L_0x00ed:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel.mo77253z0(kotlin.coroutines.c):java.lang.Object");
    }
}
