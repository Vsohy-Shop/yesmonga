package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMProducts;", "", "appliedSorts", "", "Lcom/carrefour/fid/android/data/entities/AppliedSort;", "engineTimeInMilis", "", "searchContext", "Lcom/carrefour/fid/android/data/entities/SearchContext;", "products", "Lcom/carrefour/fid/android/data/entities/Products;", "(Ljava/util/List;ILcom/carrefour/fid/android/data/entities/SearchContext;Lcom/carrefour/fid/android/data/entities/Products;)V", "getAppliedSorts", "()Ljava/util/List;", "getEngineTimeInMilis", "()I", "getProducts", "()Lcom/carrefour/fid/android/data/entities/Products;", "getSearchContext", "()Lcom/carrefour/fid/android/data/entities/SearchContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMProducts {
    public static final int $stable = 8;
    @C33608c("appliedSorts")
    @C12580l
    private final List<AppliedSort> appliedSorts;
    @C33608c("engineTimeInMilis")
    private final int engineTimeInMilis;
    @C33608c("products")
    @C12579k
    private final Products products;
    @C33608c("searchContext")
    @C12579k
    private final SearchContext searchContext;

    public APIMProducts(@C12580l List<AppliedSort> list, int i, @C12579k SearchContext searchContext2, @C12579k Products products2) {
        Intrinsics.checkNotNullParameter(searchContext2, "searchContext");
        Intrinsics.checkNotNullParameter(products2, "products");
        this.appliedSorts = list;
        this.engineTimeInMilis = i;
        this.searchContext = searchContext2;
        this.products = products2;
    }

    public static /* synthetic */ APIMProducts copy$default(APIMProducts aPIMProducts, List<AppliedSort> list, int i, SearchContext searchContext2, Products products2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aPIMProducts.appliedSorts;
        }
        if ((i2 & 2) != 0) {
            i = aPIMProducts.engineTimeInMilis;
        }
        if ((i2 & 4) != 0) {
            searchContext2 = aPIMProducts.searchContext;
        }
        if ((i2 & 8) != 0) {
            products2 = aPIMProducts.products;
        }
        return aPIMProducts.copy(list, i, searchContext2, products2);
    }

    @C12580l
    public final List<AppliedSort> component1() {
        return this.appliedSorts;
    }

    public final int component2() {
        return this.engineTimeInMilis;
    }

    @C12579k
    public final SearchContext component3() {
        return this.searchContext;
    }

    @C12579k
    public final Products component4() {
        return this.products;
    }

    @C12579k
    public final APIMProducts copy(@C12580l List<AppliedSort> list, int i, @C12579k SearchContext searchContext2, @C12579k Products products2) {
        Intrinsics.checkNotNullParameter(searchContext2, "searchContext");
        Intrinsics.checkNotNullParameter(products2, "products");
        return new APIMProducts(list, i, searchContext2, products2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMProducts)) {
            return false;
        }
        APIMProducts aPIMProducts = (APIMProducts) obj;
        return Intrinsics.areEqual((Object) this.appliedSorts, (Object) aPIMProducts.appliedSorts) && this.engineTimeInMilis == aPIMProducts.engineTimeInMilis && Intrinsics.areEqual((Object) this.searchContext, (Object) aPIMProducts.searchContext) && Intrinsics.areEqual((Object) this.products, (Object) aPIMProducts.products);
    }

    @C12580l
    public final List<AppliedSort> getAppliedSorts() {
        return this.appliedSorts;
    }

    public final int getEngineTimeInMilis() {
        return this.engineTimeInMilis;
    }

    @C12579k
    public final Products getProducts() {
        return this.products;
    }

    @C12579k
    public final SearchContext getSearchContext() {
        return this.searchContext;
    }

    public int hashCode() {
        List<AppliedSort> list = this.appliedSorts;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.engineTimeInMilis)) * 31) + this.searchContext.hashCode()) * 31) + this.products.hashCode();
    }

    @C12579k
    public String toString() {
        List<AppliedSort> list = this.appliedSorts;
        int i = this.engineTimeInMilis;
        SearchContext searchContext2 = this.searchContext;
        Products products2 = this.products;
        return "APIMProducts(appliedSorts=" + list + ", engineTimeInMilis=" + i + ", searchContext=" + searchContext2 + ", products=" + products2 + ")";
    }
}
