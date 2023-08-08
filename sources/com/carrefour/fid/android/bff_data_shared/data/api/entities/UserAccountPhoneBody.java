package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountPhoneBody;", "", "num", "", "code", "", "category", "preference", "key", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getCode", "setCode", "getKey", "()Ljava/lang/Integer;", "setKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNum", "setNum", "getPreference", "setPreference", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountPhoneBody;", "equals", "", "other", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserAccountPhoneBody {
    @C33608c("category")
    @C12580l
    private String category;
    @C33608c("code")
    @C12580l
    private String code;
    @C33608c("key")
    @C12580l
    private Integer key;
    @C33608c("num")
    @C12580l
    private Integer num;
    @C33608c("preference")
    @C12580l
    private String preference;

    public UserAccountPhoneBody() {
        this((Integer) null, (String) null, (String) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserAccountPhoneBody copy$default(UserAccountPhoneBody userAccountPhoneBody, Integer num2, String str, String str2, String str3, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num2 = userAccountPhoneBody.num;
        }
        if ((i & 2) != 0) {
            str = userAccountPhoneBody.code;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = userAccountPhoneBody.category;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = userAccountPhoneBody.preference;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num3 = userAccountPhoneBody.key;
        }
        return userAccountPhoneBody.copy(num2, str4, str5, str6, num3);
    }

    @C12580l
    public final Integer component1() {
        return this.num;
    }

    @C12580l
    public final String component2() {
        return this.code;
    }

    @C12580l
    public final String component3() {
        return this.category;
    }

    @C12580l
    public final String component4() {
        return this.preference;
    }

    @C12580l
    public final Integer component5() {
        return this.key;
    }

    @C12579k
    public final UserAccountPhoneBody copy(@C12580l Integer num2, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num3) {
        return new UserAccountPhoneBody(num2, str, str2, str3, num3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccountPhoneBody)) {
            return false;
        }
        UserAccountPhoneBody userAccountPhoneBody = (UserAccountPhoneBody) obj;
        return Intrinsics.areEqual((Object) this.num, (Object) userAccountPhoneBody.num) && Intrinsics.areEqual((Object) this.code, (Object) userAccountPhoneBody.code) && Intrinsics.areEqual((Object) this.category, (Object) userAccountPhoneBody.category) && Intrinsics.areEqual((Object) this.preference, (Object) userAccountPhoneBody.preference) && Intrinsics.areEqual((Object) this.key, (Object) userAccountPhoneBody.key);
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getCode() {
        return this.code;
    }

    @C12580l
    public final Integer getKey() {
        return this.key;
    }

    @C12580l
    public final Integer getNum() {
        return this.num;
    }

    @C12580l
    public final String getPreference() {
        return this.preference;
    }

    public int hashCode() {
        Integer num2 = this.num;
        int i = 0;
        int hashCode = (num2 == null ? 0 : num2.hashCode()) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preference;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.key;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setCategory(@C12580l String str) {
        this.category = str;
    }

    public final void setCode(@C12580l String str) {
        this.code = str;
    }

    public final void setKey(@C12580l Integer num2) {
        this.key = num2;
    }

    public final void setNum(@C12580l Integer num2) {
        this.num = num2;
    }

    public final void setPreference(@C12580l String str) {
        this.preference = str;
    }

    @C12579k
    public String toString() {
        Integer num2 = this.num;
        String str = this.code;
        String str2 = this.category;
        String str3 = this.preference;
        Integer num3 = this.key;
        return "UserAccountPhoneBody(num=" + num2 + ", code=" + str + ", category=" + str2 + ", preference=" + str3 + ", key=" + num3 + ")";
    }

    public UserAccountPhoneBody(@C12580l Integer num2, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num3) {
        this.num = num2;
        this.code = str;
        this.category = str2;
        this.preference = str3;
        this.key = num3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserAccountPhoneBody(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Integer r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r11 == 0) goto L_0x000b
            r11 = r0
            goto L_0x000c
        L_0x000b:
            r11 = r5
        L_0x000c:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x0015
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x0015:
            r1 = r6
            r5 = r10 & 4
            if (r5 == 0) goto L_0x001f
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x001f:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x0029
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x0029:
            r3 = r8
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0030
            r10 = r0
            goto L_0x0031
        L_0x0030:
            r10 = r9
        L_0x0031:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.UserAccountPhoneBody.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
