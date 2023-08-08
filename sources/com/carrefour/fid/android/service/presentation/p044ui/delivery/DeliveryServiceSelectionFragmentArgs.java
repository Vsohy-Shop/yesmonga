package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.service.presentation.model.DeliveryType;
import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.summary.NavArgumentsKt;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentArgs;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "toBundle", "Landroidx/lifecycle/p0;", "toSavedStateHandle", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "component1", "deliveryType", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "getDeliveryType", "()Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;", "<init>", "(Lcom/carrefour/fid/android/service/presentation/model/DeliveryType;)V", "Companion", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragmentArgs */
public final class DeliveryServiceSelectionFragmentArgs implements C19764l {
    public static final int $stable = 0;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12579k
    private final DeliveryType deliveryType;

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentArgs$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryServiceSelectionFragmentArgs;", "fromBundle", "Landroidx/lifecycle/p0;", "savedStateHandle", "fromSavedStateHandle", "<init>", "()V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryServiceSelectionFragmentArgs$Companion */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        public final DeliveryServiceSelectionFragmentArgs fromBundle(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(DeliveryServiceSelectionFragmentArgs.class.getClassLoader());
            if (bundle.containsKey(NavArgumentsKt.DELIVERY_TYPE)) {
                Class<DeliveryType> cls = DeliveryType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    DeliveryType deliveryType = (DeliveryType) bundle.get(NavArgumentsKt.DELIVERY_TYPE);
                    if (deliveryType != null) {
                        return new DeliveryServiceSelectionFragmentArgs(deliveryType);
                    }
                    throw new IllegalArgumentException("Argument \"deliveryType\" is marked as non-null but was passed a null value.");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"deliveryType\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        public final DeliveryServiceSelectionFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(NavArgumentsKt.DELIVERY_TYPE)) {
                Class<DeliveryType> cls = DeliveryType.class;
                if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                    DeliveryType deliveryType = (DeliveryType) p0Var.mo57648h(NavArgumentsKt.DELIVERY_TYPE);
                    if (deliveryType != null) {
                        return new DeliveryServiceSelectionFragmentArgs(deliveryType);
                    }
                    throw new IllegalArgumentException("Argument \"deliveryType\" is marked as non-null but was passed a null value");
                }
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"deliveryType\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public DeliveryServiceSelectionFragmentArgs(@C12579k DeliveryType deliveryType2) {
        Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
        this.deliveryType = deliveryType2;
    }

    public static /* synthetic */ DeliveryServiceSelectionFragmentArgs copy$default(DeliveryServiceSelectionFragmentArgs deliveryServiceSelectionFragmentArgs, DeliveryType deliveryType2, int i, Object obj) {
        if ((i & 1) != 0) {
            deliveryType2 = deliveryServiceSelectionFragmentArgs.deliveryType;
        }
        return deliveryServiceSelectionFragmentArgs.copy(deliveryType2);
    }

    @C12579k
    @C11384m
    public static final DeliveryServiceSelectionFragmentArgs fromBundle(@C12579k Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @C12579k
    @C11384m
    public static final DeliveryServiceSelectionFragmentArgs fromSavedStateHandle(@C12579k C19456p0 p0Var) {
        return Companion.fromSavedStateHandle(p0Var);
    }

    @C12579k
    public final DeliveryType component1() {
        return this.deliveryType;
    }

    @C12579k
    public final DeliveryServiceSelectionFragmentArgs copy(@C12579k DeliveryType deliveryType2) {
        Intrinsics.checkNotNullParameter(deliveryType2, NavArgumentsKt.DELIVERY_TYPE);
        return new DeliveryServiceSelectionFragmentArgs(deliveryType2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeliveryServiceSelectionFragmentArgs) && this.deliveryType == ((DeliveryServiceSelectionFragmentArgs) obj).deliveryType;
    }

    @C12579k
    public final DeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    public int hashCode() {
        return this.deliveryType.hashCode();
    }

    @C12579k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        Class<DeliveryType> cls = DeliveryType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            DeliveryType deliveryType2 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable(NavArgumentsKt.DELIVERY_TYPE, deliveryType2);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            DeliveryType deliveryType3 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType3, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable(NavArgumentsKt.DELIVERY_TYPE, deliveryType3);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    @C12579k
    public final C19456p0 toSavedStateHandle() {
        C19456p0 p0Var = new C19456p0();
        Class<DeliveryType> cls = DeliveryType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            DeliveryType deliveryType2 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType2, "null cannot be cast to non-null type android.os.Parcelable");
            p0Var.mo57656q(NavArgumentsKt.DELIVERY_TYPE, deliveryType2);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            DeliveryType deliveryType3 = this.deliveryType;
            Intrinsics.checkNotNull(deliveryType3, "null cannot be cast to non-null type java.io.Serializable");
            p0Var.mo57656q(NavArgumentsKt.DELIVERY_TYPE, deliveryType3);
        } else {
            String name = cls.getName();
            throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        DeliveryType deliveryType2 = this.deliveryType;
        return "DeliveryServiceSelectionFragmentArgs(deliveryType=" + deliveryType2 + ")";
    }
}
