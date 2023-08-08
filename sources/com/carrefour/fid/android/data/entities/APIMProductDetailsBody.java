package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMProductDetailsBody;", "", "facilityServiceIds", "", "", "gtins", "count", "", "page", "(Ljava/util/List;Ljava/util/List;II)V", "getCount", "()I", "getFacilityServiceIds", "()Ljava/util/List;", "getGtins", "getPage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMProductDetailsBody {
    public static final int $stable = 8;
    @C33608c("count")
    private final int count;
    @C33608c("facility_service_ids")
    @C12579k
    private final List<String> facilityServiceIds;
    @C33608c("gtins")
    @C12579k
    private final List<String> gtins;
    @C33608c("page")
    private final int page;

    public APIMProductDetailsBody(@C12579k List<String> list, @C12579k List<String> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
        Intrinsics.checkNotNullParameter(list2, "gtins");
        this.facilityServiceIds = list;
        this.gtins = list2;
        this.count = i;
        this.page = i2;
    }

    public static /* synthetic */ APIMProductDetailsBody copy$default(APIMProductDetailsBody aPIMProductDetailsBody, List<String> list, List<String> list2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = aPIMProductDetailsBody.facilityServiceIds;
        }
        if ((i3 & 2) != 0) {
            list2 = aPIMProductDetailsBody.gtins;
        }
        if ((i3 & 4) != 0) {
            i = aPIMProductDetailsBody.count;
        }
        if ((i3 & 8) != 0) {
            i2 = aPIMProductDetailsBody.page;
        }
        return aPIMProductDetailsBody.copy(list, list2, i, i2);
    }

    @C12579k
    public final List<String> component1() {
        return this.facilityServiceIds;
    }

    @C12579k
    public final List<String> component2() {
        return this.gtins;
    }

    public final int component3() {
        return this.count;
    }

    public final int component4() {
        return this.page;
    }

    @C12579k
    public final APIMProductDetailsBody copy(@C12579k List<String> list, @C12579k List<String> list2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
        Intrinsics.checkNotNullParameter(list2, "gtins");
        return new APIMProductDetailsBody(list, list2, i, i2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMProductDetailsBody)) {
            return false;
        }
        APIMProductDetailsBody aPIMProductDetailsBody = (APIMProductDetailsBody) obj;
        return Intrinsics.areEqual((Object) this.facilityServiceIds, (Object) aPIMProductDetailsBody.facilityServiceIds) && Intrinsics.areEqual((Object) this.gtins, (Object) aPIMProductDetailsBody.gtins) && this.count == aPIMProductDetailsBody.count && this.page == aPIMProductDetailsBody.page;
    }

    public final int getCount() {
        return this.count;
    }

    @C12579k
    public final List<String> getFacilityServiceIds() {
        return this.facilityServiceIds;
    }

    @C12579k
    public final List<String> getGtins() {
        return this.gtins;
    }

    public final int getPage() {
        return this.page;
    }

    public int hashCode() {
        return (((((this.facilityServiceIds.hashCode() * 31) + this.gtins.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.page);
    }

    @C12579k
    public String toString() {
        List<String> list = this.facilityServiceIds;
        List<String> list2 = this.gtins;
        int i = this.count;
        int i2 = this.page;
        return "APIMProductDetailsBody(facilityServiceIds=" + list + ", gtins=" + list2 + ", count=" + i + ", page=" + i2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMProductDetailsBody(List list, List list2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, i, (i3 & 8) != 0 ? 0 : i2);
    }
}
