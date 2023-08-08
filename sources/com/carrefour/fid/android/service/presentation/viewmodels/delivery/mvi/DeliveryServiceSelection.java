package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import com.carrefour.fid.android.shared.base.C28505u;
import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection;", "", "()V", "UiState", "UserAction", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliveryServiceSelection {
    @C12579k
    public static final DeliveryServiceSelection INSTANCE = new DeliveryServiceSelection();

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "AvailableServices", "AwaitingAddressValidation", "Loading", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$AvailableServices;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$AwaitingAddressValidation;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$Loading;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiState extends C28505u.C28509d {

        @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$AvailableServices;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "services", "", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "(Ljava/util/List;)V", "getServices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class AvailableServices implements UiState {
            public static final int $stable = 8;
            @C12579k
            private final List<DeliveryService> services;

            public AvailableServices(@C12579k List<? extends DeliveryService> list) {
                Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
                this.services = list;
            }

            public static /* synthetic */ AvailableServices copy$default(AvailableServices availableServices, List<DeliveryService> list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = availableServices.services;
                }
                return availableServices.copy(list);
            }

            @C12579k
            public final List<DeliveryService> component1() {
                return this.services;
            }

            @C12579k
            public final AvailableServices copy(@C12579k List<? extends DeliveryService> list) {
                Intrinsics.checkNotNullParameter(list, C28531e0.f69095y);
                return new AvailableServices(list);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvailableServices) && Intrinsics.areEqual((Object) this.services, (Object) ((AvailableServices) obj).services);
            }

            @C12579k
            public final List<DeliveryService> getServices() {
                return this.services;
            }

            public int hashCode() {
                return this.services.hashCode();
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                List<DeliveryService> list = this.services;
                return "AvailableServices(services=" + list + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$AwaitingAddressValidation;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class AwaitingAddressValidation implements UiState {
            public static final int $stable = 0;
            @C12579k
            public static final AwaitingAddressValidation INSTANCE = new AwaitingAddressValidation();

            private AwaitingAddressValidation() {
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }
        }

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class DefaultImpls {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public static C28505u.C28509d reset(@C12579k UiState uiState) {
                return C28505u.C28509d.C28510a.m118428a(uiState);
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState$Loading;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UiState;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class Loading implements UiState {
            public static final int $stable = 0;
            @C12579k
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "ChangeAddress", "SelectService", "SwitchToDrive", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$ChangeAddress;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$SelectService;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$SwitchToDrive;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$ChangeAddress;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "Lkotlin/Function0;", "Lkotlin/d2;", "component2", "deliveryType", "onAddressValidated", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "Lkotlin/jvm/functions/a;", "getOnAddressValidated", "()Lkotlin/jvm/functions/a;", "<init>", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lkotlin/jvm/functions/a;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        @C8567o(parameters = 0)
        public static final class ChangeAddress implements UserAction {
            public static final int $stable = 0;
            @C12579k
            private final DeliveryType deliveryType;
            @C12579k
            private final C11289a<C11079d2> onAddressValidated;

            public ChangeAddress(@C12579k DeliveryType deliveryType2, @C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
                Intrinsics.checkNotNullParameter(aVar, "onAddressValidated");
                this.deliveryType = deliveryType2;
                this.onAddressValidated = aVar;
            }

            public static /* synthetic */ ChangeAddress copy$default(ChangeAddress changeAddress, DeliveryType deliveryType2, C11289a<C11079d2> aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    deliveryType2 = changeAddress.deliveryType;
                }
                if ((i & 2) != 0) {
                    aVar = changeAddress.onAddressValidated;
                }
                return changeAddress.copy(deliveryType2, aVar);
            }

            @C12579k
            public final DeliveryType component1() {
                return this.deliveryType;
            }

            @C12579k
            public final C11289a<C11079d2> component2() {
                return this.onAddressValidated;
            }

            @C12579k
            public final ChangeAddress copy(@C12579k DeliveryType deliveryType2, @C12579k C11289a<C11079d2> aVar) {
                Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
                Intrinsics.checkNotNullParameter(aVar, "onAddressValidated");
                return new ChangeAddress(deliveryType2, aVar);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeAddress)) {
                    return false;
                }
                ChangeAddress changeAddress = (ChangeAddress) obj;
                return this.deliveryType == changeAddress.deliveryType && Intrinsics.areEqual((Object) this.onAddressValidated, (Object) changeAddress.onAddressValidated);
            }

            @C12579k
            public final DeliveryType getDeliveryType() {
                return this.deliveryType;
            }

            @C12579k
            public final C11289a<C11079d2> getOnAddressValidated() {
                return this.onAddressValidated;
            }

            public int hashCode() {
                return (this.deliveryType.hashCode() * 31) + this.onAddressValidated.hashCode();
            }

            @C12579k
            public String toString() {
                DeliveryType deliveryType2 = this.deliveryType;
                C11289a<C11079d2> aVar = this.onAddressValidated;
                return "ChangeAddress(deliveryType=" + deliveryType2 + ", onAddressValidated=" + aVar + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$SelectService;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;", "service", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "(Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;)V", "getService", "()Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryService;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class SelectService implements UserAction {
            public static final int $stable = 8;
            @C12579k
            private final DeliveryService service;

            public SelectService(@C12579k DeliveryService deliveryService) {
                Intrinsics.checkNotNullParameter(deliveryService, "service");
                this.service = deliveryService;
            }

            public static /* synthetic */ SelectService copy$default(SelectService selectService, DeliveryService deliveryService, int i, Object obj) {
                if ((i & 1) != 0) {
                    deliveryService = selectService.service;
                }
                return selectService.copy(deliveryService);
            }

            @C12579k
            public final DeliveryService component1() {
                return this.service;
            }

            @C12579k
            public final SelectService copy(@C12579k DeliveryService deliveryService) {
                Intrinsics.checkNotNullParameter(deliveryService, "service");
                return new SelectService(deliveryService);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectService) && Intrinsics.areEqual((Object) this.service, (Object) ((SelectService) obj).service);
            }

            @C12579k
            public final DeliveryService getService() {
                return this.service;
            }

            public int hashCode() {
                return this.service.hashCode();
            }

            @C12579k
            public String toString() {
                DeliveryService deliveryService = this.service;
                return "SelectService(service=" + deliveryService + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction$SwitchToDrive;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliveryServiceSelection$UserAction;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class SwitchToDrive implements UserAction {
            public static final int $stable = 0;
            @C12579k
            public static final SwitchToDrive INSTANCE = new SwitchToDrive();

            private SwitchToDrive() {
            }
        }
    }

    private DeliveryServiceSelection() {
    }
}
