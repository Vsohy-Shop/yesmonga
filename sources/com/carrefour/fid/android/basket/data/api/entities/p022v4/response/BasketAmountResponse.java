package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "", "currency", "", "scale", "", "unscaledAmount", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "getScale", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnscaledAmount", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "equals", "", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse */
public final class BasketAmountResponse {
    @C33608c("currency")
    @C12580l
    private final String currency;
    @C33608c("scale")
    @C12580l
    private final Integer scale;
    @C33608c("unscaled_amount")
    @C12580l
    private final Integer unscaledAmount;

    public BasketAmountResponse() {
        this((String) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketAmountResponse copy$default(BasketAmountResponse basketAmountResponse, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketAmountResponse.currency;
        }
        if ((i & 2) != 0) {
            num = basketAmountResponse.scale;
        }
        if ((i & 4) != 0) {
            num2 = basketAmountResponse.unscaledAmount;
        }
        return basketAmountResponse.copy(str, num, num2);
    }

    @C12580l
    public final String component1() {
        return this.currency;
    }

    @C12580l
    public final Integer component2() {
        return this.scale;
    }

    @C12580l
    public final Integer component3() {
        return this.unscaledAmount;
    }

    @C12579k
    public final BasketAmountResponse copy(@C12580l String str, @C12580l Integer num, @C12580l Integer num2) {
        return new BasketAmountResponse(str, num, num2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketAmountResponse)) {
            return false;
        }
        BasketAmountResponse basketAmountResponse = (BasketAmountResponse) obj;
        return Intrinsics.areEqual((Object) this.currency, (Object) basketAmountResponse.currency) && Intrinsics.areEqual((Object) this.scale, (Object) basketAmountResponse.scale) && Intrinsics.areEqual((Object) this.unscaledAmount, (Object) basketAmountResponse.unscaledAmount);
    }

    @C12580l
    public final String getCurrency() {
        return this.currency;
    }

    @C12580l
    public final Integer getScale() {
        return this.scale;
    }

    @C12580l
    public final Integer getUnscaledAmount() {
        return this.unscaledAmount;
    }

    public int hashCode() {
        String str = this.currency;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.scale;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unscaledAmount;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.currency;
        Integer num = this.scale;
        Integer num2 = this.unscaledAmount;
        return "BasketAmountResponse(currency=" + str + ", scale=" + num + ", unscaledAmount=" + num2 + ")";
    }

    public BasketAmountResponse(@C12580l String str, @C12580l Integer num, @C12580l Integer num2) {
        this.currency = str;
        this.scale = num;
        this.unscaledAmount = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketAmountResponse(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
