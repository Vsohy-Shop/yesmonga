package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferCategoryLimitResponse;", "", "label", "", "unit", "value", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getLabel", "()Ljava/lang/String;", "getUnit", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/OfferCategoryLimitResponse;", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.OfferCategoryLimitResponse */
public final class OfferCategoryLimitResponse {
    @C33608c("label")
    @C12580l
    private final String label;
    @C33608c("unit")
    @C12580l
    private final String unit;
    @C33608c("value")
    @C12580l
    private final Long value;

    public OfferCategoryLimitResponse() {
        this((String) null, (String) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OfferCategoryLimitResponse copy$default(OfferCategoryLimitResponse offerCategoryLimitResponse, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerCategoryLimitResponse.label;
        }
        if ((i & 2) != 0) {
            str2 = offerCategoryLimitResponse.unit;
        }
        if ((i & 4) != 0) {
            l = offerCategoryLimitResponse.value;
        }
        return offerCategoryLimitResponse.copy(str, str2, l);
    }

    @C12580l
    public final String component1() {
        return this.label;
    }

    @C12580l
    public final String component2() {
        return this.unit;
    }

    @C12580l
    public final Long component3() {
        return this.value;
    }

    @C12579k
    public final OfferCategoryLimitResponse copy(@C12580l String str, @C12580l String str2, @C12580l Long l) {
        return new OfferCategoryLimitResponse(str, str2, l);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCategoryLimitResponse)) {
            return false;
        }
        OfferCategoryLimitResponse offerCategoryLimitResponse = (OfferCategoryLimitResponse) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) offerCategoryLimitResponse.label) && Intrinsics.areEqual((Object) this.unit, (Object) offerCategoryLimitResponse.unit) && Intrinsics.areEqual((Object) this.value, (Object) offerCategoryLimitResponse.value);
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final String getUnit() {
        return this.unit;
    }

    @C12580l
    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unit;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.value;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.label;
        String str2 = this.unit;
        Long l = this.value;
        return "OfferCategoryLimitResponse(label=" + str + ", unit=" + str2 + ", value=" + l + ")";
    }

    public OfferCategoryLimitResponse(@C12580l String str, @C12580l String str2, @C12580l Long l) {
        this.label = str;
        this.unit = str2;
        this.value = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OfferCategoryLimitResponse(String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }
}
