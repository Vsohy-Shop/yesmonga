package com.carrefour.fid.android.checkout.data.api.entities.p068v1.request;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest;", "", "site_id", "", "channel", "device", "buyer", "Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest$Buyer;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest$Buyer;)V", "getBuyer", "()Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest$Buyer;", "getChannel", "()Ljava/lang/String;", "getDevice", "getSite_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Buyer", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v1.request.GetWalletsRequest */
public final class GetWalletsRequest {
    @C12579k
    private final Buyer buyer;
    @C12579k
    private final String channel;
    @C12579k
    private final String device;
    @C12579k
    private final String site_id;

    @Keep
    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v1/request/GetWalletsRequest$Buyer;", "", "first_name", "", "last_name", "customer_ref", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomer_ref", "()Ljava/lang/String;", "getFirst_name", "getLast_name", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v1.request.GetWalletsRequest$Buyer */
    public static final class Buyer {
        public static final int $stable = 0;
        @C12579k
        private final String customer_ref;
        @C12579k
        private final String first_name;
        @C12579k
        private final String last_name;

        public Buyer(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, C9650g.f26439b);
            Intrinsics.checkNotNullParameter(str2, C9650g.f26440c);
            Intrinsics.checkNotNullParameter(str3, "customer_ref");
            this.first_name = str;
            this.last_name = str2;
            this.customer_ref = str3;
        }

        public static /* synthetic */ Buyer copy$default(Buyer buyer, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buyer.first_name;
            }
            if ((i & 2) != 0) {
                str2 = buyer.last_name;
            }
            if ((i & 4) != 0) {
                str3 = buyer.customer_ref;
            }
            return buyer.copy(str, str2, str3);
        }

        @C12579k
        public final String component1() {
            return this.first_name;
        }

        @C12579k
        public final String component2() {
            return this.last_name;
        }

        @C12579k
        public final String component3() {
            return this.customer_ref;
        }

        @C12579k
        public final Buyer copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, C9650g.f26439b);
            Intrinsics.checkNotNullParameter(str2, C9650g.f26440c);
            Intrinsics.checkNotNullParameter(str3, "customer_ref");
            return new Buyer(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Buyer)) {
                return false;
            }
            Buyer buyer = (Buyer) obj;
            return Intrinsics.areEqual((Object) this.first_name, (Object) buyer.first_name) && Intrinsics.areEqual((Object) this.last_name, (Object) buyer.last_name) && Intrinsics.areEqual((Object) this.customer_ref, (Object) buyer.customer_ref);
        }

        @C12579k
        public final String getCustomer_ref() {
            return this.customer_ref;
        }

        @C12579k
        public final String getFirst_name() {
            return this.first_name;
        }

        @C12579k
        public final String getLast_name() {
            return this.last_name;
        }

        public int hashCode() {
            return (((this.first_name.hashCode() * 31) + this.last_name.hashCode()) * 31) + this.customer_ref.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.first_name;
            String str2 = this.last_name;
            String str3 = this.customer_ref;
            return "Buyer(first_name=" + str + ", last_name=" + str2 + ", customer_ref=" + str3 + ")";
        }
    }

    public GetWalletsRequest(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k Buyer buyer2) {
        Intrinsics.checkNotNullParameter(str, "site_id");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(str3, "device");
        Intrinsics.checkNotNullParameter(buyer2, "buyer");
        this.site_id = str;
        this.channel = str2;
        this.device = str3;
        this.buyer = buyer2;
    }

    public static /* synthetic */ GetWalletsRequest copy$default(GetWalletsRequest getWalletsRequest, String str, String str2, String str3, Buyer buyer2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getWalletsRequest.site_id;
        }
        if ((i & 2) != 0) {
            str2 = getWalletsRequest.channel;
        }
        if ((i & 4) != 0) {
            str3 = getWalletsRequest.device;
        }
        if ((i & 8) != 0) {
            buyer2 = getWalletsRequest.buyer;
        }
        return getWalletsRequest.copy(str, str2, str3, buyer2);
    }

    @C12579k
    public final String component1() {
        return this.site_id;
    }

    @C12579k
    public final String component2() {
        return this.channel;
    }

    @C12579k
    public final String component3() {
        return this.device;
    }

    @C12579k
    public final Buyer component4() {
        return this.buyer;
    }

    @C12579k
    public final GetWalletsRequest copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k Buyer buyer2) {
        Intrinsics.checkNotNullParameter(str, "site_id");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(str3, "device");
        Intrinsics.checkNotNullParameter(buyer2, "buyer");
        return new GetWalletsRequest(str, str2, str3, buyer2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetWalletsRequest)) {
            return false;
        }
        GetWalletsRequest getWalletsRequest = (GetWalletsRequest) obj;
        return Intrinsics.areEqual((Object) this.site_id, (Object) getWalletsRequest.site_id) && Intrinsics.areEqual((Object) this.channel, (Object) getWalletsRequest.channel) && Intrinsics.areEqual((Object) this.device, (Object) getWalletsRequest.device) && Intrinsics.areEqual((Object) this.buyer, (Object) getWalletsRequest.buyer);
    }

    @C12579k
    public final Buyer getBuyer() {
        return this.buyer;
    }

    @C12579k
    public final String getChannel() {
        return this.channel;
    }

    @C12579k
    public final String getDevice() {
        return this.device;
    }

    @C12579k
    public final String getSite_id() {
        return this.site_id;
    }

    public int hashCode() {
        return (((((this.site_id.hashCode() * 31) + this.channel.hashCode()) * 31) + this.device.hashCode()) * 31) + this.buyer.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.site_id;
        String str2 = this.channel;
        String str3 = this.device;
        Buyer buyer2 = this.buyer;
        return "GetWalletsRequest(site_id=" + str + ", channel=" + str2 + ", device=" + str3 + ", buyer=" + buyer2 + ")";
    }
}
