package com.carrefour.fid.android.loyalty.presentation.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/OperationHistoryModel;", "", "loyaltyTransactionDate", "", "locality", "benefits", "Lcom/carrefour/fid/android/loyalty/presentation/models/BenefitsModel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/loyalty/presentation/models/BenefitsModel;)V", "getBenefits", "()Lcom/carrefour/fid/android/loyalty/presentation/models/BenefitsModel;", "setBenefits", "(Lcom/carrefour/fid/android/loyalty/presentation/models/BenefitsModel;)V", "getLocality", "()Ljava/lang/String;", "setLocality", "(Ljava/lang/String;)V", "getLoyaltyTransactionDate", "setLoyaltyTransactionDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OperationHistoryModel {
    @C12580l
    private BenefitsModel benefits;
    @C12579k
    private String locality;
    @C12579k
    private String loyaltyTransactionDate;

    public OperationHistoryModel() {
        this((String) null, (String) null, (BenefitsModel) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OperationHistoryModel copy$default(OperationHistoryModel operationHistoryModel, String str, String str2, BenefitsModel benefitsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operationHistoryModel.loyaltyTransactionDate;
        }
        if ((i & 2) != 0) {
            str2 = operationHistoryModel.locality;
        }
        if ((i & 4) != 0) {
            benefitsModel = operationHistoryModel.benefits;
        }
        return operationHistoryModel.copy(str, str2, benefitsModel);
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
    public final BenefitsModel component3() {
        return this.benefits;
    }

    @C12579k
    public final OperationHistoryModel copy(@C12579k String str, @C12579k String str2, @C12580l BenefitsModel benefitsModel) {
        Intrinsics.checkNotNullParameter(str, "loyaltyTransactionDate");
        Intrinsics.checkNotNullParameter(str2, "locality");
        return new OperationHistoryModel(str, str2, benefitsModel);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationHistoryModel)) {
            return false;
        }
        OperationHistoryModel operationHistoryModel = (OperationHistoryModel) obj;
        return Intrinsics.areEqual((Object) this.loyaltyTransactionDate, (Object) operationHistoryModel.loyaltyTransactionDate) && Intrinsics.areEqual((Object) this.locality, (Object) operationHistoryModel.locality) && Intrinsics.areEqual((Object) this.benefits, (Object) operationHistoryModel.benefits);
    }

    @C12580l
    public final BenefitsModel getBenefits() {
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
        BenefitsModel benefitsModel = this.benefits;
        return hashCode + (benefitsModel == null ? 0 : benefitsModel.hashCode());
    }

    public final void setBenefits(@C12580l BenefitsModel benefitsModel) {
        this.benefits = benefitsModel;
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
        BenefitsModel benefitsModel = this.benefits;
        return "OperationHistoryModel(loyaltyTransactionDate=" + str + ", locality=" + str2 + ", benefits=" + benefitsModel + ")";
    }

    public OperationHistoryModel(@C12579k String str, @C12579k String str2, @C12580l BenefitsModel benefitsModel) {
        Intrinsics.checkNotNullParameter(str, "loyaltyTransactionDate");
        Intrinsics.checkNotNullParameter(str2, "locality");
        this.loyaltyTransactionDate = str;
        this.locality = str2;
        this.benefits = benefitsModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OperationHistoryModel(String str, String str2, BenefitsModel benefitsModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : benefitsModel);
    }
}
