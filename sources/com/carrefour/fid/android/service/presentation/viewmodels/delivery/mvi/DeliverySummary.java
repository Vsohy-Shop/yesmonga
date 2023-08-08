package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38038h;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary;", "", "()V", "UiEvent", "UiState", "UserAction", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliverySummary {
    @C12579k
    public static final DeliverySummary INSTANCE = new DeliverySummary();

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent;", "Lcom/carrefour/fid/android/shared/base/u$a;", "AddressNotSetError", "NavigateToHome", "SummaryFetchError", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$AddressNotSetError;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$NavigateToHome;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$SummaryFetchError;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiEvent extends C28505u.C28506a {

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$AddressNotSetError;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class AddressNotSetError implements UiEvent {
            public static final int $stable = 0;
            @C12579k
            public static final AddressNotSetError INSTANCE = new AddressNotSetError();

            private AddressNotSetError() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$NavigateToHome;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class NavigateToHome implements UiEvent {
            public static final int $stable = 0;
            @C12579k
            public static final NavigateToHome INSTANCE = new NavigateToHome();

            private NavigateToHome() {
            }
        }

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent$SummaryFetchError;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiEvent;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class SummaryFetchError implements UiEvent {
            public static final int $stable = 0;
            @C12579k
            public static final SummaryFetchError INSTANCE = new SummaryFetchError();

            private SummaryFetchError() {
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState;", "Lcom/carrefour/fid/android/shared/base/u$d;", "AwaitingSummary", "Summary", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState$AwaitingSummary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState$Summary;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UiState extends C28505u.C28509d {

        @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState$AwaitingSummary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState;", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class AwaitingSummary implements UiState {
            public static final int $stable = 0;
            @C12579k
            public static final AwaitingSummary INSTANCE = new AwaitingSummary();

            private AwaitingSummary() {
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

        @C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState$Summary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UiState;", "", "Lcom/carrefour/fid/android/domain/models/h;", "component1", "", "component2", "deliveryRates", "minOrderAmount", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getDeliveryRates", "()Ljava/util/List;", "Ljava/lang/String;", "getMinOrderAmount", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        @C8567o(parameters = 0)
        public static final class Summary implements UiState {
            public static final int $stable = 8;
            @C12579k
            private final List<C38038h> deliveryRates;
            @C12580l
            private final String minOrderAmount;

            public Summary(@C12579k List<? extends C38038h> list, @C12580l String str) {
                Intrinsics.checkNotNullParameter(list, "deliveryRates");
                this.deliveryRates = list;
                this.minOrderAmount = str;
            }

            public static /* synthetic */ Summary copy$default(Summary summary, List<C38038h> list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = summary.deliveryRates;
                }
                if ((i & 2) != 0) {
                    str = summary.minOrderAmount;
                }
                return summary.copy(list, str);
            }

            @C12579k
            public final List<C38038h> component1() {
                return this.deliveryRates;
            }

            @C12580l
            public final String component2() {
                return this.minOrderAmount;
            }

            @C12579k
            public final Summary copy(@C12579k List<? extends C38038h> list, @C12580l String str) {
                Intrinsics.checkNotNullParameter(list, "deliveryRates");
                return new Summary(list, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Summary)) {
                    return false;
                }
                Summary summary = (Summary) obj;
                return Intrinsics.areEqual((Object) this.deliveryRates, (Object) summary.deliveryRates) && Intrinsics.areEqual((Object) this.minOrderAmount, (Object) summary.minOrderAmount);
            }

            @C12579k
            public final List<C38038h> getDeliveryRates() {
                return this.deliveryRates;
            }

            @C12580l
            public final String getMinOrderAmount() {
                return this.minOrderAmount;
            }

            public int hashCode() {
                int hashCode = this.deliveryRates.hashCode() * 31;
                String str = this.minOrderAmount;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return DefaultImpls.reset(this);
            }

            @C12579k
            public String toString() {
                List<C38038h> list = this.deliveryRates;
                String str = this.minOrderAmount;
                return "Summary(deliveryRates=" + list + ", minOrderAmount=" + str + ")";
            }
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction;", "Lcom/carrefour/fid/android/shared/base/u$b;", "FetchSummary", "Validate", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction$FetchSummary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction$Validate;", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public interface UserAction extends C28505u.C28507b {

        @C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction$FetchSummary;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction;", "deliveryType", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;)V", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class FetchSummary implements UserAction {
            public static final int $stable = 0;
            @C12579k
            private final DeliveryType deliveryType;

            public FetchSummary(@C12579k DeliveryType deliveryType2) {
                Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
                this.deliveryType = deliveryType2;
            }

            public static /* synthetic */ FetchSummary copy$default(FetchSummary fetchSummary, DeliveryType deliveryType2, int i, Object obj) {
                if ((i & 1) != 0) {
                    deliveryType2 = fetchSummary.deliveryType;
                }
                return fetchSummary.copy(deliveryType2);
            }

            @C12579k
            public final DeliveryType component1() {
                return this.deliveryType;
            }

            @C12579k
            public final FetchSummary copy(@C12579k DeliveryType deliveryType2) {
                Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
                return new FetchSummary(deliveryType2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchSummary) && this.deliveryType == ((FetchSummary) obj).deliveryType;
            }

            @C12579k
            public final DeliveryType getDeliveryType() {
                return this.deliveryType;
            }

            public int hashCode() {
                return this.deliveryType.hashCode();
            }

            @C12579k
            public String toString() {
                DeliveryType deliveryType2 = this.deliveryType;
                return "FetchSummary(deliveryType=" + deliveryType2 + ")";
            }
        }

        @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction$Validate;", "Lcom/carrefour/fid/android/service/presentation/viewmodels/delivery/mvi/DeliverySummary$UserAction;", "address", "Lcom/carrefour/fid/android/domain/models/account/Address;", "telephone", "", "(Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;)V", "getAddress", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "getTelephone", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        @C8567o(parameters = 0)
        public static final class Validate implements UserAction {
            public static final int $stable = 8;
            @C12579k
            private final Address address;
            @C12579k
            private final String telephone;

            public Validate(@C12579k Address address2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address2, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                this.address = address2;
                this.telephone = str;
            }

            public static /* synthetic */ Validate copy$default(Validate validate, Address address2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address2 = validate.address;
                }
                if ((i & 2) != 0) {
                    str = validate.telephone;
                }
                return validate.copy(address2, str);
            }

            @C12579k
            public final Address component1() {
                return this.address;
            }

            @C12579k
            public final String component2() {
                return this.telephone;
            }

            @C12579k
            public final Validate copy(@C12579k Address address2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(address2, "address");
                Intrinsics.checkNotNullParameter(str, "telephone");
                return new Validate(address2, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Validate)) {
                    return false;
                }
                Validate validate = (Validate) obj;
                return Intrinsics.areEqual((Object) this.address, (Object) validate.address) && Intrinsics.areEqual((Object) this.telephone, (Object) validate.telephone);
            }

            @C12579k
            public final Address getAddress() {
                return this.address;
            }

            @C12579k
            public final String getTelephone() {
                return this.telephone;
            }

            public int hashCode() {
                return (this.address.hashCode() * 31) + this.telephone.hashCode();
            }

            @C12579k
            public String toString() {
                Address address2 = this.address;
                String str = this.telephone;
                return "Validate(address=" + address2 + ", telephone=" + str + ")";
            }
        }
    }

    private DeliverySummary() {
    }
}
