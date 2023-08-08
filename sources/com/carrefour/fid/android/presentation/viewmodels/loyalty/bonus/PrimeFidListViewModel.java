package com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus;

import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse;
import com.carrefour.fid.android.cms.domain.interactors.GetCmsPrimeFidListUseCase;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyClubsUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.IsFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.UpdateMidFidClubUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyBonusAnalyticsInterface;
import com.carrefour.fid.android.loyalty.presentation.analytics.LoyaltyBonusAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004Ba\b\u0007\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0006\u0010R\u001a\u00020O\u0012\u0006\u0010V\u001a\u00020S\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[\u0012\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0013\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J\u0013\u0010\u0017\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u001d\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0019\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\u001aH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000fJ\u001b\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u0013\u0010!\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u000fJ\u001b\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010%\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001J\t\u0010&\u001a\u00020\bH\u0001J\t\u0010'\u001a\u00020\bH\u0001J\t\u0010(\u001a\u00020\bH\u0001J\u0017\u0010)\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001J\t\u0010*\u001a\u00020\bH\u0001J\u0017\u0010,\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001J\t\u0010-\u001a\u00020\bH\u0001J\t\u0010.\u001a\u00020\bH\u0001J\u0011\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0006H\u0001J\u0019\u00102\u001a\u00020\b2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001J\u0011\u00103\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0006H\u0001J\u001b\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010b8BX\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$c;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$d;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterface;", "", "Lcom/carrefour/fid/android/cms/data/entities/DataPrimeCmsResponse;", "primes", "Lkotlin/d2;", "K0", "y0", "", "H0", "M0", "L0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "R0", "(Ljava/util/List;Lkotlin/coroutines/c;)Ljava/lang/Object;", "x0", "withLoyaltyClub", "z0", "cmsPrimeList", "B0", "Q0", "J0", "isSecuredCardRequested", "", "C0", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "G0", "E0", "hasPrimeFid", "O0", "I0", "firstTime", "P0", "listLoyalty", "sendAppsFlyerTagPrime", "sendLoyaltyIgnoreBonusTag", "sendScreenView", "sendScreenViewBonus", "sendSubscribeLoyaltyEvent", "sendTagClicOkPopinPrimesFid", "listPrimesSubscribe", "sendTagClickSubscribePrime", "sendTagDisplayPopinPrimesFid", "sendTagPlusDinfoPopinPrimesFid", "prime", "sendTagPrimeAdded", "primeList", "sendTagPrimeFid", "sendTagPrimeRemoved", "intent", "N0", "(Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/mvi/a$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase;", "a", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase;", "updateMidFidClubUseCase", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidListUseCase;", "b", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidListUseCase;", "getCmsPrimeFidListUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;", "c", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;", "getLoyaltyClubsUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "updateConsentsUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "e", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "f", "Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;", "hasCardFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;", "g", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;", "saveHasPrimeFidUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "h", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/IsFirstVisitPrimesFidelityUseCase;", "i", "Lcom/carrefour/fid/android/loyalty/domain/interactors/IsFirstVisitPrimesFidelityUseCase;", "isFirstVisitPrimesFidelityUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SetFirstVisitPrimesFidelityUseCase;", "j", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SetFirstVisitPrimesFidelityUseCase;", "setFirstVisitPrimesFidelityUseCase", "l", "Ljava/util/List;", "lastValidatedPrimes", "Lcom/carrefour/fid/android/account/data/entities/AuthStateResponse;", "F0", "()Lcom/carrefour/fid/android/account/data/entities/AuthStateResponse;", "localUser", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterfaceDelegate;", "loyaltyBonusAnalytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateMidFidClubUseCase;Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsPrimeFidListUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyClubsUseCase;Lcom/carrefour/fid/android/domain/interactors/consent/c;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/loyalty/domain/interactors/FidelityHasCardFidUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/domain/interactors/IsFirstVisitPrimesFidelityUseCase;Lcom/carrefour/fid/android/loyalty/domain/interactors/SetFirstVisitPrimesFidelityUseCase;Lcom/carrefour/fid/android/loyalty/presentation/analytics/LoyaltyBonusAnalyticsInterfaceDelegate;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPrimeFidListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimeFidListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n766#2:395\n857#2,2:396\n1549#2:398\n1620#2,3:399\n766#2:402\n857#2,2:403\n1549#2:405\n1620#2,3:406\n766#2:409\n857#2,2:410\n766#2:412\n857#2,2:413\n766#2:415\n857#2,2:416\n766#2:418\n857#2,2:419\n766#2:421\n857#2,2:422\n*S KotlinDebug\n*F\n+ 1 PrimeFidListViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/loyalty/bonus/PrimeFidListViewModel\n*L\n89#1:395\n89#1:396,2\n89#1:398\n89#1:399,3\n90#1:402\n90#1:403,2\n90#1:405\n90#1:406,3\n105#1:409\n105#1:410,2\n163#1:412\n163#1:413,2\n165#1:415\n165#1:416,2\n165#1:418\n165#1:419,2\n361#1:421\n361#1:422,2\n*E\n"})
public final class PrimeFidListViewModel extends BaseMVIViewModel<C26522a.C26532c, C26522a.C26533d> implements LoyaltyBonusAnalyticsInterface {
    @C12579k

    /* renamed from: a */
    public final UpdateMidFidClubUseCase f64797a;
    @C12579k

    /* renamed from: b */
    public final GetCmsPrimeFidListUseCase f64798b;
    @C12579k

    /* renamed from: c */
    public final GetLoyaltyClubsUseCase f64799c;
    @C12579k

    /* renamed from: d */
    public final C37631c f64800d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f64801e;
    @C12579k

    /* renamed from: f */
    public final FidelityHasCardFidUseCase f64802f;
    @C12579k

    /* renamed from: g */
    public final SaveHasPrimeFidUseCase f64803g;
    @C12579k

    /* renamed from: h */
    public final C37878e f64804h;
    @C12579k

    /* renamed from: i */
    public final IsFirstVisitPrimesFidelityUseCase f64805i;
    @C12579k

    /* renamed from: j */
    public final SetFirstVisitPrimesFidelityUseCase f64806j;

    /* renamed from: k */
    public final /* synthetic */ LoyaltyBonusAnalyticsInterfaceDelegate f64807k;
    @C12579k

    /* renamed from: l */
    public List<DataPrimeCmsResponse> f64808l = CollectionsKt__CollectionsKt.m40441E();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PrimeFidListViewModel(@C12579k UpdateMidFidClubUseCase updateMidFidClubUseCase, @C12579k GetCmsPrimeFidListUseCase getCmsPrimeFidListUseCase, @C12579k GetLoyaltyClubsUseCase getLoyaltyClubsUseCase, @C12579k C37631c cVar, @C12579k LoginRepository loginRepository, @C12579k FidelityHasCardFidUseCase fidelityHasCardFidUseCase, @C12579k SaveHasPrimeFidUseCase saveHasPrimeFidUseCase, @C12579k C37878e eVar, @C12579k IsFirstVisitPrimesFidelityUseCase isFirstVisitPrimesFidelityUseCase, @C12579k SetFirstVisitPrimesFidelityUseCase setFirstVisitPrimesFidelityUseCase, @C12579k LoyaltyBonusAnalyticsInterfaceDelegate loyaltyBonusAnalyticsInterfaceDelegate) {
        super(new C26522a.C26532c(false, (List) null, false, false, 15, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        UpdateMidFidClubUseCase updateMidFidClubUseCase2 = updateMidFidClubUseCase;
        GetCmsPrimeFidListUseCase getCmsPrimeFidListUseCase2 = getCmsPrimeFidListUseCase;
        GetLoyaltyClubsUseCase getLoyaltyClubsUseCase2 = getLoyaltyClubsUseCase;
        C37631c cVar2 = cVar;
        LoginRepository loginRepository2 = loginRepository;
        FidelityHasCardFidUseCase fidelityHasCardFidUseCase2 = fidelityHasCardFidUseCase;
        SaveHasPrimeFidUseCase saveHasPrimeFidUseCase2 = saveHasPrimeFidUseCase;
        C37878e eVar2 = eVar;
        IsFirstVisitPrimesFidelityUseCase isFirstVisitPrimesFidelityUseCase2 = isFirstVisitPrimesFidelityUseCase;
        Intrinsics.checkNotNullParameter(updateMidFidClubUseCase2, "updateMidFidClubUseCase");
        Intrinsics.checkNotNullParameter(getCmsPrimeFidListUseCase2, "getCmsPrimeFidListUseCase");
        Intrinsics.checkNotNullParameter(getLoyaltyClubsUseCase2, "getLoyaltyClubsUseCase");
        Intrinsics.checkNotNullParameter(cVar2, "updateConsentsUseCase");
        Intrinsics.checkNotNullParameter(loginRepository2, "loginRepository");
        Intrinsics.checkNotNullParameter(fidelityHasCardFidUseCase2, "hasCardFidUseCase");
        Intrinsics.checkNotNullParameter(saveHasPrimeFidUseCase2, "saveHasPrimeFidUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(isFirstVisitPrimesFidelityUseCase2, "isFirstVisitPrimesFidelityUseCase");
        Intrinsics.checkNotNullParameter(setFirstVisitPrimesFidelityUseCase, "setFirstVisitPrimesFidelityUseCase");
        Intrinsics.checkNotNullParameter(loyaltyBonusAnalyticsInterfaceDelegate, "loyaltyBonusAnalytics");
        this.f64797a = updateMidFidClubUseCase2;
        this.f64798b = getCmsPrimeFidListUseCase2;
        this.f64799c = getLoyaltyClubsUseCase2;
        this.f64800d = cVar2;
        this.f64801e = loginRepository2;
        this.f64802f = fidelityHasCardFidUseCase2;
        this.f64803g = saveHasPrimeFidUseCase2;
        this.f64804h = eVar2;
        this.f64805i = isFirstVisitPrimesFidelityUseCase2;
        this.f64806j = setFirstVisitPrimesFidelityUseCase;
        this.f64807k = loyaltyBonusAnalyticsInterfaceDelegate;
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m112937A0(PrimeFidListViewModel primeFidListViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        primeFidListViewModel.mo77119z0(z);
    }

    /* renamed from: D0 */
    public static /* synthetic */ Object m112938D0(PrimeFidListViewModel primeFidListViewModel, boolean z, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return primeFidListViewModel.mo77090C0(z, cVar);
    }

    /* renamed from: g0 */
    public static final /* synthetic */ C26522a.C26532c m112942g0(PrimeFidListViewModel primeFidListViewModel) {
        return (C26522a.C26532c) primeFidListViewModel.getCurrentState();
    }

    /* renamed from: B0 */
    public final void mo77089B0(List<DataPrimeCmsResponse> list) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PrimeFidListViewModel$fetchLoyaltyClubs$1(this, list, (C11045c<? super PrimeFidListViewModel$fetchLoyaltyClubs$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77090C0(boolean r6, kotlin.coroutines.C11045c<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFidCardNumber$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFidCardNumber$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFidCardNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFidCardNumber$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFidCardNumber$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            boolean r6 = r0.Z$0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.user.e r7 = r5.f64804h
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38709i(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0053
            r7 = r1
        L_0x0053:
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            if (r7 == 0) goto L_0x0087
            java.util.List r7 = r7.mo116669w()
            if (r7 == 0) goto L_0x0087
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0068:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0088
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.carrefour.fid.android.domain.models.account.UserCards r4 = (com.carrefour.fid.android.domain.models.account.UserCards) r4
            if (r6 == 0) goto L_0x0080
            boolean r4 = r4.mo116764l()
            if (r4 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r4 = 0
            goto L_0x0081
        L_0x0080:
            r4 = r3
        L_0x0081:
            if (r4 == 0) goto L_0x0068
            r0.add(r2)
            goto L_0x0068
        L_0x0087:
            r0 = r1
        L_0x0088:
            com.carrefour.fid.android.domain.models.account.UserCards r6 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r0)
            if (r6 == 0) goto L_0x0092
            java.lang.String r1 = r6.mo116763k()
        L_0x0092:
            if (r1 != 0) goto L_0x0096
            java.lang.String r1 = ""
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77090C0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77091E0(kotlin.coroutines.C11045c<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFirstName$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFirstName$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFirstName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFirstName$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$getFirstName$1
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
            com.carrefour.fid.android.domain.interactors.user.e r5 = r4.f64804h
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            boolean r0 = kotlin.Result.m38710j(r5)
            if (r0 == 0) goto L_0x0054
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            java.lang.String r5 = r5.mo116664s()
            return r5
        L_0x0054:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77091E0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: F0 */
    public final AuthStateResponse mo77092F0() {
        return this.f64801e.mo31354f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77093G0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$hasCardFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$hasCardFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$hasCardFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$hasCardFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$hasCardFid$1
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
            com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase r5 = r4.f64802f
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77093G0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: H0 */
    public final boolean mo77094H0(List<DataPrimeCmsResponse> list) {
        boolean z;
        ArrayList<DataPrimeCmsResponse> arrayList = new ArrayList<>();
        for (Object next : this.f64808l) {
            if (((DataPrimeCmsResponse) next).isSelected()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
        for (DataPrimeCmsResponse name : arrayList) {
            arrayList2.add(name.getName());
        }
        ArrayList<DataPrimeCmsResponse> arrayList3 = new ArrayList<>();
        for (Object next2 : list) {
            if (((DataPrimeCmsResponse) next2).isSelected()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(arrayList3, 10));
        for (DataPrimeCmsResponse name2 : arrayList3) {
            arrayList4.add(name2.getName());
        }
        if (!arrayList2.containsAll(arrayList4) || !arrayList4.containsAll(arrayList2)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77095I0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$isFirstVisitPrimesFidelity$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$isFirstVisitPrimesFidelity$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$isFirstVisitPrimesFidelity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$isFirstVisitPrimesFidelity$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$isFirstVisitPrimesFidelity$1
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
            com.carrefour.fid.android.loyalty.domain.interactors.IsFirstVisitPrimesFidelityUseCase r5 = r4.f64805i
            r0.label = r3
            java.lang.Object r5 = r5.m173054invokeIoAF18A(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77095I0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: J0 */
    public final boolean mo77096J0() {
        return C13181d.m57146e(mo77092F0());
    }

    /* renamed from: K0 */
    public final void mo77097K0(List<DataPrimeCmsResponse> list) {
        emitEvent(new C26522a.C26527b.C26530c(mo77094H0(list)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77098L0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onIgnorePrimes$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onIgnorePrimes$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onIgnorePrimes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onIgnorePrimes$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$onIgnorePrimes$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0060
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r5)
            boolean r5 = r4.mo77096J0()
            if (r5 != 0) goto L_0x004c
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r5 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$b r2 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26525b.f64824a
            r5.<init>(r2)
            r4.emitEvent(r5)
        L_0x004c:
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r4.mo77091E0(r0)
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x0060:
            java.lang.String r5 = (java.lang.String) r5
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$d r2 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$d
            r2.<init>(r1, r5)
            r0.emitEvent(r2)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77098L0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: M0 */
    public final void mo77099M0(List<DataPrimeCmsResponse> list) {
        if (!mo77096J0()) {
            emitEvent(new C26522a.C26527b.C26528a(C26522a.C26523a.C26525b.f64824a));
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((DataPrimeCmsResponse) next).isSelected()) {
                arrayList.add(next);
            }
        }
        publishState(C26522a.C26532c.m113001j((C26522a.C26532c) getCurrentState(), false, list, true, false, 9, (Object) null));
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PrimeFidListViewModel$onSubmitPrimes$1(this, arrayList, list, (C11045c<? super PrimeFidListViewModel$onSubmitPrimes$1>) null), 3, (Object) null);
    }

    @C12580l
    /* renamed from: N0 */
    public Object processIntent(@C12579k C26522a.C26533d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (dVar instanceof C26522a.C26533d.C26536c) {
            mo77119z0(((C26522a.C26533d.C26536c) dVar).mo77168d());
        } else if (dVar instanceof C26522a.C26533d.C26540g) {
            mo77099M0(((C26522a.C26533d.C26540g) dVar).mo77186d());
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C26522a.C26533d.C26537d.f64848a)) {
            Object L0 = mo77098L0(cVar);
            if (L0 == C11063b.m42612h()) {
                return L0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C26522a.C26533d.C26535b.f64844a)) {
            Object x0 = mo77117x0(cVar);
            if (x0 == C11063b.m42612h()) {
                return x0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C26522a.C26533d.C26541h) {
            Object R0 = mo77104R0(((C26522a.C26533d.C26541h) dVar).mo77192d(), cVar);
            if (R0 == C11063b.m42612h()) {
                return R0;
            }
            return C11079d2.f28267a;
        } else if (dVar instanceof C26522a.C26533d.C26538e) {
            C26522a.C26533d.C26538e eVar = (C26522a.C26533d.C26538e) dVar;
            this.f64808l = eVar.mo77174d();
            publishState(C26522a.C26532c.m113001j((C26522a.C26532c) getCurrentState(), false, eVar.mo77174d(), false, false, 13, (Object) null));
        } else if (dVar instanceof C26522a.C26533d.C26539f) {
            mo77118y0(((C26522a.C26533d.C26539f) dVar).mo77180d());
        } else if (dVar instanceof C26522a.C26533d.C26534a) {
            mo77097K0(((C26522a.C26533d.C26534a) dVar).mo77162d());
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77101O0(boolean r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$saveHasPrimeFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$saveHasPrimeFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$saveHasPrimeFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$saveHasPrimeFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$saveHasPrimeFid$1
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
            com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase r6 = r4.f64803g
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77101O0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77102P0(boolean r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$setFirstVisitPrimesFidelity$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$setFirstVisitPrimesFidelity$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$setFirstVisitPrimesFidelity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$setFirstVisitPrimesFidelity$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$setFirstVisitPrimesFidelity$1
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
            com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase r6 = r4.f64806j
            com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase$Params r2 = new com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase$Params
            r2.<init>(r5)
            r0.label = r3
            java.lang.Object r5 = r6.m173066invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.SetFirstVisitPrimesFidelityUseCase.Params) r2, (kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>>) r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77102P0(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77103Q0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0055
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            kotlin.C11661u0.m45747n(r9)
            boolean r9 = r8.mo77096J0()
            if (r9 != 0) goto L_0x0049
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r9 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$b r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26525b.f64824a
            r9.<init>(r0)
            r8.emitEvent(r9)
            goto L_0x0079
        L_0x0049:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r8.mo77093G0(r0)
            if (r9 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r8
        L_0x0055:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0068
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r9 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$a r1 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26524a.f64822a
            r9.<init>(r1)
            r0.emitEvent(r9)
            goto L_0x0079
        L_0x0068:
            kotlinx.coroutines.o0 r2 = androidx.lifecycle.C19500w0.m90846a(r0)
            r3 = 0
            r4 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$2 r5 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updateFidConsents$2
            r9 = 0
            r5.<init>(r0, r9)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r2, r3, r4, r5, r6, r7)
        L_0x0079:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77103Q0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77104R0(java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r19, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r20) {
        /*
            r18 = this;
            r6 = r18
            r14 = r19
            r0 = r20
            boolean r1 = r0 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$1
            if (r1 == 0) goto L_0x0019
            r1 = r0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$1 r1 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$1 r1 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$1
            r1.<init>(r6, r0)
        L_0x001e:
            r15 = r1
            java.lang.Object r0 = r15.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r15.label
            r4 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 != r4) goto L_0x003e
            java.lang.Object r1 = r15.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r15.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r15.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r3 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r3
            kotlin.C11661u0.m45747n(r0)
            r14 = r2
            goto L_0x0138
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            kotlin.C11661u0.m45747n(r0)
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0055:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.next()
            r7 = r3
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r7 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r7
            boolean r7 = r7.isSelected()
            if (r7 == 0) goto L_0x0055
            r1.add(r3)
            goto L_0x0055
        L_0x006c:
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r2 = r6.f64808l
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0079:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0090
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r8 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r8
            boolean r8 = r8.isSelected()
            if (r8 == 0) goto L_0x0079
            r3.add(r7)
            goto L_0x0079
        L_0x0090:
            java.util.List r3 = kotlin.collections.CollectionsKt___CollectionsKt.m40654k4(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x009d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r0.next()
            r7 = r2
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r7 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r7
            boolean r7 = r7.isSelected()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x009d
            r1.add(r2)
            goto L_0x009d
        L_0x00b5:
            java.util.List<com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse> r0 = r6.f64808l
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r0.next()
            r8 = r7
            com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse r8 = (com.carrefour.fid.android.cms.data.entities.DataPrimeCmsResponse) r8
            boolean r8 = r8.isSelected()
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x00c2
            r2.add(r7)
            goto L_0x00c2
        L_0x00da:
            java.util.List r16 = kotlin.collections.CollectionsKt___CollectionsKt.m40654k4(r1, r2)
            boolean r0 = r18.mo77096J0()
            if (r0 != 0) goto L_0x00ef
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$a
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$a$b r1 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26523a.C26525b.f64824a
            r0.<init>(r1)
            r6.emitEvent(r0)
            goto L_0x0141
        L_0x00ef:
            com.carrefour.fid.android.shared.base.u$d r0 = r18.getCurrentState()
            r7 = r0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r7 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c) r7
            r8 = 0
            r10 = 1
            r11 = 0
            r12 = 9
            r13 = 0
            r9 = r19
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$c r0 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26532c.m113001j(r7, r8, r9, r10, r11, r12, r13)
            r6.publishState(r0)
            kotlinx.coroutines.o0 r7 = androidx.lifecycle.C19500w0.m90846a(r18)
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$2 r10 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$updatePrimes$2
            r11 = 0
            r0 = r10
            r1 = r18
            r2 = r3
            r13 = r3
            r3 = r16
            r12 = r4
            r4 = r19
            r17 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = 3
            r0 = 0
            r1 = r12
            r12 = r0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            r15.L$0 = r6
            r15.L$1 = r14
            r15.L$2 = r13
            r15.label = r1
            java.lang.Object r0 = r6.mo77103Q0(r15)
            r1 = r17
            if (r0 != r1) goto L_0x0136
            return r1
        L_0x0136:
            r3 = r6
            r1 = r13
        L_0x0138:
            r3.sendTagClickSubscribePrime(r1)
            r3.sendTagPrimeFid(r14)
            r3.sendAppsFlyerTagPrime(r14)
        L_0x0141:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77104R0(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendAppsFlyerTagPrime(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listLoyalty");
        this.f64807k.sendAppsFlyerTagPrime(list);
    }

    public void sendLoyaltyIgnoreBonusTag() {
        this.f64807k.sendLoyaltyIgnoreBonusTag();
    }

    public void sendScreenView() {
        this.f64807k.sendScreenView();
    }

    public void sendScreenViewBonus() {
        this.f64807k.sendScreenViewBonus();
    }

    public void sendSubscribeLoyaltyEvent(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listLoyalty");
        this.f64807k.sendSubscribeLoyaltyEvent(list);
    }

    public void sendTagClicOkPopinPrimesFid() {
        this.f64807k.sendTagClicOkPopinPrimesFid();
    }

    public void sendTagClickSubscribePrime(@C12579k List<DataPrimeCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "listPrimesSubscribe");
        this.f64807k.sendTagClickSubscribePrime(list);
    }

    public void sendTagDisplayPopinPrimesFid() {
        this.f64807k.sendTagDisplayPopinPrimesFid();
    }

    public void sendTagPlusDinfoPopinPrimesFid() {
        this.f64807k.sendTagPlusDinfoPopinPrimesFid();
    }

    public void sendTagPrimeAdded(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        this.f64807k.sendTagPrimeAdded(dataPrimeCmsResponse);
    }

    public void sendTagPrimeFid(@C12580l List<DataPrimeCmsResponse> list) {
        this.f64807k.sendTagPrimeFid(list);
    }

    public void sendTagPrimeRemoved(@C12579k DataPrimeCmsResponse dataPrimeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataPrimeCmsResponse, "prime");
        this.f64807k.sendTagPrimeRemoved(dataPrimeCmsResponse);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77117x0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$checkIfFirstLaunchPrimesFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$checkIfFirstLaunchPrimesFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$checkIfFirstLaunchPrimesFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$checkIfFirstLaunchPrimesFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel$checkIfFirstLaunchPrimesFid$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0064
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004f
        L_0x0040:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.mo77095I0(r0)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r2 = r5
        L_0x004f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0069
            r0.L$0 = r2
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = r2.mo77102P0(r6, r0)
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r2
        L_0x0064:
            com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.a$b$b r6 = com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.mvi.C26522a.C26527b.C26529b.f64830a
            r0.emitEvent(r6)
        L_0x0069:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.loyalty.bonus.PrimeFidListViewModel.mo77117x0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: y0 */
    public final void mo77118y0(List<DataPrimeCmsResponse> list) {
        publishState(C26522a.C26532c.m113001j((C26522a.C26532c) getCurrentState(), false, list, false, mo77094H0(list), 5, (Object) null));
    }

    /* renamed from: z0 */
    public final void mo77119z0(boolean z) {
        publishState(C26522a.C26532c.m113001j((C26522a.C26532c) getCurrentState(), true, (List) null, false, false, 14, (Object) null));
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PrimeFidListViewModel$fetchLoyaltyClub$1(this, z, (C11045c<? super PrimeFidListViewModel$fetchLoyaltyClub$1>) null), 3, (Object) null);
    }
}
