package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CriteoProduct;", "", "productId", "", "onLoadBeacon", "onViewBeacon", "onClickBeacon", "onBasketChangeBeacon", "onWishListBeacon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOnBasketChangeBeacon", "()Ljava/lang/String;", "getOnClickBeacon", "getOnLoadBeacon", "getOnViewBeacon", "getOnWishListBeacon", "getProductId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CriteoProduct {
    public static final int $stable = 0;
    @C33608c("OnBasketChangeBeacon")
    @C12580l
    private final String onBasketChangeBeacon;
    @C33608c("OnClickBeacon")
    @C12580l
    private final String onClickBeacon;
    @C33608c("OnLoadBeacon")
    @C12580l
    private final String onLoadBeacon;
    @C33608c("OnViewBeacon")
    @C12580l
    private final String onViewBeacon;
    @C33608c("OnWishlistBeacon")
    @C12580l
    private final String onWishListBeacon;
    @C33608c("ProductId")
    @C12580l
    private final String productId;

    public CriteoProduct(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        this.productId = str;
        this.onLoadBeacon = str2;
        this.onViewBeacon = str3;
        this.onClickBeacon = str4;
        this.onBasketChangeBeacon = str5;
        this.onWishListBeacon = str6;
    }

    public static /* synthetic */ CriteoProduct copy$default(CriteoProduct criteoProduct, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = criteoProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = criteoProduct.onLoadBeacon;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = criteoProduct.onViewBeacon;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = criteoProduct.onClickBeacon;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = criteoProduct.onBasketChangeBeacon;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = criteoProduct.onWishListBeacon;
        }
        return criteoProduct.copy(str, str7, str8, str9, str10, str6);
    }

    @C12580l
    public final String component1() {
        return this.productId;
    }

    @C12580l
    public final String component2() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String component3() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String component4() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String component5() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String component6() {
        return this.onWishListBeacon;
    }

    @C12579k
    public final CriteoProduct copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        return new CriteoProduct(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoProduct)) {
            return false;
        }
        CriteoProduct criteoProduct = (CriteoProduct) obj;
        return Intrinsics.areEqual((Object) this.productId, (Object) criteoProduct.productId) && Intrinsics.areEqual((Object) this.onLoadBeacon, (Object) criteoProduct.onLoadBeacon) && Intrinsics.areEqual((Object) this.onViewBeacon, (Object) criteoProduct.onViewBeacon) && Intrinsics.areEqual((Object) this.onClickBeacon, (Object) criteoProduct.onClickBeacon) && Intrinsics.areEqual((Object) this.onBasketChangeBeacon, (Object) criteoProduct.onBasketChangeBeacon) && Intrinsics.areEqual((Object) this.onWishListBeacon, (Object) criteoProduct.onWishListBeacon);
    }

    @C12580l
    public final String getOnBasketChangeBeacon() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String getOnClickBeacon() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String getOnWishListBeacon() {
        return this.onWishListBeacon;
    }

    @C12580l
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        String str = this.productId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.onLoadBeacon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.onViewBeacon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onClickBeacon;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onBasketChangeBeacon;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onWishListBeacon;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    public String toString() {
        String str = this.productId;
        String str2 = this.onLoadBeacon;
        String str3 = this.onViewBeacon;
        String str4 = this.onClickBeacon;
        String str5 = this.onBasketChangeBeacon;
        String str6 = this.onWishListBeacon;
        return "CriteoProduct(productId=" + str + ", onLoadBeacon=" + str2 + ", onViewBeacon=" + str3 + ", onClickBeacon=" + str4 + ", onBasketChangeBeacon=" + str5 + ", onWishListBeacon=" + str6 + ")";
    }
}
