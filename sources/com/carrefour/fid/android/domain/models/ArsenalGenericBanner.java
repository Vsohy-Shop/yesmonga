package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/ArsenalGenericBanner;", "", "gameUrl", "", "bannerUrl", "opName", "opCode", "textAlt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerUrl", "()Ljava/lang/String;", "getGameUrl", "getOpCode", "getOpName", "getTextAlt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ArsenalGenericBanner {
    public static final int $stable = 0;
    @C12579k
    private final String bannerUrl;
    @C12579k
    private final String gameUrl;
    @C12579k
    private final String opCode;
    @C12579k
    private final String opName;
    @C12580l
    private final String textAlt;

    public ArsenalGenericBanner(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "gameUrl");
        Intrinsics.checkNotNullParameter(str2, "bannerUrl");
        Intrinsics.checkNotNullParameter(str3, "opName");
        Intrinsics.checkNotNullParameter(str4, "opCode");
        this.gameUrl = str;
        this.bannerUrl = str2;
        this.opName = str3;
        this.opCode = str4;
        this.textAlt = str5;
    }

    public static /* synthetic */ ArsenalGenericBanner copy$default(ArsenalGenericBanner arsenalGenericBanner, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arsenalGenericBanner.gameUrl;
        }
        if ((i & 2) != 0) {
            str2 = arsenalGenericBanner.bannerUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = arsenalGenericBanner.opName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = arsenalGenericBanner.opCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = arsenalGenericBanner.textAlt;
        }
        return arsenalGenericBanner.copy(str, str6, str7, str8, str5);
    }

    @C12579k
    public final String component1() {
        return this.gameUrl;
    }

    @C12579k
    public final String component2() {
        return this.bannerUrl;
    }

    @C12579k
    public final String component3() {
        return this.opName;
    }

    @C12579k
    public final String component4() {
        return this.opCode;
    }

    @C12580l
    public final String component5() {
        return this.textAlt;
    }

    @C12579k
    public final ArsenalGenericBanner copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "gameUrl");
        Intrinsics.checkNotNullParameter(str2, "bannerUrl");
        Intrinsics.checkNotNullParameter(str3, "opName");
        Intrinsics.checkNotNullParameter(str4, "opCode");
        return new ArsenalGenericBanner(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArsenalGenericBanner)) {
            return false;
        }
        ArsenalGenericBanner arsenalGenericBanner = (ArsenalGenericBanner) obj;
        return Intrinsics.areEqual((Object) this.gameUrl, (Object) arsenalGenericBanner.gameUrl) && Intrinsics.areEqual((Object) this.bannerUrl, (Object) arsenalGenericBanner.bannerUrl) && Intrinsics.areEqual((Object) this.opName, (Object) arsenalGenericBanner.opName) && Intrinsics.areEqual((Object) this.opCode, (Object) arsenalGenericBanner.opCode) && Intrinsics.areEqual((Object) this.textAlt, (Object) arsenalGenericBanner.textAlt);
    }

    @C12579k
    public final String getBannerUrl() {
        return this.bannerUrl;
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

    @C12580l
    public final String getTextAlt() {
        return this.textAlt;
    }

    public int hashCode() {
        int hashCode = ((((((this.gameUrl.hashCode() * 31) + this.bannerUrl.hashCode()) * 31) + this.opName.hashCode()) * 31) + this.opCode.hashCode()) * 31;
        String str = this.textAlt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.gameUrl;
        String str2 = this.bannerUrl;
        String str3 = this.opName;
        String str4 = this.opCode;
        String str5 = this.textAlt;
        return "ArsenalGenericBanner(gameUrl=" + str + ", bannerUrl=" + str2 + ", opName=" + str3 + ", opCode=" + str4 + ", textAlt=" + str5 + ")";
    }
}
