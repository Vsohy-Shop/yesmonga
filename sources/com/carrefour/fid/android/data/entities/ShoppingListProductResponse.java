package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import androidx.transition.C20606h0;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListProductResponse;", "", "itemId", "", "itemType", "label", "description", "gtin", "lastUpdateDate", "creationDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreationDate", "()Ljava/lang/String;", "getDescription", "getGtin", "getItemId", "getItemType", "getLabel", "getLastUpdateDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListProductResponse {
    public static final int $stable = 0;
    @C33608c("creation_date")
    @C12579k
    private final String creationDate;
    @C33608c("description")
    @C12579k
    private final String description;
    @C33608c("gtin")
    @C12579k
    private final String gtin;
    @C33608c("item_id")
    @C12579k
    private final String itemId;
    @C33608c("item_type")
    @C12579k
    private final String itemType;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("last_update_date")
    @C12579k
    private final String lastUpdateDate;

    public ShoppingListProductResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListProductResponse copy$default(ShoppingListProductResponse shoppingListProductResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingListProductResponse.itemId;
        }
        if ((i & 2) != 0) {
            str2 = shoppingListProductResponse.itemType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = shoppingListProductResponse.label;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = shoppingListProductResponse.description;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = shoppingListProductResponse.gtin;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = shoppingListProductResponse.lastUpdateDate;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = shoppingListProductResponse.creationDate;
        }
        return shoppingListProductResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @C12579k
    public final String component1() {
        return this.itemId;
    }

    @C12579k
    public final String component2() {
        return this.itemType;
    }

    @C12579k
    public final String component3() {
        return this.label;
    }

    @C12579k
    public final String component4() {
        return this.description;
    }

    @C12579k
    public final String component5() {
        return this.gtin;
    }

    @C12579k
    public final String component6() {
        return this.lastUpdateDate;
    }

    @C12579k
    public final String component7() {
        return this.creationDate;
    }

    @C12579k
    public final ShoppingListProductResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, C20606h0.f53119g1);
        Intrinsics.checkNotNullParameter(str2, "itemType");
        Intrinsics.checkNotNullParameter(str3, "label");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "gtin");
        Intrinsics.checkNotNullParameter(str6, "lastUpdateDate");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "creationDate");
        return new ShoppingListProductResponse(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListProductResponse)) {
            return false;
        }
        ShoppingListProductResponse shoppingListProductResponse = (ShoppingListProductResponse) obj;
        return Intrinsics.areEqual((Object) this.itemId, (Object) shoppingListProductResponse.itemId) && Intrinsics.areEqual((Object) this.itemType, (Object) shoppingListProductResponse.itemType) && Intrinsics.areEqual((Object) this.label, (Object) shoppingListProductResponse.label) && Intrinsics.areEqual((Object) this.description, (Object) shoppingListProductResponse.description) && Intrinsics.areEqual((Object) this.gtin, (Object) shoppingListProductResponse.gtin) && Intrinsics.areEqual((Object) this.lastUpdateDate, (Object) shoppingListProductResponse.lastUpdateDate) && Intrinsics.areEqual((Object) this.creationDate, (Object) shoppingListProductResponse.creationDate);
    }

    @C12579k
    public final String getCreationDate() {
        return this.creationDate;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getGtin() {
        return this.gtin;
    }

    @C12579k
    public final String getItemId() {
        return this.itemId;
    }

    @C12579k
    public final String getItemType() {
        return this.itemType;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12579k
    public final String getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public int hashCode() {
        return (((((((((((this.itemId.hashCode() * 31) + this.itemType.hashCode()) * 31) + this.label.hashCode()) * 31) + this.description.hashCode()) * 31) + this.gtin.hashCode()) * 31) + this.lastUpdateDate.hashCode()) * 31) + this.creationDate.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.itemId;
        String str2 = this.itemType;
        String str3 = this.label;
        String str4 = this.description;
        String str5 = this.gtin;
        String str6 = this.lastUpdateDate;
        String str7 = this.creationDate;
        return "ShoppingListProductResponse(itemId=" + str + ", itemType=" + str2 + ", label=" + str3 + ", description=" + str4 + ", gtin=" + str5 + ", lastUpdateDate=" + str6 + ", creationDate=" + str7 + ")";
    }

    public ShoppingListProductResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, C20606h0.f53119g1);
        Intrinsics.checkNotNullParameter(str2, "itemType");
        Intrinsics.checkNotNullParameter(str3, "label");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "gtin");
        Intrinsics.checkNotNullParameter(str6, "lastUpdateDate");
        Intrinsics.checkNotNullParameter(str7, "creationDate");
        this.itemId = str;
        this.itemType = str2;
        this.label = str3;
        this.description = str4;
        this.gtin = str5;
        this.lastUpdateDate = str6;
        this.creationDate = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShoppingListProductResponse(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            java.lang.String r0 = ""
            if (r15 == 0) goto L_0x0008
            r15 = r0
            goto L_0x0009
        L_0x0008:
            r15 = r7
        L_0x0009:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r10
        L_0x001e:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002b
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = r12
        L_0x002c:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0032
            r14 = r0
            goto L_0x0033
        L_0x0032:
            r14 = r13
        L_0x0033:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.ShoppingListProductResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
