package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentDirections;", "", "()V", "ActionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragmentDirections */
public final class DeliveryServiceSelectionFragmentDirections {
    public static final int $stable = 0;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentDirections$Companion;", "", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "deliveryType", "Lcom/carrefour/fid/android/domain/models/account/Address;", "address", "", "telephone", "", "restartSelectionOnBack", "Landroidx/navigation/b0;", "actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragmentDirections$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment$default */
        public static /* synthetic */ C19693b0 m118307x70bd6bfe(Companion companion, DeliveryType deliveryType, Address address, String str, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.mo82863x4f383761(deliveryType, address, str, z);
        }

        @C12579k
        /* renamed from: actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment */
        public final C19693b0 mo82863x4f383761(@C12579k DeliveryType deliveryType, @C12579k Address address, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(deliveryType, NavArgumentsKt.DELIVERY_TYPE);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new C28374x332c2381(deliveryType, address, str, z);
        }

        private Companion() {
        }
    }

    private DeliveryServiceSelectionFragmentDirections() {
    }

    @C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentDirections$ActionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment;", "Landroidx/navigation/b0;", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "Lcom/carrefour/fid/android/domain/models/account/Address;", "component2", "", "component3", "", "component4", "deliveryType", "address", "telephone", "restartSelectionOnBack", "copy", "toString", "", "hashCode", "", "other", "equals", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "getAddress", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "Ljava/lang/String;", "getTelephone", "()Ljava/lang/String;", "Z", "getRestartSelectionOnBack", "()Z", "actionId", "I", "getActionId", "()I", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "<init>", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Z)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragmentDirections$ActionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment */
    public static final class C28374x332c2381 implements C19693b0 {
        private final int actionId;
        @C12579k
        private final Address address;
        @C12579k
        private final DeliveryType deliveryType;
        private final boolean restartSelectionOnBack;
        @C12579k
        private final String telephone;

        public C28374x332c2381(@C12579k DeliveryType deliveryType2, @C12579k Address address2, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            Intrinsics.checkNotNullParameter(address2, "address");
            Intrinsics.checkNotNullParameter(str, "telephone");
            this.deliveryType = deliveryType2;
            this.address = address2;
            this.telephone = str;
            this.restartSelectionOnBack = z;
            this.actionId = C28330R.C28334id.f68494xc9c0693e;
        }

        public static /* synthetic */ C28374x332c2381 copy$default(C28374x332c2381 actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment, DeliveryType deliveryType2, Address address2, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                deliveryType2 = actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.deliveryType;
            }
            if ((i & 2) != 0) {
                address2 = actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.address;
            }
            if ((i & 4) != 0) {
                str = actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.telephone;
            }
            if ((i & 8) != 0) {
                z = actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.restartSelectionOnBack;
            }
            return actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.copy(deliveryType2, address2, str, z);
        }

        @C12579k
        public final DeliveryType component1() {
            return this.deliveryType;
        }

        @C12579k
        public final Address component2() {
            return this.address;
        }

        @C12579k
        public final String component3() {
            return this.telephone;
        }

        public final boolean component4() {
            return this.restartSelectionOnBack;
        }

        @C12579k
        public final C28374x332c2381 copy(@C12579k DeliveryType deliveryType2, @C12579k Address address2, @C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
            Intrinsics.checkNotNullParameter(address2, "address");
            Intrinsics.checkNotNullParameter(str, "telephone");
            return new C28374x332c2381(deliveryType2, address2, str, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28374x332c2381)) {
                return false;
            }
            C28374x332c2381 actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment = (C28374x332c2381) obj;
            return this.deliveryType == actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.deliveryType && Intrinsics.areEqual((Object) this.address, (Object) actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.address) && Intrinsics.areEqual((Object) this.telephone, (Object) actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.telephone) && this.restartSelectionOnBack == actionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment.restartSelectionOnBack;
        }

        public int getActionId() {
            return this.actionId;
        }

        @C12579k
        public final Address getAddress() {
            return this.address;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<DeliveryType> cls2 = DeliveryType.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                DeliveryType deliveryType2 = this.deliveryType;
                Intrinsics.checkNotNull(deliveryType2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(NavArgumentsKt.DELIVERY_TYPE, deliveryType2);
            } else if (cls3.isAssignableFrom(cls2)) {
                DeliveryType deliveryType3 = this.deliveryType;
                Intrinsics.checkNotNull(deliveryType3, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(NavArgumentsKt.DELIVERY_TYPE, deliveryType3);
            } else {
                String name = cls2.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Class<Address> cls4 = Address.class;
            if (cls.isAssignableFrom(cls4)) {
                Address address2 = this.address;
                Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("address", address2);
            } else if (cls3.isAssignableFrom(cls4)) {
                Address address3 = this.address;
                Intrinsics.checkNotNull(address3, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("address", (Serializable) address3);
            } else {
                String name2 = cls4.getName();
                throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("telephone", this.telephone);
            bundle.putBoolean("restartSelectionOnBack", this.restartSelectionOnBack);
            return bundle;
        }

        @C12579k
        public final DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        public final boolean getRestartSelectionOnBack() {
            return this.restartSelectionOnBack;
        }

        @C12579k
        public final String getTelephone() {
            return this.telephone;
        }

        public int hashCode() {
            int hashCode = ((((this.deliveryType.hashCode() * 31) + this.address.hashCode()) * 31) + this.telephone.hashCode()) * 31;
            boolean z = this.restartSelectionOnBack;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            DeliveryType deliveryType2 = this.deliveryType;
            Address address2 = this.address;
            String str = this.telephone;
            boolean z = this.restartSelectionOnBack;
            return "ActionDeliveryServiceSelectionFragmentToDeliveryServiceSummaryFragment(deliveryType=" + deliveryType2 + ", address=" + address2 + ", telephone=" + str + ", restartSelectionOnBack=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C28374x332c2381(DeliveryType deliveryType2, Address address2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(deliveryType2, address2, str, (i & 8) != 0 ? false : z);
        }
    }
}
