package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/DQEAddressSuggestionEntity;", "", "address", "", "number", "street", "postalCode", "city", "enterAddress", "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCountry", "getEnterAddress", "getNumber", "getPostalCode", "getStreet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class DQEAddressSuggestionEntity {
    public static final int $stable = 0;
    @C33608c("label")
    @C12580l
    private final String address;
    @C33608c("Localite")
    @C12580l
    private final String city;
    @C33608c("Pays")
    @C12580l
    private final String country;
    @C33608c("Saisie")
    @C12580l
    private final String enterAddress;
    @C33608c("Numero")
    @C12580l
    private final String number;
    @C33608c("CodePostal")
    @C12580l
    private final String postalCode;
    @C33608c("Voie")
    @C12580l
    private final String street;

    public DQEAddressSuggestionEntity(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7) {
        this.address = str;
        this.number = str2;
        this.street = str3;
        this.postalCode = str4;
        this.city = str5;
        this.enterAddress = str6;
        this.country = str7;
    }

    public static /* synthetic */ DQEAddressSuggestionEntity copy$default(DQEAddressSuggestionEntity dQEAddressSuggestionEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dQEAddressSuggestionEntity.address;
        }
        if ((i & 2) != 0) {
            str2 = dQEAddressSuggestionEntity.number;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = dQEAddressSuggestionEntity.street;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = dQEAddressSuggestionEntity.postalCode;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = dQEAddressSuggestionEntity.city;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = dQEAddressSuggestionEntity.enterAddress;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = dQEAddressSuggestionEntity.country;
        }
        return dQEAddressSuggestionEntity.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @C12580l
    public final String component1() {
        return this.address;
    }

    @C12580l
    public final String component2() {
        return this.number;
    }

    @C12580l
    public final String component3() {
        return this.street;
    }

    @C12580l
    public final String component4() {
        return this.postalCode;
    }

    @C12580l
    public final String component5() {
        return this.city;
    }

    @C12580l
    public final String component6() {
        return this.enterAddress;
    }

    @C12580l
    public final String component7() {
        return this.country;
    }

    @C12579k
    public final DQEAddressSuggestionEntity copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7) {
        return new DQEAddressSuggestionEntity(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DQEAddressSuggestionEntity)) {
            return false;
        }
        DQEAddressSuggestionEntity dQEAddressSuggestionEntity = (DQEAddressSuggestionEntity) obj;
        return Intrinsics.areEqual((Object) this.address, (Object) dQEAddressSuggestionEntity.address) && Intrinsics.areEqual((Object) this.number, (Object) dQEAddressSuggestionEntity.number) && Intrinsics.areEqual((Object) this.street, (Object) dQEAddressSuggestionEntity.street) && Intrinsics.areEqual((Object) this.postalCode, (Object) dQEAddressSuggestionEntity.postalCode) && Intrinsics.areEqual((Object) this.city, (Object) dQEAddressSuggestionEntity.city) && Intrinsics.areEqual((Object) this.enterAddress, (Object) dQEAddressSuggestionEntity.enterAddress) && Intrinsics.areEqual((Object) this.country, (Object) dQEAddressSuggestionEntity.country);
    }

    @C12580l
    public final String getAddress() {
        return this.address;
    }

    @C12580l
    public final String getCity() {
        return this.city;
    }

    @C12580l
    public final String getCountry() {
        return this.country;
    }

    @C12580l
    public final String getEnterAddress() {
        return this.enterAddress;
    }

    @C12580l
    public final String getNumber() {
        return this.number;
    }

    @C12580l
    public final String getPostalCode() {
        return this.postalCode;
    }

    @C12580l
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        String str = this.address;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.street;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterAddress;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.country;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @C12579k
    public String toString() {
        String str = this.address;
        String str2 = this.number;
        String str3 = this.street;
        String str4 = this.postalCode;
        String str5 = this.city;
        String str6 = this.enterAddress;
        String str7 = this.country;
        return "DQEAddressSuggestionEntity(address=" + str + ", number=" + str2 + ", street=" + str3 + ", postalCode=" + str4 + ", city=" + str5 + ", enterAddress=" + str6 + ", country=" + str7 + ")";
    }
}
