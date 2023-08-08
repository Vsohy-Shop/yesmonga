package com.carrefour.fid.android.loyalty.data.models.body;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/body/UserDataBody;", "Ljava/io/Serializable;", "civility", "", "firstName", "lastName", "email", "birthDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()Ljava/lang/String;", "setBirthDate", "(Ljava/lang/String;)V", "getCivility", "setCivility", "getEmail", "setEmail", "getFirstName", "setFirstName", "getLastName", "setLastName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserDataBody implements Serializable {
    @C33608c("birth_date")
    @C12580l
    @C33606a
    private String birthDate;
    @C33608c("civility")
    @C12580l
    @C33606a
    private String civility;
    @C33608c("email")
    @C12580l
    @C33606a
    private String email;
    @C33608c("first_name")
    @C12580l
    @C33606a
    private String firstName;
    @C33608c("last_name")
    @C12580l
    @C33606a
    private String lastName;

    public UserDataBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserDataBody copy$default(UserDataBody userDataBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userDataBody.civility;
        }
        if ((i & 2) != 0) {
            str2 = userDataBody.firstName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = userDataBody.lastName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = userDataBody.email;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = userDataBody.birthDate;
        }
        return userDataBody.copy(str, str6, str7, str8, str5);
    }

    @C12580l
    public final String component1() {
        return this.civility;
    }

    @C12580l
    public final String component2() {
        return this.firstName;
    }

    @C12580l
    public final String component3() {
        return this.lastName;
    }

    @C12580l
    public final String component4() {
        return this.email;
    }

    @C12580l
    public final String component5() {
        return this.birthDate;
    }

    @C12579k
    public final UserDataBody copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new UserDataBody(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataBody)) {
            return false;
        }
        UserDataBody userDataBody = (UserDataBody) obj;
        return Intrinsics.areEqual((Object) this.civility, (Object) userDataBody.civility) && Intrinsics.areEqual((Object) this.firstName, (Object) userDataBody.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) userDataBody.lastName) && Intrinsics.areEqual((Object) this.email, (Object) userDataBody.email) && Intrinsics.areEqual((Object) this.birthDate, (Object) userDataBody.birthDate);
    }

    @C12580l
    public final String getBirthDate() {
        return this.birthDate;
    }

    @C12580l
    public final String getCivility() {
        return this.civility;
    }

    @C12580l
    public final String getEmail() {
        return this.email;
    }

    @C12580l
    public final String getFirstName() {
        return this.firstName;
    }

    @C12580l
    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.civility;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthDate;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setBirthDate(@C12580l String str) {
        this.birthDate = str;
    }

    public final void setCivility(@C12580l String str) {
        this.civility = str;
    }

    public final void setEmail(@C12580l String str) {
        this.email = str;
    }

    public final void setFirstName(@C12580l String str) {
        this.firstName = str;
    }

    public final void setLastName(@C12580l String str) {
        this.lastName = str;
    }

    @C12579k
    public String toString() {
        String str = this.civility;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.email;
        String str5 = this.birthDate;
        return "UserDataBody(civility=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", email=" + str4 + ", birthDate=" + str5 + ")";
    }

    public UserDataBody(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.civility = str;
        this.firstName = str2;
        this.lastName = str3;
        this.email = str4;
        this.birthDate = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserDataBody(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.models.body.UserDataBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
