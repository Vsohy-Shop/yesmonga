package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/SynchronizeBasketRequest;", "", "subBasketIds", "", "", "loyaltyCard", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/LoyaltyCardRequest;", "(Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/LoyaltyCardRequest;)V", "getLoyaltyCard", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/LoyaltyCardRequest;", "getSubBasketIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.SynchronizeBasketRequest */
public final class SynchronizeBasketRequest {
    @C33608c("loyalty_card")
    @C12580l
    private final LoyaltyCardRequest loyaltyCard;
    @C33608c("sub_basket_ids")
    @C12579k
    private final List<String> subBasketIds;

    public SynchronizeBasketRequest(@C12579k List<String> list, @C12580l LoyaltyCardRequest loyaltyCardRequest) {
        Intrinsics.checkNotNullParameter(list, "subBasketIds");
        this.subBasketIds = list;
        this.loyaltyCard = loyaltyCardRequest;
    }

    public static /* synthetic */ SynchronizeBasketRequest copy$default(SynchronizeBasketRequest synchronizeBasketRequest, List<String> list, LoyaltyCardRequest loyaltyCardRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            list = synchronizeBasketRequest.subBasketIds;
        }
        if ((i & 2) != 0) {
            loyaltyCardRequest = synchronizeBasketRequest.loyaltyCard;
        }
        return synchronizeBasketRequest.copy(list, loyaltyCardRequest);
    }

    @C12579k
    public final List<String> component1() {
        return this.subBasketIds;
    }

    @C12580l
    public final LoyaltyCardRequest component2() {
        return this.loyaltyCard;
    }

    @C12579k
    public final SynchronizeBasketRequest copy(@C12579k List<String> list, @C12580l LoyaltyCardRequest loyaltyCardRequest) {
        Intrinsics.checkNotNullParameter(list, "subBasketIds");
        return new SynchronizeBasketRequest(list, loyaltyCardRequest);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SynchronizeBasketRequest)) {
            return false;
        }
        SynchronizeBasketRequest synchronizeBasketRequest = (SynchronizeBasketRequest) obj;
        return Intrinsics.areEqual((Object) this.subBasketIds, (Object) synchronizeBasketRequest.subBasketIds) && Intrinsics.areEqual((Object) this.loyaltyCard, (Object) synchronizeBasketRequest.loyaltyCard);
    }

    @C12580l
    public final LoyaltyCardRequest getLoyaltyCard() {
        return this.loyaltyCard;
    }

    @C12579k
    public final List<String> getSubBasketIds() {
        return this.subBasketIds;
    }

    public int hashCode() {
        int hashCode = this.subBasketIds.hashCode() * 31;
        LoyaltyCardRequest loyaltyCardRequest = this.loyaltyCard;
        return hashCode + (loyaltyCardRequest == null ? 0 : loyaltyCardRequest.hashCode());
    }

    @C12579k
    public String toString() {
        List<String> list = this.subBasketIds;
        LoyaltyCardRequest loyaltyCardRequest = this.loyaltyCard;
        return "SynchronizeBasketRequest(subBasketIds=" + list + ", loyaltyCard=" + loyaltyCardRequest + ")";
    }
}
