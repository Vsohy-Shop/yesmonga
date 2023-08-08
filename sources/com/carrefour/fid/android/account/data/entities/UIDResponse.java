package com.carrefour.fid.android.account.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/entities/UIDResponse;", "", "uidIam", "", "uidLocal", "(Ljava/lang/String;Ljava/lang/String;)V", "getUidIam", "()Ljava/lang/String;", "setUidIam", "(Ljava/lang/String;)V", "getUidLocal", "setUidLocal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class UIDResponse {
    public static final int $stable = 8;
    @C12579k
    private String uidIam;
    @C12579k
    private String uidLocal;

    public UIDResponse() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UIDResponse copy$default(UIDResponse uIDResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uIDResponse.uidIam;
        }
        if ((i & 2) != 0) {
            str2 = uIDResponse.uidLocal;
        }
        return uIDResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.uidIam;
    }

    @C12579k
    public final String component2() {
        return this.uidLocal;
    }

    @C12579k
    public final UIDResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "uidIam");
        Intrinsics.checkNotNullParameter(str2, "uidLocal");
        return new UIDResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIDResponse)) {
            return false;
        }
        UIDResponse uIDResponse = (UIDResponse) obj;
        return Intrinsics.areEqual((Object) this.uidIam, (Object) uIDResponse.uidIam) && Intrinsics.areEqual((Object) this.uidLocal, (Object) uIDResponse.uidLocal);
    }

    @C12579k
    public final String getUidIam() {
        return this.uidIam;
    }

    @C12579k
    public final String getUidLocal() {
        return this.uidLocal;
    }

    public int hashCode() {
        return (this.uidIam.hashCode() * 31) + this.uidLocal.hashCode();
    }

    public final void setUidIam(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uidIam = str;
    }

    public final void setUidLocal(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uidLocal = str;
    }

    @C12579k
    public String toString() {
        String str = this.uidIam;
        String str2 = this.uidLocal;
        return "UIDResponse(uidIam=" + str + ", uidLocal=" + str2 + ")";
    }

    public UIDResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "uidIam");
        Intrinsics.checkNotNullParameter(str2, "uidLocal");
        this.uidIam = str;
        this.uidLocal = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UIDResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2);
    }
}
