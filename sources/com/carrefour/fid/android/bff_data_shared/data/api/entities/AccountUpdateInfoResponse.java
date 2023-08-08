package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AccountUpdateInfoResponse;", "", "civility", "", "lastName", "firstName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivility", "()Ljava/lang/String;", "setCivility", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getLastName", "setLastName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AccountUpdateInfoResponse {
    @C12579k
    private String civility;
    @C12579k
    private String firstName;
    @C12579k
    private String lastName;

    public AccountUpdateInfoResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "civility");
        Intrinsics.checkNotNullParameter(str2, "lastName");
        Intrinsics.checkNotNullParameter(str3, "firstName");
        this.civility = str;
        this.lastName = str2;
        this.firstName = str3;
    }

    public static /* synthetic */ AccountUpdateInfoResponse copy$default(AccountUpdateInfoResponse accountUpdateInfoResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountUpdateInfoResponse.civility;
        }
        if ((i & 2) != 0) {
            str2 = accountUpdateInfoResponse.lastName;
        }
        if ((i & 4) != 0) {
            str3 = accountUpdateInfoResponse.firstName;
        }
        return accountUpdateInfoResponse.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.civility;
    }

    @C12579k
    public final String component2() {
        return this.lastName;
    }

    @C12579k
    public final String component3() {
        return this.firstName;
    }

    @C12579k
    public final AccountUpdateInfoResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "civility");
        Intrinsics.checkNotNullParameter(str2, "lastName");
        Intrinsics.checkNotNullParameter(str3, "firstName");
        return new AccountUpdateInfoResponse(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUpdateInfoResponse)) {
            return false;
        }
        AccountUpdateInfoResponse accountUpdateInfoResponse = (AccountUpdateInfoResponse) obj;
        return Intrinsics.areEqual((Object) this.civility, (Object) accountUpdateInfoResponse.civility) && Intrinsics.areEqual((Object) this.lastName, (Object) accountUpdateInfoResponse.lastName) && Intrinsics.areEqual((Object) this.firstName, (Object) accountUpdateInfoResponse.firstName);
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

    public int hashCode() {
        return (((this.civility.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.firstName.hashCode();
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

    @C12579k
    public String toString() {
        String str = this.civility;
        String str2 = this.lastName;
        String str3 = this.firstName;
        return "AccountUpdateInfoResponse(civility=" + str + ", lastName=" + str2 + ", firstName=" + str3 + ")";
    }
}
