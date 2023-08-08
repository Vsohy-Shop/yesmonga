package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CurrentCampaignsResponse;", "", "startDate", "", "endDate", "receiptReceptionDeadline", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "getReceiptReceptionDeadline", "setReceiptReceptionDeadline", "getStartDate", "setStartDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CurrentCampaignsResponse {
    public static final int $stable = 8;
    @C33608c("endDate")
    @C12579k
    private String endDate;
    @C33608c("receiptReceptionDeadline")
    @C12579k
    private String receiptReceptionDeadline;
    @C33608c("startDate")
    @C12579k
    private String startDate;

    public CurrentCampaignsResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CurrentCampaignsResponse copy$default(CurrentCampaignsResponse currentCampaignsResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentCampaignsResponse.startDate;
        }
        if ((i & 2) != 0) {
            str2 = currentCampaignsResponse.endDate;
        }
        if ((i & 4) != 0) {
            str3 = currentCampaignsResponse.receiptReceptionDeadline;
        }
        return currentCampaignsResponse.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.startDate;
    }

    @C12579k
    public final String component2() {
        return this.endDate;
    }

    @C12579k
    public final String component3() {
        return this.receiptReceptionDeadline;
    }

    @C12579k
    public final CurrentCampaignsResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(str3, "receiptReceptionDeadline");
        return new CurrentCampaignsResponse(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentCampaignsResponse)) {
            return false;
        }
        CurrentCampaignsResponse currentCampaignsResponse = (CurrentCampaignsResponse) obj;
        return Intrinsics.areEqual((Object) this.startDate, (Object) currentCampaignsResponse.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) currentCampaignsResponse.endDate) && Intrinsics.areEqual((Object) this.receiptReceptionDeadline, (Object) currentCampaignsResponse.receiptReceptionDeadline);
    }

    @C12579k
    public final String getEndDate() {
        return this.endDate;
    }

    @C12579k
    public final String getReceiptReceptionDeadline() {
        return this.receiptReceptionDeadline;
    }

    @C12579k
    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return (((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.receiptReceptionDeadline.hashCode();
    }

    public final void setEndDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endDate = str;
    }

    public final void setReceiptReceptionDeadline(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptReceptionDeadline = str;
    }

    public final void setStartDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDate = str;
    }

    @C12579k
    public String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        String str3 = this.receiptReceptionDeadline;
        return "CurrentCampaignsResponse(startDate=" + str + ", endDate=" + str2 + ", receiptReceptionDeadline=" + str3 + ")";
    }

    public CurrentCampaignsResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(str3, "receiptReceptionDeadline");
        this.startDate = str;
        this.endDate = str2;
        this.receiptReceptionDeadline = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentCampaignsResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
