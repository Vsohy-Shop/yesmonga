package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/AddToShoppingListRequest;", "", "addItemsList", "", "Lcom/carrefour/fid/android/data/entities/ShoppingListItemToAddRequest;", "(Ljava/util/List;)V", "getAddItemsList", "()Ljava/util/List;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class AddToShoppingListRequest {
    public static final int $stable = 8;
    @C33608c("add_items_list")
    @C12580l
    private final List<ShoppingListItemToAddRequest> addItemsList;

    public AddToShoppingListRequest() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    @C12580l
    public final List<ShoppingListItemToAddRequest> getAddItemsList() {
        return this.addItemsList;
    }

    public AddToShoppingListRequest(@C12580l List<ShoppingListItemToAddRequest> list) {
        this.addItemsList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddToShoppingListRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
