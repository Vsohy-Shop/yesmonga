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

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListResponse;", "", "shoppingListNumber", "", "shoppingList", "", "Lcom/carrefour/fid/android/data/entities/ShoppingListItemResponse;", "(ILjava/util/List;)V", "getShoppingList", "()Ljava/util/List;", "getShoppingListNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListResponse {
    public static final int $stable = 8;
    @C33608c("shopping_lists")
    @C12580l
    private final List<ShoppingListItemResponse> shoppingList;
    @C33608c("number_of_shopping_lists")
    private final int shoppingListNumber;

    public ShoppingListResponse() {
        this(0, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListResponse copy$default(ShoppingListResponse shoppingListResponse, int i, List<ShoppingListItemResponse> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shoppingListResponse.shoppingListNumber;
        }
        if ((i2 & 2) != 0) {
            list = shoppingListResponse.shoppingList;
        }
        return shoppingListResponse.copy(i, list);
    }

    public final int component1() {
        return this.shoppingListNumber;
    }

    @C12580l
    public final List<ShoppingListItemResponse> component2() {
        return this.shoppingList;
    }

    @C12579k
    public final ShoppingListResponse copy(int i, @C12580l List<ShoppingListItemResponse> list) {
        return new ShoppingListResponse(i, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListResponse)) {
            return false;
        }
        ShoppingListResponse shoppingListResponse = (ShoppingListResponse) obj;
        return this.shoppingListNumber == shoppingListResponse.shoppingListNumber && Intrinsics.areEqual((Object) this.shoppingList, (Object) shoppingListResponse.shoppingList);
    }

    @C12580l
    public final List<ShoppingListItemResponse> getShoppingList() {
        return this.shoppingList;
    }

    public final int getShoppingListNumber() {
        return this.shoppingListNumber;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.shoppingListNumber) * 31;
        List<ShoppingListItemResponse> list = this.shoppingList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @C12579k
    public String toString() {
        int i = this.shoppingListNumber;
        List<ShoppingListItemResponse> list = this.shoppingList;
        return "ShoppingListResponse(shoppingListNumber=" + i + ", shoppingList=" + list + ")";
    }

    public ShoppingListResponse(int i, @C12580l List<ShoppingListItemResponse> list) {
        this.shoppingListNumber = i;
        this.shoppingList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingListResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
