package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAccountBody;", "", "civility", "", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivility", "()Ljava/lang/String;", "setCivility", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getLastName", "setLastName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UpdateAccountBody {
    @C33608c("civility")
    @C12580l
    private String civility;
    @C33608c("first_name")
    @C12580l
    private String firstName;
    @C33608c("last_name")
    @C12580l
    private String lastName;

    public UpdateAccountBody() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateAccountBody copy$default(UpdateAccountBody updateAccountBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateAccountBody.civility;
        }
        if ((i & 2) != 0) {
            str2 = updateAccountBody.firstName;
        }
        if ((i & 4) != 0) {
            str3 = updateAccountBody.lastName;
        }
        return updateAccountBody.copy(str, str2, str3);
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

    @C12579k
    public final UpdateAccountBody copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new UpdateAccountBody(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAccountBody)) {
            return false;
        }
        UpdateAccountBody updateAccountBody = (UpdateAccountBody) obj;
        return Intrinsics.areEqual((Object) this.civility, (Object) updateAccountBody.civility) && Intrinsics.areEqual((Object) this.firstName, (Object) updateAccountBody.firstName) && Intrinsics.areEqual((Object) this.lastName, (Object) updateAccountBody.lastName);
    }

    @C12580l
    public final String getCivility() {
        return this.civility;
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
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setCivility(@C12580l String str) {
        this.civility = str;
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
        return "UpdateAccountBody(civility=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ")";
    }

    public UpdateAccountBody(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.civility = str;
        this.firstName = str2;
        this.lastName = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateAccountBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : str3);
    }
}
