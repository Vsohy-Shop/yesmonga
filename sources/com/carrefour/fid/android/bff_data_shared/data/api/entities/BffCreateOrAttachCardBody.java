package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import androidx.autofill.C0861a;
import androidx.compose.p004ui.unit.C16476b;
import com.google.firebase.remoteconfig.C33585u;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "Ljava/io/Serializable;", "secretCode", "", "phoneNumber", "birthdate", "address", "city", "postalCode", "countryCode", "firstName", "lastName", "civility", "email", "optEmail", "optSms", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getBirthdate", "getCity", "getCivility", "getCountryCode", "getEmail", "getFirstName", "getLastName", "getOptEmail", "getOptSms", "getPhoneNumber", "getPostalCode", "getSecretCode", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class BffCreateOrAttachCardBody implements Serializable {
    @C33608c("address")
    @C12579k
    @C33606a
    private final String address;
    @C33608c("birthdate")
    @C12579k
    @C33606a
    private final String birthdate;
    @C33608c("city")
    @C12579k
    @C33606a
    private final String city;
    @C33608c("civility")
    @C12579k
    @C33606a
    private final String civility;
    @C33608c("country_code")
    @C12579k
    @C33606a
    private final String countryCode;
    @C33608c("email")
    @C12579k
    @C33606a
    private final String email;
    @C33608c("first_name")
    @C12579k
    @C33606a
    private final String firstName;
    @C33608c("last_name")
    @C12579k
    @C33606a
    private final String lastName;
    @C33608c("opt_email")
    @C12579k
    @C33606a
    private final String optEmail;
    @C33608c("opt_sms")
    @C12579k
    @C33606a
    private final String optSms;
    @C33608c("phone_number")
    @C12579k
    @C33606a
    private final String phoneNumber;
    @C33608c("postal_code")
    @C12579k
    @C33606a
    private final String postalCode;
    @C33608c("secret_code")
    @C12579k
    @C33606a
    private final String secretCode;

    public BffCreateOrAttachCardBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCreateOrAttachCardBody copy$default(BffCreateOrAttachCardBody bffCreateOrAttachCardBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        BffCreateOrAttachCardBody bffCreateOrAttachCardBody2 = bffCreateOrAttachCardBody;
        int i2 = i;
        return bffCreateOrAttachCardBody.copy((i2 & 1) != 0 ? bffCreateOrAttachCardBody2.secretCode : str, (i2 & 2) != 0 ? bffCreateOrAttachCardBody2.phoneNumber : str2, (i2 & 4) != 0 ? bffCreateOrAttachCardBody2.birthdate : str3, (i2 & 8) != 0 ? bffCreateOrAttachCardBody2.address : str4, (i2 & 16) != 0 ? bffCreateOrAttachCardBody2.city : str5, (i2 & 32) != 0 ? bffCreateOrAttachCardBody2.postalCode : str6, (i2 & 64) != 0 ? bffCreateOrAttachCardBody2.countryCode : str7, (i2 & 128) != 0 ? bffCreateOrAttachCardBody2.firstName : str8, (i2 & 256) != 0 ? bffCreateOrAttachCardBody2.lastName : str9, (i2 & 512) != 0 ? bffCreateOrAttachCardBody2.civility : str10, (i2 & 1024) != 0 ? bffCreateOrAttachCardBody2.email : str11, (i2 & 2048) != 0 ? bffCreateOrAttachCardBody2.optEmail : str12, (i2 & 4096) != 0 ? bffCreateOrAttachCardBody2.optSms : str13);
    }

    @C12579k
    public final String component1() {
        return this.secretCode;
    }

    @C12579k
    public final String component10() {
        return this.civility;
    }

    @C12579k
    public final String component11() {
        return this.email;
    }

    @C12579k
    public final String component12() {
        return this.optEmail;
    }

    @C12579k
    public final String component13() {
        return this.optSms;
    }

    @C12579k
    public final String component2() {
        return this.phoneNumber;
    }

    @C12579k
    public final String component3() {
        return this.birthdate;
    }

    @C12579k
    public final String component4() {
        return this.address;
    }

    @C12579k
    public final String component5() {
        return this.city;
    }

    @C12579k
    public final String component6() {
        return this.postalCode;
    }

    @C12579k
    public final String component7() {
        return this.countryCode;
    }

    @C12579k
    public final String component8() {
        return this.firstName;
    }

    @C12579k
    public final String component9() {
        return this.lastName;
    }

    @C12579k
    public final BffCreateOrAttachCardBody copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "secretCode");
        String str15 = str2;
        Intrinsics.checkNotNullParameter(str15, C0861a.f2689A);
        String str16 = str3;
        Intrinsics.checkNotNullParameter(str16, C9650g.f26447j);
        String str17 = str4;
        Intrinsics.checkNotNullParameter(str17, "address");
        String str18 = str5;
        Intrinsics.checkNotNullParameter(str18, C9650g.f26444g);
        String str19 = str6;
        Intrinsics.checkNotNullParameter(str19, C0861a.f2707g);
        String str20 = str7;
        Intrinsics.checkNotNullParameter(str20, C33585u.C33587b.f81734p3);
        String str21 = str8;
        Intrinsics.checkNotNullParameter(str21, "firstName");
        String str22 = str9;
        Intrinsics.checkNotNullParameter(str22, "lastName");
        String str23 = str10;
        Intrinsics.checkNotNullParameter(str23, "civility");
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str24, "email");
        String str25 = str12;
        Intrinsics.checkNotNullParameter(str25, "optEmail");
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str26, "optSms");
        return new BffCreateOrAttachCardBody(str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCreateOrAttachCardBody)) {
            return false;
        }
        BffCreateOrAttachCardBody bffCreateOrAttachCardBody = (BffCreateOrAttachCardBody) obj;
        return Intrinsics.areEqual((Object) this.secretCode, (Object) bffCreateOrAttachCardBody.secretCode) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) bffCreateOrAttachCardBody.phoneNumber) && Intrinsics.areEqual((Object) this.birthdate, (Object) bffCreateOrAttachCardBody.birthdate) && Intrinsics.areEqual((Object) this.address, (Object) bffCreateOrAttachCardBody.address) && Intrinsics.areEqual((Object) this.city, (Object) bffCreateOrAttachCardBody.city) && Intrinsics.areEqual((Object) this.postalCode, (Object) bffCreateOrAttachCardBody.postalCode) && Intrinsics.areEqual((Object) this.countryCode, (Object) bffCreateOrAttachCardBody.countryCode) && Intrinsics.areEqual((Object) this.firstName, (Object) bffCreateOrAttachCardBody.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) bffCreateOrAttachCardBody.lastName) && Intrinsics.areEqual((Object) this.civility, (Object) bffCreateOrAttachCardBody.civility) && Intrinsics.areEqual((Object) this.email, (Object) bffCreateOrAttachCardBody.email) && Intrinsics.areEqual((Object) this.optEmail, (Object) bffCreateOrAttachCardBody.optEmail) && Intrinsics.areEqual((Object) this.optSms, (Object) bffCreateOrAttachCardBody.optSms);
    }

    @C12579k
    public final String getAddress() {
        return this.address;
    }

    @C12579k
    public final String getBirthdate() {
        return this.birthdate;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getCivility() {
        return this.civility;
    }

    @C12579k
    public final String getCountryCode() {
        return this.countryCode;
    }

    @C12579k
    public final String getEmail() {
        return this.email;
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
    public final String getOptEmail() {
        return this.optEmail;
    }

    @C12579k
    public final String getOptSms() {
        return this.optSms;
    }

    @C12579k
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @C12579k
    public final String getPostalCode() {
        return this.postalCode;
    }

    @C12579k
    public final String getSecretCode() {
        return this.secretCode;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.secretCode.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.birthdate.hashCode()) * 31) + this.address.hashCode()) * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.civility.hashCode()) * 31) + this.email.hashCode()) * 31) + this.optEmail.hashCode()) * 31) + this.optSms.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.secretCode;
        String str2 = this.phoneNumber;
        String str3 = this.birthdate;
        String str4 = this.address;
        String str5 = this.city;
        String str6 = this.postalCode;
        String str7 = this.countryCode;
        String str8 = this.firstName;
        String str9 = this.lastName;
        String str10 = this.civility;
        String str11 = this.email;
        String str12 = this.optEmail;
        String str13 = this.optSms;
        return "BffCreateOrAttachCardBody(secretCode=" + str + ", phoneNumber=" + str2 + ", birthdate=" + str3 + ", address=" + str4 + ", city=" + str5 + ", postalCode=" + str6 + ", countryCode=" + str7 + ", firstName=" + str8 + ", lastName=" + str9 + ", civility=" + str10 + ", email=" + str11 + ", optEmail=" + str12 + ", optSms=" + str13 + ")";
    }

    public BffCreateOrAttachCardBody(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, @C12579k String str11, @C12579k String str12, @C12579k String str13) {
        Intrinsics.checkNotNullParameter(str, "secretCode");
        Intrinsics.checkNotNullParameter(str2, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str3, C9650g.f26447j);
        Intrinsics.checkNotNullParameter(str4, "address");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str6, C0861a.f2707g);
        Intrinsics.checkNotNullParameter(str7, C33585u.C33587b.f81734p3);
        Intrinsics.checkNotNullParameter(str8, "firstName");
        Intrinsics.checkNotNullParameter(str9, "lastName");
        Intrinsics.checkNotNullParameter(str10, "civility");
        Intrinsics.checkNotNullParameter(str11, "email");
        Intrinsics.checkNotNullParameter(str12, "optEmail");
        Intrinsics.checkNotNullParameter(str13, "optSms");
        this.secretCode = str;
        this.phoneNumber = str2;
        this.birthdate = str3;
        this.address = str4;
        this.city = str5;
        this.postalCode = str6;
        this.countryCode = str7;
        this.firstName = str8;
        this.lastName = str9;
        this.civility = str10;
        this.email = str11;
        this.optEmail = str12;
        this.optSms = str13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCreateOrAttachCardBody(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r15
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r16
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r17
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r18
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r19
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r20
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r21
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r22
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r23
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r24
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r25
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r26
        L_0x0063:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r2 = r27
        L_0x006a:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
