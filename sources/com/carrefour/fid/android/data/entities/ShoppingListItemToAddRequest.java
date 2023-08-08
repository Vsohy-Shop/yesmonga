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

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ShoppingListItemToAddRequest;", "", "additionSource", "", "description", "ean", "itemType", "label", "quantity", "", "itemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAdditionSource", "()Ljava/lang/String;", "getDescription", "getEan", "getItemId", "getItemType", "getLabel", "getQuantity", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ShoppingListItemToAddRequest {
    public static final int $stable = 0;
    @C33608c("addition_source")
    @C12579k
    private final String additionSource;
    @C33608c("description")
    @C12579k
    private final String description;
    @C33608c("gtin")
    @C12579k
    private final String ean;
    @C33608c("item_id")
    @C12579k
    private final String itemId;
    @C33608c("item_type")
    @C12579k
    private final String itemType;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("quantity")
    private final int quantity;

    public ShoppingListItemToAddRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShoppingListItemToAddRequest copy$default(ShoppingListItemToAddRequest shoppingListItemToAddRequest, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shoppingListItemToAddRequest.additionSource;
        }
        if ((i2 & 2) != 0) {
            str2 = shoppingListItemToAddRequest.description;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = shoppingListItemToAddRequest.ean;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = shoppingListItemToAddRequest.itemType;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = shoppingListItemToAddRequest.label;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            i = shoppingListItemToAddRequest.quantity;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            str6 = shoppingListItemToAddRequest.itemId;
        }
        return shoppingListItemToAddRequest.copy(str, str7, str8, str9, str10, i3, str6);
    }

    @C12579k
    public final String component1() {
        return this.additionSource;
    }

    @C12579k
    public final String component2() {
        return this.description;
    }

    @C12579k
    public final String component3() {
        return this.ean;
    }

    @C12579k
    public final String component4() {
        return this.itemType;
    }

    @C12579k
    public final String component5() {
        return this.label;
    }

    public final int component6() {
        return this.quantity;
    }

    @C12579k
    public final String component7() {
        return this.itemId;
    }

    @C12579k
    public final ShoppingListItemToAddRequest copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, int i, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "additionSource");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "ean");
        Intrinsics.checkNotNullParameter(str4, "itemType");
        Intrinsics.checkNotNullParameter(str5, "label");
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, C20606h0.f53119g1);
        return new ShoppingListItemToAddRequest(str, str2, str3, str4, str5, i, str7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingListItemToAddRequest)) {
            return false;
        }
        ShoppingListItemToAddRequest shoppingListItemToAddRequest = (ShoppingListItemToAddRequest) obj;
        return Intrinsics.areEqual((Object) this.additionSource, (Object) shoppingListItemToAddRequest.additionSource) && Intrinsics.areEqual((Object) this.description, (Object) shoppingListItemToAddRequest.description) && Intrinsics.areEqual((Object) this.ean, (Object) shoppingListItemToAddRequest.ean) && Intrinsics.areEqual((Object) this.itemType, (Object) shoppingListItemToAddRequest.itemType) && Intrinsics.areEqual((Object) this.label, (Object) shoppingListItemToAddRequest.label) && this.quantity == shoppingListItemToAddRequest.quantity && Intrinsics.areEqual((Object) this.itemId, (Object) shoppingListItemToAddRequest.itemId);
    }

    @C12579k
    public final String getAdditionSource() {
        return this.additionSource;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getEan() {
        return this.ean;
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

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((((((((((this.additionSource.hashCode() * 31) + this.description.hashCode()) * 31) + this.ean.hashCode()) * 31) + this.itemType.hashCode()) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + this.itemId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.additionSource;
        String str2 = this.description;
        String str3 = this.ean;
        String str4 = this.itemType;
        String str5 = this.label;
        int i = this.quantity;
        String str6 = this.itemId;
        return "ShoppingListItemToAddRequest(additionSource=" + str + ", description=" + str2 + ", ean=" + str3 + ", itemType=" + str4 + ", label=" + str5 + ", quantity=" + i + ", itemId=" + str6 + ")";
    }

    public ShoppingListItemToAddRequest(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, int i, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "additionSource");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "ean");
        Intrinsics.checkNotNullParameter(str4, "itemType");
        Intrinsics.checkNotNullParameter(str5, "label");
        Intrinsics.checkNotNullParameter(str6, C20606h0.f53119g1);
        this.additionSource = str;
        this.description = str2;
        this.ean = str3;
        this.itemType = str4;
        this.label = str5;
        this.quantity = i;
        this.itemId = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShoppingListItemToAddRequest(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
            if (r7 == 0) goto L_0x002a
            r12 = 1
        L_0x002a:
            r5 = r12
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.ShoppingListItemToAddRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
