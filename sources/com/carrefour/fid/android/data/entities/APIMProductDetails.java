package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMProductDetails;", "", "product", "Lcom/carrefour/fid/android/data/entities/Product;", "offers", "", "Lcom/carrefour/fid/android/data/entities/Offer;", "(Lcom/carrefour/fid/android/data/entities/Product;Ljava/util/List;)V", "getOffers", "()Ljava/util/List;", "getProduct", "()Lcom/carrefour/fid/android/data/entities/Product;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMProductDetails {
    public static final int $stable = 8;
    @C33608c("offers")
    @C12580l
    private final List<Offer> offers;
    @C33608c("product")
    @C12580l
    private final Product product;

    public APIMProductDetails(@C12580l Product product2, @C12580l List<Offer> list) {
        this.product = product2;
        this.offers = list;
    }

    public static /* synthetic */ APIMProductDetails copy$default(APIMProductDetails aPIMProductDetails, Product product2, List<Offer> list, int i, Object obj) {
        if ((i & 1) != 0) {
            product2 = aPIMProductDetails.product;
        }
        if ((i & 2) != 0) {
            list = aPIMProductDetails.offers;
        }
        return aPIMProductDetails.copy(product2, list);
    }

    @C12580l
    public final Product component1() {
        return this.product;
    }

    @C12580l
    public final List<Offer> component2() {
        return this.offers;
    }

    @C12579k
    public final APIMProductDetails copy(@C12580l Product product2, @C12580l List<Offer> list) {
        return new APIMProductDetails(product2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMProductDetails)) {
            return false;
        }
        APIMProductDetails aPIMProductDetails = (APIMProductDetails) obj;
        return Intrinsics.areEqual((Object) this.product, (Object) aPIMProductDetails.product) && Intrinsics.areEqual((Object) this.offers, (Object) aPIMProductDetails.offers);
    }

    @C12580l
    public final List<Offer> getOffers() {
        return this.offers;
    }

    @C12580l
    public final Product getProduct() {
        return this.product;
    }

    public int hashCode() {
        Product product2 = this.product;
        int i = 0;
        int hashCode = (product2 == null ? 0 : product2.hashCode()) * 31;
        List<Offer> list = this.offers;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Product product2 = this.product;
        List<Offer> list = this.offers;
        return "APIMProductDetails(product=" + product2 + ", offers=" + list + ")";
    }
}
