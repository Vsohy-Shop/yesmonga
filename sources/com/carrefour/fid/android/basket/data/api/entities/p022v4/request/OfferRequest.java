package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/OfferRequest;", "", "gtin", "", "quantity", "", "(Ljava/lang/String;I)V", "getGtin", "()Ljava/lang/String;", "getQuantity", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.OfferRequest */
public final class OfferRequest {
    @C33608c("gtin")
    @C12579k
    private final String gtin;
    @C33608c("quantity")
    private final int quantity;

    public OfferRequest(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.gtin = str;
        this.quantity = i;
    }

    public static /* synthetic */ OfferRequest copy$default(OfferRequest offerRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offerRequest.gtin;
        }
        if ((i2 & 2) != 0) {
            i = offerRequest.quantity;
        }
        return offerRequest.copy(str, i);
    }

    @C12579k
    public final String component1() {
        return this.gtin;
    }

    public final int component2() {
        return this.quantity;
    }

    @C12579k
    public final OfferRequest copy(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        return new OfferRequest(str, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferRequest)) {
            return false;
        }
        OfferRequest offerRequest = (OfferRequest) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) offerRequest.gtin) && this.quantity == offerRequest.quantity;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (this.gtin.hashCode() * 31) + Integer.hashCode(this.quantity);
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        int i = this.quantity;
        return "OfferRequest(gtin=" + str + ", quantity=" + i + ")";
    }
}
