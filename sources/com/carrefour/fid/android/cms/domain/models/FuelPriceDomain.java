package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/FuelPriceDomain;", "", "name", "", "code", "fuelId", "price", "updateDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getFuelId", "getName", "getPrice", "getUpdateDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FuelPriceDomain {
    @C12579k
    private final String code;
    @C12579k
    private final String fuelId;
    @C12579k
    private final String name;
    @C12579k
    private final String price;
    @C12579k
    private final String updateDate;

    public FuelPriceDomain() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FuelPriceDomain copy$default(FuelPriceDomain fuelPriceDomain, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fuelPriceDomain.name;
        }
        if ((i & 2) != 0) {
            str2 = fuelPriceDomain.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fuelPriceDomain.fuelId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fuelPriceDomain.price;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fuelPriceDomain.updateDate;
        }
        return fuelPriceDomain.copy(str, str6, str7, str8, str5);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.code;
    }

    @C12579k
    public final String component3() {
        return this.fuelId;
    }

    @C12579k
    public final String component4() {
        return this.price;
    }

    @C12579k
    public final String component5() {
        return this.updateDate;
    }

    @C12579k
    public final FuelPriceDomain copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "fuelId");
        Intrinsics.checkNotNullParameter(str4, "price");
        Intrinsics.checkNotNullParameter(str5, "updateDate");
        return new FuelPriceDomain(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FuelPriceDomain)) {
            return false;
        }
        FuelPriceDomain fuelPriceDomain = (FuelPriceDomain) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) fuelPriceDomain.name) && Intrinsics.areEqual((Object) this.code, (Object) fuelPriceDomain.code) && Intrinsics.areEqual((Object) this.fuelId, (Object) fuelPriceDomain.fuelId) && Intrinsics.areEqual((Object) this.price, (Object) fuelPriceDomain.price) && Intrinsics.areEqual((Object) this.updateDate, (Object) fuelPriceDomain.updateDate);
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    @C12579k
    public final String getFuelId() {
        return this.fuelId;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getPrice() {
        return this.price;
    }

    @C12579k
    public final String getUpdateDate() {
        return this.updateDate;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.code.hashCode()) * 31) + this.fuelId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.updateDate.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.code;
        String str3 = this.fuelId;
        String str4 = this.price;
        String str5 = this.updateDate;
        return "FuelPriceDomain(name=" + str + ", code=" + str2 + ", fuelId=" + str3 + ", price=" + str4 + ", updateDate=" + str5 + ")";
    }

    public FuelPriceDomain(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "fuelId");
        Intrinsics.checkNotNullParameter(str4, "price");
        Intrinsics.checkNotNullParameter(str5, "updateDate");
        this.name = str;
        this.code = str2;
        this.fuelId = str3;
        this.price = str4;
        this.updateDate = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FuelPriceDomain(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
            if (r5 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r7
        L_0x0017:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001d
            r3 = r0
            goto L_0x001e
        L_0x001d:
            r3 = r8
        L_0x001e:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            r10 = r0
            goto L_0x0025
        L_0x0024:
            r10 = r9
        L_0x0025:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.models.FuelPriceDomain.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
