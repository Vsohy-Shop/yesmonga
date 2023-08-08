package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ArsenalJOContentResponse;", "", "banner", "Lcom/carrefour/fid/android/data/entities/ArsenalJOBannerResponse;", "accountBalance", "", "associationClientClub", "", "associationClubName", "(Lcom/carrefour/fid/android/data/entities/ArsenalJOBannerResponse;Ljava/lang/String;ILjava/lang/String;)V", "getAccountBalance", "()Ljava/lang/String;", "getAssociationClientClub", "()I", "getAssociationClubName", "getBanner", "()Lcom/carrefour/fid/android/data/entities/ArsenalJOBannerResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ArsenalJOContentResponse {
    public static final int $stable = 0;
    @C33608c("AccountBalance")
    @C12579k
    private final String accountBalance;
    @C33608c("AssociationClientClub")
    private final int associationClientClub;
    @C33608c("AssociationClubName")
    @C12579k
    private final String associationClubName;
    @C33608c("Banniere")
    @C12579k
    private final ArsenalJOBannerResponse banner;

    public ArsenalJOContentResponse(@C12579k ArsenalJOBannerResponse arsenalJOBannerResponse, @C12579k String str, int i, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(arsenalJOBannerResponse, "banner");
        Intrinsics.checkNotNullParameter(str, "accountBalance");
        Intrinsics.checkNotNullParameter(str2, "associationClubName");
        this.banner = arsenalJOBannerResponse;
        this.accountBalance = str;
        this.associationClientClub = i;
        this.associationClubName = str2;
    }

    public static /* synthetic */ ArsenalJOContentResponse copy$default(ArsenalJOContentResponse arsenalJOContentResponse, ArsenalJOBannerResponse arsenalJOBannerResponse, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arsenalJOBannerResponse = arsenalJOContentResponse.banner;
        }
        if ((i2 & 2) != 0) {
            str = arsenalJOContentResponse.accountBalance;
        }
        if ((i2 & 4) != 0) {
            i = arsenalJOContentResponse.associationClientClub;
        }
        if ((i2 & 8) != 0) {
            str2 = arsenalJOContentResponse.associationClubName;
        }
        return arsenalJOContentResponse.copy(arsenalJOBannerResponse, str, i, str2);
    }

    @C12579k
    public final ArsenalJOBannerResponse component1() {
        return this.banner;
    }

    @C12579k
    public final String component2() {
        return this.accountBalance;
    }

    public final int component3() {
        return this.associationClientClub;
    }

    @C12579k
    public final String component4() {
        return this.associationClubName;
    }

    @C12579k
    public final ArsenalJOContentResponse copy(@C12579k ArsenalJOBannerResponse arsenalJOBannerResponse, @C12579k String str, int i, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(arsenalJOBannerResponse, "banner");
        Intrinsics.checkNotNullParameter(str, "accountBalance");
        Intrinsics.checkNotNullParameter(str2, "associationClubName");
        return new ArsenalJOContentResponse(arsenalJOBannerResponse, str, i, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArsenalJOContentResponse)) {
            return false;
        }
        ArsenalJOContentResponse arsenalJOContentResponse = (ArsenalJOContentResponse) obj;
        return Intrinsics.areEqual((Object) this.banner, (Object) arsenalJOContentResponse.banner) && Intrinsics.areEqual((Object) this.accountBalance, (Object) arsenalJOContentResponse.accountBalance) && this.associationClientClub == arsenalJOContentResponse.associationClientClub && Intrinsics.areEqual((Object) this.associationClubName, (Object) arsenalJOContentResponse.associationClubName);
    }

    @C12579k
    public final String getAccountBalance() {
        return this.accountBalance;
    }

    public final int getAssociationClientClub() {
        return this.associationClientClub;
    }

    @C12579k
    public final String getAssociationClubName() {
        return this.associationClubName;
    }

    @C12579k
    public final ArsenalJOBannerResponse getBanner() {
        return this.banner;
    }

    public int hashCode() {
        return (((((this.banner.hashCode() * 31) + this.accountBalance.hashCode()) * 31) + Integer.hashCode(this.associationClientClub)) * 31) + this.associationClubName.hashCode();
    }

    @C12579k
    public String toString() {
        ArsenalJOBannerResponse arsenalJOBannerResponse = this.banner;
        String str = this.accountBalance;
        int i = this.associationClientClub;
        String str2 = this.associationClubName;
        return "ArsenalJOContentResponse(banner=" + arsenalJOBannerResponse + ", accountBalance=" + str + ", associationClientClub=" + i + ", associationClubName=" + str2 + ")";
    }
}
