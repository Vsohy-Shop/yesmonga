package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountResponse;", "", "code", "", "message", "", "returnObject", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ReturnObjectResponse;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ReturnObjectResponse;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getReturnObject", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ReturnObjectResponse;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ReturnObjectResponse;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UserAccountResponse;", "equals", "", "other", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UserAccountResponse {
    @C33608c("code")
    @C12580l
    private final Integer code;
    @C33608c("message")
    @C12580l
    private final String message;
    @C33608c("return_object")
    @C12580l
    private final ReturnObjectResponse returnObject;

    public UserAccountResponse() {
        this((Integer) null, (String) null, (ReturnObjectResponse) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserAccountResponse copy$default(UserAccountResponse userAccountResponse, Integer num, String str, ReturnObjectResponse returnObjectResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            num = userAccountResponse.code;
        }
        if ((i & 2) != 0) {
            str = userAccountResponse.message;
        }
        if ((i & 4) != 0) {
            returnObjectResponse = userAccountResponse.returnObject;
        }
        return userAccountResponse.copy(num, str, returnObjectResponse);
    }

    @C12580l
    public final Integer component1() {
        return this.code;
    }

    @C12580l
    public final String component2() {
        return this.message;
    }

    @C12580l
    public final ReturnObjectResponse component3() {
        return this.returnObject;
    }

    @C12579k
    public final UserAccountResponse copy(@C12580l Integer num, @C12580l String str, @C12580l ReturnObjectResponse returnObjectResponse) {
        return new UserAccountResponse(num, str, returnObjectResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccountResponse)) {
            return false;
        }
        UserAccountResponse userAccountResponse = (UserAccountResponse) obj;
        return Intrinsics.areEqual((Object) this.code, (Object) userAccountResponse.code) && Intrinsics.areEqual((Object) this.message, (Object) userAccountResponse.message) && Intrinsics.areEqual((Object) this.returnObject, (Object) userAccountResponse.returnObject);
    }

    @C12580l
    public final Integer getCode() {
        return this.code;
    }

    @C12580l
    public final String getMessage() {
        return this.message;
    }

    @C12580l
    public final ReturnObjectResponse getReturnObject() {
        return this.returnObject;
    }

    public int hashCode() {
        Integer num = this.code;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReturnObjectResponse returnObjectResponse = this.returnObject;
        if (returnObjectResponse != null) {
            i = returnObjectResponse.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.code;
        String str = this.message;
        ReturnObjectResponse returnObjectResponse = this.returnObject;
        return "UserAccountResponse(code=" + num + ", message=" + str + ", returnObject=" + returnObjectResponse + ")";
    }

    public UserAccountResponse(@C12580l Integer num, @C12580l String str, @C12580l ReturnObjectResponse returnObjectResponse) {
        this.code = num;
        this.message = str;
        this.returnObject = returnObjectResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserAccountResponse(Integer num, String str, ReturnObjectResponse returnObjectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : returnObjectResponse);
    }
}
