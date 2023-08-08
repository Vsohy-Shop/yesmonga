package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogFullDetailsResponse;", "", "catalogHeader", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogHeaderDetailsResponse;", "slug", "", "doublePages", "", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogDoublePageResponse;", "(Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogHeaderDetailsResponse;Ljava/lang/String;Ljava/util/List;)V", "getCatalogHeader", "()Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogHeaderDetailsResponse;", "setCatalogHeader", "(Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogHeaderDetailsResponse;)V", "getDoublePages", "()Ljava/util/List;", "setDoublePages", "(Ljava/util/List;)V", "getSlug", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CatalogFullDetailsResponse {
    @C33608c("catalog_header")
    @C12580l
    private CatalogHeaderDetailsResponse catalogHeader;
    @C33608c("double_pages")
    @C12579k
    private List<CatalogDoublePageResponse> doublePages;
    @C33608c("slug_catalog")
    @C12579k
    private String slug;

    public CatalogFullDetailsResponse() {
        this((CatalogHeaderDetailsResponse) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogFullDetailsResponse copy$default(CatalogFullDetailsResponse catalogFullDetailsResponse, CatalogHeaderDetailsResponse catalogHeaderDetailsResponse, String str, List<CatalogDoublePageResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogHeaderDetailsResponse = catalogFullDetailsResponse.catalogHeader;
        }
        if ((i & 2) != 0) {
            str = catalogFullDetailsResponse.slug;
        }
        if ((i & 4) != 0) {
            list = catalogFullDetailsResponse.doublePages;
        }
        return catalogFullDetailsResponse.copy(catalogHeaderDetailsResponse, str, list);
    }

    @C12580l
    public final CatalogHeaderDetailsResponse component1() {
        return this.catalogHeader;
    }

    @C12579k
    public final String component2() {
        return this.slug;
    }

    @C12579k
    public final List<CatalogDoublePageResponse> component3() {
        return this.doublePages;
    }

    @C12579k
    public final CatalogFullDetailsResponse copy(@C12580l CatalogHeaderDetailsResponse catalogHeaderDetailsResponse, @C12579k String str, @C12579k List<CatalogDoublePageResponse> list) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(list, "doublePages");
        return new CatalogFullDetailsResponse(catalogHeaderDetailsResponse, str, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogFullDetailsResponse)) {
            return false;
        }
        CatalogFullDetailsResponse catalogFullDetailsResponse = (CatalogFullDetailsResponse) obj;
        return Intrinsics.areEqual((Object) this.catalogHeader, (Object) catalogFullDetailsResponse.catalogHeader) && Intrinsics.areEqual((Object) this.slug, (Object) catalogFullDetailsResponse.slug) && Intrinsics.areEqual((Object) this.doublePages, (Object) catalogFullDetailsResponse.doublePages);
    }

    @C12580l
    public final CatalogHeaderDetailsResponse getCatalogHeader() {
        return this.catalogHeader;
    }

    @C12579k
    public final List<CatalogDoublePageResponse> getDoublePages() {
        return this.doublePages;
    }

    @C12579k
    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        CatalogHeaderDetailsResponse catalogHeaderDetailsResponse = this.catalogHeader;
        return ((((catalogHeaderDetailsResponse == null ? 0 : catalogHeaderDetailsResponse.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.doublePages.hashCode();
    }

    public final void setCatalogHeader(@C12580l CatalogHeaderDetailsResponse catalogHeaderDetailsResponse) {
        this.catalogHeader = catalogHeaderDetailsResponse;
    }

    public final void setDoublePages(@C12579k List<CatalogDoublePageResponse> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.doublePages = list;
    }

    public final void setSlug(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slug = str;
    }

    @C12579k
    public String toString() {
        CatalogHeaderDetailsResponse catalogHeaderDetailsResponse = this.catalogHeader;
        String str = this.slug;
        List<CatalogDoublePageResponse> list = this.doublePages;
        return "CatalogFullDetailsResponse(catalogHeader=" + catalogHeaderDetailsResponse + ", slug=" + str + ", doublePages=" + list + ")";
    }

    public CatalogFullDetailsResponse(@C12580l CatalogHeaderDetailsResponse catalogHeaderDetailsResponse, @C12579k String str, @C12579k List<CatalogDoublePageResponse> list) {
        Intrinsics.checkNotNullParameter(str, "slug");
        Intrinsics.checkNotNullParameter(list, "doublePages");
        this.catalogHeader = catalogHeaderDetailsResponse;
        this.slug = str;
        this.doublePages = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogFullDetailsResponse(CatalogHeaderDetailsResponse catalogHeaderDetailsResponse, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catalogHeaderDetailsResponse, (i & 2) != 0 ? new String() : str, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
