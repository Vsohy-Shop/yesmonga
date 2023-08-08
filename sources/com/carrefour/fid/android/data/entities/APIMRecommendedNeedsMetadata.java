package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsMetadata;", "", "status", "", "error", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsMetadata;", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedNeedsMetadata {
    public static final int $stable = 0;
    @C33608c("error")
    @C12580l
    private final String error;
    @C33608c("status")
    @C12580l
    private final Integer status;

    public APIMRecommendedNeedsMetadata() {
        this((Integer) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APIMRecommendedNeedsMetadata copy$default(APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aPIMRecommendedNeedsMetadata.status;
        }
        if ((i & 2) != 0) {
            str = aPIMRecommendedNeedsMetadata.error;
        }
        return aPIMRecommendedNeedsMetadata.copy(num, str);
    }

    @C12580l
    public final Integer component1() {
        return this.status;
    }

    @C12580l
    public final String component2() {
        return this.error;
    }

    @C12579k
    public final APIMRecommendedNeedsMetadata copy(@C12580l Integer num, @C12580l String str) {
        return new APIMRecommendedNeedsMetadata(num, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedNeedsMetadata)) {
            return false;
        }
        APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata = (APIMRecommendedNeedsMetadata) obj;
        return Intrinsics.areEqual((Object) this.status, (Object) aPIMRecommendedNeedsMetadata.status) && Intrinsics.areEqual((Object) this.error, (Object) aPIMRecommendedNeedsMetadata.error);
    }

    @C12580l
    public final String getError() {
        return this.error;
    }

    @C12580l
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.error;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.status;
        String str = this.error;
        return "APIMRecommendedNeedsMetadata(status=" + num + ", error=" + str + ")";
    }

    public APIMRecommendedNeedsMetadata(@C12580l Integer num, @C12580l String str) {
        this.status = num;
        this.error = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMRecommendedNeedsMetadata(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
