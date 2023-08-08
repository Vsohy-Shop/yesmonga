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

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsItems;", "", "error", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsErrors;", "items", "", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsItem;", "searchKeyword", "", "(Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsErrors;Ljava/util/List;Ljava/lang/String;)V", "getError", "()Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsErrors;", "getItems", "()Ljava/util/List;", "getSearchKeyword", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedNeedsItems {
    public static final int $stable = 8;
    @C33608c("errors")
    @C12580l
    private final APIMRecommendedNeedsErrors error;
    @C33608c("items")
    @C12580l
    private final List<APIMRecommendedNeedsItem> items;
    @C33608c("search_keyword")
    @C12580l
    private final String searchKeyword;

    public APIMRecommendedNeedsItems() {
        this((APIMRecommendedNeedsErrors) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APIMRecommendedNeedsItems copy$default(APIMRecommendedNeedsItems aPIMRecommendedNeedsItems, APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors, List<APIMRecommendedNeedsItem> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aPIMRecommendedNeedsErrors = aPIMRecommendedNeedsItems.error;
        }
        if ((i & 2) != 0) {
            list = aPIMRecommendedNeedsItems.items;
        }
        if ((i & 4) != 0) {
            str = aPIMRecommendedNeedsItems.searchKeyword;
        }
        return aPIMRecommendedNeedsItems.copy(aPIMRecommendedNeedsErrors, list, str);
    }

    @C12580l
    public final APIMRecommendedNeedsErrors component1() {
        return this.error;
    }

    @C12580l
    public final List<APIMRecommendedNeedsItem> component2() {
        return this.items;
    }

    @C12580l
    public final String component3() {
        return this.searchKeyword;
    }

    @C12579k
    public final APIMRecommendedNeedsItems copy(@C12580l APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors, @C12580l List<APIMRecommendedNeedsItem> list, @C12580l String str) {
        return new APIMRecommendedNeedsItems(aPIMRecommendedNeedsErrors, list, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedNeedsItems)) {
            return false;
        }
        APIMRecommendedNeedsItems aPIMRecommendedNeedsItems = (APIMRecommendedNeedsItems) obj;
        return Intrinsics.areEqual((Object) this.error, (Object) aPIMRecommendedNeedsItems.error) && Intrinsics.areEqual((Object) this.items, (Object) aPIMRecommendedNeedsItems.items) && Intrinsics.areEqual((Object) this.searchKeyword, (Object) aPIMRecommendedNeedsItems.searchKeyword);
    }

    @C12580l
    public final APIMRecommendedNeedsErrors getError() {
        return this.error;
    }

    @C12580l
    public final List<APIMRecommendedNeedsItem> getItems() {
        return this.items;
    }

    @C12580l
    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public int hashCode() {
        APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors = this.error;
        int i = 0;
        int hashCode = (aPIMRecommendedNeedsErrors == null ? 0 : aPIMRecommendedNeedsErrors.hashCode()) * 31;
        List<APIMRecommendedNeedsItem> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.searchKeyword;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors = this.error;
        List<APIMRecommendedNeedsItem> list = this.items;
        String str = this.searchKeyword;
        return "APIMRecommendedNeedsItems(error=" + aPIMRecommendedNeedsErrors + ", items=" + list + ", searchKeyword=" + str + ")";
    }

    public APIMRecommendedNeedsItems(@C12580l APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors, @C12580l List<APIMRecommendedNeedsItem> list, @C12580l String str) {
        this.error = aPIMRecommendedNeedsErrors;
        this.items = list;
        this.searchKeyword = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMRecommendedNeedsItems(APIMRecommendedNeedsErrors aPIMRecommendedNeedsErrors, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aPIMRecommendedNeedsErrors, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
