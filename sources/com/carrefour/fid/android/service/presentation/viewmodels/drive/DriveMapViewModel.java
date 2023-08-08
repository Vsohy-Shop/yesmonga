package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.LatLon;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.C38146a;
import com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveMapAnalyticsReporter;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
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
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001TBA\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\bR\u0010SJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ#\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0;8\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010:R\"\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020;8\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C088\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bD\u0010:R\"\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0;8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020H0K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010Q\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel;", "Landroidx/lifecycle/v0;", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "drivePoint", "", "distanceMeters", "Lkotlin/d2;", "selectDriveOrNavigateToSummary", "(Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;FLkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "driveType", "validate", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Lcom/carrefour/fid/android/domain/models/service/models/DriveType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "onAddressValidated", "checkBillingAddress", "(Lkotlin/jvm/functions/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "billingAddress", "deliveryAddress", "goToBillingAddress", "(Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/domain/models/account/Address;Lkotlin/jvm/functions/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "setDriveSelection", "Lcom/carrefour/fid/android/domain/models/LatLon;", "latLon", "fetchDrivePointThrottled", "", "fetchDrivePoints", "(Lcom/carrefour/fid/android/domain/models/LatLon;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/c2;", "onDriveSelected", "Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase;", "fetchDriveUseCase", "Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/domain/events/account/a;", "tunnelInputProvider", "Lcom/carrefour/fid/android/domain/events/account/a;", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "getFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "setServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/s;", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "switchFacilityServiceInBasketUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/j0;", "Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveMapAnalyticsReporter;", "analytics", "Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveMapAnalyticsReporter;", "Lkotlinx/coroutines/flow/j;", "_drivePoints", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/u;", "drivePoints", "Lkotlinx/coroutines/flow/u;", "getDrivePoints$service_release", "()Lkotlinx/coroutines/flow/u;", "_selectedDrive", "selectedDrive", "getSelectedDrive$service_release", "Lcom/carrefour/fid/android/domain/models/service/models/a;", "_driveLoading", "driveLoading", "getDriveLoading", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "_eventChannel", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/flow/e;", "events", "Lkotlinx/coroutines/flow/e;", "getEvents", "()Lkotlinx/coroutines/flow/e;", "fetchJob", "Lkotlinx/coroutines/c2;", "<init>", "(Lcom/carrefour/fid/android/service/domain/interactors/FetchDriveUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/events/account/a;Lcom/carrefour/fid/android/domain/interactors/service/e;Lcom/carrefour/fid/android/domain/interactors/service/s;Lcom/carrefour/fid/android/domain/interactors/basket/j0;Lcom/carrefour/fid/android/service/presentation/analytics/drive/DriveMapAnalyticsReporter;)V", "Event", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveMapViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveMapViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n230#2,5:197\n230#2,5:228\n1603#3,9:202\n1855#3:211\n1603#3,9:212\n1855#3:221\n1856#3:223\n1612#3:224\n1856#3:226\n1612#3:227\n766#3:233\n857#3,2:234\n1603#3,9:236\n1855#3:245\n1856#3:247\n1612#3:248\n288#3,2:249\n1#4:222\n1#4:225\n1#4:246\n*S KotlinDebug\n*F\n+ 1 DriveMapViewModel.kt\ncom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel\n*L\n65#1:197,5\n98#1:228,5\n80#1:202,9\n80#1:211\n89#1:212,9\n89#1:221\n89#1:223\n89#1:224\n80#1:226\n80#1:227\n121#1:233\n121#1:234,2\n124#1:236,9\n124#1:245\n124#1:247\n124#1:248\n142#1:249,2\n89#1:222\n80#1:225\n124#1:246\n*E\n"})
public final class DriveMapViewModel extends C19476v0 {
    /* access modifiers changed from: private */
    @C12579k
    public final C11940j<C38146a> _driveLoading;
    @C12579k
    private final C11940j<List<DrivePoint>> _drivePoints;
    /* access modifiers changed from: private */
    @C12579k
    public final C11744g<C28436Event> _eventChannel;
    @C12579k
    private final C11940j<DrivePoint> _selectedDrive;
    /* access modifiers changed from: private */
    @C12579k
    public final DriveMapAnalyticsReporter analytics;
    @C12579k
    private final C11952u<C38146a> driveLoading;
    @C12579k
    private final C11952u<List<DrivePoint>> drivePoints;
    @C12579k
    private final C11907e<C28436Event> events;
    @C12579k
    private final FetchDriveUseCase fetchDriveUseCase;
    @C12580l
    private C11723c2 fetchJob;
    @C12579k
    private final C37816e getFacilityDetailsByAnabelKeyUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;
    @C12579k
    private final C11952u<DrivePoint> selectedDrive;
    @C12579k
    private final C37836s setServiceSelectionUseCase;
    @C12579k
    private final C37578j0 switchFacilityServiceInBasketUseCase;
    /* access modifiers changed from: private */
    @C12579k
    public final C37493a tunnelInputProvider;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "", "DataFetchError", "NavigateToBillingAddress", "NavigateToHome", "NavigateToSummary", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$DataFetchError;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToBillingAddress;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToHome;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToSummary;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event */
    public interface C28436Event {

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$DataFetchError;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$DataFetchError */
        public static final class DataFetchError implements C28436Event {
            public static final int $stable = 0;
            @C12579k
            public static final DataFetchError INSTANCE = new DataFetchError();

            private DataFetchError() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToBillingAddress;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "deliveryAddress", "Lcom/carrefour/fid/android/domain/models/account/Address;", "billingAddress", "(Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/domain/models/account/Address;)V", "getBillingAddress", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "getDeliveryAddress", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToBillingAddress */
        public static final class NavigateToBillingAddress implements C28436Event {
            public static final int $stable = 8;
            @C12579k
            private final Address billingAddress;
            @C12579k
            private final Address deliveryAddress;

            public NavigateToBillingAddress(@C12579k Address address, @C12579k Address address2) {
                Intrinsics.checkNotNullParameter(address, "deliveryAddress");
                Intrinsics.checkNotNullParameter(address2, "billingAddress");
                this.deliveryAddress = address;
                this.billingAddress = address2;
            }

            public static /* synthetic */ NavigateToBillingAddress copy$default(NavigateToBillingAddress navigateToBillingAddress, Address address, Address address2, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = navigateToBillingAddress.deliveryAddress;
                }
                if ((i & 2) != 0) {
                    address2 = navigateToBillingAddress.billingAddress;
                }
                return navigateToBillingAddress.copy(address, address2);
            }

            @C12579k
            public final Address component1() {
                return this.deliveryAddress;
            }

            @C12579k
            public final Address component2() {
                return this.billingAddress;
            }

            @C12579k
            public final NavigateToBillingAddress copy(@C12579k Address address, @C12579k Address address2) {
                Intrinsics.checkNotNullParameter(address, "deliveryAddress");
                Intrinsics.checkNotNullParameter(address2, "billingAddress");
                return new NavigateToBillingAddress(address, address2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NavigateToBillingAddress)) {
                    return false;
                }
                NavigateToBillingAddress navigateToBillingAddress = (NavigateToBillingAddress) obj;
                return Intrinsics.areEqual((Object) this.deliveryAddress, (Object) navigateToBillingAddress.deliveryAddress) && Intrinsics.areEqual((Object) this.billingAddress, (Object) navigateToBillingAddress.billingAddress);
            }

            @C12579k
            public final Address getBillingAddress() {
                return this.billingAddress;
            }

            @C12579k
            public final Address getDeliveryAddress() {
                return this.deliveryAddress;
            }

            public int hashCode() {
                return (this.deliveryAddress.hashCode() * 31) + this.billingAddress.hashCode();
            }

            @C12579k
            public String toString() {
                Address address = this.deliveryAddress;
                Address address2 = this.billingAddress;
                return "NavigateToBillingAddress(deliveryAddress=" + address + ", billingAddress=" + address2 + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToHome;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToHome */
        public static final class NavigateToHome implements C28436Event {
            public static final int $stable = 0;
            @C12579k
            public static final NavigateToHome INSTANCE = new NavigateToHome();

            private NavigateToHome() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event$NavigateToSummary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveMapViewModel$Event;", "storeId", "", "distanceMeters", "", "(Ljava/lang/String;F)V", "getDistanceMeters", "()F", "getStoreId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToSummary */
        public static final class NavigateToSummary implements C28436Event {
            public static final int $stable = 0;
            private final float distanceMeters;
            @C12579k
            private final String storeId;

            public NavigateToSummary(@C12579k String str, float f) {
                Intrinsics.checkNotNullParameter(str, "storeId");
                this.storeId = str;
                this.distanceMeters = f;
            }

            public static /* synthetic */ NavigateToSummary copy$default(NavigateToSummary navigateToSummary, String str, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = navigateToSummary.storeId;
                }
                if ((i & 2) != 0) {
                    f = navigateToSummary.distanceMeters;
                }
                return navigateToSummary.copy(str, f);
            }

            @C12579k
            public final String component1() {
                return this.storeId;
            }

            public final float component2() {
                return this.distanceMeters;
            }

            @C12579k
            public final NavigateToSummary copy(@C12579k String str, float f) {
                Intrinsics.checkNotNullParameter(str, "storeId");
                return new NavigateToSummary(str, f);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NavigateToSummary)) {
                    return false;
                }
                NavigateToSummary navigateToSummary = (NavigateToSummary) obj;
                return Intrinsics.areEqual((Object) this.storeId, (Object) navigateToSummary.storeId) && Float.compare(this.distanceMeters, navigateToSummary.distanceMeters) == 0;
            }

            public final float getDistanceMeters() {
                return this.distanceMeters;
            }

            @C12579k
            public final String getStoreId() {
                return this.storeId;
            }

            public int hashCode() {
                return (this.storeId.hashCode() * 31) + Float.hashCode(this.distanceMeters);
            }

            @C12579k
            public String toString() {
                String str = this.storeId;
                float f = this.distanceMeters;
                return "NavigateToSummary(storeId=" + str + ", distanceMeters=" + f + ")";
            }
        }
    }

    @Inject
    public DriveMapViewModel(@C12579k FetchDriveUseCase fetchDriveUseCase2, @C12579k C37878e eVar, @C12579k C37493a aVar, @C12579k C37816e eVar2, @C12579k C37836s sVar, @C12579k C37578j0 j0Var, @C12579k DriveMapAnalyticsReporter driveMapAnalyticsReporter) {
        Intrinsics.checkNotNullParameter(fetchDriveUseCase2, "fetchDriveUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(aVar, "tunnelInputProvider");
        Intrinsics.checkNotNullParameter(eVar2, "getFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(sVar, "setServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        Intrinsics.checkNotNullParameter(driveMapAnalyticsReporter, "analytics");
        this.fetchDriveUseCase = fetchDriveUseCase2;
        this.getUserInfoUseCase = eVar;
        this.tunnelInputProvider = aVar;
        this.getFacilityDetailsByAnabelKeyUseCase = eVar2;
        this.setServiceSelectionUseCase = sVar;
        this.switchFacilityServiceInBasketUseCase = j0Var;
        this.analytics = driveMapAnalyticsReporter;
        C11940j<List<DrivePoint>> a = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this._drivePoints = a;
        this.drivePoints = C11909g.m47470m(a);
        C11940j<DrivePoint> a2 = C11953v.m47628a(null);
        this._selectedDrive = a2;
        this.selectedDrive = C11909g.m47470m(a2);
        C11940j<C38146a> a3 = C11953v.m47628a(null);
        this._driveLoading = a3;
        this.driveLoading = C11909g.m47470m(a3);
        C11744g<C28436Event> d = C11748i.m46625d(1, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this._eventChannel = d;
        this.events = C11909g.m47490s1(d);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object checkBillingAddress(kotlin.jvm.functions.C11300l<? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r36, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$checkBillingAddress$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$checkBillingAddress$1 r2 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$checkBillingAddress$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$checkBillingAddress$1 r2 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$checkBillingAddress$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 == r7) goto L_0x0040
            if (r4 == r6) goto L_0x003c
            if (r4 != r5) goto L_0x0034
            kotlin.C11661u0.m45747n(r1)
            goto L_0x0107
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            kotlin.C11661u0.m45747n(r1)
            goto L_0x008b
        L_0x0040:
            java.lang.Object r4 = r2.L$1
            kotlin.jvm.functions.l r4 = (kotlin.jvm.functions.C11300l) r4
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r7 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r7
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x006a
        L_0x0052:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r4 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r2.L$0 = r0
            r8 = r36
            r2.L$1 = r8
            r2.label = r7
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0068
            return r3
        L_0x0068:
            r7 = r0
            r4 = r8
        L_0x006a:
            boolean r8 = kotlin.Result.m38709i(r1)
            r9 = 0
            if (r8 == 0) goto L_0x0072
            r1 = r9
        L_0x0072:
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            if (r1 == 0) goto L_0x007b
            com.carrefour.fid.android.domain.models.account.Address r8 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155955a(r1)
            goto L_0x007c
        L_0x007b:
            r8 = r9
        L_0x007c:
            if (r8 == 0) goto L_0x008e
            r2.L$0 = r9
            r2.L$1 = r9
            r2.label = r6
            java.lang.Object r1 = r4.invoke(r2)
            if (r1 != r3) goto L_0x008b
            return r3
        L_0x008b:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x008e:
            if (r1 == 0) goto L_0x0096
            com.carrefour.fid.android.domain.models.account.Address r6 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155955a(r1)
            if (r6 != 0) goto L_0x00c4
        L_0x0096:
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
        L_0x00c4:
            if (r1 == 0) goto L_0x00cc
            com.carrefour.fid.android.domain.models.account.Address r1 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155956b(r1)
            if (r1 != 0) goto L_0x00fa
        L_0x00cc:
            com.carrefour.fid.android.domain.models.account.Address r1 = new com.carrefour.fid.android.domain.models.account.Address
            r10 = r1
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
        L_0x00fa:
            r2.L$0 = r9
            r2.L$1 = r9
            r2.label = r5
            java.lang.Object r1 = r7.goToBillingAddress(r6, r1, r4, r2)
            if (r1 != r3) goto L_0x0107
            return r3
        L_0x0107:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.checkBillingAddress(kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object goToBillingAddress(Address address, Address address2, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new DriveMapViewModel$goToBillingAddress$2(this, address, address2, lVar, (C11045c<? super DriveMapViewModel$goToBillingAddress$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object selectDriveOrNavigateToSummary(com.carrefour.fid.android.service.presentation.model.DrivePoint r18, float r19, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$selectDriveOrNavigateToSummary$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$selectDriveOrNavigateToSummary$1 r2 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$selectDriveOrNavigateToSummary$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$selectDriveOrNavigateToSummary$1 r2 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$selectDriveOrNavigateToSummary$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x005e
            if (r4 == r8) goto L_0x004a
            if (r4 == r7) goto L_0x003f
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            kotlin.C11661u0.m45747n(r1)
            goto L_0x012b
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$1
            java.lang.Object r6 = r2.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r6 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r6
            kotlin.C11661u0.m45747n(r1)
            goto L_0x00f8
        L_0x004a:
            float r4 = r2.F$0
            java.lang.Object r9 = r2.L$1
            com.carrefour.fid.android.service.presentation.model.DrivePoint r9 = (com.carrefour.fid.android.service.presentation.model.DrivePoint) r9
            java.lang.Object r10 = r2.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r10 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r10
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0084
        L_0x005e:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.service.e r1 = r0.getFacilityDetailsByAnabelKeyUseCase
            java.lang.String r4 = r18.getStoreId()
            java.lang.String r4 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r4)
            com.carrefour.fid.android.domain.models.service.models.a r4 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r4)
            r2.L$0 = r0
            r9 = r18
            r2.L$1 = r9
            r10 = r19
            r2.F$0 = r10
            r2.label = r8
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x0082
            return r3
        L_0x0082:
            r4 = r10
            r10 = r0
        L_0x0084:
            boolean r11 = kotlin.Result.m38710j(r1)
            if (r11 == 0) goto L_0x0113
            r11 = r1
            com.carrefour.fid.android.domain.models.service.models.l r11 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r11
            java.util.List r12 = r11.mo119367K()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x009c:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00be
            java.lang.Object r14 = r12.next()
            r15 = r14
            com.carrefour.fid.android.domain.models.service.models.StoreService r15 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r15
            boolean r16 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDrive(r15)
            if (r16 == 0) goto L_0x00b7
            boolean r15 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDataValid(r15)
            if (r15 == 0) goto L_0x00b7
            r15 = r8
            goto L_0x00b8
        L_0x00b7:
            r15 = 0
        L_0x00b8:
            if (r15 == 0) goto L_0x009c
            r13.add(r14)
            goto L_0x009c
        L_0x00be:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00c7:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00dd
            java.lang.Object r14 = r13.next()
            com.carrefour.fid.android.domain.models.service.models.StoreService r14 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r14
            com.carrefour.fid.android.domain.models.service.models.DriveType r14 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.getDriveType(r14)
            if (r14 == 0) goto L_0x00c7
            r12.add(r14)
            goto L_0x00c7
        L_0x00dd:
            int r13 = r12.size()
            if (r13 != r8) goto L_0x00fb
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r12)
            com.carrefour.fid.android.domain.models.service.models.DriveType r4 = (com.carrefour.fid.android.domain.models.service.models.DriveType) r4
            r2.L$0 = r10
            r2.L$1 = r1
            r2.label = r7
            java.lang.Object r4 = r10.validate(r11, r4, r2)
            if (r4 != r3) goto L_0x00f6
            return r3
        L_0x00f6:
            r4 = r1
            r6 = r10
        L_0x00f8:
            r1 = r4
            r10 = r6
            goto L_0x0113
        L_0x00fb:
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event> r7 = r10._eventChannel
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToSummary r8 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToSummary
            java.lang.String r9 = r9.getStoreId()
            r8.<init>(r9, r4)
            r2.L$0 = r10
            r2.L$1 = r1
            r2.label = r6
            java.lang.Object r4 = r7.mo23757h0(r8, r2)
            if (r4 != r3) goto L_0x00f6
            return r3
        L_0x0113:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r1)
            if (r4 == 0) goto L_0x012b
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event> r4 = r10._eventChannel
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$DataFetchError r6 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.C28436Event.DataFetchError.INSTANCE
            r2.L$0 = r1
            r1 = 0
            r2.L$1 = r1
            r2.label = r5
            java.lang.Object r1 = r4.mo23757h0(r6, r2)
            if (r1 != r3) goto L_0x012b
            return r3
        L_0x012b:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.selectDriveOrNavigateToSummary(com.carrefour.fid.android.service.presentation.model.DrivePoint, float, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object validate(com.carrefour.fid.android.domain.models.service.models.C38163l r11, com.carrefour.fid.android.domain.models.service.models.DriveType r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$validate$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$validate$1 r0 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$validate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$validate$1 r0 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$validate$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x006a
            if (r2 == r7) goto L_0x0059
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0100
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            java.lang.Object r11 = r0.L$1
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r12 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r12
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00e6
        L_0x0047:
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r11 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r11
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r12 = r13.mo21858l()
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x00cf
        L_0x0059:
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r11
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r12 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r12
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x00b4
        L_0x006a:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.service.presentation.analytics.drive.DriveMapAnalyticsReporter r13 = r10.analytics
            r13.tagValidatePressed()
            java.util.List r13 = r11.mo119367K()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x007c:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r13.next()
            r8 = r2
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r8
            com.carrefour.fid.android.domain.models.service.models.DriveType r8 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.getDriveType(r8)
            if (r8 != r12) goto L_0x0091
            r8 = r7
            goto L_0x0092
        L_0x0091:
            r8 = 0
        L_0x0092:
            if (r8 == 0) goto L_0x007c
            goto L_0x0096
        L_0x0095:
            r2 = r6
        L_0x0096:
            r12 = r2
            com.carrefour.fid.android.domain.models.service.models.StoreService r12 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r12
            if (r12 != 0) goto L_0x009e
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x009e:
            com.carrefour.fid.android.domain.interactors.service.s r13 = r10.setServiceSelectionUseCase
            com.carrefour.fid.android.domain.interactors.service.s$a r2 = new com.carrefour.fid.android.domain.interactors.service.s$a
            r2.<init>(r11, r12)
            r0.L$0 = r10
            r0.L$1 = r12
            r0.label = r7
            java.lang.Object r11 = r13.m172966invokegIAlus(r2, r0)
            if (r11 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            r11 = r12
            r12 = r10
        L_0x00b4:
            com.carrefour.fid.android.domain.interactors.basket.j0 r13 = r12.switchFacilityServiceInBasketUseCase
            java.lang.String r11 = r11.mo119163G()
            java.lang.String r11 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r11)
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r11 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r11)
            r0.L$0 = r12
            r0.L$1 = r6
            r0.label = r5
            java.lang.Object r11 = r13.m172966invokegIAlus(r11, r0)
            if (r11 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            java.lang.Throwable r13 = kotlin.Result.m38705e(r11)
            if (r13 == 0) goto L_0x00e6
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event> r13 = r12._eventChannel
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$DataFetchError r2 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.C28436Event.DataFetchError.INSTANCE
            r0.L$0 = r12
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r13 = r13.mo23757h0(r2, r0)
            if (r13 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            boolean r13 = kotlin.Result.m38710j(r11)
            if (r13 == 0) goto L_0x0100
            r13 = r11
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event> r12 = r12._eventChannel
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$NavigateToHome r13 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.C28436Event.NavigateToHome.INSTANCE
            r0.L$0 = r11
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r11 = r12.mo23757h0(r13, r0)
            if (r11 != r1) goto L_0x0100
            return r1
        L_0x0100:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.validate(com.carrefour.fid.android.domain.models.service.models.l, com.carrefour.fid.android.domain.models.service.models.DriveType, kotlin.coroutines.c):java.lang.Object");
    }

    public final void fetchDrivePointThrottled(@C12579k LatLon latLon) {
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        if (this.fetchJob == null) {
            C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveMapViewModel$fetchDrivePointThrottled$1(this, latLon, (C11045c<? super DriveMapViewModel$fetchDrivePointThrottled$1>) null), 3, (Object) null);
            this.fetchJob = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0082 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fetchDrivePoints(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.LatLon r24, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.service.presentation.model.DrivePoint>> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$fetchDrivePoints$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$fetchDrivePoints$1 r2 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$fetchDrivePoints$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$fetchDrivePoints$1 r2 = new com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$fetchDrivePoints$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004b
            if (r4 == r6) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            java.lang.Object r2 = r2.L$0
            java.util.List r2 = (java.util.List) r2
            kotlin.C11661u0.m45747n(r1)
            goto L_0x018d
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r4 = (com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0069
        L_0x004b:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase r1 = r0.fetchDriveUseCase
            com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$Param r4 = new com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase$Param
            double r7 = r24.getLatitude()
            double r9 = r24.getLongitude()
            r4.<init>(r7, r9)
            r2.L$0 = r0
            r2.label = r6
            java.lang.Object r1 = r1.m172835invokegIAlus((com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase.Param) r4, (kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.service.models.C38166m>>) r2)
            if (r1 != r3) goto L_0x0068
            return r3
        L_0x0068:
            r4 = r0
        L_0x0069:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x015b
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.service.models.m r1 = (com.carrefour.fid.android.domain.models.service.models.C38166m) r1
            java.util.List r1 = r1.mo119402d()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0082:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0156
            java.lang.Object r8 = r1.next()
            com.carrefour.fid.android.domain.models.service.models.l r8 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r8
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r9 = r8.mo119392v()
            if (r9 == 0) goto L_0x014e
            com.carrefour.fid.android.domain.models.service.models.StoreCoordinates r9 = r9.mo119130k()
            if (r9 == 0) goto L_0x014e
            java.lang.String r9 = r9.mo119145e()
            if (r9 == 0) goto L_0x014e
            java.lang.Double r9 = kotlin.text.C11620r.toDoubleOrNull(r9)
            if (r9 == 0) goto L_0x014e
            double r12 = r9.doubleValue()
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r9 = r8.mo119392v()
            if (r9 == 0) goto L_0x014e
            com.carrefour.fid.android.domain.models.service.models.StoreCoordinates r9 = r9.mo119130k()
            if (r9 == 0) goto L_0x014e
            java.lang.String r9 = r9.mo119147f()
            if (r9 == 0) goto L_0x014e
            java.lang.Double r9 = kotlin.text.C11620r.toDoubleOrNull(r9)
            if (r9 == 0) goto L_0x014e
            double r14 = r9.doubleValue()
            java.lang.String r11 = r8.mo119361E()
            java.lang.String r16 = r8.mo119359C()
            java.lang.String r17 = r8.mo119357A()
            java.util.List r9 = r8.mo119367K()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00e1:
            boolean r18 = r9.hasNext()
            if (r18 == 0) goto L_0x00f7
            java.lang.Object r18 = r9.next()
            com.carrefour.fid.android.domain.models.service.models.StoreService r18 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r18
            com.carrefour.fid.android.domain.models.service.models.DriveType r7 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.getDriveType(r18)
            if (r7 == 0) goto L_0x00e1
            r10.add(r7)
            goto L_0x00e1
        L_0x00f7:
            java.util.Set r18 = kotlin.collections.CollectionsKt___CollectionsKt.m40582V5(r10)
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r7 = r8.mo119392v()
            java.lang.String r9 = ""
            if (r7 == 0) goto L_0x010d
            java.lang.String r7 = r7.mo119126h()
            if (r7 != 0) goto L_0x010a
            goto L_0x010d
        L_0x010a:
            r19 = r7
            goto L_0x010f
        L_0x010d:
            r19 = r9
        L_0x010f:
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r7 = r8.mo119392v()
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = r7.mo119128i()
            if (r7 != 0) goto L_0x011c
            goto L_0x011f
        L_0x011c:
            r20 = r7
            goto L_0x0121
        L_0x011f:
            r20 = r9
        L_0x0121:
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r7 = r8.mo119392v()
            if (r7 == 0) goto L_0x012c
            java.lang.String r7 = r7.mo119131l()
            goto L_0x012d
        L_0x012c:
            r7 = 0
        L_0x012d:
            if (r7 != 0) goto L_0x0132
            r21 = r9
            goto L_0x0134
        L_0x0132:
            r21 = r7
        L_0x0134:
            com.carrefour.fid.android.domain.models.service.models.StoreAddress r7 = r8.mo119392v()
            if (r7 == 0) goto L_0x013f
            java.lang.String r7 = r7.mo119129j()
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            if (r7 != 0) goto L_0x0145
            r22 = r9
            goto L_0x0147
        L_0x0145:
            r22 = r7
        L_0x0147:
            com.carrefour.fid.android.service.presentation.model.DrivePoint r7 = new com.carrefour.fid.android.service.presentation.model.DrivePoint
            r10 = r7
            r10.<init>(r11, r12, r14, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            if (r7 == 0) goto L_0x0082
            r6.add(r7)
            goto L_0x0082
        L_0x0156:
            java.lang.Object r1 = kotlin.Result.m38702b(r6)
            goto L_0x015f
        L_0x015b:
            java.lang.Object r1 = kotlin.Result.m38702b(r1)
        L_0x015f:
            boolean r6 = kotlin.Result.m38709i(r1)
            if (r6 == 0) goto L_0x0167
            r7 = 0
            goto L_0x0168
        L_0x0167:
            r7 = r1
        L_0x0168:
            r1 = r7
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x017d
            kotlinx.coroutines.flow.j<java.util.List<com.carrefour.fid.android.service.presentation.model.DrivePoint>> r6 = r4._drivePoints
        L_0x016f:
            java.lang.Object r2 = r6.getValue()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r6.mo24216e(r2, r1)
            if (r2 == 0) goto L_0x016f
            goto L_0x018e
        L_0x017d:
            kotlinx.coroutines.channels.g<com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event> r4 = r4._eventChannel
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel$Event$DataFetchError r6 = com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.C28436Event.DataFetchError.INSTANCE
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r2 = r4.mo23757h0(r6, r2)
            if (r2 != r3) goto L_0x018c
            return r3
        L_0x018c:
            r2 = r1
        L_0x018d:
            r1 = r2
        L_0x018e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel.fetchDrivePoints(com.carrefour.fid.android.domain.models.LatLon, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public final C11952u<C38146a> getDriveLoading() {
        return this.driveLoading;
    }

    @C12579k
    public final C11952u<List<DrivePoint>> getDrivePoints$service_release() {
        return this.drivePoints;
    }

    @C12579k
    public final C11907e<C28436Event> getEvents() {
        return this.events;
    }

    @C12579k
    public final C11952u<DrivePoint> getSelectedDrive$service_release() {
        return this.selectedDrive;
    }

    @C12579k
    public final C11723c2 onDriveSelected(@C12579k DrivePoint drivePoint, float f) {
        Intrinsics.checkNotNullParameter(drivePoint, "drivePoint");
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new DriveMapViewModel$onDriveSelected$1(this, drivePoint, f, (C11045c<? super DriveMapViewModel$onDriveSelected$1>) null), 3, (Object) null);
    }

    public final void setDriveSelection(@C12580l DrivePoint drivePoint) {
        DrivePoint value;
        C11940j<DrivePoint> jVar = this._selectedDrive;
        do {
            value = jVar.getValue();
            DrivePoint drivePoint2 = value;
        } while (!jVar.mo24216e(value, drivePoint));
    }
}
