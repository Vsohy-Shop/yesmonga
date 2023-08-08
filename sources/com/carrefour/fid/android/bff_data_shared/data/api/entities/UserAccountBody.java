package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0016J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010>\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00102J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0003J¸\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00112\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00103\u001a\u0004\b6\u00102R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001e¨\u0006N"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountBody;", "", "login", "", "password", "civility", "firstName", "lastName", "birthdate", "phones", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountPhoneBody;", "addresses", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountAddressBody;", "cards", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountCardBody;", "accountActive", "", "cgu", "oneEmailOptin", "personalizedAdvertisingOptin", "partnerPersonalizedAdvertisingOptin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "getAccountActive", "()Z", "setAccountActive", "(Z)V", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "getBirthdate", "()Ljava/lang/String;", "setBirthdate", "(Ljava/lang/String;)V", "getCards", "setCards", "getCgu", "setCgu", "getCivility", "setCivility", "getFirstName", "setFirstName", "getLastName", "setLastName", "getLogin", "setLogin", "getOneEmailOptin", "setOneEmailOptin", "getPartnerPersonalizedAdvertisingOptin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPassword", "setPassword", "getPersonalizedAdvertisingOptin", "getPhones", "setPhones", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountBody;", "equals", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserAccountBody {
    @C33608c("account_active")
    private boolean accountActive;
    @C12580l
    private List<UserAccountAddressBody> addresses;
    @C12580l
    private String birthdate;
    @C12580l
    private List<UserAccountCardBody> cards;
    private boolean cgu;
    @C12579k
    private String civility;
    @C33608c("first_name")
    @C12579k
    private String firstName;
    @C33608c("last_name")
    @C12579k
    private String lastName;
    @C12579k
    private String login;
    private boolean oneEmailOptin;
    @C12580l
    private final Boolean partnerPersonalizedAdvertisingOptin;
    @C12579k
    private String password;
    @C12580l
    private final Boolean personalizedAdvertisingOptin;
    @C12580l
    private List<UserAccountPhoneBody> phones;

    public UserAccountBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, false, false, false, (Boolean) null, (Boolean) null, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserAccountBody copy$default(UserAccountBody userAccountBody, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, boolean z, boolean z2, boolean z3, Boolean bool, Boolean bool2, int i, Object obj) {
        UserAccountBody userAccountBody2 = userAccountBody;
        int i2 = i;
        return userAccountBody.copy((i2 & 1) != 0 ? userAccountBody2.login : str, (i2 & 2) != 0 ? userAccountBody2.password : str2, (i2 & 4) != 0 ? userAccountBody2.civility : str3, (i2 & 8) != 0 ? userAccountBody2.firstName : str4, (i2 & 16) != 0 ? userAccountBody2.lastName : str5, (i2 & 32) != 0 ? userAccountBody2.birthdate : str6, (i2 & 64) != 0 ? userAccountBody2.phones : list, (i2 & 128) != 0 ? userAccountBody2.addresses : list2, (i2 & 256) != 0 ? userAccountBody2.cards : list3, (i2 & 512) != 0 ? userAccountBody2.accountActive : z, (i2 & 1024) != 0 ? userAccountBody2.cgu : z2, (i2 & 2048) != 0 ? userAccountBody2.oneEmailOptin : z3, (i2 & 4096) != 0 ? userAccountBody2.personalizedAdvertisingOptin : bool, (i2 & 8192) != 0 ? userAccountBody2.partnerPersonalizedAdvertisingOptin : bool2);
    }

    @C12579k
    public final String component1() {
        return this.login;
    }

    public final boolean component10() {
        return this.accountActive;
    }

    public final boolean component11() {
        return this.cgu;
    }

    public final boolean component12() {
        return this.oneEmailOptin;
    }

    @C12580l
    public final Boolean component13() {
        return this.personalizedAdvertisingOptin;
    }

    @C12580l
    public final Boolean component14() {
        return this.partnerPersonalizedAdvertisingOptin;
    }

    @C12579k
    public final String component2() {
        return this.password;
    }

    @C12579k
    public final String component3() {
        return this.civility;
    }

    @C12579k
    public final String component4() {
        return this.firstName;
    }

    @C12579k
    public final String component5() {
        return this.lastName;
    }

    @C12580l
    public final String component6() {
        return this.birthdate;
    }

    @C12580l
    public final List<UserAccountPhoneBody> component7() {
        return this.phones;
    }

    @C12580l
    public final List<UserAccountAddressBody> component8() {
        return this.addresses;
    }

    @C12580l
    public final List<UserAccountCardBody> component9() {
        return this.cards;
    }

    @C12579k
    public final UserAccountBody copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l String str6, @C12580l List<UserAccountPhoneBody> list, @C12580l List<UserAccountAddressBody> list2, @C12580l List<UserAccountCardBody> list3, boolean z, boolean z2, boolean z3, @C12580l Boolean bool, @C12580l Boolean bool2) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, FirebaseAnalytics.C32531a.f78899m);
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "password");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "civility");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "firstName");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "lastName");
        return new UserAccountBody(str7, str8, str9, str10, str11, str6, list, list2, list3, z, z2, z3, bool, bool2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccountBody)) {
            return false;
        }
        UserAccountBody userAccountBody = (UserAccountBody) obj;
        return Intrinsics.areEqual((Object) this.login, (Object) userAccountBody.login) && Intrinsics.areEqual((Object) this.password, (Object) userAccountBody.password) && Intrinsics.areEqual((Object) this.civility, (Object) userAccountBody.civility) && Intrinsics.areEqual((Object) this.firstName, (Object) userAccountBody.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) userAccountBody.lastName) && Intrinsics.areEqual((Object) this.birthdate, (Object) userAccountBody.birthdate) && Intrinsics.areEqual((Object) this.phones, (Object) userAccountBody.phones) && Intrinsics.areEqual((Object) this.addresses, (Object) userAccountBody.addresses) && Intrinsics.areEqual((Object) this.cards, (Object) userAccountBody.cards) && this.accountActive == userAccountBody.accountActive && this.cgu == userAccountBody.cgu && this.oneEmailOptin == userAccountBody.oneEmailOptin && Intrinsics.areEqual((Object) this.personalizedAdvertisingOptin, (Object) userAccountBody.personalizedAdvertisingOptin) && Intrinsics.areEqual((Object) this.partnerPersonalizedAdvertisingOptin, (Object) userAccountBody.partnerPersonalizedAdvertisingOptin);
    }

    public final boolean getAccountActive() {
        return this.accountActive;
    }

    @C12580l
    public final List<UserAccountAddressBody> getAddresses() {
        return this.addresses;
    }

    @C12580l
    public final String getBirthdate() {
        return this.birthdate;
    }

    @C12580l
    public final List<UserAccountCardBody> getCards() {
        return this.cards;
    }

    public final boolean getCgu() {
        return this.cgu;
    }

    @C12579k
    public final String getCivility() {
        return this.civility;
    }

    @C12579k
    public final String getFirstName() {
        return this.firstName;
    }

    @C12579k
    public final String getLastName() {
        return this.lastName;
    }

    @C12579k
    public final String getLogin() {
        return this.login;
    }

    public final boolean getOneEmailOptin() {
        return this.oneEmailOptin;
    }

    @C12580l
    public final Boolean getPartnerPersonalizedAdvertisingOptin() {
        return this.partnerPersonalizedAdvertisingOptin;
    }

    @C12579k
    public final String getPassword() {
        return this.password;
    }

    @C12580l
    public final Boolean getPersonalizedAdvertisingOptin() {
        return this.personalizedAdvertisingOptin;
    }

    @C12580l
    public final List<UserAccountPhoneBody> getPhones() {
        return this.phones;
    }

    public int hashCode() {
        int hashCode = ((((((((this.login.hashCode() * 31) + this.password.hashCode()) * 31) + this.civility.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        String str = this.birthdate;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UserAccountPhoneBody> list = this.phones;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserAccountAddressBody> list2 = this.addresses;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UserAccountCardBody> list3 = this.cards;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z = this.accountActive;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.cgu;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.oneEmailOptin;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Boolean bool = this.personalizedAdvertisingOptin;
        int hashCode6 = (i4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.partnerPersonalizedAdvertisingOptin;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setAccountActive(boolean z) {
        this.accountActive = z;
    }

    public final void setAddresses(@C12580l List<UserAccountAddressBody> list) {
        this.addresses = list;
    }

    public final void setBirthdate(@C12580l String str) {
        this.birthdate = str;
    }

    public final void setCards(@C12580l List<UserAccountCardBody> list) {
        this.cards = list;
    }

    public final void setCgu(boolean z) {
        this.cgu = z;
    }

    public final void setCivility(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.civility = str;
    }

    public final void setFirstName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setLastName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setLogin(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.login = str;
    }

    public final void setOneEmailOptin(boolean z) {
        this.oneEmailOptin = z;
    }

    public final void setPassword(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.password = str;
    }

    public final void setPhones(@C12580l List<UserAccountPhoneBody> list) {
        this.phones = list;
    }

    @C12579k
    public String toString() {
        String str = this.login;
        String str2 = this.password;
        String str3 = this.civility;
        String str4 = this.firstName;
        String str5 = this.lastName;
        String str6 = this.birthdate;
        List<UserAccountPhoneBody> list = this.phones;
        List<UserAccountAddressBody> list2 = this.addresses;
        List<UserAccountCardBody> list3 = this.cards;
        boolean z = this.accountActive;
        boolean z2 = this.cgu;
        boolean z3 = this.oneEmailOptin;
        Boolean bool = this.personalizedAdvertisingOptin;
        Boolean bool2 = this.partnerPersonalizedAdvertisingOptin;
        return "UserAccountBody(login=" + str + ", password=" + str2 + ", civility=" + str3 + ", firstName=" + str4 + ", lastName=" + str5 + ", birthdate=" + str6 + ", phones=" + list + ", addresses=" + list2 + ", cards=" + list3 + ", accountActive=" + z + ", cgu=" + z2 + ", oneEmailOptin=" + z3 + ", personalizedAdvertisingOptin=" + bool + ", partnerPersonalizedAdvertisingOptin=" + bool2 + ")";
    }

    public UserAccountBody(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l String str6, @C12580l List<UserAccountPhoneBody> list, @C12580l List<UserAccountAddressBody> list2, @C12580l List<UserAccountCardBody> list3, boolean z, boolean z2, boolean z3, @C12580l Boolean bool, @C12580l Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32531a.f78899m);
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "civility");
        Intrinsics.checkNotNullParameter(str4, "firstName");
        Intrinsics.checkNotNullParameter(str5, "lastName");
        this.login = str;
        this.password = str2;
        this.civility = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.birthdate = str6;
        this.phones = list;
        this.addresses = list2;
        this.cards = list3;
        this.accountActive = z;
        this.cgu = z2;
        this.oneEmailOptin = z3;
        this.personalizedAdvertisingOptin = bool;
        this.partnerPersonalizedAdvertisingOptin = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserAccountBody(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.List r22, java.util.List r23, java.util.List r24, boolean r25, boolean r26, boolean r27, java.lang.Boolean r28, java.lang.Boolean r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r16
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x001a
        L_0x0018:
            r2 = r17
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0026
        L_0x0024:
            r3 = r18
        L_0x0026:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0030
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x0032
        L_0x0030:
            r4 = r19
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003e
        L_0x003c:
            r5 = r20
        L_0x003e:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0045
            java.lang.String r6 = "-2195942400"
            goto L_0x0047
        L_0x0045:
            r6 = r21
        L_0x0047:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x004e
            r7 = r8
            goto L_0x0050
        L_0x004e:
            r7 = r22
        L_0x0050:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0056
            r9 = r8
            goto L_0x0058
        L_0x0056:
            r9 = r23
        L_0x0058:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x005e
            r10 = r8
            goto L_0x0060
        L_0x005e:
            r10 = r24
        L_0x0060:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0066
            r11 = 1
            goto L_0x0068
        L_0x0066:
            r11 = r25
        L_0x0068:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            r13 = 0
            if (r12 == 0) goto L_0x006f
            r12 = r13
            goto L_0x0071
        L_0x006f:
            r12 = r26
        L_0x0071:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r13 = r27
        L_0x0078:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x007e
            r14 = r8
            goto L_0x0080
        L_0x007e:
            r14 = r28
        L_0x0080:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r8 = r29
        L_0x0087:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean, boolean, boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
