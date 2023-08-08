package com.carrefour.fid.android.service.data.api.entities;

import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse;", "", "feeType", "Lcom/carrefour/fid/android/service/data/api/entities/FeeType;", "minAmount", "Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;", "maxAmount", "feesAmount", "(Lcom/carrefour/fid/android/service/data/api/entities/FeeType;Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;)V", "getFeeType", "()Lcom/carrefour/fid/android/service/data/api/entities/FeeType;", "getFeesAmount", "()Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;", "getMaxAmount", "getMinAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FeeAmount", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliveryFeeResponse {
    @C33608c("bff_type")
    @C12579k
    private final FeeType feeType;
    @C33608c("fees_amount")
    @C12580l
    private final FeeAmount feesAmount;
    @C33608c("max_amount")
    @C12580l
    private final FeeAmount maxAmount;
    @C33608c("min_amount")
    @C12580l
    private final FeeAmount minAmount;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/DeliveryFeeResponse$FeeAmount;", "", "unscaledAmount", "", "scale", "currency", "", "(IILjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getScale", "()I", "getUnscaledAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    public static final class FeeAmount {
        public static final int $stable = 0;
        @C33608c("currency")
        @C12579k
        private final String currency;
        @C33608c("scale")
        private final int scale;
        @C33608c("unscaled_amount")
        private final int unscaledAmount;

        public FeeAmount() {
            this(0, 0, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ FeeAmount copy$default(FeeAmount feeAmount, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = feeAmount.unscaledAmount;
            }
            if ((i3 & 2) != 0) {
                i2 = feeAmount.scale;
            }
            if ((i3 & 4) != 0) {
                str = feeAmount.currency;
            }
            return feeAmount.copy(i, i2, str);
        }

        public final int component1() {
            return this.unscaledAmount;
        }

        public final int component2() {
            return this.scale;
        }

        @C12579k
        public final String component3() {
            return this.currency;
        }

        @C12579k
        public final FeeAmount copy(int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
            return new FeeAmount(i, i2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeeAmount)) {
                return false;
            }
            FeeAmount feeAmount = (FeeAmount) obj;
            return this.unscaledAmount == feeAmount.unscaledAmount && this.scale == feeAmount.scale && Intrinsics.areEqual((Object) this.currency, (Object) feeAmount.currency);
        }

        @C12579k
        public final String getCurrency() {
            return this.currency;
        }

        public final int getScale() {
            return this.scale;
        }

        public final int getUnscaledAmount() {
            return this.unscaledAmount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.unscaledAmount) * 31) + Integer.hashCode(this.scale)) * 31) + this.currency.hashCode();
        }

        @C12579k
        public String toString() {
            int i = this.unscaledAmount;
            int i2 = this.scale;
            String str = this.currency;
            return "FeeAmount(unscaledAmount=" + i + ", scale=" + i2 + ", currency=" + str + ")";
        }

        public FeeAmount(int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
            this.unscaledAmount = i;
            this.scale = i2;
            this.currency = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FeeAmount(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new String() : str);
        }
    }

    public DeliveryFeeResponse() {
        this((FeeType) null, (FeeAmount) null, (FeeAmount) null, (FeeAmount) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DeliveryFeeResponse copy$default(DeliveryFeeResponse deliveryFeeResponse, FeeType feeType2, FeeAmount feeAmount, FeeAmount feeAmount2, FeeAmount feeAmount3, int i, Object obj) {
        if ((i & 1) != 0) {
            feeType2 = deliveryFeeResponse.feeType;
        }
        if ((i & 2) != 0) {
            feeAmount = deliveryFeeResponse.minAmount;
        }
        if ((i & 4) != 0) {
            feeAmount2 = deliveryFeeResponse.maxAmount;
        }
        if ((i & 8) != 0) {
            feeAmount3 = deliveryFeeResponse.feesAmount;
        }
        return deliveryFeeResponse.copy(feeType2, feeAmount, feeAmount2, feeAmount3);
    }

    @C12579k
    public final FeeType component1() {
        return this.feeType;
    }

    @C12580l
    public final FeeAmount component2() {
        return this.minAmount;
    }

    @C12580l
    public final FeeAmount component3() {
        return this.maxAmount;
    }

    @C12580l
    public final FeeAmount component4() {
        return this.feesAmount;
    }

    @C12579k
    public final DeliveryFeeResponse copy(@C12579k FeeType feeType2, @C12580l FeeAmount feeAmount, @C12580l FeeAmount feeAmount2, @C12580l FeeAmount feeAmount3) {
        Intrinsics.checkNotNullParameter(feeType2, "feeType");
        return new DeliveryFeeResponse(feeType2, feeAmount, feeAmount2, feeAmount3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryFeeResponse)) {
            return false;
        }
        DeliveryFeeResponse deliveryFeeResponse = (DeliveryFeeResponse) obj;
        return this.feeType == deliveryFeeResponse.feeType && Intrinsics.areEqual((Object) this.minAmount, (Object) deliveryFeeResponse.minAmount) && Intrinsics.areEqual((Object) this.maxAmount, (Object) deliveryFeeResponse.maxAmount) && Intrinsics.areEqual((Object) this.feesAmount, (Object) deliveryFeeResponse.feesAmount);
    }

    @C12579k
    public final FeeType getFeeType() {
        return this.feeType;
    }

    @C12580l
    public final FeeAmount getFeesAmount() {
        return this.feesAmount;
    }

    @C12580l
    public final FeeAmount getMaxAmount() {
        return this.maxAmount;
    }

    @C12580l
    public final FeeAmount getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        int hashCode = this.feeType.hashCode() * 31;
        FeeAmount feeAmount = this.minAmount;
        int i = 0;
        int hashCode2 = (hashCode + (feeAmount == null ? 0 : feeAmount.hashCode())) * 31;
        FeeAmount feeAmount2 = this.maxAmount;
        int hashCode3 = (hashCode2 + (feeAmount2 == null ? 0 : feeAmount2.hashCode())) * 31;
        FeeAmount feeAmount3 = this.feesAmount;
        if (feeAmount3 != null) {
            i = feeAmount3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        FeeType feeType2 = this.feeType;
        FeeAmount feeAmount = this.minAmount;
        FeeAmount feeAmount2 = this.maxAmount;
        FeeAmount feeAmount3 = this.feesAmount;
        return "DeliveryFeeResponse(feeType=" + feeType2 + ", minAmount=" + feeAmount + ", maxAmount=" + feeAmount2 + ", feesAmount=" + feeAmount3 + ")";
    }

    public DeliveryFeeResponse(@C12579k FeeType feeType2, @C12580l FeeAmount feeAmount, @C12580l FeeAmount feeAmount2, @C12580l FeeAmount feeAmount3) {
        Intrinsics.checkNotNullParameter(feeType2, "feeType");
        this.feeType = feeType2;
        this.minAmount = feeAmount;
        this.maxAmount = feeAmount2;
        this.feesAmount = feeAmount3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryFeeResponse(FeeType feeType2, FeeAmount feeAmount, FeeAmount feeAmount2, FeeAmount feeAmount3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FeeType.Amount : feeType2, (i & 2) != 0 ? null : feeAmount, (i & 4) != 0 ? null : feeAmount2, (i & 8) != 0 ? null : feeAmount3);
    }
}
