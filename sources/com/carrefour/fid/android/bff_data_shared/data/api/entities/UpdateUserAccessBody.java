package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateUserAccessBody;", "", "oldPassword", "", "newPassword", "newLogin", "uriRedirect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNewLogin", "()Ljava/lang/String;", "setNewLogin", "(Ljava/lang/String;)V", "getNewPassword", "setNewPassword", "getOldPassword", "setOldPassword", "getUriRedirect", "setUriRedirect", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UpdateUserAccessBody {
    @C33608c("new_login")
    @C12580l
    private String newLogin;
    @C33608c("new_password")
    @C12580l
    private String newPassword;
    @C33608c("old_password")
    @C12580l
    private String oldPassword;
    @C33608c("uri_redirect")
    @C12580l
    private String uriRedirect;

    public UpdateUserAccessBody() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateUserAccessBody copy$default(UpdateUserAccessBody updateUserAccessBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateUserAccessBody.oldPassword;
        }
        if ((i & 2) != 0) {
            str2 = updateUserAccessBody.newPassword;
        }
        if ((i & 4) != 0) {
            str3 = updateUserAccessBody.newLogin;
        }
        if ((i & 8) != 0) {
            str4 = updateUserAccessBody.uriRedirect;
        }
        return updateUserAccessBody.copy(str, str2, str3, str4);
    }

    @C12580l
    public final String component1() {
        return this.oldPassword;
    }

    @C12580l
    public final String component2() {
        return this.newPassword;
    }

    @C12580l
    public final String component3() {
        return this.newLogin;
    }

    @C12580l
    public final String component4() {
        return this.uriRedirect;
    }

    @C12579k
    public final UpdateUserAccessBody copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        return new UpdateUserAccessBody(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserAccessBody)) {
            return false;
        }
        UpdateUserAccessBody updateUserAccessBody = (UpdateUserAccessBody) obj;
        return Intrinsics.areEqual((Object) this.oldPassword, (Object) updateUserAccessBody.oldPassword) && Intrinsics.areEqual((Object) this.newPassword, (Object) updateUserAccessBody.newPassword) && Intrinsics.areEqual((Object) this.newLogin, (Object) updateUserAccessBody.newLogin) && Intrinsics.areEqual((Object) this.uriRedirect, (Object) updateUserAccessBody.uriRedirect);
    }

    @C12580l
    public final String getNewLogin() {
        return this.newLogin;
    }

    @C12580l
    public final String getNewPassword() {
        return this.newPassword;
    }

    @C12580l
    public final String getOldPassword() {
        return this.oldPassword;
    }

    @C12580l
    public final String getUriRedirect() {
        return this.uriRedirect;
    }

    public int hashCode() {
        String str = this.oldPassword;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.newPassword;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.newLogin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uriRedirect;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setNewLogin(@C12580l String str) {
        this.newLogin = str;
    }

    public final void setNewPassword(@C12580l String str) {
        this.newPassword = str;
    }

    public final void setOldPassword(@C12580l String str) {
        this.oldPassword = str;
    }

    public final void setUriRedirect(@C12580l String str) {
        this.uriRedirect = str;
    }

    @C12579k
    public String toString() {
        String str = this.oldPassword;
        String str2 = this.newPassword;
        String str3 = this.newLogin;
        String str4 = this.uriRedirect;
        return "UpdateUserAccessBody(oldPassword=" + str + ", newPassword=" + str2 + ", newLogin=" + str3 + ", uriRedirect=" + str4 + ")";
    }

    public UpdateUserAccessBody(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        this.oldPassword = str;
        this.newPassword = str2;
        this.newLogin = str3;
        this.uriRedirect = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateUserAccessBody(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3, (i & 8) != 0 ? new String() : str4);
    }
}
