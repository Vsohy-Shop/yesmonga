package com.carrefour.fid.android.catalogs.data.api.entities.responses;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/CatalogResponse;", "", "data", "", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/CatalogHeaderResponse;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CatalogResponse {
    @C33608c("catalog_headers")
    @C12580l
    private final List<CatalogHeaderResponse> data;

    public CatalogResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogResponse copy$default(CatalogResponse catalogResponse, List<CatalogHeaderResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = catalogResponse.data;
        }
        return catalogResponse.copy(list);
    }

    @C12580l
    public final List<CatalogHeaderResponse> component1() {
        return this.data;
    }

    @C12579k
    public final CatalogResponse copy(@C12580l List<CatalogHeaderResponse> list) {
        return new CatalogResponse(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogResponse) && Intrinsics.areEqual((Object) this.data, (Object) ((CatalogResponse) obj).data);
    }

    @C12580l
    public final List<CatalogHeaderResponse> getData() {
        return this.data;
    }

    public int hashCode() {
        List<CatalogHeaderResponse> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @C12579k
    public String toString() {
        List<CatalogHeaderResponse> list = this.data;
        return "CatalogResponse(data=" + list + ")";
    }

    public CatalogResponse(@C12580l List<CatalogHeaderResponse> list) {
        this.data = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
