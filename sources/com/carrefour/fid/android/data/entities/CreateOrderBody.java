package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CreateOrderBody;", "", "isExpressPickup", "", "isPostOrderSubstitutionEnabled", "subBasketIds", "", "", "userAgent", "orderChannel", "Lcom/carrefour/fid/android/data/entities/OrderChannel;", "deliveryLocation", "originalSubOrderId", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderChannel;Ljava/lang/String;Ljava/lang/String;)V", "getDeliveryLocation", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrderChannel", "()Lcom/carrefour/fid/android/data/entities/OrderChannel;", "getOriginalSubOrderId", "getSubBasketIds", "()Ljava/util/List;", "getUserAgent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderChannel;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/CreateOrderBody;", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CreateOrderBody {
    public static final int $stable = 8;
    @C33608c("DeliveryLocation")
    @C12580l
    private final String deliveryLocation;
    @C33608c("express_pickup")
    @C12580l
    private final Boolean isExpressPickup;
    @C33608c("is_substitution_allowed")
    @C12580l
    private final Boolean isPostOrderSubstitutionEnabled;
    @C33608c("order_channel")
    @C12579k
    private final OrderChannel orderChannel;
    @C33608c("original_sub_order_id")
    @C12580l
    private final String originalSubOrderId;
    @C33608c("sub_basket_ids")
    @C12579k
    private final List<String> subBasketIds;
    @C33608c("user_agent")
    @C12579k
    private final String userAgent;

    public CreateOrderBody(@C12580l Boolean bool, @C12580l Boolean bool2, @C12579k List<String> list, @C12579k String str, @C12579k OrderChannel orderChannel2, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(list, "subBasketIds");
        Intrinsics.checkNotNullParameter(str, "userAgent");
        Intrinsics.checkNotNullParameter(orderChannel2, "orderChannel");
        this.isExpressPickup = bool;
        this.isPostOrderSubstitutionEnabled = bool2;
        this.subBasketIds = list;
        this.userAgent = str;
        this.orderChannel = orderChannel2;
        this.deliveryLocation = str2;
        this.originalSubOrderId = str3;
    }

    public static /* synthetic */ CreateOrderBody copy$default(CreateOrderBody createOrderBody, Boolean bool, Boolean bool2, List<String> list, String str, OrderChannel orderChannel2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = createOrderBody.isExpressPickup;
        }
        if ((i & 2) != 0) {
            bool2 = createOrderBody.isPostOrderSubstitutionEnabled;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            list = createOrderBody.subBasketIds;
        }
        List<String> list2 = list;
        if ((i & 8) != 0) {
            str = createOrderBody.userAgent;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            orderChannel2 = createOrderBody.orderChannel;
        }
        OrderChannel orderChannel3 = orderChannel2;
        if ((i & 32) != 0) {
            str2 = createOrderBody.deliveryLocation;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = createOrderBody.originalSubOrderId;
        }
        return createOrderBody.copy(bool, bool3, list2, str4, orderChannel3, str5, str3);
    }

    @C12580l
    public final Boolean component1() {
        return this.isExpressPickup;
    }

    @C12580l
    public final Boolean component2() {
        return this.isPostOrderSubstitutionEnabled;
    }

    @C12579k
    public final List<String> component3() {
        return this.subBasketIds;
    }

    @C12579k
    public final String component4() {
        return this.userAgent;
    }

    @C12579k
    public final OrderChannel component5() {
        return this.orderChannel;
    }

    @C12580l
    public final String component6() {
        return this.deliveryLocation;
    }

    @C12580l
    public final String component7() {
        return this.originalSubOrderId;
    }

    @C12579k
    public final CreateOrderBody copy(@C12580l Boolean bool, @C12580l Boolean bool2, @C12579k List<String> list, @C12579k String str, @C12579k OrderChannel orderChannel2, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(list, "subBasketIds");
        Intrinsics.checkNotNullParameter(str, "userAgent");
        Intrinsics.checkNotNullParameter(orderChannel2, "orderChannel");
        return new CreateOrderBody(bool, bool2, list, str, orderChannel2, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderBody)) {
            return false;
        }
        CreateOrderBody createOrderBody = (CreateOrderBody) obj;
        return Intrinsics.areEqual((Object) this.isExpressPickup, (Object) createOrderBody.isExpressPickup) && Intrinsics.areEqual((Object) this.isPostOrderSubstitutionEnabled, (Object) createOrderBody.isPostOrderSubstitutionEnabled) && Intrinsics.areEqual((Object) this.subBasketIds, (Object) createOrderBody.subBasketIds) && Intrinsics.areEqual((Object) this.userAgent, (Object) createOrderBody.userAgent) && Intrinsics.areEqual((Object) this.orderChannel, (Object) createOrderBody.orderChannel) && Intrinsics.areEqual((Object) this.deliveryLocation, (Object) createOrderBody.deliveryLocation) && Intrinsics.areEqual((Object) this.originalSubOrderId, (Object) createOrderBody.originalSubOrderId);
    }

    @C12580l
    public final String getDeliveryLocation() {
        return this.deliveryLocation;
    }

    @C12579k
    public final OrderChannel getOrderChannel() {
        return this.orderChannel;
    }

    @C12580l
    public final String getOriginalSubOrderId() {
        return this.originalSubOrderId;
    }

    @C12579k
    public final List<String> getSubBasketIds() {
        return this.subBasketIds;
    }

    @C12579k
    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        Boolean bool = this.isExpressPickup;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isPostOrderSubstitutionEnabled;
        int hashCode2 = (((((((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.subBasketIds.hashCode()) * 31) + this.userAgent.hashCode()) * 31) + this.orderChannel.hashCode()) * 31;
        String str = this.deliveryLocation;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalSubOrderId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    public final Boolean isExpressPickup() {
        return this.isExpressPickup;
    }

    @C12580l
    public final Boolean isPostOrderSubstitutionEnabled() {
        return this.isPostOrderSubstitutionEnabled;
    }

    @C12579k
    public String toString() {
        Boolean bool = this.isExpressPickup;
        Boolean bool2 = this.isPostOrderSubstitutionEnabled;
        List<String> list = this.subBasketIds;
        String str = this.userAgent;
        OrderChannel orderChannel2 = this.orderChannel;
        String str2 = this.deliveryLocation;
        String str3 = this.originalSubOrderId;
        return "CreateOrderBody(isExpressPickup=" + bool + ", isPostOrderSubstitutionEnabled=" + bool2 + ", subBasketIds=" + list + ", userAgent=" + str + ", orderChannel=" + orderChannel2 + ", deliveryLocation=" + str2 + ", originalSubOrderId=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateOrderBody(Boolean bool, Boolean bool2, List list, String str, OrderChannel orderChannel2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, list, str, (i & 16) != 0 ? new OrderChannel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : orderChannel2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
