package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/ShippingTypeRequest;", "", "shippingTypeCode", "", "subBasketId", "providerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProviderId", "()Ljava/lang/String;", "getShippingTypeCode", "getSubBasketId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.ShippingTypeRequest */
public final class ShippingTypeRequest {
    @C33608c("provider_id")
    @C12579k
    private final String providerId;
    @C33608c("shipping_type_code")
    @C12579k
    private final String shippingTypeCode;
    @C33608c("sub_basket_id")
    @C12579k
    private final String subBasketId;

    public ShippingTypeRequest(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "shippingTypeCode");
        Intrinsics.checkNotNullParameter(str2, "subBasketId");
        Intrinsics.checkNotNullParameter(str3, "providerId");
        this.shippingTypeCode = str;
        this.subBasketId = str2;
        this.providerId = str3;
    }

    public static /* synthetic */ ShippingTypeRequest copy$default(ShippingTypeRequest shippingTypeRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingTypeRequest.shippingTypeCode;
        }
        if ((i & 2) != 0) {
            str2 = shippingTypeRequest.subBasketId;
        }
        if ((i & 4) != 0) {
            str3 = shippingTypeRequest.providerId;
        }
        return shippingTypeRequest.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.shippingTypeCode;
    }

    @C12579k
    public final String component2() {
        return this.subBasketId;
    }

    @C12579k
    public final String component3() {
        return this.providerId;
    }

    @C12579k
    public final ShippingTypeRequest copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "shippingTypeCode");
        Intrinsics.checkNotNullParameter(str2, "subBasketId");
        Intrinsics.checkNotNullParameter(str3, "providerId");
        return new ShippingTypeRequest(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingTypeRequest)) {
            return false;
        }
        ShippingTypeRequest shippingTypeRequest = (ShippingTypeRequest) obj;
        return Intrinsics.areEqual((Object) this.shippingTypeCode, (Object) shippingTypeRequest.shippingTypeCode) && Intrinsics.areEqual((Object) this.subBasketId, (Object) shippingTypeRequest.subBasketId) && Intrinsics.areEqual((Object) this.providerId, (Object) shippingTypeRequest.providerId);
    }

    @C12579k
    public final String getProviderId() {
        return this.providerId;
    }

    @C12579k
    public final String getShippingTypeCode() {
        return this.shippingTypeCode;
    }

    @C12579k
    public final String getSubBasketId() {
        return this.subBasketId;
    }

    public int hashCode() {
        return (((this.shippingTypeCode.hashCode() * 31) + this.subBasketId.hashCode()) * 31) + this.providerId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.shippingTypeCode;
        String str2 = this.subBasketId;
        String str3 = this.providerId;
        return "ShippingTypeRequest(shippingTypeCode=" + str + ", subBasketId=" + str2 + ", providerId=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingTypeRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3);
    }
}
