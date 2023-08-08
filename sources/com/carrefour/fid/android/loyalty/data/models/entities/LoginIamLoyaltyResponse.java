package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoginIamLoyaltyResponse;", "", "idTokenLoyalty", "", "accessTokenLoyalty", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessTokenLoyalty", "()Ljava/lang/String;", "getIdTokenLoyalty", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class LoginIamLoyaltyResponse {
    @C33608c("access_token")
    @C12579k
    private final String accessTokenLoyalty;
    @C33608c("id_token")
    @C12579k
    private final String idTokenLoyalty;

    public LoginIamLoyaltyResponse() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoginIamLoyaltyResponse copy$default(LoginIamLoyaltyResponse loginIamLoyaltyResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginIamLoyaltyResponse.idTokenLoyalty;
        }
        if ((i & 2) != 0) {
            str2 = loginIamLoyaltyResponse.accessTokenLoyalty;
        }
        return loginIamLoyaltyResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.idTokenLoyalty;
    }

    @C12579k
    public final String component2() {
        return this.accessTokenLoyalty;
    }

    @C12579k
    public final LoginIamLoyaltyResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "idTokenLoyalty");
        Intrinsics.checkNotNullParameter(str2, "accessTokenLoyalty");
        return new LoginIamLoyaltyResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginIamLoyaltyResponse)) {
            return false;
        }
        LoginIamLoyaltyResponse loginIamLoyaltyResponse = (LoginIamLoyaltyResponse) obj;
        return Intrinsics.areEqual((Object) this.idTokenLoyalty, (Object) loginIamLoyaltyResponse.idTokenLoyalty) && Intrinsics.areEqual((Object) this.accessTokenLoyalty, (Object) loginIamLoyaltyResponse.accessTokenLoyalty);
    }

    @C12579k
    public final String getAccessTokenLoyalty() {
        return this.accessTokenLoyalty;
    }

    @C12579k
    public final String getIdTokenLoyalty() {
        return this.idTokenLoyalty;
    }

    public int hashCode() {
        return (this.idTokenLoyalty.hashCode() * 31) + this.accessTokenLoyalty.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.idTokenLoyalty;
        String str2 = this.accessTokenLoyalty;
        return "LoginIamLoyaltyResponse(idTokenLoyalty=" + str + ", accessTokenLoyalty=" + str2 + ")";
    }

    public LoginIamLoyaltyResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "idTokenLoyalty");
        Intrinsics.checkNotNullParameter(str2, "accessTokenLoyalty");
        this.idTokenLoyalty = str;
        this.accessTokenLoyalty = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginIamLoyaltyResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2);
    }
}
