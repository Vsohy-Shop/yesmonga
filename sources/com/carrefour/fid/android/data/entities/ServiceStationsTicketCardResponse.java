package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ServiceStationsTicketCardResponse;", "", "httpCode", "", "httpMessage", "", "moreInformation", "errorCode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getHttpCode", "()I", "setHttpCode", "(I)V", "getHttpMessage", "setHttpMessage", "getMoreInformation", "setMoreInformation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ServiceStationsTicketCardResponse {
    public static final int $stable = 8;
    @C33608c("error_code")
    @C12580l
    private String errorCode;
    @C33608c("http_code")
    private int httpCode;
    @C33608c("http_message")
    @C12579k
    private String httpMessage;
    @C33608c("more_information")
    @C12579k
    private String moreInformation;

    public ServiceStationsTicketCardResponse() {
        this(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ServiceStationsTicketCardResponse copy$default(ServiceStationsTicketCardResponse serviceStationsTicketCardResponse, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serviceStationsTicketCardResponse.httpCode;
        }
        if ((i2 & 2) != 0) {
            str = serviceStationsTicketCardResponse.httpMessage;
        }
        if ((i2 & 4) != 0) {
            str2 = serviceStationsTicketCardResponse.moreInformation;
        }
        if ((i2 & 8) != 0) {
            str3 = serviceStationsTicketCardResponse.errorCode;
        }
        return serviceStationsTicketCardResponse.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.httpCode;
    }

    @C12579k
    public final String component2() {
        return this.httpMessage;
    }

    @C12579k
    public final String component3() {
        return this.moreInformation;
    }

    @C12580l
    public final String component4() {
        return this.errorCode;
    }

    @C12579k
    public final ServiceStationsTicketCardResponse copy(int i, @C12579k String str, @C12579k String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "httpMessage");
        Intrinsics.checkNotNullParameter(str2, "moreInformation");
        return new ServiceStationsTicketCardResponse(i, str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceStationsTicketCardResponse)) {
            return false;
        }
        ServiceStationsTicketCardResponse serviceStationsTicketCardResponse = (ServiceStationsTicketCardResponse) obj;
        return this.httpCode == serviceStationsTicketCardResponse.httpCode && Intrinsics.areEqual((Object) this.httpMessage, (Object) serviceStationsTicketCardResponse.httpMessage) && Intrinsics.areEqual((Object) this.moreInformation, (Object) serviceStationsTicketCardResponse.moreInformation) && Intrinsics.areEqual((Object) this.errorCode, (Object) serviceStationsTicketCardResponse.errorCode);
    }

    @C12580l
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    @C12579k
    public final String getHttpMessage() {
        return this.httpMessage;
    }

    @C12579k
    public final String getMoreInformation() {
        return this.moreInformation;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.httpCode) * 31) + this.httpMessage.hashCode()) * 31) + this.moreInformation.hashCode()) * 31;
        String str = this.errorCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setErrorCode(@C12580l String str) {
        this.errorCode = str;
    }

    public final void setHttpCode(int i) {
        this.httpCode = i;
    }

    public final void setHttpMessage(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.httpMessage = str;
    }

    public final void setMoreInformation(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moreInformation = str;
    }

    @C12579k
    public String toString() {
        int i = this.httpCode;
        String str = this.httpMessage;
        String str2 = this.moreInformation;
        String str3 = this.errorCode;
        return "ServiceStationsTicketCardResponse(httpCode=" + i + ", httpMessage=" + str + ", moreInformation=" + str2 + ", errorCode=" + str3 + ")";
    }

    public ServiceStationsTicketCardResponse(int i, @C12579k String str, @C12579k String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "httpMessage");
        Intrinsics.checkNotNullParameter(str2, "moreInformation");
        this.httpCode = i;
        this.httpMessage = str;
        this.moreInformation = str2;
        this.errorCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceStationsTicketCardResponse(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new String() : str, (i2 & 4) != 0 ? new String() : str2, (i2 & 8) != 0 ? new String() : str3);
    }
}
