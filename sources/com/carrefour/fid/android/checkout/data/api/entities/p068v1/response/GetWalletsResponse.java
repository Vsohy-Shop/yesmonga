package com.carrefour.fid.android.checkout.data.api.entities.p068v1.response;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v1/response/GetWalletsResponse;", "", "psp_token", "", "(Ljava/lang/String;)V", "getPsp_token", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v1.response.GetWalletsResponse */
public final class GetWalletsResponse {
    @C12580l
    private final String psp_token;

    public GetWalletsResponse() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetWalletsResponse copy$default(GetWalletsResponse getWalletsResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getWalletsResponse.psp_token;
        }
        return getWalletsResponse.copy(str);
    }

    @C12580l
    public final String component1() {
        return this.psp_token;
    }

    @C12579k
    public final GetWalletsResponse copy(@C12580l String str) {
        return new GetWalletsResponse(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetWalletsResponse) && Intrinsics.areEqual((Object) this.psp_token, (Object) ((GetWalletsResponse) obj).psp_token);
    }

    @C12580l
    public final String getPsp_token() {
        return this.psp_token;
    }

    public int hashCode() {
        String str = this.psp_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.psp_token;
        return "GetWalletsResponse(psp_token=" + str + ")";
    }

    public GetWalletsResponse(@C12580l String str) {
        this.psp_token = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetWalletsResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
