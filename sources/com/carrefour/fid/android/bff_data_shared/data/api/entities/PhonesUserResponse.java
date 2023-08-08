package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/PhonesUserResponse;", "Ljava/io/Serializable;", "num", "", "code", "category", "preference", "", "key", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getCode", "setCode", "getKey", "()I", "setKey", "(I)V", "getNum", "setNum", "getPreference", "()Z", "setPreference", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class PhonesUserResponse implements Serializable {
    @C33608c("category")
    @C12579k
    private String category;
    @C33608c("code")
    @C12579k
    private String code;
    @C33608c("key")
    private int key;
    @C33608c("num")
    @C12579k
    private String num;
    @C33608c("preference")
    private boolean preference;

    public PhonesUserResponse() {
        this((String) null, (String) null, (String) null, false, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PhonesUserResponse copy$default(PhonesUserResponse phonesUserResponse, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phonesUserResponse.num;
        }
        if ((i2 & 2) != 0) {
            str2 = phonesUserResponse.code;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = phonesUserResponse.category;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            z = phonesUserResponse.preference;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = phonesUserResponse.key;
        }
        return phonesUserResponse.copy(str, str4, str5, z2, i);
    }

    @C12579k
    public final String component1() {
        return this.num;
    }

    @C12579k
    public final String component2() {
        return this.code;
    }

    @C12579k
    public final String component3() {
        return this.category;
    }

    public final boolean component4() {
        return this.preference;
    }

    public final int component5() {
        return this.key;
    }

    @C12579k
    public final PhonesUserResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "category");
        return new PhonesUserResponse(str, str2, str3, z, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonesUserResponse)) {
            return false;
        }
        PhonesUserResponse phonesUserResponse = (PhonesUserResponse) obj;
        return Intrinsics.areEqual((Object) this.num, (Object) phonesUserResponse.num) && Intrinsics.areEqual((Object) this.code, (Object) phonesUserResponse.code) && Intrinsics.areEqual((Object) this.category, (Object) phonesUserResponse.category) && this.preference == phonesUserResponse.preference && this.key == phonesUserResponse.key;
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    public final int getKey() {
        return this.key;
    }

    @C12579k
    public final String getNum() {
        return this.num;
    }

    public final boolean getPreference() {
        return this.preference;
    }

    public int hashCode() {
        int hashCode = ((((this.num.hashCode() * 31) + this.code.hashCode()) * 31) + this.category.hashCode()) * 31;
        boolean z = this.preference;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.key);
    }

    public final void setCategory(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setCode(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setKey(int i) {
        this.key = i;
    }

    public final void setNum(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.num = str;
    }

    public final void setPreference(boolean z) {
        this.preference = z;
    }

    @C12579k
    public String toString() {
        String str = this.num;
        String str2 = this.code;
        String str3 = this.category;
        boolean z = this.preference;
        int i = this.key;
        return "PhonesUserResponse(num=" + str + ", code=" + str2 + ", category=" + str3 + ", preference=" + z + ", key=" + i + ")";
    }

    public PhonesUserResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "num");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "category");
        this.num = str;
        this.code = str2;
        this.category = str3;
        this.preference = z;
        this.key = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PhonesUserResponse(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0009
            java.lang.String r4 = new java.lang.String
            r4.<init>()
        L_0x0009:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000f
            java.lang.String r5 = "0033"
        L_0x000f:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0016
            java.lang.String r6 = "MOB"
        L_0x0016:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001c
            r7 = 1
        L_0x001c:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.PhonesUserResponse.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
