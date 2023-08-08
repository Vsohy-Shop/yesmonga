package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.C38166m;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.service.domain.interactors.SetPendingServiceSelectionUseCase;
import com.carrefour.fid.android.service.presentation.analytics.delivery.DeliveryServiceSelectionAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.p044ui.delivery.DeliveryServiceSelectionSideEffect;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11620r;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bP\u0010QJA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0010H\u0002J\f\u0010\u001d\u001a\u00020\u001c*\u00020\u0010H\u0002J%\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u0004\u0018\u00010$*\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R,\u0010B\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?0>8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelectionViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "deliveryType", "Lcom/carrefour/fid/android/domain/models/account/Address;", "billingAddress", "deliveryAddress", "", "phone", "Lkotlin/Function0;", "Lkotlin/d2;", "onAddressValidated", "onChangeAddress", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Lkotlin/jvm/functions/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/service/models/m;", "storeFacility", "handleServices", "(Lcom/carrefour/fid/android/domain/models/service/models/m;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "deliveryService", "", "skipSelection", "selectService", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;ZLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/ClcvService;", "obtainClcvService", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/H1h3Service;", "obtainH1h3Service", "address", "type", "getStoreFacilityAtAddress", "(Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "", "getFreeThresholdFee", "(Ljava/util/List;)Ljava/lang/Double;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$ChangeAddress;", "intent", "fetchAddress", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$ChangeAddress;Lkotlin/coroutines/c;)Ljava/lang/Object;", "processIntent", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/service/domain/interactors/SetPendingServiceSelectionUseCase;", "setPendingServiceSelectionUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/SetPendingServiceSelectionUseCase;", "Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter;", "getAnalytics", "()Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter;", "Lcom/carrefour/fid/android/domain/events/account/a;", "userAddressProvider", "Lcom/carrefour/fid/android/domain/events/account/a;", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "fetchDeliveryStoresUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/b;", "", "Lkotlin/Pair;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "storeForDeliverService", "Ljava/util/Map;", "Lcom/carrefour/fid/android/domain/models/account/a;", "addressTunnelData", "Lcom/carrefour/fid/android/domain/models/account/a;", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "_sideEffect", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/service/domain/interactors/SetPendingServiceSelectionUseCase;Lcom/carrefour/fid/android/service/presentation/analytics/delivery/DeliveryServiceSelectionAnalyticsReporter;Lcom/carrefour/fid/android/domain/events/account/a;Lcom/carrefour/fid/android/domain/interactors/service/b;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliveryServiceSelectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryServiceSelectionViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelectionViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n1#2:276\n1#2:291\n1603#3,9:264\n1855#3:273\n288#3,2:274\n1856#3:277\n1612#3:278\n1603#3,9:279\n1855#3:288\n288#3,2:289\n1856#3:292\n1612#3:293\n*S KotlinDebug\n*F\n+ 1 DeliveryServiceSelectionViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelectionViewModel\n*L\n167#1:276\n193#1:291\n167#1:264,9\n167#1:273\n168#1:274,2\n167#1:277\n167#1:278\n193#1:279,9\n193#1:288\n194#1:289,2\n193#1:292\n193#1:293\n*E\n"})
public final class DeliveryServiceSelectionViewModel extends BaseMVIViewModel<DeliveryServiceSelection.UiState, DeliveryServiceSelection.UserAction> {
    /* access modifiers changed from: private */
    @C12579k
    public final C11744g<DeliveryServiceSelectionSideEffect> _sideEffect;
    /* access modifiers changed from: private */
    @C12580l
    public C37947a addressTunnelData;
    @C12579k
    private final DeliveryServiceSelectionAnalyticsReporter analytics;
    @C12579k
    private final C37812b fetchDeliveryStoresUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;
    @C12579k
    private final SetPendingServiceSelectionUseCase setPendingServiceSelectionUseCase;
    @C12579k
    private final C11907e<DeliveryServiceSelectionSideEffect> sideEffect;
    @C12579k
    private final Map<DeliveryType, Pair<C38163l, StoreService>> storeForDeliverService = new LinkedHashMap();
    /* access modifiers changed from: private */
    @C12579k
    public final C37493a userAddressProvider;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.service.presentation.model.DeliveryType[] r0 = com.carrefour.fid.android.service.presentation.model.DeliveryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.service.presentation.model.DeliveryType r1 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public DeliveryServiceSelectionViewModel(@C12579k C37878e eVar, @C12579k SetPendingServiceSelectionUseCase setPendingServiceSelectionUseCase2, @C12579k DeliveryServiceSelectionAnalyticsReporter deliveryServiceSelectionAnalyticsReporter, @C12579k C37493a aVar, @C12579k C37812b bVar) {
        super(DeliveryServiceSelection.UiState.AwaitingAddressValidation.INSTANCE, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(setPendingServiceSelectionUseCase2, "setPendingServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(deliveryServiceSelectionAnalyticsReporter, "analytics");
        Intrinsics.checkNotNullParameter(aVar, "userAddressProvider");
        Intrinsics.checkNotNullParameter(bVar, "fetchDeliveryStoresUseCase");
        this.getUserInfoUseCase = eVar;
        this.setPendingServiceSelectionUseCase = setPendingServiceSelectionUseCase2;
        this.analytics = deliveryServiceSelectionAnalyticsReporter;
        this.userAddressProvider = aVar;
        this.fetchDeliveryStoresUseCase = bVar;
        C11744g<DeliveryServiceSelectionSideEffect> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this._sideEffect = d;
        this.sideEffect = C11909g.m47490s1(d);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchAddress(com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection.UserAction.ChangeAddress r36, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$fetchAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$fetchAddress$1 r2 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$fetchAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$fetchAddress$1 r2 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$fetchAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            r9 = r2
            java.lang.Object r1 = r9.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r9.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 == r5) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0108
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            java.lang.Object r3 = r9.L$1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection$UserAction$ChangeAddress r3 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection.UserAction.ChangeAddress) r3
            java.lang.Object r5 = r9.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r5 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel) r5
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0064
        L_0x004c:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r3 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r9.L$0 = r0
            r6 = r36
            r9.L$1 = r6
            r9.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r3, r9)
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            r5 = r0
            r3 = r6
        L_0x0064:
            kotlin.Result.m38705e(r1)
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x0108
            r6 = r1
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            java.util.List r7 = r6.mo116671x()
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r7)
            com.carrefour.fid.android.domain.models.account.Phone r7 = (com.carrefour.fid.android.domain.models.account.Phone) r7
            com.carrefour.fid.android.domain.models.account.Address r8 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155955a(r6)
            if (r8 != 0) goto L_0x00ae
            com.carrefour.fid.android.domain.models.account.Address r8 = new com.carrefour.fid.android.domain.models.account.Address
            r10 = r8
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            com.carrefour.fid.android.domain.models.AddressCategory r24 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 1040383(0xfdfff, float:1.457887E-39)
            r34 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33, r34)
        L_0x00ae:
            com.carrefour.fid.android.domain.models.account.Address r6 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155956b(r6)
            if (r6 != 0) goto L_0x00e2
            com.carrefour.fid.android.domain.models.account.Address r6 = new com.carrefour.fid.android.domain.models.account.Address
            r10 = r6
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            com.carrefour.fid.android.domain.models.AddressCategory r24 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 1040383(0xfdfff, float:1.457887E-39)
            r34 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32, r33, r34)
        L_0x00e2:
            r10 = 0
            if (r7 == 0) goto L_0x00ea
            java.lang.String r7 = r7.mo116741e()
            goto L_0x00eb
        L_0x00ea:
            r7 = r10
        L_0x00eb:
            if (r7 != 0) goto L_0x00ef
            java.lang.String r7 = ""
        L_0x00ef:
            com.carrefour.fid.android.service.presentation.model.DeliveryType r11 = r3.getDeliveryType()
            kotlin.jvm.functions.a r12 = r3.getOnAddressValidated()
            r9.L$0 = r1
            r9.L$1 = r10
            r9.label = r4
            r3 = r5
            r4 = r11
            r5 = r8
            r8 = r12
            java.lang.Object r1 = r3.onChangeAddress(r4, r5, r6, r7, r8, r9)
            if (r1 != r2) goto L_0x0108
            return r2
        L_0x0108:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.fetchAddress(com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection$UserAction$ChangeAddress, kotlin.coroutines.c):java.lang.Object");
    }

    private final Double getFreeThresholdFee(List<DeliveryFee> list) {
        DeliveryFee.FeeAmount j;
        boolean z;
        if (list.isEmpty()) {
            return null;
        }
        boolean z2 = true;
        if (((DeliveryFee) CollectionsKt___CollectionsKt.m40653k3(list)).mo119072i() != null) {
            DeliveryFee.FeeAmount i = ((DeliveryFee) CollectionsKt___CollectionsKt.m40653k3(list)).mo119072i();
            if (i == null || i.mo119087i() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
        }
        DeliveryFee.FeeAmount h = ((DeliveryFee) CollectionsKt___CollectionsKt.m40653k3(list)).mo119070h();
        if (h == null || h.mo119087i() != 0) {
            z2 = false;
        }
        if (!z2 || (j = ((DeliveryFee) CollectionsKt___CollectionsKt.m40653k3(list)).mo119073j()) == null) {
            return null;
        }
        return Double.valueOf(j.mo119083f());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getStoreFacilityAtAddress(com.carrefour.fid.android.domain.models.account.Address r20, com.carrefour.fid.android.service.presentation.model.DeliveryType r21, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.C38166m> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$getStoreFacilityAtAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$getStoreFacilityAtAddress$1 r2 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$getStoreFacilityAtAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$getStoreFacilityAtAddress$1 r2 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$getStoreFacilityAtAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.b r1 = r0.fetchDeliveryStoresUseCase
            com.carrefour.fid.android.domain.interactors.service.b$a r4 = new com.carrefour.fid.android.domain.interactors.service.b$a
            double r7 = r20.mo116691P()
            double r9 = r20.mo116693R()
            com.carrefour.fid.android.service.presentation.model.DeliveryType r6 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv
            r11 = r21
            if (r11 != r6) goto L_0x0052
            r11 = r5
            goto L_0x0054
        L_0x0052:
            r6 = 0
            r11 = r6
        L_0x0054:
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 248(0xf8, float:3.48E-43)
            r18 = 0
            r6 = r4
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.label = r5
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x006b
            return r3
        L_0x006b:
            boolean r2 = kotlin.Result.m38709i(r1)
            if (r2 == 0) goto L_0x0072
            r1 = 0
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.getStoreFacilityAtAddress(com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.service.presentation.model.DeliveryType, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object handleServices(com.carrefour.fid.android.domain.models.service.models.C38166m r9, com.carrefour.fid.android.service.presentation.model.DeliveryType r10, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$handleServices$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$handleServices$1 r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$handleServices$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$handleServices$1 r0 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$handleServices$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r6) goto L_0x0050
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r10 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0094
        L_0x0043:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r10 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00c3
        L_0x0050:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r10 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b6
        L_0x005c:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService r11 = r8.obtainClcvService(r9)
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service r9 = r8.obtainH1h3Service(r9)
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService[] r2 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService[r5]
            r7 = 0
            r2[r7] = r11
            r2[r6] = r9
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r2)
            int[] r7 = com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.WhenMappings.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r7[r10]
            if (r10 == r6) goto L_0x00a1
            if (r10 == r5) goto L_0x007f
            goto L_0x00c5
        L_0x007f:
            boolean r10 = r9.isAvailable()
            if (r10 == 0) goto L_0x00c5
            r0.L$0 = r8
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r9 = r8.selectService(r9, r6, r0)
            if (r9 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r10 = r8
            r9 = r2
        L_0x0094:
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r11 = kotlinx.coroutines.C12088q3.m48293a(r0)
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x00a1:
            boolean r9 = r11.isAvailable()
            if (r9 == 0) goto L_0x00c5
            r0.L$0 = r8
            r0.L$1 = r2
            r0.label = r6
            java.lang.Object r9 = r8.selectService(r11, r6, r0)
            if (r9 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r10 = r8
            r9 = r2
        L_0x00b6:
            r0.L$0 = r10
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r11 = kotlinx.coroutines.C12088q3.m48293a(r0)
            if (r11 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r2 = r9
            goto L_0x00c6
        L_0x00c5:
            r10 = r8
        L_0x00c6:
            com.carrefour.fid.android.service.presentation.analytics.delivery.DeliveryServiceSelectionAnalyticsReporter r9 = r10.analytics
            r9.updateScreenName(r2)
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection$UiState$AvailableServices r9 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection$UiState$AvailableServices
            r9.<init>(r2)
            r10.publishState(r9)
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.handleServices(com.carrefour.fid.android.domain.models.service.models.m, com.carrefour.fid.android.service.presentation.model.DeliveryType, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService obtainClcvService(com.carrefour.fid.android.domain.models.service.models.C38166m r10) {
        /*
            r9 = this;
            java.util.List r10 = r10.mo119402d()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x000f:
            boolean r1 = r10.hasNext()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r10.next()
            com.carrefour.fid.android.domain.models.service.models.l r1 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r1
            java.util.List r5 = r1.mo119367K()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0028:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004d
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.carrefour.fid.android.domain.models.service.models.StoreService r7 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r7
            boolean r8 = r7.mo119189d0()
            if (r8 == 0) goto L_0x0049
            java.lang.String r7 = r7.mo119175S()
            java.lang.String r8 = "151"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0049
            r7 = r2
            goto L_0x004a
        L_0x0049:
            r7 = r4
        L_0x004a:
            if (r7 == 0) goto L_0x0028
            r3 = r6
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.StoreService r3 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r3
            if (r3 == 0) goto L_0x005d
            java.util.Map<com.carrefour.fid.android.service.presentation.model.DeliveryType, kotlin.Pair<com.carrefour.fid.android.domain.models.service.models.l, com.carrefour.fid.android.domain.models.service.models.StoreService>> r2 = r9.storeForDeliverService
            com.carrefour.fid.android.service.presentation.model.DeliveryType r4 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r3)
            r2.put(r4, r5)
        L_0x005d:
            if (r3 == 0) goto L_0x000f
            r0.add(r3)
            goto L_0x000f
        L_0x0063:
            java.lang.Object r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r0)
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r10
            r0 = 0
            if (r10 == 0) goto L_0x0089
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService r3 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService
            java.lang.String r4 = r10.mo119168L()
            java.lang.Double r4 = kotlin.text.C11620r.toDoubleOrNull(r4)
            if (r4 == 0) goto L_0x007d
            double r0 = r4.doubleValue()
        L_0x007d:
            java.util.List r10 = r10.mo119161E()
            java.lang.Double r10 = r9.getFreeThresholdFee(r10)
            r3.<init>(r2, r0, r10)
            return r3
        L_0x0089:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService r10 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService
            r10.<init>(r4, r0, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.obtainClcvService(com.carrefour.fid.android.domain.models.service.models.m):com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService");
    }

    private final H1h3Service obtainH1h3Service(C38166m mVar) {
        double d;
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (C38163l lVar : mVar.mo119402d()) {
            Iterator it = lVar.mo119367K().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                StoreService storeService = (StoreService) obj;
                if (!storeService.mo119189d0() || !Intrinsics.areEqual((Object) storeService.mo119175S(), (Object) "288")) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            StoreService storeService2 = (StoreService) obj;
            if (storeService2 != null) {
                this.storeForDeliverService.put(DeliveryType.H1h3, new Pair(lVar, storeService2));
            }
            if (storeService2 != null) {
                arrayList.add(storeService2);
            }
        }
        StoreService storeService3 = (StoreService) CollectionsKt___CollectionsKt.m40479B2(arrayList);
        if (storeService3 == null) {
            return new H1h3Service(false, 0.0d, 1.9d);
        }
        Double doubleOrNull = C11620r.toDoubleOrNull(storeService3.mo119168L());
        if (doubleOrNull != null) {
            d = doubleOrNull.doubleValue();
        } else {
            d = 0.0d;
        }
        return new H1h3Service(true, d, 1.9d);
    }

    /* access modifiers changed from: private */
    public final Object onChangeAddress(DeliveryType deliveryType, Address address, Address address2, String str, C11289a<C11079d2> aVar, C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new DeliveryServiceSelectionViewModel$onChangeAddress$2(this, address, address2, str, deliveryType, aVar, (C11045c<? super DeliveryServiceSelectionViewModel$onChangeAddress$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object selectService(com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService r12, boolean r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$selectService$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$selectService$1 r0 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$selectService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$selectService$1 r0 = new com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel$selectService$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.domain.models.account.a r12 = (com.carrefour.fid.android.domain.models.account.C37947a) r12
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00c1
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$2
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.service.presentation.model.DeliveryType r13 = (com.carrefour.fid.android.service.presentation.model.DeliveryType) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel r2 = (com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel) r2
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            r14.mo21858l()
            goto L_0x0092
        L_0x0050:
            kotlin.C11661u0.m45747n(r14)
            boolean r14 = r12 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.ClcvService
            if (r14 == 0) goto L_0x005a
            com.carrefour.fid.android.service.presentation.model.DeliveryType r12 = com.carrefour.fid.android.service.presentation.model.DeliveryType.Clcv
            goto L_0x0060
        L_0x005a:
            boolean r12 = r12 instanceof com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.H1h3Service
            if (r12 == 0) goto L_0x00c4
            com.carrefour.fid.android.service.presentation.model.DeliveryType r12 = com.carrefour.fid.android.service.presentation.model.DeliveryType.H1h3
        L_0x0060:
            java.util.Map<com.carrefour.fid.android.service.presentation.model.DeliveryType, kotlin.Pair<com.carrefour.fid.android.domain.models.service.models.l, com.carrefour.fid.android.domain.models.service.models.StoreService>> r14 = r11.storeForDeliverService
            java.lang.Object r14 = r14.get(r12)
            kotlin.Pair r14 = (kotlin.Pair) r14
            if (r14 == 0) goto L_0x0095
            java.lang.Object r2 = r14.mo21846a()
            com.carrefour.fid.android.domain.models.service.models.l r2 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r2
            java.lang.Object r5 = r14.mo21847b()
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r5
            com.carrefour.fid.android.service.domain.interactors.SetPendingServiceSelectionUseCase r6 = r11.setPendingServiceSelectionUseCase
            com.carrefour.fid.android.domain.models.service.models.k r7 = new com.carrefour.fid.android.domain.models.service.models.k
            r7.<init>(r2, r5)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r14
            r0.Z$0 = r13
            r0.label = r4
            java.lang.Object r14 = r6.m172871invokegIAlus((com.carrefour.fid.android.domain.models.service.models.C38162k) r7, (kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>>) r0)
            if (r14 != r1) goto L_0x008e
            return r1
        L_0x008e:
            r2 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0092:
            r8 = r12
            r5 = r13
            goto L_0x0098
        L_0x0095:
            r2 = r11
            r5 = r12
            r8 = r13
        L_0x0098:
            com.carrefour.fid.android.domain.models.account.a r12 = r2.addressTunnelData
            if (r12 == 0) goto L_0x00c1
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect> r13 = r2._sideEffect
            com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary r14 = new com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary
            com.carrefour.fid.android.domain.models.account.Address r2 = r12.mo116774e()
            com.carrefour.fid.android.domain.models.account.Address r6 = com.carrefour.fid.android.service.presentation.model.AddressModelKt.toModel(r2)
            java.lang.String r7 = r12.mo116776f()
            r9 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r12
            r12 = 0
            r0.L$1 = r12
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r12 = r13.mo23757h0(r14, r0)
            if (r12 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x00c4:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel.selectService(com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryService, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final DeliveryServiceSelectionAnalyticsReporter getAnalytics() {
        return this.analytics;
    }

    @C12579k
    public final C11907e<DeliveryServiceSelectionSideEffect> getSideEffect() {
        return this.sideEffect;
    }

    @C12580l
    public Object processIntent(@C12579k DeliveryServiceSelection.UserAction userAction, @C12579k C11045c<? super C11079d2> cVar) {
        if (userAction instanceof DeliveryServiceSelection.UserAction.ChangeAddress) {
            Object fetchAddress = fetchAddress((DeliveryServiceSelection.UserAction.ChangeAddress) userAction, cVar);
            return fetchAddress == C11063b.m42612h() ? fetchAddress : C11079d2.f28267a;
        } else if (userAction instanceof DeliveryServiceSelection.UserAction.SelectService) {
            DeliveryServiceSelection.UserAction.SelectService selectService = (DeliveryServiceSelection.UserAction.SelectService) userAction;
            this.analytics.tagServiceSelected(selectService.getService());
            Object selectService2 = selectService(selectService.getService(), false, cVar);
            return selectService2 == C11063b.m42612h() ? selectService2 : C11079d2.f28267a;
        } else if (!Intrinsics.areEqual((Object) userAction, (Object) DeliveryServiceSelection.UserAction.SwitchToDrive.INSTANCE)) {
            return C11079d2.f28267a;
        } else {
            this.analytics.tagChangeToDrive();
            Object h0 = this._sideEffect.mo23757h0(DeliveryServiceSelectionSideEffect.NavigateToDrive.INSTANCE, cVar);
            return h0 == C11063b.m42612h() ? h0 : C11079d2.f28267a;
        }
    }
}
