package com.carrefour.fid.android.checkout.data.api.entities.p069v2.request;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody;", "", "yield", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYield;", "(Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYield;)V", "getYield", "()Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYield;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SlotYield", "SlotYieldAddress", "SlotYieldBasket", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.request.SlotYieldServiceRequestBody */
public final class SlotYieldServiceRequestBody {
    @C33608c("yield")
    @C12579k
    private final SlotYield yield;

    @Keep
    @C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYield;", "", "address", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldAddress;", "basket", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldBasket;", "(Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldAddress;Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldBasket;)V", "getAddress", "()Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldAddress;", "getBasket", "()Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldBasket;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.request.SlotYieldServiceRequestBody$SlotYield */
    public static final class SlotYield {
        public static final int $stable = 0;
        @C33608c("address")
        @C12579k
        private final SlotYieldAddress address;
        @C33608c("basket")
        @C12580l
        private final SlotYieldBasket basket;

        public SlotYield(@C12579k SlotYieldAddress slotYieldAddress, @C12580l SlotYieldBasket slotYieldBasket) {
            Intrinsics.checkNotNullParameter(slotYieldAddress, "address");
            this.address = slotYieldAddress;
            this.basket = slotYieldBasket;
        }

        public static /* synthetic */ SlotYield copy$default(SlotYield slotYield, SlotYieldAddress slotYieldAddress, SlotYieldBasket slotYieldBasket, int i, Object obj) {
            if ((i & 1) != 0) {
                slotYieldAddress = slotYield.address;
            }
            if ((i & 2) != 0) {
                slotYieldBasket = slotYield.basket;
            }
            return slotYield.copy(slotYieldAddress, slotYieldBasket);
        }

        @C12579k
        public final SlotYieldAddress component1() {
            return this.address;
        }

        @C12580l
        public final SlotYieldBasket component2() {
            return this.basket;
        }

        @C12579k
        public final SlotYield copy(@C12579k SlotYieldAddress slotYieldAddress, @C12580l SlotYieldBasket slotYieldBasket) {
            Intrinsics.checkNotNullParameter(slotYieldAddress, "address");
            return new SlotYield(slotYieldAddress, slotYieldBasket);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotYield)) {
                return false;
            }
            SlotYield slotYield = (SlotYield) obj;
            return Intrinsics.areEqual((Object) this.address, (Object) slotYield.address) && Intrinsics.areEqual((Object) this.basket, (Object) slotYield.basket);
        }

        @C12579k
        public final SlotYieldAddress getAddress() {
            return this.address;
        }

        @C12580l
        public final SlotYieldBasket getBasket() {
            return this.basket;
        }

        public int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            SlotYieldBasket slotYieldBasket = this.basket;
            return hashCode + (slotYieldBasket == null ? 0 : slotYieldBasket.hashCode());
        }

        @C12579k
        public String toString() {
            SlotYieldAddress slotYieldAddress = this.address;
            SlotYieldBasket slotYieldBasket = this.basket;
            return "SlotYield(address=" + slotYieldAddress + ", basket=" + slotYieldBasket + ")";
        }
    }

    @Keep
    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldAddress;", "", "latitude", "", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldAddress;", "equals", "", "other", "hashCode", "", "toString", "", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.request.SlotYieldServiceRequestBody$SlotYieldAddress */
    public static final class SlotYieldAddress {
        public static final int $stable = 0;
        @C33608c("latitude")
        @C12580l
        private final Double latitude;
        @C33608c("longitude")
        @C12580l
        private final Double longitude;

        public SlotYieldAddress(@C12580l Double d, @C12580l Double d2) {
            this.latitude = d;
            this.longitude = d2;
        }

        public static /* synthetic */ SlotYieldAddress copy$default(SlotYieldAddress slotYieldAddress, Double d, Double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = slotYieldAddress.latitude;
            }
            if ((i & 2) != 0) {
                d2 = slotYieldAddress.longitude;
            }
            return slotYieldAddress.copy(d, d2);
        }

        @C12580l
        public final Double component1() {
            return this.latitude;
        }

        @C12580l
        public final Double component2() {
            return this.longitude;
        }

        @C12579k
        public final SlotYieldAddress copy(@C12580l Double d, @C12580l Double d2) {
            return new SlotYieldAddress(d, d2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotYieldAddress)) {
                return false;
            }
            SlotYieldAddress slotYieldAddress = (SlotYieldAddress) obj;
            return Intrinsics.areEqual((Object) this.latitude, (Object) slotYieldAddress.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) slotYieldAddress.longitude);
        }

        @C12580l
        public final Double getLatitude() {
            return this.latitude;
        }

        @C12580l
        public final Double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            Double d = this.latitude;
            int i = 0;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.longitude;
            if (d2 != null) {
                i = d2.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            Double d = this.latitude;
            Double d2 = this.longitude;
            return "SlotYieldAddress(latitude=" + d + ", longitude=" + d2 + ")";
        }
    }

    @Keep
    @C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldBasket;", "", "cartTotalAmount", "", "id", "", "maxDeliveryCost", "productCount", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)V", "getCartTotalAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "()Ljava/lang/String;", "getMaxDeliveryCost", "getProductCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotYieldServiceRequestBody$SlotYieldBasket;", "equals", "", "other", "hashCode", "toString", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.request.SlotYieldServiceRequestBody$SlotYieldBasket */
    public static final class SlotYieldBasket {
        public static final int $stable = 0;
        @C33608c("cart_total_amount")
        @C12580l
        private final Double cartTotalAmount;
        @C33608c("id")
        @C12580l

        /* renamed from: id */
        private final String f101600id;
        @C33608c("max_delivery_cost")
        @C12580l
        private final Double maxDeliveryCost;
        @C33608c("product_count")
        @C12580l
        private final Integer productCount;

        public SlotYieldBasket(@C12580l Double d, @C12580l String str, @C12580l Double d2, @C12580l Integer num) {
            this.cartTotalAmount = d;
            this.f101600id = str;
            this.maxDeliveryCost = d2;
            this.productCount = num;
        }

        public static /* synthetic */ SlotYieldBasket copy$default(SlotYieldBasket slotYieldBasket, Double d, String str, Double d2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                d = slotYieldBasket.cartTotalAmount;
            }
            if ((i & 2) != 0) {
                str = slotYieldBasket.f101600id;
            }
            if ((i & 4) != 0) {
                d2 = slotYieldBasket.maxDeliveryCost;
            }
            if ((i & 8) != 0) {
                num = slotYieldBasket.productCount;
            }
            return slotYieldBasket.copy(d, str, d2, num);
        }

        @C12580l
        public final Double component1() {
            return this.cartTotalAmount;
        }

        @C12580l
        public final String component2() {
            return this.f101600id;
        }

        @C12580l
        public final Double component3() {
            return this.maxDeliveryCost;
        }

        @C12580l
        public final Integer component4() {
            return this.productCount;
        }

        @C12579k
        public final SlotYieldBasket copy(@C12580l Double d, @C12580l String str, @C12580l Double d2, @C12580l Integer num) {
            return new SlotYieldBasket(d, str, d2, num);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotYieldBasket)) {
                return false;
            }
            SlotYieldBasket slotYieldBasket = (SlotYieldBasket) obj;
            return Intrinsics.areEqual((Object) this.cartTotalAmount, (Object) slotYieldBasket.cartTotalAmount) && Intrinsics.areEqual((Object) this.f101600id, (Object) slotYieldBasket.f101600id) && Intrinsics.areEqual((Object) this.maxDeliveryCost, (Object) slotYieldBasket.maxDeliveryCost) && Intrinsics.areEqual((Object) this.productCount, (Object) slotYieldBasket.productCount);
        }

        @C12580l
        public final Double getCartTotalAmount() {
            return this.cartTotalAmount;
        }

        @C12580l
        public final String getId() {
            return this.f101600id;
        }

        @C12580l
        public final Double getMaxDeliveryCost() {
            return this.maxDeliveryCost;
        }

        @C12580l
        public final Integer getProductCount() {
            return this.productCount;
        }

        public int hashCode() {
            Double d = this.cartTotalAmount;
            int i = 0;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            String str = this.f101600id;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Double d2 = this.maxDeliveryCost;
            int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Integer num = this.productCount;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode3 + i;
        }

        @C12579k
        public String toString() {
            Double d = this.cartTotalAmount;
            String str = this.f101600id;
            Double d2 = this.maxDeliveryCost;
            Integer num = this.productCount;
            return "SlotYieldBasket(cartTotalAmount=" + d + ", id=" + str + ", maxDeliveryCost=" + d2 + ", productCount=" + num + ")";
        }
    }

    public SlotYieldServiceRequestBody(@C12579k SlotYield slotYield) {
        Intrinsics.checkNotNullParameter(slotYield, "yield");
        this.yield = slotYield;
    }

    public static /* synthetic */ SlotYieldServiceRequestBody copy$default(SlotYieldServiceRequestBody slotYieldServiceRequestBody, SlotYield slotYield, int i, Object obj) {
        if ((i & 1) != 0) {
            slotYield = slotYieldServiceRequestBody.yield;
        }
        return slotYieldServiceRequestBody.copy(slotYield);
    }

    @C12579k
    public final SlotYield component1() {
        return this.yield;
    }

    @C12579k
    public final SlotYieldServiceRequestBody copy(@C12579k SlotYield slotYield) {
        Intrinsics.checkNotNullParameter(slotYield, "yield");
        return new SlotYieldServiceRequestBody(slotYield);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotYieldServiceRequestBody) && Intrinsics.areEqual((Object) this.yield, (Object) ((SlotYieldServiceRequestBody) obj).yield);
    }

    @C12579k
    public final SlotYield getYield() {
        return this.yield;
    }

    public int hashCode() {
        return this.yield.hashCode();
    }

    @C12579k
    public String toString() {
        SlotYield slotYield = this.yield;
        return "SlotYieldServiceRequestBody(yield=" + slotYield + ")";
    }
}
