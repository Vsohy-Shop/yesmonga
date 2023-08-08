package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountCardBody;", "", "num", "", "date", "", "category", "key", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getDate", "setDate", "getKey", "()Ljava/lang/Integer;", "setKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNum", "setNum", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountCardBody;", "equals", "", "other", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserAccountCardBody {
    @C33608c("category")
    @C12580l
    private String category;
    @C33608c("date")
    @C12580l
    private String date;
    @C33608c("key")
    @C12580l
    private Integer key;
    @C33608c("num")
    @C12580l
    private Integer num;

    public UserAccountCardBody() {
        this((Integer) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserAccountCardBody copy$default(UserAccountCardBody userAccountCardBody, Integer num2, String str, String str2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num2 = userAccountCardBody.num;
        }
        if ((i & 2) != 0) {
            str = userAccountCardBody.date;
        }
        if ((i & 4) != 0) {
            str2 = userAccountCardBody.category;
        }
        if ((i & 8) != 0) {
            num3 = userAccountCardBody.key;
        }
        return userAccountCardBody.copy(num2, str, str2, num3);
    }

    @C12580l
    public final Integer component1() {
        return this.num;
    }

    @C12580l
    public final String component2() {
        return this.date;
    }

    @C12580l
    public final String component3() {
        return this.category;
    }

    @C12580l
    public final Integer component4() {
        return this.key;
    }

    @C12579k
    public final UserAccountCardBody copy(@C12580l Integer num2, @C12580l String str, @C12580l String str2, @C12580l Integer num3) {
        return new UserAccountCardBody(num2, str, str2, num3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccountCardBody)) {
            return false;
        }
        UserAccountCardBody userAccountCardBody = (UserAccountCardBody) obj;
        return Intrinsics.areEqual((Object) this.num, (Object) userAccountCardBody.num) && Intrinsics.areEqual((Object) this.date, (Object) userAccountCardBody.date) && Intrinsics.areEqual((Object) this.category, (Object) userAccountCardBody.category) && Intrinsics.areEqual((Object) this.key, (Object) userAccountCardBody.key);
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getDate() {
        return this.date;
    }

    @C12580l
    public final Integer getKey() {
        return this.key;
    }

    @C12580l
    public final Integer getNum() {
        return this.num;
    }

    public int hashCode() {
        Integer num2 = this.num;
        int i = 0;
        int hashCode = (num2 == null ? 0 : num2.hashCode()) * 31;
        String str = this.date;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.key;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCategory(@C12580l String str) {
        this.category = str;
    }

    public final void setDate(@C12580l String str) {
        this.date = str;
    }

    public final void setKey(@C12580l Integer num2) {
        this.key = num2;
    }

    public final void setNum(@C12580l Integer num2) {
        this.num = num2;
    }

    @C12579k
    public String toString() {
        Integer num2 = this.num;
        String str = this.date;
        String str2 = this.category;
        Integer num3 = this.key;
        return "UserAccountCardBody(num=" + num2 + ", date=" + str + ", category=" + str2 + ", key=" + num3 + ")";
    }

    public UserAccountCardBody(@C12580l Integer num2, @C12580l String str, @C12580l String str2, @C12580l Integer num3) {
        this.num = num2;
        this.date = str;
        this.category = str2;
        this.key = num3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserAccountCardBody(Integer num2, String str, String str2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num2, (i & 2) != 0 ? new String() : str, (i & 4) != 0 ? new String() : str2, (i & 8) != 0 ? 0 : num3);
    }
}
