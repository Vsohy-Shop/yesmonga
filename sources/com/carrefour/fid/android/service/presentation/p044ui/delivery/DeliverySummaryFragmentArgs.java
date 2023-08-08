package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Landroidx/lifecycle/p0;", "toSavedStateHandle", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "Lcom/carrefour/fid/android/domain/models/account/Address;", "component2", "", "component3", "", "component4", "deliveryType", "address", "telephone", "restartSelectionOnBack", "copy", "toString", "", "hashCode", "", "other", "equals", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "getAddress", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "Ljava/lang/String;", "getTelephone", "()Ljava/lang/String;", "Z", "getRestartSelectionOnBack", "()Z", "<init>", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Z)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragmentArgs */
public final class DeliverySummaryFragmentArgs implements C19764l {
    public static final int $stable = 8;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final Address address;
    @C12579k
    private final DeliveryType deliveryType;
    private final boolean restartSelectionOnBack;
    @C12579k
    private final String telephone;

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliverySummaryFragmentArgs;", "fromBundle", "Landroidx/lifecycle/p0;", "savedStateHandle", "fromSavedStateHandle", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliverySummaryFragmentArgs$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        public final DeliverySummaryFragmentArgs fromBundle(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DeliverySummaryFragmentArgs.class.getClassLoader());
            if (bundle.containsKey(NavArgumentsKt.DELIVERY_TYPE)) {
                Class<Parcelable> cls = Parcelable.class;
                Class<DeliveryType> cls2 = DeliveryType.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    DeliveryType deliveryType = (DeliveryType) bundle.get(NavArgumentsKt.DELIVERY_TYPE);
                    if (deliveryType == null) {
                        throw new IllegalArgumentException("Argument \"deliveryType\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("address")) {
                        Class<Address> cls4 = Address.class;
                        if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            Address address = (Address) bundle.get("address");
                            if (address == null) {
                                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
                            } else if (bundle.containsKey("telephone")) {
                                String string = bundle.getString("telephone");
                                if (string != null) {
                                    if (bundle.containsKey("restartSelectionOnBack")) {
                                        z = bundle.getBoolean("restartSelectionOnBack");
                                    } else {
                                        z = false;
                                    }
                                    return new DeliverySummaryFragmentArgs(deliveryType, address, string, z);
                                }
                                throw new IllegalArgumentException("Argument \"telephone\" is marked as non-null but was passed a null value.");
                            } else {
                                throw new IllegalArgumentException("Required argument \"telephone\" is missing and does not have an android:defaultValue");
                            }
                        } else {
                            String name = cls4.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name2 = cls2.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"deliveryType\" is missing and does not have an android:defaultValue");
            }
        }

        @C12579k
        @C11384m
        public final DeliverySummaryFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(NavArgumentsKt.DELIVERY_TYPE)) {
                Class<Parcelable> cls = Parcelable.class;
                Class<DeliveryType> cls2 = DeliveryType.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    DeliveryType deliveryType = (DeliveryType) p0Var.mo57648h(NavArgumentsKt.DELIVERY_TYPE);
                    if (deliveryType == null) {
                        throw new IllegalArgumentException("Argument \"deliveryType\" is marked as non-null but was passed a null value");
                    } else if (p0Var.mo57647f("address")) {
                        Class<Address> cls4 = Address.class;
                        if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            Address address = (Address) p0Var.mo57648h("address");
                            if (address == null) {
                                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value");
                            } else if (p0Var.mo57647f("telephone")) {
                                String str = (String) p0Var.mo57648h("telephone");
                                if (str != null) {
                                    if (p0Var.mo57647f("restartSelectionOnBack")) {
                                        bool = (Boolean) p0Var.mo57648h("restartSelectionOnBack");
                                        if (bool == null) {
                                            throw new IllegalArgumentException("Argument \"restartSelectionOnBack\" of type boolean does not support null values");
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                    return new DeliverySummaryFragmentArgs(deliveryType, address, str, bool.booleanValue());
                                }
                                throw new IllegalArgumentException("Argument \"telephone\" is marked as non-null but was passed a null value");
                            } else {
                                throw new IllegalArgumentException("Required argument \"telephone\" is missing and does not have an android:defaultValue");
                            }
                        } else {
                            String name = cls4.getName();
                            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name2 = cls2.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"deliveryType\" is missing and does not have an android:defaultValue");
            }
        }

        private Companion() {
        }
    }

    public DeliverySummaryFragmentArgs(@C12579k DeliveryType deliveryType2, @C12579k Address address2, @C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        this.deliveryType = deliveryType2;
        this.address = address2;
        this.telephone = str;
        this.restartSelectionOnBack = z;
    }

    public static /* synthetic */ DeliverySummaryFragmentArgs copy$default(DeliverySummaryFragmentArgs deliverySummaryFragmentArgs, DeliveryType deliveryType2, Address address2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryType2 = deliverySummaryFragmentArgs.deliveryType;
        }
        if ((i & 2) != 0) {
            address2 = deliverySummaryFragmentArgs.address;
        }
        if ((i & 4) != 0) {
            str = deliverySummaryFragmentArgs.telephone;
        }
        if ((i & 8) != 0) {
            z = deliverySummaryFragmentArgs.restartSelectionOnBack;
        }
        return deliverySummaryFragmentArgs.copy(deliveryType2, address2, str, z);
    }

    @C12579k
    @C11384m
    public static final DeliverySummaryFragmentArgs fromBundle(@C12579k Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @C12579k
    @C11384m
    public static final DeliverySummaryFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
        return Companion.fromSavedStateHandle(p0Var);
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
    public final DeliverySummaryFragmentArgs copy(@C12579k DeliveryType deliveryType2, @C12579k Address address2, @C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
        Intrinsics.checkNotNullParameter(address2, "address");
        Intrinsics.checkNotNullParameter(str, "telephone");
        return new DeliverySummaryFragmentArgs(deliveryType2, address2, str, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliverySummaryFragmentArgs)) {
            return false;
        }
        DeliverySummaryFragmentArgs deliverySummaryFragmentArgs = (DeliverySummaryFragmentArgs) obj;
        return this.deliveryType == deliverySummaryFragmentArgs.deliveryType && Intrinsics.areEqual((Object) this.address, (Object) deliverySummaryFragmentArgs.address) && Intrinsics.areEqual((Object) this.telephone, (Object) deliverySummaryFragmentArgs.telephone) && this.restartSelectionOnBack == deliverySummaryFragmentArgs.restartSelectionOnBack;
    }

    @C12579k
    public final Address getAddress() {
        return this.address;
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
    public final Bundle toBundle() {
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
    public final C19456p0 toSavedStateHandle() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<DeliveryType> cls2 = DeliveryType.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            DeliveryType deliveryType2 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType2, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(NavArgumentsKt.DELIVERY_TYPE, deliveryType2);
        } else if (cls3.isAssignableFrom(cls2)) {
            DeliveryType deliveryType3 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType3, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(NavArgumentsKt.DELIVERY_TYPE, deliveryType3);
        } else {
            String name = cls2.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        Class<Address> cls4 = Address.class;
        if (cls.isAssignableFrom(cls4)) {
            Address address2 = this.address;
            Intrinsics.checkNotNull(address2, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q("address", address2);
        } else if (cls3.isAssignableFrom(cls4)) {
            Address address3 = this.address;
            Intrinsics.checkNotNull(address3, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q("address", (Serializable) address3);
        } else {
            String name2 = cls4.getName();
            throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
        }
        p0Var.mo57656q("telephone", this.telephone);
        p0Var.mo57656q("restartSelectionOnBack", Boolean.valueOf(this.restartSelectionOnBack));
        return p0Var;
    }

    @C12579k
    public String toString() {
        DeliveryType deliveryType2 = this.deliveryType;
        Address address2 = this.address;
        String str = this.telephone;
        boolean z = this.restartSelectionOnBack;
        return "DeliverySummaryFragmentArgs(deliveryType=" + deliveryType2 + ", address=" + address2 + ", telephone=" + str + ", restartSelectionOnBack=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliverySummaryFragmentArgs(DeliveryType deliveryType2, Address address2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deliveryType2, address2, str, (i & 8) != 0 ? false : z);
    }
}
