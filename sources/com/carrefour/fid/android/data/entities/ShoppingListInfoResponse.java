package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListInfoResponse;", "", "shoppingListId", "", "libelleList", "shopping_list_type", "numberOfItems", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getLibelleList", "()Ljava/lang/String;", "getNumberOfItems", "()I", "getShoppingListId", "getShopping_list_type", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListInfoResponse {
    public static final int $stable = 0;
    @C33608c("label")
    @C12579k
    private final String libelleList;
    @C33608c("number_of_items")
    private final int numberOfItems;
    @C33608c("shopping_list_id")
    @C12579k
    private final String shoppingListId;
    @C33608c("shopping_list_type")
    @C12579k
    private final String shopping_list_type;

    public ShoppingListInfoResponse() {
        this((String) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListInfoResponse copy$default(ShoppingListInfoResponse shoppingListInfoResponse, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingListInfoResponse.shoppingListId;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingListInfoResponse.libelleList;
        }
        if ((i2 & 4) != 0) {
            str3 = shoppingListInfoResponse.shopping_list_type;
        }
        if ((i2 & 8) != 0) {
            i = shoppingListInfoResponse.numberOfItems;
        }
        return shoppingListInfoResponse.copy(str, str2, str3, i);
    }

    @C12579k
    public final String component1() {
        return this.shoppingListId;
    }

    @C12579k
    public final String component2() {
        return this.libelleList;
    }

    @C12579k
    public final String component3() {
        return this.shopping_list_type;
    }

    public final int component4() {
        return this.numberOfItems;
    }

    @C12579k
    public final ShoppingListInfoResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "shoppingListId");
        Intrinsics.checkNotNullParameter(str2, "libelleList");
        Intrinsics.checkNotNullParameter(str3, "shopping_list_type");
        return new ShoppingListInfoResponse(str, str2, str3, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListInfoResponse)) {
            return false;
        }
        ShoppingListInfoResponse shoppingListInfoResponse = (ShoppingListInfoResponse) obj;
        return Intrinsics.areEqual((Object) this.shoppingListId, (Object) shoppingListInfoResponse.shoppingListId) && Intrinsics.areEqual((Object) this.libelleList, (Object) shoppingListInfoResponse.libelleList) && Intrinsics.areEqual((Object) this.shopping_list_type, (Object) shoppingListInfoResponse.shopping_list_type) && this.numberOfItems == shoppingListInfoResponse.numberOfItems;
    }

    @C12579k
    public final String getLibelleList() {
        return this.libelleList;
    }

    public final int getNumberOfItems() {
        return this.numberOfItems;
    }

    @C12579k
    public final String getShoppingListId() {
        return this.shoppingListId;
    }

    @C12579k
    public final String getShopping_list_type() {
        return this.shopping_list_type;
    }

    public int hashCode() {
        return (((((this.shoppingListId.hashCode() * 31) + this.libelleList.hashCode()) * 31) + this.shopping_list_type.hashCode()) * 31) + Integer.hashCode(this.numberOfItems);
    }

    @C12579k
    public String toString() {
        String str = this.shoppingListId;
        String str2 = this.libelleList;
        String str3 = this.shopping_list_type;
        int i = this.numberOfItems;
        return "ShoppingListInfoResponse(shoppingListId=" + str + ", libelleList=" + str2 + ", shopping_list_type=" + str3 + ", numberOfItems=" + i + ")";
    }

    public ShoppingListInfoResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "shoppingListId");
        Intrinsics.checkNotNullParameter(str2, "libelleList");
        Intrinsics.checkNotNullParameter(str3, "shopping_list_type");
        this.shoppingListId = str;
        this.libelleList = str2;
        this.shopping_list_type = str3;
        this.numberOfItems = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingListInfoResponse(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
