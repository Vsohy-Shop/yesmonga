package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListItemResponse;", "", "shoppingListLabel", "", "shoppingListType", "shoppingListNumberItems", "", "shoppingListId", "lastUpdateDate", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLastUpdateDate", "()Ljava/lang/String;", "getShoppingListId", "getShoppingListLabel", "getShoppingListNumberItems", "()I", "getShoppingListType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListItemResponse {
    public static final int $stable = 0;
    @C33608c("last_update_date")
    @C12579k
    private final String lastUpdateDate;
    @C33608c("shopping_list_id")
    @C12579k
    private final String shoppingListId;
    @C33608c("label")
    @C12579k
    private final String shoppingListLabel;
    @C33608c("number_of_items")
    private final int shoppingListNumberItems;
    @C33608c("shopping_list_type")
    @C12579k
    private final String shoppingListType;

    public ShoppingListItemResponse() {
        this((String) null, (String) null, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListItemResponse copy$default(ShoppingListItemResponse shoppingListItemResponse, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingListItemResponse.shoppingListLabel;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingListItemResponse.shoppingListType;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = shoppingListItemResponse.shoppingListNumberItems;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = shoppingListItemResponse.shoppingListId;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = shoppingListItemResponse.lastUpdateDate;
        }
        return shoppingListItemResponse.copy(str, str5, i3, str6, str4);
    }

    @C12579k
    public final String component1() {
        return this.shoppingListLabel;
    }

    @C12579k
    public final String component2() {
        return this.shoppingListType;
    }

    public final int component3() {
        return this.shoppingListNumberItems;
    }

    @C12579k
    public final String component4() {
        return this.shoppingListId;
    }

    @C12579k
    public final String component5() {
        return this.lastUpdateDate;
    }

    @C12579k
    public final ShoppingListItemResponse copy(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "shoppingListLabel");
        Intrinsics.checkNotNullParameter(str2, "shoppingListType");
        Intrinsics.checkNotNullParameter(str3, "shoppingListId");
        Intrinsics.checkNotNullParameter(str4, "lastUpdateDate");
        return new ShoppingListItemResponse(str, str2, i, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListItemResponse)) {
            return false;
        }
        ShoppingListItemResponse shoppingListItemResponse = (ShoppingListItemResponse) obj;
        return Intrinsics.areEqual((Object) this.shoppingListLabel, (Object) shoppingListItemResponse.shoppingListLabel) && Intrinsics.areEqual((Object) this.shoppingListType, (Object) shoppingListItemResponse.shoppingListType) && this.shoppingListNumberItems == shoppingListItemResponse.shoppingListNumberItems && Intrinsics.areEqual((Object) this.shoppingListId, (Object) shoppingListItemResponse.shoppingListId) && Intrinsics.areEqual((Object) this.lastUpdateDate, (Object) shoppingListItemResponse.lastUpdateDate);
    }

    @C12579k
    public final String getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    @C12579k
    public final String getShoppingListId() {
        return this.shoppingListId;
    }

    @C12579k
    public final String getShoppingListLabel() {
        return this.shoppingListLabel;
    }

    public final int getShoppingListNumberItems() {
        return this.shoppingListNumberItems;
    }

    @C12579k
    public final String getShoppingListType() {
        return this.shoppingListType;
    }

    public int hashCode() {
        return (((((((this.shoppingListLabel.hashCode() * 31) + this.shoppingListType.hashCode()) * 31) + Integer.hashCode(this.shoppingListNumberItems)) * 31) + this.shoppingListId.hashCode()) * 31) + this.lastUpdateDate.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.shoppingListLabel;
        String str2 = this.shoppingListType;
        int i = this.shoppingListNumberItems;
        String str3 = this.shoppingListId;
        String str4 = this.lastUpdateDate;
        return "ShoppingListItemResponse(shoppingListLabel=" + str + ", shoppingListType=" + str2 + ", shoppingListNumberItems=" + i + ", shoppingListId=" + str3 + ", lastUpdateDate=" + str4 + ")";
    }

    public ShoppingListItemResponse(@C12579k String str, @C12579k String str2, int i, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "shoppingListLabel");
        Intrinsics.checkNotNullParameter(str2, "shoppingListType");
        Intrinsics.checkNotNullParameter(str3, "shoppingListId");
        Intrinsics.checkNotNullParameter(str4, "lastUpdateDate");
        this.shoppingListLabel = str;
        this.shoppingListType = str2;
        this.shoppingListNumberItems = i;
        this.shoppingListId = str3;
        this.lastUpdateDate = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShoppingListItemResponse(java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x0008
            r11 = r0
            goto L_0x0009
        L_0x0008:
            r11 = r5
        L_0x0009:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r7 = 0
        L_0x0015:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.ShoppingListItemResponse.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
