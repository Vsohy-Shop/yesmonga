package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMDepartmentsBody;", "", "catalog", "", "", "mergeCatalogs", "", "treeNodeFilter", "Lcom/carrefour/fid/android/data/entities/APIMTreeNodeFilterBody;", "(Ljava/util/List;ZLcom/carrefour/fid/android/data/entities/APIMTreeNodeFilterBody;)V", "getCatalog", "()Ljava/util/List;", "getMergeCatalogs", "()Z", "getTreeNodeFilter", "()Lcom/carrefour/fid/android/data/entities/APIMTreeNodeFilterBody;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMDepartmentsBody {
    public static final int $stable = 8;
    @C33608c("catalog")
    @C12579k
    private final List<String> catalog;
    @C33608c("merge_catalogs")
    private final boolean mergeCatalogs;
    @C33608c("treeNodeFilter")
    @C12579k
    private final APIMTreeNodeFilterBody treeNodeFilter;

    public APIMDepartmentsBody(@C12579k List<String> list, boolean z, @C12579k APIMTreeNodeFilterBody aPIMTreeNodeFilterBody) {
        Intrinsics.checkNotNullParameter(list, "catalog");
        Intrinsics.checkNotNullParameter(aPIMTreeNodeFilterBody, "treeNodeFilter");
        this.catalog = list;
        this.mergeCatalogs = z;
        this.treeNodeFilter = aPIMTreeNodeFilterBody;
    }

    public static /* synthetic */ APIMDepartmentsBody copy$default(APIMDepartmentsBody aPIMDepartmentsBody, List<String> list, boolean z, APIMTreeNodeFilterBody aPIMTreeNodeFilterBody, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aPIMDepartmentsBody.catalog;
        }
        if ((i & 2) != 0) {
            z = aPIMDepartmentsBody.mergeCatalogs;
        }
        if ((i & 4) != 0) {
            aPIMTreeNodeFilterBody = aPIMDepartmentsBody.treeNodeFilter;
        }
        return aPIMDepartmentsBody.copy(list, z, aPIMTreeNodeFilterBody);
    }

    @C12579k
    public final List<String> component1() {
        return this.catalog;
    }

    public final boolean component2() {
        return this.mergeCatalogs;
    }

    @C12579k
    public final APIMTreeNodeFilterBody component3() {
        return this.treeNodeFilter;
    }

    @C12579k
    public final APIMDepartmentsBody copy(@C12579k List<String> list, boolean z, @C12579k APIMTreeNodeFilterBody aPIMTreeNodeFilterBody) {
        Intrinsics.checkNotNullParameter(list, "catalog");
        Intrinsics.checkNotNullParameter(aPIMTreeNodeFilterBody, "treeNodeFilter");
        return new APIMDepartmentsBody(list, z, aPIMTreeNodeFilterBody);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMDepartmentsBody)) {
            return false;
        }
        APIMDepartmentsBody aPIMDepartmentsBody = (APIMDepartmentsBody) obj;
        return Intrinsics.areEqual((Object) this.catalog, (Object) aPIMDepartmentsBody.catalog) && this.mergeCatalogs == aPIMDepartmentsBody.mergeCatalogs && Intrinsics.areEqual((Object) this.treeNodeFilter, (Object) aPIMDepartmentsBody.treeNodeFilter);
    }

    @C12579k
    public final List<String> getCatalog() {
        return this.catalog;
    }

    public final boolean getMergeCatalogs() {
        return this.mergeCatalogs;
    }

    @C12579k
    public final APIMTreeNodeFilterBody getTreeNodeFilter() {
        return this.treeNodeFilter;
    }

    public int hashCode() {
        int hashCode = this.catalog.hashCode() * 31;
        boolean z = this.mergeCatalogs;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.treeNodeFilter.hashCode();
    }

    @C12579k
    public String toString() {
        List<String> list = this.catalog;
        boolean z = this.mergeCatalogs;
        APIMTreeNodeFilterBody aPIMTreeNodeFilterBody = this.treeNodeFilter;
        return "APIMDepartmentsBody(catalog=" + list + ", mergeCatalogs=" + z + ", treeNodeFilter=" + aPIMTreeNodeFilterBody + ")";
    }
}
