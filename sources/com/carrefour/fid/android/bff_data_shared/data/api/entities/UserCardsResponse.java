package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserCardsResponse;", "", "date", "", "num", "category", "key", "", "isSecured", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getDate", "setDate", "()Z", "setSecured", "(Z)V", "getKey", "()I", "setKey", "(I)V", "getNum", "setNum", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserCardsResponse {
    @C33608c("category")
    @C12579k
    private String category;
    @C33608c("date")
    @C12579k
    private String date;
    @C33608c("isSecFID")
    private boolean isSecured;
    @C33608c("key")
    private int key;
    @C33608c("num")
    @C12579k
    private String num;

    public UserCardsResponse() {
        this((String) null, (String) null, (String) null, 0, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserCardsResponse copy$default(UserCardsResponse userCardsResponse, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userCardsResponse.date;
        }
        if ((i2 & 2) != 0) {
            str2 = userCardsResponse.num;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = userCardsResponse.category;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = userCardsResponse.key;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = userCardsResponse.isSecured;
        }
        return userCardsResponse.copy(str, str4, str5, i3, z);
    }

    @C12579k
    public final String component1() {
        return this.date;
    }

    @C12579k
    public final String component2() {
        return this.num;
    }

    @C12579k
    public final String component3() {
        return this.category;
    }

    public final int component4() {
        return this.key;
    }

    public final boolean component5() {
        return this.isSecured;
    }

    @C12579k
    public final UserCardsResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "num");
        Intrinsics.checkNotNullParameter(str3, "category");
        return new UserCardsResponse(str, str2, str3, i, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCardsResponse)) {
            return false;
        }
        UserCardsResponse userCardsResponse = (UserCardsResponse) obj;
        return Intrinsics.areEqual((Object) this.date, (Object) userCardsResponse.date) && Intrinsics.areEqual((Object) this.num, (Object) userCardsResponse.num) && Intrinsics.areEqual((Object) this.category, (Object) userCardsResponse.category) && this.key == userCardsResponse.key && this.isSecured == userCardsResponse.isSecured;
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    @C12579k
    public final String getDate() {
        return this.date;
    }

    public final int getKey() {
        return this.key;
    }

    @C12579k
    public final String getNum() {
        return this.num;
    }

    public int hashCode() {
        int hashCode = ((((((this.date.hashCode() * 31) + this.num.hashCode()) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.key)) * 31;
        boolean z = this.isSecured;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    public final void setCategory(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final void setKey(int i) {
        this.key = i;
    }

    public final void setNum(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.num = str;
    }

    public final void setSecured(boolean z) {
        this.isSecured = z;
    }

    @C12579k
    public String toString() {
        String str = this.date;
        String str2 = this.num;
        String str3 = this.category;
        int i = this.key;
        boolean z = this.isSecured;
        return "UserCardsResponse(date=" + str + ", num=" + str2 + ", category=" + str3 + ", key=" + i + ", isSecured=" + z + ")";
    }

    public UserCardsResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "date");
        Intrinsics.checkNotNullParameter(str2, "num");
        Intrinsics.checkNotNullParameter(str3, "category");
        this.date = str;
        this.num = str2;
        this.category = str3;
        this.key = i;
        this.isSecured = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserCardsResponse(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0009
            java.lang.String r4 = new java.lang.String
            r4.<init>()
        L_0x0009:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0012
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x0012:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001c
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x001c:
            r0 = r6
            r5 = r9 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0024
            r1 = r6
            goto L_0x0025
        L_0x0024:
            r1 = r7
        L_0x0025:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x002b
            r2 = r6
            goto L_0x002c
        L_0x002b:
            r2 = r8
        L_0x002c:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.UserCardsResponse.<init>(java.lang.String, java.lang.String, java.lang.String, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
