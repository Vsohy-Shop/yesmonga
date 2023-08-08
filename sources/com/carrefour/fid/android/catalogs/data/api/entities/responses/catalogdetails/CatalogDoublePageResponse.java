package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogDoublePageResponse;", "", "leftPage", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogPageResponse;", "rightPage", "(Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogPageResponse;Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogPageResponse;)V", "getLeftPage", "()Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogPageResponse;", "getRightPage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CatalogDoublePageResponse {
    @C33608c("left_page")
    @C12580l
    private final CatalogPageResponse leftPage;
    @C33608c("right_page")
    @C12580l
    private final CatalogPageResponse rightPage;

    public CatalogDoublePageResponse() {
        this((CatalogPageResponse) null, (CatalogPageResponse) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogDoublePageResponse copy$default(CatalogDoublePageResponse catalogDoublePageResponse, CatalogPageResponse catalogPageResponse, CatalogPageResponse catalogPageResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            catalogPageResponse = catalogDoublePageResponse.leftPage;
        }
        if ((i & 2) != 0) {
            catalogPageResponse2 = catalogDoublePageResponse.rightPage;
        }
        return catalogDoublePageResponse.copy(catalogPageResponse, catalogPageResponse2);
    }

    @C12580l
    public final CatalogPageResponse component1() {
        return this.leftPage;
    }

    @C12580l
    public final CatalogPageResponse component2() {
        return this.rightPage;
    }

    @C12579k
    public final CatalogDoublePageResponse copy(@C12580l CatalogPageResponse catalogPageResponse, @C12580l CatalogPageResponse catalogPageResponse2) {
        return new CatalogDoublePageResponse(catalogPageResponse, catalogPageResponse2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogDoublePageResponse)) {
            return false;
        }
        CatalogDoublePageResponse catalogDoublePageResponse = (CatalogDoublePageResponse) obj;
        return Intrinsics.areEqual((Object) this.leftPage, (Object) catalogDoublePageResponse.leftPage) && Intrinsics.areEqual((Object) this.rightPage, (Object) catalogDoublePageResponse.rightPage);
    }

    @C12580l
    public final CatalogPageResponse getLeftPage() {
        return this.leftPage;
    }

    @C12580l
    public final CatalogPageResponse getRightPage() {
        return this.rightPage;
    }

    public int hashCode() {
        CatalogPageResponse catalogPageResponse = this.leftPage;
        int i = 0;
        int hashCode = (catalogPageResponse == null ? 0 : catalogPageResponse.hashCode()) * 31;
        CatalogPageResponse catalogPageResponse2 = this.rightPage;
        if (catalogPageResponse2 != null) {
            i = catalogPageResponse2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        CatalogPageResponse catalogPageResponse = this.leftPage;
        CatalogPageResponse catalogPageResponse2 = this.rightPage;
        return "CatalogDoublePageResponse(leftPage=" + catalogPageResponse + ", rightPage=" + catalogPageResponse2 + ")";
    }

    public CatalogDoublePageResponse(@C12580l CatalogPageResponse catalogPageResponse, @C12580l CatalogPageResponse catalogPageResponse2) {
        this.leftPage = catalogPageResponse;
        this.rightPage = catalogPageResponse2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogDoublePageResponse(CatalogPageResponse catalogPageResponse, CatalogPageResponse catalogPageResponse2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catalogPageResponse, (i & 2) != 0 ? null : catalogPageResponse2);
    }
}
