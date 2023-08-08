package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "Landroid/os/Parcelable;", "()V", "DefaultLoyaltyBasket", "LoyaltyHasCardWithTotalAmount", "LoyaltyHasCardWithZeroTotalAmount", "LoyaltyHasNoCardWithZeroTotalAmount", "LoyaltyHasNoPrimeFidProduct", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$DefaultLoyaltyBasket;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasCardWithTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasCardWithZeroTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasNoCardWithZeroTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasNoPrimeFidProduct;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public abstract class LoyaltyBenefitsModel implements Parcelable {

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$DefaultLoyaltyBasket;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "", "component1", "()Ljava/lang/Double;", "loyaltyTotalAmount", "copy", "(Ljava/lang/Double;)Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$DefaultLoyaltyBasket;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Double;", "getLoyaltyTotalAmount", "<init>", "(Ljava/lang/Double;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class DefaultLoyaltyBasket extends LoyaltyBenefitsModel {
        @C12579k
        public static final Parcelable.Creator<DefaultLoyaltyBasket> CREATOR = new Creator();
        @C12580l
        private final Double loyaltyTotalAmount;

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Creator implements Parcelable.Creator<DefaultLoyaltyBasket> {
            @C12579k
            public final DefaultLoyaltyBasket createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DefaultLoyaltyBasket(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @C12579k
            public final DefaultLoyaltyBasket[] newArray(int i) {
                return new DefaultLoyaltyBasket[i];
            }
        }

        public DefaultLoyaltyBasket(@C12580l Double d) {
            super((DefaultConstructorMarker) null);
            this.loyaltyTotalAmount = d;
        }

        public static /* synthetic */ DefaultLoyaltyBasket copy$default(DefaultLoyaltyBasket defaultLoyaltyBasket, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = defaultLoyaltyBasket.loyaltyTotalAmount;
            }
            return defaultLoyaltyBasket.copy(d);
        }

        @C12580l
        public final Double component1() {
            return this.loyaltyTotalAmount;
        }

        @C12579k
        public final DefaultLoyaltyBasket copy(@C12580l Double d) {
            return new DefaultLoyaltyBasket(d);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DefaultLoyaltyBasket) && Intrinsics.areEqual((Object) this.loyaltyTotalAmount, (Object) ((DefaultLoyaltyBasket) obj).loyaltyTotalAmount);
        }

        @C12580l
        public final Double getLoyaltyTotalAmount() {
            return this.loyaltyTotalAmount;
        }

        public int hashCode() {
            Double d = this.loyaltyTotalAmount;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        @C12579k
        public String toString() {
            Double d = this.loyaltyTotalAmount;
            return "DefaultLoyaltyBasket(loyaltyTotalAmount=" + d + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Double d = this.loyaltyTotalAmount;
            if (d == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasCardWithTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "", "component1", "()Ljava/lang/Double;", "loyaltyTotalAmount", "copy", "(Ljava/lang/Double;)Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasCardWithTotalAmount;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Double;", "getLoyaltyTotalAmount", "<init>", "(Ljava/lang/Double;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class LoyaltyHasCardWithTotalAmount extends LoyaltyBenefitsModel {
        @C12579k
        public static final Parcelable.Creator<LoyaltyHasCardWithTotalAmount> CREATOR = new Creator();
        @C12580l
        private final Double loyaltyTotalAmount;

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyHasCardWithTotalAmount> {
            @C12579k
            public final LoyaltyHasCardWithTotalAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoyaltyHasCardWithTotalAmount(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @C12579k
            public final LoyaltyHasCardWithTotalAmount[] newArray(int i) {
                return new LoyaltyHasCardWithTotalAmount[i];
            }
        }

        public LoyaltyHasCardWithTotalAmount(@C12580l Double d) {
            super((DefaultConstructorMarker) null);
            this.loyaltyTotalAmount = d;
        }

        public static /* synthetic */ LoyaltyHasCardWithTotalAmount copy$default(LoyaltyHasCardWithTotalAmount loyaltyHasCardWithTotalAmount, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = loyaltyHasCardWithTotalAmount.loyaltyTotalAmount;
            }
            return loyaltyHasCardWithTotalAmount.copy(d);
        }

        @C12580l
        public final Double component1() {
            return this.loyaltyTotalAmount;
        }

        @C12579k
        public final LoyaltyHasCardWithTotalAmount copy(@C12580l Double d) {
            return new LoyaltyHasCardWithTotalAmount(d);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoyaltyHasCardWithTotalAmount) && Intrinsics.areEqual((Object) this.loyaltyTotalAmount, (Object) ((LoyaltyHasCardWithTotalAmount) obj).loyaltyTotalAmount);
        }

        @C12580l
        public final Double getLoyaltyTotalAmount() {
            return this.loyaltyTotalAmount;
        }

        public int hashCode() {
            Double d = this.loyaltyTotalAmount;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        @C12579k
        public String toString() {
            Double d = this.loyaltyTotalAmount;
            return "LoyaltyHasCardWithTotalAmount(loyaltyTotalAmount=" + d + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Double d = this.loyaltyTotalAmount;
            if (d == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasCardWithZeroTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class LoyaltyHasCardWithZeroTotalAmount extends LoyaltyBenefitsModel {
        @C12579k
        public static final Parcelable.Creator<LoyaltyHasCardWithZeroTotalAmount> CREATOR = new Creator();
        @C12579k
        public static final LoyaltyHasCardWithZeroTotalAmount INSTANCE = new LoyaltyHasCardWithZeroTotalAmount();

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyHasCardWithZeroTotalAmount> {
            @C12579k
            public final LoyaltyHasCardWithZeroTotalAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoyaltyHasCardWithZeroTotalAmount.INSTANCE;
            }

            @C12579k
            public final LoyaltyHasCardWithZeroTotalAmount[] newArray(int i) {
                return new LoyaltyHasCardWithZeroTotalAmount[i];
            }
        }

        private LoyaltyHasCardWithZeroTotalAmount() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasNoCardWithZeroTotalAmount;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class LoyaltyHasNoCardWithZeroTotalAmount extends LoyaltyBenefitsModel {
        @C12579k
        public static final Parcelable.Creator<LoyaltyHasNoCardWithZeroTotalAmount> CREATOR = new Creator();
        @C12579k
        public static final LoyaltyHasNoCardWithZeroTotalAmount INSTANCE = new LoyaltyHasNoCardWithZeroTotalAmount();

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyHasNoCardWithZeroTotalAmount> {
            @C12579k
            public final LoyaltyHasNoCardWithZeroTotalAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoyaltyHasNoCardWithZeroTotalAmount.INSTANCE;
            }

            @C12579k
            public final LoyaltyHasNoCardWithZeroTotalAmount[] newArray(int i) {
                return new LoyaltyHasNoCardWithZeroTotalAmount[i];
            }
        }

        private LoyaltyHasNoCardWithZeroTotalAmount() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel$LoyaltyHasNoPrimeFidProduct;", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitsModel;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class LoyaltyHasNoPrimeFidProduct extends LoyaltyBenefitsModel {
        @C12579k
        public static final Parcelable.Creator<LoyaltyHasNoPrimeFidProduct> CREATOR = new Creator();
        @C12579k
        public static final LoyaltyHasNoPrimeFidProduct INSTANCE = new LoyaltyHasNoPrimeFidProduct();

        @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyHasNoPrimeFidProduct> {
            @C12579k
            public final LoyaltyHasNoPrimeFidProduct createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoyaltyHasNoPrimeFidProduct.INSTANCE;
            }

            @C12579k
            public final LoyaltyHasNoPrimeFidProduct[] newArray(int i) {
                return new LoyaltyHasNoPrimeFidProduct[i];
            }
        }

        private LoyaltyHasNoPrimeFidProduct() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ LoyaltyBenefitsModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoyaltyBenefitsModel() {
    }
}
