package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketErrorResponse;", "", "errorCode", "", "message", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketErrorResponse */
public final class BasketErrorResponse {
    @C33608c("error_code")
    @C12580l
    private final String errorCode;
    @C33608c("message")
    @C12580l
    private final String message;
    @C33608c("type")
    @C12580l
    private final String type;

    public BasketErrorResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketErrorResponse copy$default(BasketErrorResponse basketErrorResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketErrorResponse.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = basketErrorResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = basketErrorResponse.type;
        }
        return basketErrorResponse.copy(str, str2, str3);
    }

    @C12580l
    public final String component1() {
        return this.errorCode;
    }

    @C12580l
    public final String component2() {
        return this.message;
    }

    @C12580l
    public final String component3() {
        return this.type;
    }

    @C12579k
    public final BasketErrorResponse copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new BasketErrorResponse(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketErrorResponse)) {
            return false;
        }
        BasketErrorResponse basketErrorResponse = (BasketErrorResponse) obj;
        return Intrinsics.areEqual((Object) this.errorCode, (Object) basketErrorResponse.errorCode) && Intrinsics.areEqual((Object) this.message, (Object) basketErrorResponse.message) && Intrinsics.areEqual((Object) this.type, (Object) basketErrorResponse.type);
    }

    @C12580l
    public final String getErrorCode() {
        return this.errorCode;
    }

    @C12580l
    public final String getMessage() {
        return this.message;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.errorCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.errorCode;
        String str2 = this.message;
        String str3 = this.type;
        return "BasketErrorResponse(errorCode=" + str + ", message=" + str2 + ", type=" + str3 + ")";
    }

    public BasketErrorResponse(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.errorCode = str;
        this.message = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketErrorResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
