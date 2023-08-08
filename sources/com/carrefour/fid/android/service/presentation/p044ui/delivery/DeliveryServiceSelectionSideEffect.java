package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37948b;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "", "NavigateToAddressInput", "NavigateToDeliveryServiceSummary", "NavigateToDrive", "NetworkError", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToAddressInput;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToDrive;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NetworkError;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect */
public interface DeliveryServiceSelectionSideEffect {

    @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToAddressInput;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "billingAddress", "Lcom/carrefour/fid/android/domain/models/account/Address;", "deliveryAddress", "phone", "", "(Lcom/carrefour/fid/android/domain/models/account/Address;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;)V", "getBillingAddress", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "getDeliveryAddress", "getPhone", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NavigateToAddressInput */
    public static final class NavigateToAddressInput implements DeliveryServiceSelectionSideEffect {
        public static final int $stable = 8;
        @C12579k
        private final Address billingAddress;
        @C12579k
        private final Address deliveryAddress;
        @C12579k
        private final String phone;

        public NavigateToAddressInput(@C12579k Address address, @C12579k Address address2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "billingAddress");
            Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            this.billingAddress = address;
            this.deliveryAddress = address2;
            this.phone = str;
        }

        public static /* synthetic */ NavigateToAddressInput copy$default(NavigateToAddressInput navigateToAddressInput, Address address, Address address2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                address = navigateToAddressInput.billingAddress;
            }
            if ((i & 2) != 0) {
                address2 = navigateToAddressInput.deliveryAddress;
            }
            if ((i & 4) != 0) {
                str = navigateToAddressInput.phone;
            }
            return navigateToAddressInput.copy(address, address2, str);
        }

        @C12579k
        public final Address component1() {
            return this.billingAddress;
        }

        @C12579k
        public final Address component2() {
            return this.deliveryAddress;
        }

        @C12579k
        public final String component3() {
            return this.phone;
        }

        @C12579k
        public final NavigateToAddressInput copy(@C12579k Address address, @C12579k Address address2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(address, "billingAddress");
            Intrinsics.checkNotNullParameter(address2, "deliveryAddress");
            Intrinsics.checkNotNullParameter(str, C0861a.f2705e);
            return new NavigateToAddressInput(address, address2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToAddressInput)) {
                return false;
            }
            NavigateToAddressInput navigateToAddressInput = (NavigateToAddressInput) obj;
            return Intrinsics.areEqual((Object) this.billingAddress, (Object) navigateToAddressInput.billingAddress) && Intrinsics.areEqual((Object) this.deliveryAddress, (Object) navigateToAddressInput.deliveryAddress) && Intrinsics.areEqual((Object) this.phone, (Object) navigateToAddressInput.phone);
        }

        @C12579k
        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        @C12579k
        public final Address getDeliveryAddress() {
            return this.deliveryAddress;
        }

        @C12579k
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return (((this.billingAddress.hashCode() * 31) + this.deliveryAddress.hashCode()) * 31) + this.phone.hashCode();
        }

        @C12579k
        public String toString() {
            Address address = this.billingAddress;
            Address address2 = this.deliveryAddress;
            String str = this.phone;
            return "NavigateToAddressInput(billingAddress=" + address + ", deliveryAddress=" + address2 + ", phone=" + str + ")";
        }
    }

    @C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\nø\u0001\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÆ\u0003J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000e\u001a\u00020\u00068\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "Lcom/carrefour/fid/android/domain/models/account/Address;", "component2", "Lcom/carrefour/fid/android/domain/models/account/b;", "component3-eg0BugQ", "()Ljava/lang/String;", "component3", "", "component4", "deliveryType", "addressModel", "telephone", "hasSkippedSelection", "copy-bLMwIYs", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Z)Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary;", "copy", "", "toString", "", "hashCode", "", "other", "equals", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "getAddressModel", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "Ljava/lang/String;", "getTelephone-eg0BugQ", "Z", "getHasSkippedSelection", "()Z", "<init>", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NavigateToDeliveryServiceSummary */
    public static final class NavigateToDeliveryServiceSummary implements DeliveryServiceSelectionSideEffect {
        public static final int $stable = 8;
        @C12579k
        private final Address addressModel;
        @C12579k
        private final DeliveryType deliveryType;
        private final boolean hasSkippedSelection;
        @C12579k
        private final String telephone;

        public /* synthetic */ NavigateToDeliveryServiceSummary(DeliveryType deliveryType2, Address address, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(deliveryType2, address, str, z);
        }

        /* renamed from: copy-bLMwIYs$default  reason: not valid java name */
        public static /* synthetic */ NavigateToDeliveryServiceSummary m172884copybLMwIYs$default(NavigateToDeliveryServiceSummary navigateToDeliveryServiceSummary, DeliveryType deliveryType2, Address address, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                deliveryType2 = navigateToDeliveryServiceSummary.deliveryType;
            }
            if ((i & 2) != 0) {
                address = navigateToDeliveryServiceSummary.addressModel;
            }
            if ((i & 4) != 0) {
                str = navigateToDeliveryServiceSummary.telephone;
            }
            if ((i & 8) != 0) {
                z = navigateToDeliveryServiceSummary.hasSkippedSelection;
            }
            return navigateToDeliveryServiceSummary.m172886copybLMwIYs(deliveryType2, address, str, z);
        }

        @C12579k
        public final DeliveryType component1() {
            return this.deliveryType;
        }

        @C12579k
        public final Address component2() {
            return this.addressModel;
        }

        @C12579k
        /* renamed from: component3-eg0BugQ  reason: not valid java name */
        public final String m172885component3eg0BugQ() {
            return this.telephone;
        }

        public final boolean component4() {
            return this.hasSkippedSelection;
        }

        @C12579k
        /* renamed from: copy-bLMwIYs  reason: not valid java name */
        public final NavigateToDeliveryServiceSummary m172886copybLMwIYs(@C12579k DeliveryType deliveryType2, @C12579k Address address, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new NavigateToDeliveryServiceSummary(deliveryType2, address, str, z, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToDeliveryServiceSummary)) {
                return false;
            }
            NavigateToDeliveryServiceSummary navigateToDeliveryServiceSummary = (NavigateToDeliveryServiceSummary) obj;
            return this.deliveryType == navigateToDeliveryServiceSummary.deliveryType && Intrinsics.areEqual((Object) this.addressModel, (Object) navigateToDeliveryServiceSummary.addressModel) && C37948b.m155950d(this.telephone, navigateToDeliveryServiceSummary.telephone) && this.hasSkippedSelection == navigateToDeliveryServiceSummary.hasSkippedSelection;
        }

        @C12579k
        public final Address getAddressModel() {
            return this.addressModel;
        }

        @C12579k
        public final DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        public final boolean getHasSkippedSelection() {
            return this.hasSkippedSelection;
        }

        @C12579k
        /* renamed from: getTelephone-eg0BugQ  reason: not valid java name */
        public final String m172887getTelephoneeg0BugQ() {
            return this.telephone;
        }

        public int hashCode() {
            int hashCode = ((((this.deliveryType.hashCode() * 31) + this.addressModel.hashCode()) * 31) + C37948b.m155951f(this.telephone)) * 31;
            boolean z = this.hasSkippedSelection;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            DeliveryType deliveryType2 = this.deliveryType;
            Address address = this.addressModel;
            String g = C37948b.m155952g(this.telephone);
            boolean z = this.hasSkippedSelection;
            return "NavigateToDeliveryServiceSummary(deliveryType=" + deliveryType2 + ", addressModel=" + address + ", telephone=" + g + ", hasSkippedSelection=" + z + ")";
        }

        private NavigateToDeliveryServiceSummary(DeliveryType deliveryType2, Address address, String str, boolean z) {
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            Intrinsics.checkNotNullParameter(address, "addressModel");
            Intrinsics.checkNotNullParameter(str, "telephone");
            this.deliveryType = deliveryType2;
            this.addressModel = address;
            this.telephone = str;
            this.hasSkippedSelection = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NavigateToDeliveryServiceSummary(DeliveryType deliveryType2, Address address, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deliveryType2, address, str, (i & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NavigateToDrive;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NavigateToDrive */
    public static final class NavigateToDrive implements DeliveryServiceSelectionSideEffect {
        public static final int $stable = 0;
        @C12579k
        public static final NavigateToDrive INSTANCE = new NavigateToDrive();

        private NavigateToDrive() {
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect$NetworkError;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionSideEffect;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionSideEffect$NetworkError */
    public static final class NetworkError implements DeliveryServiceSelectionSideEffect {
        public static final int $stable = 0;
        @C12579k
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
        }
    }
}
