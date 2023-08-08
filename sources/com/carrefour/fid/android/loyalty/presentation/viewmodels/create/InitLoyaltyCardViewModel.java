package com.carrefour.fid.android.loyalty.presentation.viewmodels.create;

import androidx.lifecycle.C19476v0;
import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.presentation.models.DQEAddressModel;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult;
import com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase;
import com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalytics;
import com.carrefour.fid.android.loyalty.presentation.analytics.InitSecretCodeAnalyticsDelegate;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0005H\u0001J\t\u0010\t\u001a\u00020\u0005H\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001J\t\u0010\r\u001a\u00020\u0005H\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0001J\t\u0010\u000f\u001a\u00020\u0005H\u0001J\u0013\u0010\u0010\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0011J\u001b\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020 H@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR%\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020F\u0018\u00010E0@8\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0@8\u0006¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010DR#\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050L0@8\u0006¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR$\u0010O\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel;", "Landroidx/lifecycle/v0;", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalytics;", "", "isRefreshSuccess", "Lkotlin/d2;", "fetchUserInfo", "(ZLkotlin/coroutines/c;)Ljava/lang/Object;", "sendAirshipTagCardCreated", "sendScreenViewCreateSecretCode", "", "cardNumber", "sendTagCardCreated", "sendTagClickInitSecretCode", "trackClickActivateSuccess", "trackScreenActivateCard", "getUserAddress", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "isFromActiveFid", "Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "loyaltyMembershipConsent", "loyaltyCard", "startLoyaltyProcess", "(ZLcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "createAndLinkLoyaltyProcess", "(Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;Lkotlin/coroutines/c;)Ljava/lang/Object;", "activateAndLinkLoyaltyProcess", "(Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "refreshToken", "address", "getAddressSuggestions", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "validateUserInput", "(Lcom/carrefour/fid/android/domain/models/account/Address;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase;", "createLoyaltyCardFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/domain/interactors/account/g;", "refreshTokenUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/g;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ActivateLoyaltyCardFidUseCase;", "activateLoyaltyCardFidUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/ActivateLoyaltyCardFidUseCase;", "Lcom/carrefour/fid/android/tracking/a;", "audienceTracking", "Lcom/carrefour/fid/android/tracking/a;", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "getDQEAddressSuggestionsUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "getVerificationDQEAddressUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;", "Lcom/carrefour/fid/android/account/domain/events/a;", "addressTunnelDataProvider", "Lcom/carrefour/fid/android/account/domain/events/a;", "getAddressTunnelDataProvider", "()Lcom/carrefour/fid/android/account/domain/events/a;", "Lkotlinx/coroutines/flow/j;", "billingAddressStateFlow", "Lkotlinx/coroutines/flow/j;", "getBillingAddressStateFlow", "()Lkotlinx/coroutines/flow/j;", "", "Lcom/carrefour/fid/android/account/presentation/models/DQEAddressModel;", "suggestedAddressList", "getSuggestedAddressList", "Lcom/carrefour/fid/android/loyalty/core/type/ValidUserAddressResult;", "validUserAddressType", "getValidUserAddressType", "Lcom/carrefour/fid/android/shared/type/e;", "loyaltyCardCreatedResult", "getLoyaltyCardCreatedResult", "initialAddress", "Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "getInitialAddress", "()Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "setInitialAddress", "(Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;)V", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "accountInfo", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "getAccountInfo", "()Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "setAccountInfo", "(Lcom/carrefour/fid/android/domain/models/account/AccountInfo;)V", "Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalyticsDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/account/g;Lcom/carrefour/fid/android/loyalty/domain/interactors/ActivateLoyaltyCardFidUseCase;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetDQEAddressSuggestionsUseCase;Lcom/carrefour/fid/android/account/domain/interactors/address/dqe/GetVerificationDQEAddressUseCase;Lcom/carrefour/fid/android/account/domain/events/a;Lcom/carrefour/fid/android/loyalty/presentation/analytics/InitSecretCodeAnalyticsDelegate;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInitLoyaltyCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitLoyaltyCardViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n533#2,6:187\n1549#2:193\n1620#2,3:194\n*S KotlinDebug\n*F\n+ 1 InitLoyaltyCardViewModel.kt\ncom/carrefour/fid/android/loyalty/presentation/viewmodels/create/InitLoyaltyCardViewModel\n*L\n60#1:187,6\n167#1:193\n167#1:194,3\n*E\n"})
public final class InitLoyaltyCardViewModel extends C19476v0 implements InitSecretCodeAnalytics {
    private final /* synthetic */ InitSecretCodeAnalyticsDelegate $$delegate_0;
    @C12580l
    private AccountInfo accountInfo;
    @C12579k
    private final ActivateLoyaltyCardFidUseCase activateLoyaltyCardFidUseCase;
    @C12579k
    private final C13239a addressTunnelDataProvider;
    @C12579k
    private final C28994a audienceTracking;
    @C12579k
    private final C11940j<Address> billingAddressStateFlow = C11953v.m47628a(null);
    @C12579k
    private final CreateLoyaltyCardFidUseCase createLoyaltyCardFidUseCase;
    @C12579k
    private final GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;
    @C12579k
    private final GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase;
    @C12580l
    private LoyaltyMembershipConsentModel initialAddress;
    @C12579k
    private final C11940j<C28892e<C11079d2>> loyaltyCardCreatedResult = C11953v.m47628a(C28892e.C28896d.f70785b);
    @C12579k
    private final LoyaltyPreferencesStorage loyaltyPreferencesStorage;
    @C12579k
    private final C37521g refreshTokenUseCase;
    @C12579k
    private final C11940j<List<DQEAddressModel>> suggestedAddressList = C11953v.m47628a(null);
    @C12579k
    private final C11940j<ValidUserAddressResult> validUserAddressType = C11953v.m47628a(ValidUserAddressResult.Uninitialized.INSTANCE);

    @Inject
    public InitLoyaltyCardViewModel(@C12579k CreateLoyaltyCardFidUseCase createLoyaltyCardFidUseCase2, @C12579k C37878e eVar, @C12579k C37521g gVar, @C12579k ActivateLoyaltyCardFidUseCase activateLoyaltyCardFidUseCase2, @C12579k C28994a aVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage2, @C12579k GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase2, @C12579k GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase2, @C12579k C13239a aVar2, @C12579k InitSecretCodeAnalyticsDelegate initSecretCodeAnalyticsDelegate) {
        Intrinsics.checkNotNullParameter(createLoyaltyCardFidUseCase2, "createLoyaltyCardFidUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(gVar, "refreshTokenUseCase");
        Intrinsics.checkNotNullParameter(activateLoyaltyCardFidUseCase2, "activateLoyaltyCardFidUseCase");
        Intrinsics.checkNotNullParameter(aVar, "audienceTracking");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(getDQEAddressSuggestionsUseCase2, "getDQEAddressSuggestionsUseCase");
        Intrinsics.checkNotNullParameter(getVerificationDQEAddressUseCase2, "getVerificationDQEAddressUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "addressTunnelDataProvider");
        Intrinsics.checkNotNullParameter(initSecretCodeAnalyticsDelegate, "analytics");
        this.createLoyaltyCardFidUseCase = createLoyaltyCardFidUseCase2;
        this.getUserInfoUseCase = eVar;
        this.refreshTokenUseCase = gVar;
        this.activateLoyaltyCardFidUseCase = activateLoyaltyCardFidUseCase2;
        this.audienceTracking = aVar;
        this.loyaltyPreferencesStorage = loyaltyPreferencesStorage2;
        this.getDQEAddressSuggestionsUseCase = getDQEAddressSuggestionsUseCase2;
        this.getVerificationDQEAddressUseCase = getVerificationDQEAddressUseCase2;
        this.addressTunnelDataProvider = aVar2;
        this.$$delegate_0 = initSecretCodeAnalyticsDelegate;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchUserInfo(boolean r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$fetchUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$fetchUserInfo$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$fetchUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$fetchUserInfo$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$fetchUserInfo$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            switch(r2) {
                case 0: goto L_0x004d;
                case 1: goto L_0x003d;
                case 2: goto L_0x0031;
                case 3: goto L_0x002c;
                case 4: goto L_0x002c;
                case 5: goto L_0x002c;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002c:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x00e4
        L_0x0031:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0083
        L_0x003d:
            boolean r6 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0063
        L_0x004d:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.user.e r7 = r5.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$b r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37880b.f94998a
            r0.L$0 = r5
            r0.Z$0 = r6
            r4 = 1
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r5
        L_0x0063:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r7)
            if (r4 != 0) goto L_0x00d1
            com.carrefour.fid.android.domain.models.account.AccountInfo r7 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r7
            if (r6 == 0) goto L_0x00b7
            java.lang.String r6 = com.carrefour.fid.android.loyalty.presentation.models.extension.AccountInfoModelKt.getLoyaltyCardId(r7)
            if (r6 == 0) goto L_0x009d
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r7 = r2.loyaltyPreferencesStorage
            r0.L$0 = r2
            r0.L$1 = r6
            r4 = 2
            r0.label = r4
            java.lang.Object r7 = r7.setLoyaltyCardNumber(r6, r0)
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2.sendTagCardCreated(r6)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r2.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$c r7 = new com.carrefour.fid.android.shared.type.e$c
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r7.<init>(r2)
            r0.L$0 = r3
            r0.L$1 = r3
            r2 = 3
            r0.label = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L_0x00e4
            return r1
        L_0x009d:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r2.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r7 = new com.carrefour.fid.android.shared.type.e$a
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r4 = "failed to get loyalty card ID"
            r2.<init>(r4)
            r7.<init>(r2)
            r0.L$0 = r3
            r2 = 4
            r0.label = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L_0x00e4
            return r1
        L_0x00b7:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r2.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r7 = new com.carrefour.fid.android.shared.type.e$a
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r4 = "failed to refresh token"
            r2.<init>(r4)
            r7.<init>(r2)
            r0.L$0 = r3
            r2 = 5
            r0.label = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L_0x00e4
            return r1
        L_0x00d1:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r6 = r2.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r7 = new com.carrefour.fid.android.shared.type.e$a
            r7.<init>(r4)
            r0.L$0 = r3
            r2 = 6
            r0.label = r2
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.fetchUserInfo(boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object activateAndLinkLoyaltyProcess(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r10, @org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$activateAndLinkLoyaltyProcess$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00c6
        L_0x003d:
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r10 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r10
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r11 = r12.mo21858l()
            goto L_0x0094
        L_0x004b:
            java.lang.Object r10 = r0.L$2
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r10 = (com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            r11 = r10
            r10 = r2
            goto L_0x0078
        L_0x005f:
            kotlin.C11661u0.m45747n(r12)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r12 = r9.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$b r2 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r6
            java.lang.Object r12 = r12.emit(r2, r0)
            if (r12 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r12 = r11
            r11 = r10
            r10 = r9
        L_0x0078:
            com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase r2 = r10.activateLoyaltyCardFidUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase$Param r6 = new com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase$Param
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = r10.accountInfo
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r11 = com.carrefour.fid.android.loyalty.presentation.models.extension.AccountInfoModelKt.toCreateOrAttachCardBody(r8, r11)
            r6.<init>(r11, r12)
            r0.L$0 = r10
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r11 = r2.m173032invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.ActivateLoyaltyCardFidUseCase.Param) r6, (kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>>) r0)
            if (r11 != r1) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r11)
            if (r12 != 0) goto L_0x00b4
            kotlin.d2 r11 = (kotlin.C11079d2) r11
            r10.trackClickActivateSuccess()
            r10.sendAirshipTagCardCreated()
            com.carrefour.fid.android.tracking.a r11 = r10.audienceTracking
            com.carrefour.fid.android.tracking.UserTag r12 = com.carrefour.fid.android.tracking.UserTag.LoyaltyCard
            r11.mo32666a(r12)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r10 = r10.refreshToken(r0)
            if (r10 != r1) goto L_0x00c6
            return r1
        L_0x00b4:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r10 = r10.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r11 = new com.carrefour.fid.android.shared.type.e$a
            r11.<init>(r12)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r10.emit(r11, r0)
            if (r10 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.activateAndLinkLoyaltyProcess(com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createAndLinkLoyaltyProcess(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$createAndLinkLoyaltyProcess$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$createAndLinkLoyaltyProcess$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$createAndLinkLoyaltyProcess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$createAndLinkLoyaltyProcess$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$createAndLinkLoyaltyProcess$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b8
        L_0x003d:
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r10 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0089
        L_0x004b:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r10 = (com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r11)
            r11 = r10
            r10 = r2
            goto L_0x006f
        L_0x0059:
            kotlin.C11661u0.m45747n(r11)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r11 = r9.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$b r2 = com.carrefour.fid.android.shared.type.C28892e.C28894b.f70781b
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r6
            java.lang.Object r11 = r11.emit(r2, r0)
            if (r11 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r11 = r10
            r10 = r9
        L_0x006f:
            com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase r2 = r10.createLoyaltyCardFidUseCase
            com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$Param r6 = new com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$Param
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = r10.accountInfo
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r11 = com.carrefour.fid.android.loyalty.presentation.models.extension.AccountInfoModelKt.toCreateOrAttachCardBody(r8, r11)
            r6.<init>(r11)
            r0.L$0 = r10
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r11 = r2.m173035invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase.Param) r6, (kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>>) r0)
            if (r11 != r1) goto L_0x0089
            return r1
        L_0x0089:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r11)
            if (r2 != 0) goto L_0x00a6
            kotlin.d2 r11 = (kotlin.C11079d2) r11
            r10.sendAirshipTagCardCreated()
            com.carrefour.fid.android.tracking.a r11 = r10.audienceTracking
            com.carrefour.fid.android.tracking.UserTag r2 = com.carrefour.fid.android.tracking.UserTag.LoyaltyCard
            r11.mo32666a(r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r10 = r10.refreshToken(r0)
            if (r10 != r1) goto L_0x00b8
            return r1
        L_0x00a6:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r10 = r10.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r11 = new com.carrefour.fid.android.shared.type.e$a
            r11.<init>(r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r10.emit(r11, r0)
            if (r10 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.createAndLinkLoyaltyProcess(com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getAddressSuggestions(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getAddressSuggestions$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getAddressSuggestions$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getAddressSuggestions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getAddressSuggestions$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getAddressSuggestions$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0039
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00ab
        L_0x0039:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r7 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x005c
        L_0x0047:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase r8 = r6.getDQEAddressSuggestionsUseCase
            java.lang.String r7 = com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase.C13255a.m57421b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r8 = r8.mo31448a(r7, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r7 = r6
        L_0x005c:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r8)
            r5 = 0
            if (r2 != 0) goto L_0x009e
            java.util.List r8 = (java.util.List) r8
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.account.presentation.models.DQEAddressModel>> r7 = r7.suggestedAddressList
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r2 = 4
            java.util.List r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40497E5(r8, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C10978t.m41495Y(r8, r3)
            r2.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
        L_0x007f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r8.next()
            com.carrefour.fid.android.account.domain.models.DQEAddressDomain r3 = (com.carrefour.fid.android.account.domain.models.DQEAddressDomain) r3
            com.carrefour.fid.android.account.presentation.models.DQEAddressModel r3 = com.carrefour.fid.android.account.domain.extension.C13244b.m57382c(r3)
            r2.add(r3)
            goto L_0x007f
        L_0x0093:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L_0x00ab
            return r1
        L_0x009e:
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.account.presentation.models.DQEAddressModel>> r7 = r7.suggestedAddressList
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.emit(r5, r0)
            if (r7 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.getAddressSuggestions(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C13239a getAddressTunnelDataProvider() {
        return this.addressTunnelDataProvider;
    }

    @C12579k
    public final C11940j<Address> getBillingAddressStateFlow() {
        return this.billingAddressStateFlow;
    }

    @C12580l
    public final LoyaltyMembershipConsentModel getInitialAddress() {
        return this.initialAddress;
    }

    @C12579k
    public final C11940j<C28892e<C11079d2>> getLoyaltyCardCreatedResult() {
        return this.loyaltyCardCreatedResult;
    }

    @C12579k
    public final C11940j<List<DQEAddressModel>> getSuggestedAddressList() {
        return this.suggestedAddressList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUserAddress(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getUserAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getUserAddress$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getUserAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getUserAddress$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$getUserAddress$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r6) goto L_0x0043
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r12)
            goto L_0x00c9
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0039:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r4 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r4
            kotlin.C11661u0.m45747n(r12)
            goto L_0x007e
        L_0x0043:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r10 = r2
            r2 = r12
            r12 = r10
            goto L_0x0068
        L_0x0054:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.domain.interactors.user.e r12 = r11.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r11
            r0.label = r6
            java.lang.Object r12 = r12.m172966invokegIAlus(r2, r0)
            if (r12 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r12
            r12 = r11
        L_0x0068:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r2)
            if (r7 == 0) goto L_0x007f
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.account.Address> r7 = r12.billingAddressStateFlow
            r0.L$0 = r12
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r4 = r7.emit(r5, r0)
            if (r4 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r4 = r12
        L_0x007e:
            r12 = r4
        L_0x007f:
            boolean r4 = kotlin.Result.m38710j(r2)
            if (r4 == 0) goto L_0x00c9
            r4 = r2
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r4
            r12.accountInfo = r4
            java.util.List r4 = r4.mo116668v()
            int r7 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r7)
        L_0x0096:
            boolean r7 = r4.hasPrevious()
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r7 = r4.previous()
            r8 = r7
            com.carrefour.fid.android.domain.models.account.Address r8 = (com.carrefour.fid.android.domain.models.account.Address) r8
            boolean r9 = r8.mo116695T()
            if (r9 == 0) goto L_0x00b3
            com.carrefour.fid.android.domain.models.AddressCategory r8 = r8.mo116683H()
            com.carrefour.fid.android.domain.models.AddressCategory r9 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            if (r8 != r9) goto L_0x00b3
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = 0
        L_0x00b4:
            if (r8 == 0) goto L_0x0096
            goto L_0x00b8
        L_0x00b7:
            r7 = r5
        L_0x00b8:
            com.carrefour.fid.android.domain.models.account.Address r7 = (com.carrefour.fid.android.domain.models.account.Address) r7
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.domain.models.account.Address> r12 = r12.billingAddressStateFlow
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r12 = r12.emit(r7, r0)
            if (r12 != r1) goto L_0x00c9
            return r1
        L_0x00c9:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.getUserAddress(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C11940j<ValidUserAddressResult> getValidUserAddressType() {
        return this.validUserAddressType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object refreshToken(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$refreshToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$refreshToken$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$refreshToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$refreshToken$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$refreshToken$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0081
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0057
        L_0x0046:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.account.g r8 = r7.refreshTokenUseCase
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r7
        L_0x0057:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r8)
            r6 = 0
            if (r5 != 0) goto L_0x006f
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r2.fetchUserInfo(r8, r0)
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x006f:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.shared.type.e<kotlin.d2>> r8 = r2.loyaltyCardCreatedResult
            com.carrefour.fid.android.shared.type.e$a r2 = new com.carrefour.fid.android.shared.type.e$a
            r2.<init>(r5)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.emit(r2, r0)
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x0081:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.refreshToken(kotlin.coroutines.c):java.lang.Object");
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

    public final void setAccountInfo(@C12580l AccountInfo accountInfo2) {
        this.accountInfo = accountInfo2;
    }

    public final void setInitialAddress(@C12580l LoyaltyMembershipConsentModel loyaltyMembershipConsentModel) {
        this.initialAddress = loyaltyMembershipConsentModel;
    }

    @C12580l
    public final Object startLoyaltyProcess(boolean z, @C12579k LoyaltyMembershipConsentModel loyaltyMembershipConsentModel, @C12579k String str, @C12579k C11045c<? super C11079d2> cVar) {
        if (z) {
            trackScreenActivateCard();
            Object activateAndLinkLoyaltyProcess = activateAndLinkLoyaltyProcess(loyaltyMembershipConsentModel, str, cVar);
            if (activateAndLinkLoyaltyProcess == C11063b.m42612h()) {
                return activateAndLinkLoyaltyProcess;
            }
            return C11079d2.f28267a;
        }
        Object createAndLinkLoyaltyProcess = createAndLinkLoyaltyProcess(loyaltyMembershipConsentModel, cVar);
        if (createAndLinkLoyaltyProcess == C11063b.m42612h()) {
            return createAndLinkLoyaltyProcess;
        }
        return C11079d2.f28267a;
    }

    public void trackClickActivateSuccess() {
        this.$$delegate_0.trackClickActivateSuccess();
    }

    public void trackScreenActivateCard() {
        this.$$delegate_0.trackScreenActivateCard();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object validateUserInput(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.account.Address r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$validateUserInput$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$validateUserInput$1 r0 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$validateUserInput$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$validateUserInput$1 r0 = new com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel$validateUserInput$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r6) goto L_0x0046
            if (r2 == r5) goto L_0x003c
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x00b2
        L_0x003c:
            java.lang.Object r9 = r0.L$1
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r2 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x007e
        L_0x0046:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r9 = (com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel) r9
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r2 = r9
            r9 = r10
            goto L_0x0067
        L_0x0056:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase r10 = r8.getVerificationDQEAddressUseCase
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r10.m172730invokegIAlus(r9, r0)
            if (r9 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r8
        L_0x0067:
            java.lang.Throwable r10 = kotlin.Result.m38705e(r9)
            if (r10 == 0) goto L_0x007e
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult> r10 = r2.validUserAddressType
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$Error r7 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.Error.INSTANCE
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.emit(r7, r0)
            if (r10 != r1) goto L_0x007e
            return r1
        L_0x007e:
            boolean r10 = kotlin.Result.m38710j(r9)
            if (r10 == 0) goto L_0x00b2
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r5 = 0
            if (r10 != r6) goto L_0x00a1
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult> r10 = r2.validUserAddressType
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$ValidAddress r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.ValidAddress.INSTANCE
            r0.L$0 = r9
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r9 = r10.emit(r2, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00a1:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult> r10 = r2.validUserAddressType
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$AddressVerification r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.AddressVerification.INSTANCE
            r0.L$0 = r9
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.emit(r2, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel.validateUserInput(com.carrefour.fid.android.domain.models.account.Address, kotlin.coroutines.c):java.lang.Object");
    }
}
