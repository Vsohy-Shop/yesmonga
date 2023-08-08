package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;", "", "discountDayMessage", "", "discountDayTitle", "isOwner", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDiscountDayMessage", "()Ljava/lang/String;", "getDiscountDayTitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;", "equals", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketPassCard */
public final class BasketPassCard {
    @C33608c("discount_day_msg")
    @C12580l
    private final String discountDayMessage;
    @C33608c("discount_day_title")
    @C12580l
    private final String discountDayTitle;
    @C33608c("is_owner")
    @C12580l
    private final Boolean isOwner;

    public BasketPassCard() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketPassCard copy$default(BasketPassCard basketPassCard, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketPassCard.discountDayMessage;
        }
        if ((i & 2) != 0) {
            str2 = basketPassCard.discountDayTitle;
        }
        if ((i & 4) != 0) {
            bool = basketPassCard.isOwner;
        }
        return basketPassCard.copy(str, str2, bool);
    }

    @C12580l
    public final String component1() {
        return this.discountDayMessage;
    }

    @C12580l
    public final String component2() {
        return this.discountDayTitle;
    }

    @C12580l
    public final Boolean component3() {
        return this.isOwner;
    }

    @C12579k
    public final BasketPassCard copy(@C12580l String str, @C12580l String str2, @C12580l Boolean bool) {
        return new BasketPassCard(str, str2, bool);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketPassCard)) {
            return false;
        }
        BasketPassCard basketPassCard = (BasketPassCard) obj;
        return Intrinsics.areEqual((Object) this.discountDayMessage, (Object) basketPassCard.discountDayMessage) && Intrinsics.areEqual((Object) this.discountDayTitle, (Object) basketPassCard.discountDayTitle) && Intrinsics.areEqual((Object) this.isOwner, (Object) basketPassCard.isOwner);
    }

    @C12580l
    public final String getDiscountDayMessage() {
        return this.discountDayMessage;
    }

    @C12580l
    public final String getDiscountDayTitle() {
        return this.discountDayTitle;
    }

    public int hashCode() {
        String str = this.discountDayMessage;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.discountDayTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOwner;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    public final Boolean isOwner() {
        return this.isOwner;
    }

    @C12579k
    public String toString() {
        String str = this.discountDayMessage;
        String str2 = this.discountDayTitle;
        Boolean bool = this.isOwner;
        return "BasketPassCard(discountDayMessage=" + str + ", discountDayTitle=" + str2 + ", isOwner=" + bool + ")";
    }

    public BasketPassCard(@C12580l String str, @C12580l String str2, @C12580l Boolean bool) {
        this.discountDayMessage = str;
        this.discountDayTitle = str2;
        this.isOwner = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketPassCard(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
