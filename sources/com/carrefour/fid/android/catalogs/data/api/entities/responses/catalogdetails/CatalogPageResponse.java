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

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogPageResponse;", "", "", "component1", "", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/a;", "component2", "component3", "num", "area", "pageUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getNum", "()Ljava/lang/String;", "Ljava/util/List;", "getArea", "()Ljava/util/List;", "getPageUrl", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class CatalogPageResponse {
    @C33608c("areas")
    @C12579k
    private final List<C39398a> area;
    @C33608c("num")
    @C12579k
    private final String num;
    @C33608c("page_url")
    @C12579k
    private final String pageUrl;

    public CatalogPageResponse() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogPageResponse copy$default(CatalogPageResponse catalogPageResponse, String str, List<C39398a> list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogPageResponse.num;
        }
        if ((i & 2) != 0) {
            list = catalogPageResponse.area;
        }
        if ((i & 4) != 0) {
            str2 = catalogPageResponse.pageUrl;
        }
        return catalogPageResponse.copy(str, list, str2);
    }

    @C12579k
    public final String component1() {
        return this.num;
    }

    @C12579k
    public final List<C39398a> component2() {
        return this.area;
    }

    @C12579k
    public final String component3() {
        return this.pageUrl;
    }

    @C12579k
    public final CatalogPageResponse copy(@C12579k String str, @C12579k List<C39398a> list, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(list, "area");
        Intrinsics.checkNotNullParameter(str2, "pageUrl");
        return new CatalogPageResponse(str, list, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPageResponse)) {
            return false;
        }
        CatalogPageResponse catalogPageResponse = (CatalogPageResponse) obj;
        return Intrinsics.areEqual((Object) this.num, (Object) catalogPageResponse.num) && Intrinsics.areEqual((Object) this.area, (Object) catalogPageResponse.area) && Intrinsics.areEqual((Object) this.pageUrl, (Object) catalogPageResponse.pageUrl);
    }

    @C12579k
    public final List<C39398a> getArea() {
        return this.area;
    }

    @C12579k
    public final String getNum() {
        return this.num;
    }

    @C12579k
    public final String getPageUrl() {
        return this.pageUrl;
    }

    public int hashCode() {
        return (((this.num.hashCode() * 31) + this.area.hashCode()) * 31) + this.pageUrl.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.num;
        List<C39398a> list = this.area;
        String str2 = this.pageUrl;
        return "CatalogPageResponse(num=" + str + ", area=" + list + ", pageUrl=" + str2 + ")";
    }

    public CatalogPageResponse(@C12579k String str, @C12579k List<C39398a> list, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(list, "area");
        Intrinsics.checkNotNullParameter(str2, "pageUrl");
        this.num = str;
        this.area = list;
        this.pageUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogPageResponse(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? new String() : str2);
    }
}
