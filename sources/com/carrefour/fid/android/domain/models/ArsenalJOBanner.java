package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ArsenalJOBanner;", "", "opCode", "", "gameUrl", "gameName", "accountBalance", "associationClientClub", "", "associationClubName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAccountBalance", "()Ljava/lang/String;", "getAssociationClientClub", "()Z", "getAssociationClubName", "getGameName", "getGameUrl", "getOpCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ArsenalJOBanner {
    public static final int $stable = 0;
    @C12579k
    private final String accountBalance;
    private final boolean associationClientClub;
    @C12579k
    private final String associationClubName;
    @C12579k
    private final String gameName;
    @C12579k
    private final String gameUrl;
    @C12579k
    private final String opCode;

    public ArsenalJOBanner(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, boolean z, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        Intrinsics.checkNotNullParameter(str2, "gameUrl");
        Intrinsics.checkNotNullParameter(str3, "gameName");
        Intrinsics.checkNotNullParameter(str4, "accountBalance");
        Intrinsics.checkNotNullParameter(str5, "associationClubName");
        this.opCode = str;
        this.gameUrl = str2;
        this.gameName = str3;
        this.accountBalance = str4;
        this.associationClientClub = z;
        this.associationClubName = str5;
    }

    public static /* synthetic */ ArsenalJOBanner copy$default(ArsenalJOBanner arsenalJOBanner, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arsenalJOBanner.opCode;
        }
        if ((i & 2) != 0) {
            str2 = arsenalJOBanner.gameUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = arsenalJOBanner.gameName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = arsenalJOBanner.accountBalance;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = arsenalJOBanner.associationClientClub;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = arsenalJOBanner.associationClubName;
        }
        return arsenalJOBanner.copy(str, str6, str7, str8, z2, str5);
    }

    @C12579k
    public final String component1() {
        return this.opCode;
    }

    @C12579k
    public final String component2() {
        return this.gameUrl;
    }

    @C12579k
    public final String component3() {
        return this.gameName;
    }

    @C12579k
    public final String component4() {
        return this.accountBalance;
    }

    public final boolean component5() {
        return this.associationClientClub;
    }

    @C12579k
    public final String component6() {
        return this.associationClubName;
    }

    @C12579k
    public final ArsenalJOBanner copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, boolean z, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        Intrinsics.checkNotNullParameter(str2, "gameUrl");
        Intrinsics.checkNotNullParameter(str3, "gameName");
        Intrinsics.checkNotNullParameter(str4, "accountBalance");
        Intrinsics.checkNotNullParameter(str5, "associationClubName");
        return new ArsenalJOBanner(str, str2, str3, str4, z, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArsenalJOBanner)) {
            return false;
        }
        ArsenalJOBanner arsenalJOBanner = (ArsenalJOBanner) obj;
        return Intrinsics.areEqual((Object) this.opCode, (Object) arsenalJOBanner.opCode) && Intrinsics.areEqual((Object) this.gameUrl, (Object) arsenalJOBanner.gameUrl) && Intrinsics.areEqual((Object) this.gameName, (Object) arsenalJOBanner.gameName) && Intrinsics.areEqual((Object) this.accountBalance, (Object) arsenalJOBanner.accountBalance) && this.associationClientClub == arsenalJOBanner.associationClientClub && Intrinsics.areEqual((Object) this.associationClubName, (Object) arsenalJOBanner.associationClubName);
    }

    @C12579k
    public final String getAccountBalance() {
        return this.accountBalance;
    }

    public final boolean getAssociationClientClub() {
        return this.associationClientClub;
    }

    @C12579k
    public final String getAssociationClubName() {
        return this.associationClubName;
    }

    @C12579k
    public final String getGameName() {
        return this.gameName;
    }

    @C12579k
    public final String getGameUrl() {
        return this.gameUrl;
    }

    @C12579k
    public final String getOpCode() {
        return this.opCode;
    }

    public int hashCode() {
        int hashCode = ((((((this.opCode.hashCode() * 31) + this.gameUrl.hashCode()) * 31) + this.gameName.hashCode()) * 31) + this.accountBalance.hashCode()) * 31;
        boolean z = this.associationClientClub;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.associationClubName.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.opCode;
        String str2 = this.gameUrl;
        String str3 = this.gameName;
        String str4 = this.accountBalance;
        boolean z = this.associationClientClub;
        String str5 = this.associationClubName;
        return "ArsenalJOBanner(opCode=" + str + ", gameUrl=" + str2 + ", gameName=" + str3 + ", accountBalance=" + str4 + ", associationClientClub=" + z + ", associationClubName=" + str5 + ")";
    }
}
