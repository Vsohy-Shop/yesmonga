package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMCatalogsResponse;", "", "product", "Lcom/carrefour/fid/android/data/entities/APIMProductResponse;", "offers", "Lcom/carrefour/fid/android/data/entities/APIMOffersResponse;", "(Lcom/carrefour/fid/android/data/entities/APIMProductResponse;Lcom/carrefour/fid/android/data/entities/APIMOffersResponse;)V", "getOffers", "()Lcom/carrefour/fid/android/data/entities/APIMOffersResponse;", "getProduct", "()Lcom/carrefour/fid/android/data/entities/APIMProductResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMCatalogsResponse {
    public static final int $stable = 8;
    @C33608c("offers")
    @C12580l
    private final APIMOffersResponse offers;
    @C33608c("product")
    @C12580l
    private final APIMProductResponse product;

    public APIMCatalogsResponse() {
        this((APIMProductResponse) null, (APIMOffersResponse) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APIMCatalogsResponse copy$default(APIMCatalogsResponse aPIMCatalogsResponse, APIMProductResponse aPIMProductResponse, APIMOffersResponse aPIMOffersResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            aPIMProductResponse = aPIMCatalogsResponse.product;
        }
        if ((i & 2) != 0) {
            aPIMOffersResponse = aPIMCatalogsResponse.offers;
        }
        return aPIMCatalogsResponse.copy(aPIMProductResponse, aPIMOffersResponse);
    }

    @C12580l
    public final APIMProductResponse component1() {
        return this.product;
    }

    @C12580l
    public final APIMOffersResponse component2() {
        return this.offers;
    }

    @C12579k
    public final APIMCatalogsResponse copy(@C12580l APIMProductResponse aPIMProductResponse, @C12580l APIMOffersResponse aPIMOffersResponse) {
        return new APIMCatalogsResponse(aPIMProductResponse, aPIMOffersResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMCatalogsResponse)) {
            return false;
        }
        APIMCatalogsResponse aPIMCatalogsResponse = (APIMCatalogsResponse) obj;
        return Intrinsics.areEqual((Object) this.product, (Object) aPIMCatalogsResponse.product) && Intrinsics.areEqual((Object) this.offers, (Object) aPIMCatalogsResponse.offers);
    }

    @C12580l
    public final APIMOffersResponse getOffers() {
        return this.offers;
    }

    @C12580l
    public final APIMProductResponse getProduct() {
        return this.product;
    }

    public int hashCode() {
        APIMProductResponse aPIMProductResponse = this.product;
        int i = 0;
        int hashCode = (aPIMProductResponse == null ? 0 : aPIMProductResponse.hashCode()) * 31;
        APIMOffersResponse aPIMOffersResponse = this.offers;
        if (aPIMOffersResponse != null) {
            i = aPIMOffersResponse.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        APIMProductResponse aPIMProductResponse = this.product;
        APIMOffersResponse aPIMOffersResponse = this.offers;
        return "APIMCatalogsResponse(product=" + aPIMProductResponse + ", offers=" + aPIMOffersResponse + ")";
    }

    public APIMCatalogsResponse(@C12580l APIMProductResponse aPIMProductResponse, @C12580l APIMOffersResponse aPIMOffersResponse) {
        this.product = aPIMProductResponse;
        this.offers = aPIMOffersResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMCatalogsResponse(APIMProductResponse aPIMProductResponse, APIMOffersResponse aPIMOffersResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aPIMProductResponse, (i & 2) != 0 ? null : aPIMOffersResponse);
    }
}
