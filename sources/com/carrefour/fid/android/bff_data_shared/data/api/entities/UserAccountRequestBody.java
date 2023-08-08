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

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001c¨\u0006B"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountRequestBody;", "", "login", "", "password", "civility", "firstName", "lastName", "birthdate", "phones", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountPhoneBody;", "addresses", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountAddressBody;", "cards", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountCardBody;", "consents", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptIn;", "accountActive", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getAccountActive", "()Z", "setAccountActive", "(Z)V", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "getBirthdate", "()Ljava/lang/String;", "setBirthdate", "(Ljava/lang/String;)V", "getCards", "setCards", "getCivility", "setCivility", "getConsents", "setConsents", "getFirstName", "setFirstName", "getLastName", "setLastName", "getLogin", "setLogin", "getPassword", "setPassword", "getPhones", "setPhones", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserAccountRequestBody {
    @C33608c("account_active")
    private boolean accountActive;
    @C12580l
    private List<UserAccountAddressBody> addresses;
    @C12580l
    private String birthdate;
    @C12580l
    private List<UserAccountCardBody> cards;
    @C12579k
    private String civility;
    @C12580l
    private List<BffConsentOptIn> consents;
    @C33608c("first_name")
    @C12579k
    private String firstName;
    @C33608c("last_name")
    @C12579k
    private String lastName;
    @C12579k
    private String login;
    @C12579k
    private String password;
    @C12580l
    private List<UserAccountPhoneBody> phones;

    public UserAccountRequestBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, false, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserAccountRequestBody copy$default(UserAccountRequestBody userAccountRequestBody, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, boolean z, int i, Object obj) {
        UserAccountRequestBody userAccountRequestBody2 = userAccountRequestBody;
        int i2 = i;
        return userAccountRequestBody.copy((i2 & 1) != 0 ? userAccountRequestBody2.login : str, (i2 & 2) != 0 ? userAccountRequestBody2.password : str2, (i2 & 4) != 0 ? userAccountRequestBody2.civility : str3, (i2 & 8) != 0 ? userAccountRequestBody2.firstName : str4, (i2 & 16) != 0 ? userAccountRequestBody2.lastName : str5, (i2 & 32) != 0 ? userAccountRequestBody2.birthdate : str6, (i2 & 64) != 0 ? userAccountRequestBody2.phones : list, (i2 & 128) != 0 ? userAccountRequestBody2.addresses : list2, (i2 & 256) != 0 ? userAccountRequestBody2.cards : list3, (i2 & 512) != 0 ? userAccountRequestBody2.consents : list4, (i2 & 1024) != 0 ? userAccountRequestBody2.accountActive : z);
    }

    @C12579k
    public final String component1() {
        return this.login;
    }

    @C12580l
    public final List<BffConsentOptIn> component10() {
        return this.consents;
    }

    public final boolean component11() {
        return this.accountActive;
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
    public final UserAccountRequestBody copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l String str6, @C12580l List<UserAccountPhoneBody> list, @C12580l List<UserAccountAddressBody> list2, @C12580l List<UserAccountCardBody> list3, @C12580l List<BffConsentOptIn> list4, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32531a.f78899m);
        Intrinsics.checkNotNullParameter(str2, "password");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "civility");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "firstName");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "lastName");
        return new UserAccountRequestBody(str, str2, str7, str8, str9, str6, list, list2, list3, list4, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccountRequestBody)) {
            return false;
        }
        UserAccountRequestBody userAccountRequestBody = (UserAccountRequestBody) obj;
        return Intrinsics.areEqual((Object) this.login, (Object) userAccountRequestBody.login) && Intrinsics.areEqual((Object) this.password, (Object) userAccountRequestBody.password) && Intrinsics.areEqual((Object) this.civility, (Object) userAccountRequestBody.civility) && Intrinsics.areEqual((Object) this.firstName, (Object) userAccountRequestBody.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) userAccountRequestBody.lastName) && Intrinsics.areEqual((Object) this.birthdate, (Object) userAccountRequestBody.birthdate) && Intrinsics.areEqual((Object) this.phones, (Object) userAccountRequestBody.phones) && Intrinsics.areEqual((Object) this.addresses, (Object) userAccountRequestBody.addresses) && Intrinsics.areEqual((Object) this.cards, (Object) userAccountRequestBody.cards) && Intrinsics.areEqual((Object) this.consents, (Object) userAccountRequestBody.consents) && this.accountActive == userAccountRequestBody.accountActive;
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

    @C12579k
    public final String getCivility() {
        return this.civility;
    }

    @C12580l
    public final List<BffConsentOptIn> getConsents() {
        return this.consents;
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

    @C12579k
    public final String getPassword() {
        return this.password;
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
        List<BffConsentOptIn> list4 = this.consents;
        if (list4 != null) {
            i = list4.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.accountActive;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
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

    public final void setCivility(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.civility = str;
    }

    public final void setConsents(@C12580l List<BffConsentOptIn> list) {
        this.consents = list;
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
        List<BffConsentOptIn> list4 = this.consents;
        boolean z = this.accountActive;
        return "UserAccountRequestBody(login=" + str + ", password=" + str2 + ", civility=" + str3 + ", firstName=" + str4 + ", lastName=" + str5 + ", birthdate=" + str6 + ", phones=" + list + ", addresses=" + list2 + ", cards=" + list3 + ", consents=" + list4 + ", accountActive=" + z + ")";
    }

    public UserAccountRequestBody(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12580l String str6, @C12580l List<UserAccountPhoneBody> list, @C12580l List<UserAccountAddressBody> list2, @C12580l List<UserAccountCardBody> list3, @C12580l List<BffConsentOptIn> list4, boolean z) {
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
        this.consents = list4;
        this.accountActive = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserAccountRequestBody(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r13
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r14
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r15
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x002f
        L_0x002d:
            r4 = r16
        L_0x002f:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x003b
        L_0x0039:
            r5 = r17
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "-2195942400"
            goto L_0x0044
        L_0x0042:
            r6 = r18
        L_0x0044:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x004b
            r7 = r8
            goto L_0x004d
        L_0x004b:
            r7 = r19
        L_0x004d:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0053
            r9 = r8
            goto L_0x0055
        L_0x0053:
            r9 = r20
        L_0x0055:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x005b
            r10 = r8
            goto L_0x005d
        L_0x005b:
            r10 = r21
        L_0x005d:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r8 = r22
        L_0x0064:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x006a
            r0 = 1
            goto L_0x006c
        L_0x006a:
            r0 = r23
        L_0x006c:
            r13 = r12
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r10
            r23 = r8
            r24 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountRequestBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
