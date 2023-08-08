package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketShippingType;", "", "amount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "code", "", "freeShippingAmount", "isSelected", "", "label", "(Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAmount", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getCode", "()Ljava/lang/String;", "getFreeShippingAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabel", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketShippingType;", "equals", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketShippingType */
public final class BasketShippingType {
    @C33608c("amount")
    @C12580l
    private final BasketAmountResponse amount;
    @C33608c("code")
    @C12580l
    private final String code;
    @C33608c("free_shipping_amount")
    @C12580l
    private final BasketAmountResponse freeShippingAmount;
    @C33608c("is_selected")
    @C12580l
    private final Boolean isSelected;
    @C33608c("label")
    @C12580l
    private final String label;

    public BasketShippingType() {
        this((BasketAmountResponse) null, (String) null, (BasketAmountResponse) null, (Boolean) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketShippingType copy$default(BasketShippingType basketShippingType, BasketAmountResponse basketAmountResponse, String str, BasketAmountResponse basketAmountResponse2, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            basketAmountResponse = basketShippingType.amount;
        }
        if ((i & 2) != 0) {
            str = basketShippingType.code;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            basketAmountResponse2 = basketShippingType.freeShippingAmount;
        }
        BasketAmountResponse basketAmountResponse3 = basketAmountResponse2;
        if ((i & 8) != 0) {
            bool = basketShippingType.isSelected;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str2 = basketShippingType.label;
        }
        return basketShippingType.copy(basketAmountResponse, str3, basketAmountResponse3, bool2, str2);
    }

    @C12580l
    public final BasketAmountResponse component1() {
        return this.amount;
    }

    @C12580l
    public final String component2() {
        return this.code;
    }

    @C12580l
    public final BasketAmountResponse component3() {
        return this.freeShippingAmount;
    }

    @C12580l
    public final Boolean component4() {
        return this.isSelected;
    }

    @C12580l
    public final String component5() {
        return this.label;
    }

    @C12579k
    public final BasketShippingType copy(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l Boolean bool, @C12580l String str2) {
        return new BasketShippingType(basketAmountResponse, str, basketAmountResponse2, bool, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketShippingType)) {
            return false;
        }
        BasketShippingType basketShippingType = (BasketShippingType) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) basketShippingType.amount) && Intrinsics.areEqual((Object) this.code, (Object) basketShippingType.code) && Intrinsics.areEqual((Object) this.freeShippingAmount, (Object) basketShippingType.freeShippingAmount) && Intrinsics.areEqual((Object) this.isSelected, (Object) basketShippingType.isSelected) && Intrinsics.areEqual((Object) this.label, (Object) basketShippingType.label);
    }

    @C12580l
    public final BasketAmountResponse getAmount() {
        return this.amount;
    }

    @C12580l
    public final String getCode() {
        return this.code;
    }

    @C12580l
    public final BasketAmountResponse getFreeShippingAmount() {
        return this.freeShippingAmount;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        BasketAmountResponse basketAmountResponse = this.amount;
        int i = 0;
        int hashCode = (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse2 = this.freeShippingAmount;
        int hashCode3 = (hashCode2 + (basketAmountResponse2 == null ? 0 : basketAmountResponse2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.label;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    @C12580l
    public final Boolean isSelected() {
        return this.isSelected;
    }

    @C12579k
    public String toString() {
        BasketAmountResponse basketAmountResponse = this.amount;
        String str = this.code;
        BasketAmountResponse basketAmountResponse2 = this.freeShippingAmount;
        Boolean bool = this.isSelected;
        String str2 = this.label;
        return "BasketShippingType(amount=" + basketAmountResponse + ", code=" + str + ", freeShippingAmount=" + basketAmountResponse2 + ", isSelected=" + bool + ", label=" + str2 + ")";
    }

    public BasketShippingType(@C12580l BasketAmountResponse basketAmountResponse, @C12580l String str, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l Boolean bool, @C12580l String str2) {
        this.amount = basketAmountResponse;
        this.code = str;
        this.freeShippingAmount = basketAmountResponse2;
        this.isSelected = bool;
        this.label = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketShippingType(com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r5, java.lang.String r6, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r7, java.lang.Boolean r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketShippingType.<init>(com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.String, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
