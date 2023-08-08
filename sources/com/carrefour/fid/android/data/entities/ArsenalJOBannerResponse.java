package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ArsenalJOBannerResponse;", "", "opCode", "", "opName", "gameUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGameUrl", "()Ljava/lang/String;", "getOpCode", "getOpName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ArsenalJOBannerResponse {
    public static final int $stable = 0;
    @C33608c("Game_Url")
    @C12579k
    private final String gameUrl;
    @C33608c("Op_Code")
    @C12579k
    private final String opCode;
    @C33608c("Op_Name")
    @C12579k
    private final String opName;

    public ArsenalJOBannerResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        Intrinsics.checkNotNullParameter(str2, "opName");
        Intrinsics.checkNotNullParameter(str3, "gameUrl");
        this.opCode = str;
        this.opName = str2;
        this.gameUrl = str3;
    }

    public static /* synthetic */ ArsenalJOBannerResponse copy$default(ArsenalJOBannerResponse arsenalJOBannerResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arsenalJOBannerResponse.opCode;
        }
        if ((i & 2) != 0) {
            str2 = arsenalJOBannerResponse.opName;
        }
        if ((i & 4) != 0) {
            str3 = arsenalJOBannerResponse.gameUrl;
        }
        return arsenalJOBannerResponse.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.opCode;
    }

    @C12579k
    public final String component2() {
        return this.opName;
    }

    @C12579k
    public final String component3() {
        return this.gameUrl;
    }

    @C12579k
    public final ArsenalJOBannerResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "opCode");
        Intrinsics.checkNotNullParameter(str2, "opName");
        Intrinsics.checkNotNullParameter(str3, "gameUrl");
        return new ArsenalJOBannerResponse(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArsenalJOBannerResponse)) {
            return false;
        }
        ArsenalJOBannerResponse arsenalJOBannerResponse = (ArsenalJOBannerResponse) obj;
        return Intrinsics.areEqual((Object) this.opCode, (Object) arsenalJOBannerResponse.opCode) && Intrinsics.areEqual((Object) this.opName, (Object) arsenalJOBannerResponse.opName) && Intrinsics.areEqual((Object) this.gameUrl, (Object) arsenalJOBannerResponse.gameUrl);
    }

    @C12579k
    public final String getGameUrl() {
        return this.gameUrl;
    }

    @C12579k
    public final String getOpCode() {
        return this.opCode;
    }

    @C12579k
    public final String getOpName() {
        return this.opName;
    }

    public int hashCode() {
        return (((this.opCode.hashCode() * 31) + this.opName.hashCode()) * 31) + this.gameUrl.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.opCode;
        String str2 = this.opName;
        String str3 = this.gameUrl;
        return "ArsenalJOBannerResponse(opCode=" + str + ", opName=" + str2 + ", gameUrl=" + str3 + ")";
    }
}
