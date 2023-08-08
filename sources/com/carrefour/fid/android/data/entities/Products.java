package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Products;", "", "totalHits", "", "maxScore", "hits", "", "Lcom/carrefour/fid/android/data/entities/Hit;", "facets", "Lcom/carrefour/fid/android/data/entities/Facet;", "suggestions", "", "(IILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFacets", "()Ljava/util/List;", "getHits", "getMaxScore", "()I", "getSuggestions", "getTotalHits", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Products {
    public static final int $stable = 8;
    @C33608c("facets")
    @C12579k
    private final List<Facet> facets;
    @C33608c("hits")
    @C12579k
    private final List<Hit> hits;
    @C33608c("maxScore")
    private final int maxScore;
    @C33608c("suggestions")
    @C12579k
    private final List<String> suggestions;
    @C33608c("totalHits")
    private final int totalHits;

    public Products(int i, int i2, @C12579k List<Hit> list, @C12579k List<Facet> list2, @C12579k List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "hits");
        Intrinsics.checkNotNullParameter(list2, "facets");
        Intrinsics.checkNotNullParameter(list3, "suggestions");
        this.totalHits = i;
        this.maxScore = i2;
        this.hits = list;
        this.facets = list2;
        this.suggestions = list3;
    }

    public static /* synthetic */ Products copy$default(Products products, int i, int i2, List<Hit> list, List<Facet> list2, List<String> list3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = products.totalHits;
        }
        if ((i3 & 2) != 0) {
            i2 = products.maxScore;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            list = products.hits;
        }
        List<Hit> list4 = list;
        if ((i3 & 8) != 0) {
            list2 = products.facets;
        }
        List<Facet> list5 = list2;
        if ((i3 & 16) != 0) {
            list3 = products.suggestions;
        }
        return products.copy(i, i4, list4, list5, list3);
    }

    public final int component1() {
        return this.totalHits;
    }

    public final int component2() {
        return this.maxScore;
    }

    @C12579k
    public final List<Hit> component3() {
        return this.hits;
    }

    @C12579k
    public final List<Facet> component4() {
        return this.facets;
    }

    @C12579k
    public final List<String> component5() {
        return this.suggestions;
    }

    @C12579k
    public final Products copy(int i, int i2, @C12579k List<Hit> list, @C12579k List<Facet> list2, @C12579k List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "hits");
        Intrinsics.checkNotNullParameter(list2, "facets");
        Intrinsics.checkNotNullParameter(list3, "suggestions");
        return new Products(i, i2, list, list2, list3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Products)) {
            return false;
        }
        Products products = (Products) obj;
        return this.totalHits == products.totalHits && this.maxScore == products.maxScore && Intrinsics.areEqual((Object) this.hits, (Object) products.hits) && Intrinsics.areEqual((Object) this.facets, (Object) products.facets) && Intrinsics.areEqual((Object) this.suggestions, (Object) products.suggestions);
    }

    @C12579k
    public final List<Facet> getFacets() {
        return this.facets;
    }

    @C12579k
    public final List<Hit> getHits() {
        return this.hits;
    }

    public final int getMaxScore() {
        return this.maxScore;
    }

    @C12579k
    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public final int getTotalHits() {
        return this.totalHits;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.totalHits) * 31) + Integer.hashCode(this.maxScore)) * 31) + this.hits.hashCode()) * 31) + this.facets.hashCode()) * 31) + this.suggestions.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.totalHits;
        int i2 = this.maxScore;
        List<Hit> list = this.hits;
        List<Facet> list2 = this.facets;
        List<String> list3 = this.suggestions;
        return "Products(totalHits=" + i + ", maxScore=" + i2 + ", hits=" + list + ", facets=" + list2 + ", suggestions=" + list3 + ")";
    }
}
