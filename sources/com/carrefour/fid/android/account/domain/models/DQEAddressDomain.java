package com.carrefour.fid.android.account.domain.models;

import androidx.annotation.Keep;
import androidx.autofill.C0861a;
import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/domain/models/DQEAddressDomain;", "", "address", "", "enterAddress", "postalCode", "city", "country", "latitude", "", "longitude", "dqeCodeDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCountry", "getDqeCodeDetail", "getEnterAddress", "getLatitude", "()D", "getLongitude", "getPostalCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class DQEAddressDomain {
    public static final int $stable = 0;
    @C12579k
    private final String address;
    @C12579k
    private final String city;
    @C12579k
    private final String country;
    @C12579k
    private final String dqeCodeDetail;
    @C12579k
    private final String enterAddress;
    private final double latitude;
    private final double longitude;
    @C12579k
    private final String postalCode;

    public DQEAddressDomain(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, double d, double d2, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "address");
        Intrinsics.checkNotNullParameter(str2, "enterAddress");
        Intrinsics.checkNotNullParameter(str3, C0861a.f2707g);
        Intrinsics.checkNotNullParameter(str4, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str5, "country");
        Intrinsics.checkNotNullParameter(str6, "dqeCodeDetail");
        this.address = str;
        this.enterAddress = str2;
        this.postalCode = str3;
        this.city = str4;
        this.country = str5;
        this.latitude = d;
        this.longitude = d2;
        this.dqeCodeDetail = str6;
    }

    public static /* synthetic */ DQEAddressDomain copy$default(DQEAddressDomain dQEAddressDomain, String str, String str2, String str3, String str4, String str5, double d, double d2, String str6, int i, Object obj) {
        DQEAddressDomain dQEAddressDomain2 = dQEAddressDomain;
        int i2 = i;
        return dQEAddressDomain.copy((i2 & 1) != 0 ? dQEAddressDomain2.address : str, (i2 & 2) != 0 ? dQEAddressDomain2.enterAddress : str2, (i2 & 4) != 0 ? dQEAddressDomain2.postalCode : str3, (i2 & 8) != 0 ? dQEAddressDomain2.city : str4, (i2 & 16) != 0 ? dQEAddressDomain2.country : str5, (i2 & 32) != 0 ? dQEAddressDomain2.latitude : d, (i2 & 64) != 0 ? dQEAddressDomain2.longitude : d2, (i2 & 128) != 0 ? dQEAddressDomain2.dqeCodeDetail : str6);
    }

    @C12579k
    public final String component1() {
        return this.address;
    }

    @C12579k
    public final String component2() {
        return this.enterAddress;
    }

    @C12579k
    public final String component3() {
        return this.postalCode;
    }

    @C12579k
    public final String component4() {
        return this.city;
    }

    @C12579k
    public final String component5() {
        return this.country;
    }

    public final double component6() {
        return this.latitude;
    }

    public final double component7() {
        return this.longitude;
    }

    @C12579k
    public final String component8() {
        return this.dqeCodeDetail;
    }

    @C12579k
    public final DQEAddressDomain copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, double d, double d2, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "address");
        Intrinsics.checkNotNullParameter(str2, "enterAddress");
        Intrinsics.checkNotNullParameter(str3, C0861a.f2707g);
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, C9650g.f26444g);
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "country");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "dqeCodeDetail");
        return new DQEAddressDomain(str, str2, str3, str7, str8, d, d2, str9);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DQEAddressDomain)) {
            return false;
        }
        DQEAddressDomain dQEAddressDomain = (DQEAddressDomain) obj;
        return Intrinsics.areEqual((Object) this.address, (Object) dQEAddressDomain.address) && Intrinsics.areEqual((Object) this.enterAddress, (Object) dQEAddressDomain.enterAddress) && Intrinsics.areEqual((Object) this.postalCode, (Object) dQEAddressDomain.postalCode) && Intrinsics.areEqual((Object) this.city, (Object) dQEAddressDomain.city) && Intrinsics.areEqual((Object) this.country, (Object) dQEAddressDomain.country) && Double.compare(this.latitude, dQEAddressDomain.latitude) == 0 && Double.compare(this.longitude, dQEAddressDomain.longitude) == 0 && Intrinsics.areEqual((Object) this.dqeCodeDetail, (Object) dQEAddressDomain.dqeCodeDetail);
    }

    @C12579k
    public final String getAddress() {
        return this.address;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getCountry() {
        return this.country;
    }

    @C12579k
    public final String getDqeCodeDetail() {
        return this.dqeCodeDetail;
    }

    @C12579k
    public final String getEnterAddress() {
        return this.enterAddress;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @C12579k
    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        return (((((((((((((this.address.hashCode() * 31) + this.enterAddress.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.country.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude)) * 31) + this.dqeCodeDetail.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.address;
        String str2 = this.enterAddress;
        String str3 = this.postalCode;
        String str4 = this.city;
        String str5 = this.country;
        double d = this.latitude;
        double d2 = this.longitude;
        String str6 = this.dqeCodeDetail;
        return "DQEAddressDomain(address=" + str + ", enterAddress=" + str2 + ", postalCode=" + str3 + ", city=" + str4 + ", country=" + str5 + ", latitude=" + d + ", longitude=" + d2 + ", dqeCodeDetail=" + str6 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DQEAddressDomain(String str, String str2, String str3, String str4, String str5, double d, double d2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? 0.0d : d2, str6);
    }
}
