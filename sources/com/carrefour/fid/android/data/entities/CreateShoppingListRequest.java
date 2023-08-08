package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36186q;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CreateShoppingListRequest;", "", "shoppingListLabel", "", "shoppingListDescription", "shoppingListType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShoppingListDescription", "()Ljava/lang/String;", "getShoppingListLabel", "getShoppingListType", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public class CreateShoppingListRequest {
    public static final int $stable = 0;
    @C33608c("description")
    @C12579k
    private final String shoppingListDescription;
    @C33608c("label")
    @C12579k
    private final String shoppingListLabel;
    @C33608c("shopping_list_type")
    @C12579k
    private final String shoppingListType;

    public CreateShoppingListRequest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @C12579k
    public final String getShoppingListDescription() {
        return this.shoppingListDescription;
    }

    @C12579k
    public final String getShoppingListLabel() {
        return this.shoppingListLabel;
    }

    @C12579k
    public final String getShoppingListType() {
        return this.shoppingListType;
    }

    public CreateShoppingListRequest(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "shoppingListLabel");
        Intrinsics.checkNotNullParameter(str2, "shoppingListDescription");
        Intrinsics.checkNotNullParameter(str3, "shoppingListType");
        this.shoppingListLabel = str;
        this.shoppingListDescription = str2;
        this.shoppingListType = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateShoppingListRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "STD List" : str, (i & 2) != 0 ? "STD List" : str2, (i & 4) != 0 ? C36186q.f89346a : str3);
    }
}
