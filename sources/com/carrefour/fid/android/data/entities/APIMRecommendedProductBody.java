package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedProductBody;", "", "widgetId", "", "storeId", "customerType", "customerKey", "lastProductsAddedToCart", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCustomerKey", "()Ljava/lang/String;", "getCustomerType", "getLastProductsAddedToCart", "()Ljava/util/List;", "getStoreId", "getWidgetId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedProductBody {
    public static final int $stable = 8;
    @C33608c("customer_key")
    @C12579k
    private final String customerKey;
    @C33608c("customer_type")
    @C12579k
    private final String customerType;
    @C33608c("last_products_added_to_cart")
    @C12579k
    private final List<String> lastProductsAddedToCart;
    @C33608c("store_id")
    @C12579k
    private final String storeId;
    @C33608c("widget_id")
    @C12579k
    private final String widgetId;

    public APIMRecommendedProductBody(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "widgetId");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        Intrinsics.checkNotNullParameter(str3, "customerType");
        Intrinsics.checkNotNullParameter(str4, "customerKey");
        Intrinsics.checkNotNullParameter(list, "lastProductsAddedToCart");
        this.widgetId = str;
        this.storeId = str2;
        this.customerType = str3;
        this.customerKey = str4;
        this.lastProductsAddedToCart = list;
    }

    public static /* synthetic */ APIMRecommendedProductBody copy$default(APIMRecommendedProductBody aPIMRecommendedProductBody, String str, String str2, String str3, String str4, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMRecommendedProductBody.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = aPIMRecommendedProductBody.storeId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = aPIMRecommendedProductBody.customerType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = aPIMRecommendedProductBody.customerKey;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = aPIMRecommendedProductBody.lastProductsAddedToCart;
        }
        return aPIMRecommendedProductBody.copy(str, str5, str6, str7, list);
    }

    @C12579k
    public final String component1() {
        return this.widgetId;
    }

    @C12579k
    public final String component2() {
        return this.storeId;
    }

    @C12579k
    public final String component3() {
        return this.customerType;
    }

    @C12579k
    public final String component4() {
        return this.customerKey;
    }

    @C12579k
    public final List<String> component5() {
        return this.lastProductsAddedToCart;
    }

    @C12579k
    public final APIMRecommendedProductBody copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "widgetId");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        Intrinsics.checkNotNullParameter(str3, "customerType");
        Intrinsics.checkNotNullParameter(str4, "customerKey");
        Intrinsics.checkNotNullParameter(list, "lastProductsAddedToCart");
        return new APIMRecommendedProductBody(str, str2, str3, str4, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedProductBody)) {
            return false;
        }
        APIMRecommendedProductBody aPIMRecommendedProductBody = (APIMRecommendedProductBody) obj;
        return Intrinsics.areEqual((Object) this.widgetId, (Object) aPIMRecommendedProductBody.widgetId) && Intrinsics.areEqual((Object) this.storeId, (Object) aPIMRecommendedProductBody.storeId) && Intrinsics.areEqual((Object) this.customerType, (Object) aPIMRecommendedProductBody.customerType) && Intrinsics.areEqual((Object) this.customerKey, (Object) aPIMRecommendedProductBody.customerKey) && Intrinsics.areEqual((Object) this.lastProductsAddedToCart, (Object) aPIMRecommendedProductBody.lastProductsAddedToCart);
    }

    @C12579k
    public final String getCustomerKey() {
        return this.customerKey;
    }

    @C12579k
    public final String getCustomerType() {
        return this.customerType;
    }

    @C12579k
    public final List<String> getLastProductsAddedToCart() {
        return this.lastProductsAddedToCart;
    }

    @C12579k
    public final String getStoreId() {
        return this.storeId;
    }

    @C12579k
    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return (((((((this.widgetId.hashCode() * 31) + this.storeId.hashCode()) * 31) + this.customerType.hashCode()) * 31) + this.customerKey.hashCode()) * 31) + this.lastProductsAddedToCart.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.widgetId;
        String str2 = this.storeId;
        String str3 = this.customerType;
        String str4 = this.customerKey;
        List<String> list = this.lastProductsAddedToCart;
        return "APIMRecommendedProductBody(widgetId=" + str + ", storeId=" + str2 + ", customerType=" + str3 + ", customerKey=" + str4 + ", lastProductsAddedToCart=" + list + ")";
    }
}
