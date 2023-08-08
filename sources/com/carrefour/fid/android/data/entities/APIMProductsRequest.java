package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.C36377a;
import com.google.gson.annotations.C33608c;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001Bi\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b2\u00103J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b'\u0010(R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b1\u0010.¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMProductsRequest;", "", "", "", "component1", "", "component2", "component3", "Lcom/carrefour/fid/android/data/a;", "component4", "", "component5", "component6", "component7", "component8", "component9", "catalogs", "productFrom", "productSize", "facetFilter", "sort", "queryId", "index", "text", "queryGroup", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/util/List;", "getCatalogs", "()Ljava/util/List;", "I", "getProductFrom", "()I", "getProductSize", "Lcom/carrefour/fid/android/data/a;", "getFacetFilter", "()Lcom/carrefour/fid/android/data/a;", "Ljava/util/Map;", "getSort", "()Ljava/util/Map;", "Ljava/lang/String;", "getQueryId", "()Ljava/lang/String;", "getIndex", "getText", "getQueryGroup", "<init>", "(Ljava/util/List;IILcom/carrefour/fid/android/data/a;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C8567o(parameters = 0)
public final class APIMProductsRequest {
    public static final int $stable = 8;
    @C33608c("catalog")
    @C12579k
    private final List<String> catalogs;
    @C33608c("facetFilter")
    @C12579k
    private final C36377a facetFilter;
    @C33608c("index")
    @C12580l
    private final String index;
    @C33608c("productFrom")
    private final int productFrom;
    @C33608c("productSize")
    private final int productSize;
    @C33608c("queryGroup")
    @C12580l
    private final String queryGroup;
    @C33608c("queryId")
    @C12580l
    private final String queryId;
    @C33608c("sort")
    @C12579k
    private final Map<String, String> sort;
    @C33608c("text")
    @C12580l
    private final String text;

    public APIMProductsRequest(@C12579k List<String> list, int i, int i2, @C12579k C36377a aVar, @C12579k Map<String, String> map, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "catalogs");
        Intrinsics.checkNotNullParameter(aVar, "facetFilter");
        Intrinsics.checkNotNullParameter(map, "sort");
        this.catalogs = list;
        this.productFrom = i;
        this.productSize = i2;
        this.facetFilter = aVar;
        this.sort = map;
        this.queryId = str;
        this.index = str2;
        this.text = str3;
        this.queryGroup = str4;
    }

    public static /* synthetic */ APIMProductsRequest copy$default(APIMProductsRequest aPIMProductsRequest, List list, int i, int i2, C36377a aVar, Map map, String str, String str2, String str3, String str4, int i3, Object obj) {
        APIMProductsRequest aPIMProductsRequest2 = aPIMProductsRequest;
        int i4 = i3;
        return aPIMProductsRequest.copy((i4 & 1) != 0 ? aPIMProductsRequest2.catalogs : list, (i4 & 2) != 0 ? aPIMProductsRequest2.productFrom : i, (i4 & 4) != 0 ? aPIMProductsRequest2.productSize : i2, (i4 & 8) != 0 ? aPIMProductsRequest2.facetFilter : aVar, (i4 & 16) != 0 ? aPIMProductsRequest2.sort : map, (i4 & 32) != 0 ? aPIMProductsRequest2.queryId : str, (i4 & 64) != 0 ? aPIMProductsRequest2.index : str2, (i4 & 128) != 0 ? aPIMProductsRequest2.text : str3, (i4 & 256) != 0 ? aPIMProductsRequest2.queryGroup : str4);
    }

    @C12579k
    public final List<String> component1() {
        return this.catalogs;
    }

    public final int component2() {
        return this.productFrom;
    }

    public final int component3() {
        return this.productSize;
    }

    @C12579k
    public final C36377a component4() {
        return this.facetFilter;
    }

    @C12579k
    public final Map<String, String> component5() {
        return this.sort;
    }

    @C12580l
    public final String component6() {
        return this.queryId;
    }

    @C12580l
    public final String component7() {
        return this.index;
    }

    @C12580l
    public final String component8() {
        return this.text;
    }

    @C12580l
    public final String component9() {
        return this.queryGroup;
    }

    @C12579k
    public final APIMProductsRequest copy(@C12579k List<String> list, int i, int i2, @C12579k C36377a aVar, @C12579k Map<String, String> map, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "catalogs");
        Intrinsics.checkNotNullParameter(aVar, "facetFilter");
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "sort");
        return new APIMProductsRequest(list, i, i2, aVar, map2, str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMProductsRequest)) {
            return false;
        }
        APIMProductsRequest aPIMProductsRequest = (APIMProductsRequest) obj;
        return Intrinsics.areEqual((Object) this.catalogs, (Object) aPIMProductsRequest.catalogs) && this.productFrom == aPIMProductsRequest.productFrom && this.productSize == aPIMProductsRequest.productSize && Intrinsics.areEqual((Object) this.facetFilter, (Object) aPIMProductsRequest.facetFilter) && Intrinsics.areEqual((Object) this.sort, (Object) aPIMProductsRequest.sort) && Intrinsics.areEqual((Object) this.queryId, (Object) aPIMProductsRequest.queryId) && Intrinsics.areEqual((Object) this.index, (Object) aPIMProductsRequest.index) && Intrinsics.areEqual((Object) this.text, (Object) aPIMProductsRequest.text) && Intrinsics.areEqual((Object) this.queryGroup, (Object) aPIMProductsRequest.queryGroup);
    }

    @C12579k
    public final List<String> getCatalogs() {
        return this.catalogs;
    }

    @C12579k
    public final C36377a getFacetFilter() {
        return this.facetFilter;
    }

    @C12580l
    public final String getIndex() {
        return this.index;
    }

    public final int getProductFrom() {
        return this.productFrom;
    }

    public final int getProductSize() {
        return this.productSize;
    }

    @C12580l
    public final String getQueryGroup() {
        return this.queryGroup;
    }

    @C12580l
    public final String getQueryId() {
        return this.queryId;
    }

    @C12579k
    public final Map<String, String> getSort() {
        return this.sort;
    }

    @C12580l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((((((this.catalogs.hashCode() * 31) + Integer.hashCode(this.productFrom)) * 31) + Integer.hashCode(this.productSize)) * 31) + this.facetFilter.hashCode()) * 31) + this.sort.hashCode()) * 31;
        String str = this.queryId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.index;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.queryGroup;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        List<String> list = this.catalogs;
        int i = this.productFrom;
        int i2 = this.productSize;
        C36377a aVar = this.facetFilter;
        Map<String, String> map = this.sort;
        String str = this.queryId;
        String str2 = this.index;
        String str3 = this.text;
        String str4 = this.queryGroup;
        return "APIMProductsRequest(catalogs=" + list + ", productFrom=" + i + ", productSize=" + i2 + ", facetFilter=" + aVar + ", sort=" + map + ", queryId=" + str + ", index=" + str2 + ", text=" + str3 + ", queryGroup=" + str4 + ")";
    }
}
