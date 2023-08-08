package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/DiscountArticleResponse;", "", "gtin", "", "quantity", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getGtin", "()Ljava/lang/String;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/DiscountArticleResponse;", "equals", "", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.DiscountArticleResponse */
public final class DiscountArticleResponse {
    @C33608c("gtin")
    @C12580l
    private final String gtin;
    @C33608c("quantity")
    @C12580l
    private final Integer quantity;

    public DiscountArticleResponse() {
        this((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DiscountArticleResponse copy$default(DiscountArticleResponse discountArticleResponse, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountArticleResponse.gtin;
        }
        if ((i & 2) != 0) {
            num = discountArticleResponse.quantity;
        }
        return discountArticleResponse.copy(str, num);
    }

    @C12580l
    public final String component1() {
        return this.gtin;
    }

    @C12580l
    public final Integer component2() {
        return this.quantity;
    }

    @C12579k
    public final DiscountArticleResponse copy(@C12580l String str, @C12580l Integer num) {
        return new DiscountArticleResponse(str, num);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountArticleResponse)) {
            return false;
        }
        DiscountArticleResponse discountArticleResponse = (DiscountArticleResponse) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) discountArticleResponse.gtin) && Intrinsics.areEqual((Object) this.quantity, (Object) discountArticleResponse.quantity);
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        String str = this.gtin;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quantity;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        Integer num = this.quantity;
        return "DiscountArticleResponse(gtin=" + str + ", quantity=" + num + ")";
    }

    public DiscountArticleResponse(@C12580l String str, @C12580l Integer num) {
        this.gtin = str;
        this.quantity = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscountArticleResponse(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
