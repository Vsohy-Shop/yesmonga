package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import androidx.core.app.C17239t;
import com.carrefour.fid.android.shared.constant.C28573o0;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import java.io.Serializable;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0003J{\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileResponse;", "Ljava/io/Serializable;", "email", "", "firstName", "lastName", "birthdate", "civility", "cgu", "listCards", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserCardsResponse;", "listAddress", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AddressUserResponse;", "listPhones", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/PhonesUserResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBirthdate", "()Ljava/lang/String;", "setBirthdate", "(Ljava/lang/String;)V", "getCgu", "setCgu", "getCivility", "setCivility", "getEmail", "setEmail", "getFirstName", "setFirstName", "getLastName", "setLastName", "getListAddress", "()Ljava/util/List;", "setListAddress", "(Ljava/util/List;)V", "getListCards", "setListCards", "getListPhones", "setListPhones", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ProfileResponse implements Serializable {
    @C33608c("birthdate")
    @C12579k
    private String birthdate;
    @C33608c("cgu")
    @C12579k
    private String cgu;
    @C33608c("civility")
    @C12579k
    private String civility;
    @C33608c("email")
    @C12579k
    private String email;
    @C33608c("first_name")
    @C12579k
    private String firstName;
    @C33608c("last_name")
    @C12579k
    private String lastName;
    @C33608c("addresses")
    @C12580l
    private List<AddressUserResponse> listAddress;
    @C33608c("cards")
    @C12580l
    private List<UserCardsResponse> listCards;
    @C33608c("phones")
    @C12580l
    private List<PhonesUserResponse> listPhones;

    public ProfileResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, C17239t.f45525u, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProfileResponse copy$default(ProfileResponse profileResponse, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, Object obj) {
        ProfileResponse profileResponse2 = profileResponse;
        int i2 = i;
        return profileResponse.copy((i2 & 1) != 0 ? profileResponse2.email : str, (i2 & 2) != 0 ? profileResponse2.firstName : str2, (i2 & 4) != 0 ? profileResponse2.lastName : str3, (i2 & 8) != 0 ? profileResponse2.birthdate : str4, (i2 & 16) != 0 ? profileResponse2.civility : str5, (i2 & 32) != 0 ? profileResponse2.cgu : str6, (i2 & 64) != 0 ? profileResponse2.listCards : list, (i2 & 128) != 0 ? profileResponse2.listAddress : list2, (i2 & 256) != 0 ? profileResponse2.listPhones : list3);
    }

    @C12579k
    public final String component1() {
        return this.email;
    }

    @C12579k
    public final String component2() {
        return this.firstName;
    }

    @C12579k
    public final String component3() {
        return this.lastName;
    }

    @C12579k
    public final String component4() {
        return this.birthdate;
    }

    @C12579k
    public final String component5() {
        return this.civility;
    }

    @C12579k
    public final String component6() {
        return this.cgu;
    }

    @C12580l
    public final List<UserCardsResponse> component7() {
        return this.listCards;
    }

    @C12580l
    public final List<AddressUserResponse> component8() {
        return this.listAddress;
    }

    @C12580l
    public final List<PhonesUserResponse> component9() {
        return this.listPhones;
    }

    @C12579k
    public final ProfileResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12580l List<UserCardsResponse> list, @C12580l List<AddressUserResponse> list2, @C12580l List<PhonesUserResponse> list3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        Intrinsics.checkNotNullParameter(str4, C9650g.f26447j);
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str7, "civility");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, C28573o0.f69650b);
        return new ProfileResponse(str, str2, str3, str4, str7, str8, list, list2, list3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileResponse)) {
            return false;
        }
        ProfileResponse profileResponse = (ProfileResponse) obj;
        return Intrinsics.areEqual((Object) this.email, (Object) profileResponse.email) && Intrinsics.areEqual((Object) this.firstName, (Object) profileResponse.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) profileResponse.lastName) && Intrinsics.areEqual((Object) this.birthdate, (Object) profileResponse.birthdate) && Intrinsics.areEqual((Object) this.civility, (Object) profileResponse.civility) && Intrinsics.areEqual((Object) this.cgu, (Object) profileResponse.cgu) && Intrinsics.areEqual((Object) this.listCards, (Object) profileResponse.listCards) && Intrinsics.areEqual((Object) this.listAddress, (Object) profileResponse.listAddress) && Intrinsics.areEqual((Object) this.listPhones, (Object) profileResponse.listPhones);
    }

    @C12579k
    public final String getBirthdate() {
        return this.birthdate;
    }

    @C12579k
    public final String getCgu() {
        return this.cgu;
    }

    @C12579k
    public final String getCivility() {
        return this.civility;
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

    @C12580l
    public final List<AddressUserResponse> getListAddress() {
        return this.listAddress;
    }

    @C12580l
    public final List<UserCardsResponse> getListCards() {
        return this.listCards;
    }

    @C12580l
    public final List<PhonesUserResponse> getListPhones() {
        return this.listPhones;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.email.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.birthdate.hashCode()) * 31) + this.civility.hashCode()) * 31) + this.cgu.hashCode()) * 31;
        List<UserCardsResponse> list = this.listCards;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AddressUserResponse> list2 = this.listAddress;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhonesUserResponse> list3 = this.listPhones;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setBirthdate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birthdate = str;
    }

    public final void setCgu(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cgu = str;
    }

    public final void setCivility(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.civility = str;
    }

    public final void setEmail(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setFirstName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    public final void setLastName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastName = str;
    }

    public final void setListAddress(@C12580l List<AddressUserResponse> list) {
        this.listAddress = list;
    }

    public final void setListCards(@C12580l List<UserCardsResponse> list) {
        this.listCards = list;
    }

    public final void setListPhones(@C12580l List<PhonesUserResponse> list) {
        this.listPhones = list;
    }

    @C12579k
    public String toString() {
        String str = this.email;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.birthdate;
        String str5 = this.civility;
        String str6 = this.cgu;
        List<UserCardsResponse> list = this.listCards;
        List<AddressUserResponse> list2 = this.listAddress;
        List<PhonesUserResponse> list3 = this.listPhones;
        return "ProfileResponse(email=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", birthdate=" + str4 + ", civility=" + str5 + ", cgu=" + str6 + ", listCards=" + list + ", listAddress=" + list2 + ", listPhones=" + list3 + ")";
    }

    public ProfileResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12580l List<UserCardsResponse> list, @C12580l List<AddressUserResponse> list2, @C12580l List<PhonesUserResponse> list3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        Intrinsics.checkNotNullParameter(str4, C9650g.f26447j);
        Intrinsics.checkNotNullParameter(str5, "civility");
        Intrinsics.checkNotNullParameter(str6, C28573o0.f69650b);
        this.email = str;
        this.firstName = str2;
        this.lastName = str3;
        this.birthdate = str4;
        this.civility = str5;
        this.cgu = str6;
        this.listCards = list;
        this.listAddress = list2;
        this.listPhones = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProfileResponse(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r11
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r12
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r13
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = new java.lang.String
            r4.<init>()
            goto L_0x002e
        L_0x002d:
            r4 = r14
        L_0x002e:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x0039
        L_0x0038:
            r5 = r15
        L_0x0039:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0043
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0045
        L_0x0043:
            r6 = r16
        L_0x0045:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x004c
            r7 = r8
            goto L_0x004e
        L_0x004c:
            r7 = r17
        L_0x004e:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0054
            r9 = r8
            goto L_0x0056
        L_0x0054:
            r9 = r18
        L_0x0056:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r8 = r19
        L_0x005d:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r9
            r20 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.ProfileResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
