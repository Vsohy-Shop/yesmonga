package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/LoyaltyCardOperationHistoryResponse;", "", "loyaltyTransactionDate", "", "locality", "benefits", "Lcom/carrefour/fid/android/loyalty/data/models/entities/BenefitsResponse;", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/data/models/entities/BenefitsResponse;)V", "getBenefits", "()Lcom/carrefour/fid/android/loyalty/data/models/entities/BenefitsResponse;", "setBenefits", "(Lcom/carrefour/fid/android/loyalty/data/models/entities/BenefitsResponse;)V", "getLocality", "()Ljava/lang/String;", "setLocality", "(Ljava/lang/String;)V", "getLoyaltyTransactionDate", "setLoyaltyTransactionDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class LoyaltyCardOperationHistoryResponse {
    @C12580l
    private BenefitsResponse benefits;
    @C33608c(alternate = {"location"}, value = "lieu")
    @C12579k
    private String locality;
    @C33608c(alternate = {"operation_date"}, value = "dateOperation")
    @C12579k
    private String loyaltyTransactionDate;

    public LoyaltyCardOperationHistoryResponse() {
        this((String) null, (String) null, (BenefitsResponse) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoyaltyCardOperationHistoryResponse copy$default(LoyaltyCardOperationHistoryResponse loyaltyCardOperationHistoryResponse, String str, String str2, BenefitsResponse benefitsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyCardOperationHistoryResponse.loyaltyTransactionDate;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyCardOperationHistoryResponse.locality;
        }
        if ((i & 4) != 0) {
            benefitsResponse = loyaltyCardOperationHistoryResponse.benefits;
        }
        return loyaltyCardOperationHistoryResponse.copy(str, str2, benefitsResponse);
    }

    @C12579k
    public final String component1() {
        return this.loyaltyTransactionDate;
    }

    @C12579k
    public final String component2() {
        return this.locality;
    }

    @C12580l
    public final BenefitsResponse component3() {
        return this.benefits;
    }

    @C12579k
    public final LoyaltyCardOperationHistoryResponse copy(@C12579k String str, @C12579k String str2, @C12580l BenefitsResponse benefitsResponse) {
        Intrinsics.checkNotNullParameter(str, "loyaltyTransactionDate");
        Intrinsics.checkNotNullParameter(str2, "locality");
        return new LoyaltyCardOperationHistoryResponse(str, str2, benefitsResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyCardOperationHistoryResponse)) {
            return false;
        }
        LoyaltyCardOperationHistoryResponse loyaltyCardOperationHistoryResponse = (LoyaltyCardOperationHistoryResponse) obj;
        return Intrinsics.areEqual((Object) this.loyaltyTransactionDate, (Object) loyaltyCardOperationHistoryResponse.loyaltyTransactionDate) && Intrinsics.areEqual((Object) this.locality, (Object) loyaltyCardOperationHistoryResponse.locality) && Intrinsics.areEqual((Object) this.benefits, (Object) loyaltyCardOperationHistoryResponse.benefits);
    }

    @C12580l
    public final BenefitsResponse getBenefits() {
        return this.benefits;
    }

    @C12579k
    public final String getLocality() {
        return this.locality;
    }

    @C12579k
    public final String getLoyaltyTransactionDate() {
        return this.loyaltyTransactionDate;
    }

    public int hashCode() {
        int hashCode = ((this.loyaltyTransactionDate.hashCode() * 31) + this.locality.hashCode()) * 31;
        BenefitsResponse benefitsResponse = this.benefits;
        return hashCode + (benefitsResponse == null ? 0 : benefitsResponse.hashCode());
    }

    public final void setBenefits(@C12580l BenefitsResponse benefitsResponse) {
        this.benefits = benefitsResponse;
    }

    public final void setLocality(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locality = str;
    }

    public final void setLoyaltyTransactionDate(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loyaltyTransactionDate = str;
    }

    @C12579k
    public String toString() {
        String str = this.loyaltyTransactionDate;
        String str2 = this.locality;
        BenefitsResponse benefitsResponse = this.benefits;
        return "LoyaltyCardOperationHistoryResponse(loyaltyTransactionDate=" + str + ", locality=" + str2 + ", benefits=" + benefitsResponse + ")";
    }

    public LoyaltyCardOperationHistoryResponse(@C12579k String str, @C12579k String str2, @C12580l BenefitsResponse benefitsResponse) {
        Intrinsics.checkNotNullParameter(str, "loyaltyTransactionDate");
        Intrinsics.checkNotNullParameter(str2, "locality");
        this.loyaltyTransactionDate = str;
        this.locality = str2;
        this.benefits = benefitsResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoyaltyCardOperationHistoryResponse(String str, String str2, BenefitsResponse benefitsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : benefitsResponse);
    }
}
