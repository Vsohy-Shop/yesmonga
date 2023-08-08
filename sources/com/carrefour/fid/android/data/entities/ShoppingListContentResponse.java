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

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListContentResponse;", "", "shoppingListMetadata", "Lcom/carrefour/fid/android/data/entities/ShoppingListInfoResponse;", "items", "", "Lcom/carrefour/fid/android/data/entities/ShoppingListProductResponse;", "(Lcom/carrefour/fid/android/data/entities/ShoppingListInfoResponse;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getShoppingListMetadata", "()Lcom/carrefour/fid/android/data/entities/ShoppingListInfoResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListContentResponse {
    public static final int $stable = 8;
    @C33608c("items")
    @C12580l
    private final List<ShoppingListProductResponse> items;
    @C33608c("shopping_list_metadata")
    @C12580l
    private final ShoppingListInfoResponse shoppingListMetadata;

    public ShoppingListContentResponse() {
        this((ShoppingListInfoResponse) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListContentResponse copy$default(ShoppingListContentResponse shoppingListContentResponse, ShoppingListInfoResponse shoppingListInfoResponse, List<ShoppingListProductResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingListInfoResponse = shoppingListContentResponse.shoppingListMetadata;
        }
        if ((i & 2) != 0) {
            list = shoppingListContentResponse.items;
        }
        return shoppingListContentResponse.copy(shoppingListInfoResponse, list);
    }

    @C12580l
    public final ShoppingListInfoResponse component1() {
        return this.shoppingListMetadata;
    }

    @C12580l
    public final List<ShoppingListProductResponse> component2() {
        return this.items;
    }

    @C12579k
    public final ShoppingListContentResponse copy(@C12580l ShoppingListInfoResponse shoppingListInfoResponse, @C12580l List<ShoppingListProductResponse> list) {
        return new ShoppingListContentResponse(shoppingListInfoResponse, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListContentResponse)) {
            return false;
        }
        ShoppingListContentResponse shoppingListContentResponse = (ShoppingListContentResponse) obj;
        return Intrinsics.areEqual((Object) this.shoppingListMetadata, (Object) shoppingListContentResponse.shoppingListMetadata) && Intrinsics.areEqual((Object) this.items, (Object) shoppingListContentResponse.items);
    }

    @C12580l
    public final List<ShoppingListProductResponse> getItems() {
        return this.items;
    }

    @C12580l
    public final ShoppingListInfoResponse getShoppingListMetadata() {
        return this.shoppingListMetadata;
    }

    public int hashCode() {
        ShoppingListInfoResponse shoppingListInfoResponse = this.shoppingListMetadata;
        int i = 0;
        int hashCode = (shoppingListInfoResponse == null ? 0 : shoppingListInfoResponse.hashCode()) * 31;
        List<ShoppingListProductResponse> list = this.items;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        ShoppingListInfoResponse shoppingListInfoResponse = this.shoppingListMetadata;
        List<ShoppingListProductResponse> list = this.items;
        return "ShoppingListContentResponse(shoppingListMetadata=" + shoppingListInfoResponse + ", items=" + list + ")";
    }

    public ShoppingListContentResponse(@C12580l ShoppingListInfoResponse shoppingListInfoResponse, @C12580l List<ShoppingListProductResponse> list) {
        this.shoppingListMetadata = shoppingListInfoResponse;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingListContentResponse(ShoppingListInfoResponse shoppingListInfoResponse, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : shoppingListInfoResponse, (i & 2) != 0 ? null : list);
    }
}
