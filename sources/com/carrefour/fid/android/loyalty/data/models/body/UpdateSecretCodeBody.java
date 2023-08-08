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

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/body/UpdateSecretCodeBody;", "Ljava/io/Serializable;", "newSecretCode", "", "origin", "validationOtpCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNewSecretCode", "()Ljava/lang/String;", "setNewSecretCode", "(Ljava/lang/String;)V", "getOrigin", "setOrigin", "getValidationOtpCode", "setValidationOtpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UpdateSecretCodeBody implements Serializable {
    @C33608c("new_secret_code")
    @C12580l
    @C33606a
    private String newSecretCode;
    @C33608c("origin")
    @C12580l
    @C33606a
    private String origin;
    @C33608c("validation_otp_code")
    @C12580l
    @C33606a
    private String validationOtpCode;

    public UpdateSecretCodeBody() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateSecretCodeBody copy$default(UpdateSecretCodeBody updateSecretCodeBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateSecretCodeBody.newSecretCode;
        }
        if ((i & 2) != 0) {
            str2 = updateSecretCodeBody.origin;
        }
        if ((i & 4) != 0) {
            str3 = updateSecretCodeBody.validationOtpCode;
        }
        return updateSecretCodeBody.copy(str, str2, str3);
    }

    @C12580l
    public final String component1() {
        return this.newSecretCode;
    }

    @C12580l
    public final String component2() {
        return this.origin;
    }

    @C12580l
    public final String component3() {
        return this.validationOtpCode;
    }

    @C12579k
    public final UpdateSecretCodeBody copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new UpdateSecretCodeBody(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSecretCodeBody)) {
            return false;
        }
        UpdateSecretCodeBody updateSecretCodeBody = (UpdateSecretCodeBody) obj;
        return Intrinsics.areEqual((Object) this.newSecretCode, (Object) updateSecretCodeBody.newSecretCode) && Intrinsics.areEqual((Object) this.origin, (Object) updateSecretCodeBody.origin) && Intrinsics.areEqual((Object) this.validationOtpCode, (Object) updateSecretCodeBody.validationOtpCode);
    }

    @C12580l
    public final String getNewSecretCode() {
        return this.newSecretCode;
    }

    @C12580l
    public final String getOrigin() {
        return this.origin;
    }

    @C12580l
    public final String getValidationOtpCode() {
        return this.validationOtpCode;
    }

    public int hashCode() {
        String str = this.newSecretCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.origin;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validationOtpCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setNewSecretCode(@C12580l String str) {
        this.newSecretCode = str;
    }

    public final void setOrigin(@C12580l String str) {
        this.origin = str;
    }

    public final void setValidationOtpCode(@C12580l String str) {
        this.validationOtpCode = str;
    }

    @C12579k
    public String toString() {
        String str = this.newSecretCode;
        String str2 = this.origin;
        String str3 = this.validationOtpCode;
        return "UpdateSecretCodeBody(newSecretCode=" + str + ", origin=" + str2 + ", validationOtpCode=" + str3 + ")";
    }

    public UpdateSecretCodeBody(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.newSecretCode = str;
        this.origin = str2;
        this.validationOtpCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateSecretCodeBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "MOBILE" : str2, (i & 4) != 0 ? "" : str3);
    }
}
