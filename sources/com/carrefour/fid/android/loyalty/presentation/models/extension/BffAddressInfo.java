package com.carrefour.fid.android.loyalty.presentation.models.extension;

import androidx.autofill.C0861a;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/extension/BffAddressInfo;", "", "address", "", "city", "postalCode", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCountryCode", "getPostalCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BffAddressInfo {
    @C12579k
    private final String address;
    @C12579k
    private final String city;
    @C12579k
    private final String countryCode;
    @C12579k
    private final String postalCode;

    public BffAddressInfo(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "address");
        Intrinsics.checkNotNullParameter(str2, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str3, C0861a.f2707g);
        Intrinsics.checkNotNullParameter(str4, C33585u.C33587b.f81734p3);
        this.address = str;
        this.city = str2;
        this.postalCode = str3;
        this.countryCode = str4;
    }

    public static /* synthetic */ BffAddressInfo copy$default(BffAddressInfo bffAddressInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffAddressInfo.address;
        }
        if ((i & 2) != 0) {
            str2 = bffAddressInfo.city;
        }
        if ((i & 4) != 0) {
            str3 = bffAddressInfo.postalCode;
        }
        if ((i & 8) != 0) {
            str4 = bffAddressInfo.countryCode;
        }
        return bffAddressInfo.copy(str, str2, str3, str4);
    }

    @C12579k
    public final String component1() {
        return this.address;
    }

    @C12579k
    public final String component2() {
        return this.city;
    }

    @C12579k
    public final String component3() {
        return this.postalCode;
    }

    @C12579k
    public final String component4() {
        return this.countryCode;
    }

    @C12579k
    public final BffAddressInfo copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "address");
        Intrinsics.checkNotNullParameter(str2, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str3, C0861a.f2707g);
        Intrinsics.checkNotNullParameter(str4, C33585u.C33587b.f81734p3);
        return new BffAddressInfo(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffAddressInfo)) {
            return false;
        }
        BffAddressInfo bffAddressInfo = (BffAddressInfo) obj;
        return Intrinsics.areEqual((Object) this.address, (Object) bffAddressInfo.address) && Intrinsics.areEqual((Object) this.city, (Object) bffAddressInfo.city) && Intrinsics.areEqual((Object) this.postalCode, (Object) bffAddressInfo.postalCode) && Intrinsics.areEqual((Object) this.countryCode, (Object) bffAddressInfo.countryCode);
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
    public final String getCountryCode() {
        return this.countryCode;
    }

    @C12579k
    public final String getPostalCode() {
        return this.postalCode;
    }

    public int hashCode() {
        return (((((this.address.hashCode() * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.countryCode.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.address;
        String str2 = this.city;
        String str3 = this.postalCode;
        String str4 = this.countryCode;
        return "BffAddressInfo(address=" + str + ", city=" + str2 + ", postalCode=" + str3 + ", countryCode=" + str4 + ")";
    }
}
