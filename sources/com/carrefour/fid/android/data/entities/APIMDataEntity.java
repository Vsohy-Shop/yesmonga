package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J«\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMDataEntity;", "", "orderKey", "", "orderDate", "loyaltyCardNumber", "orderAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "amountBeforeDiscount", "amountImmediateDiscount", "amountRewardedOnLoyalty", "store", "Lcom/carrefour/fid/android/data/entities/APIMStoreEntity;", "offlineOfferEntityList", "", "Lcom/carrefour/fid/android/data/entities/APIMOfflineOfferEntity;", "payments", "Lcom/carrefour/fid/android/data/entities/APIMPaymentEntity;", "paidVAT", "Lcom/carrefour/fid/android/data/entities/APIMPaidVATEntity;", "totalVATAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/Amount;Lcom/carrefour/fid/android/data/entities/APIMStoreEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/Amount;)V", "getAmountBeforeDiscount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getAmountImmediateDiscount", "getAmountRewardedOnLoyalty", "getLoyaltyCardNumber", "()Ljava/lang/String;", "getOfflineOfferEntityList", "()Ljava/util/List;", "getOrderAmount", "getOrderDate", "getOrderKey", "getPaidVAT", "getPayments", "getStore", "()Lcom/carrefour/fid/android/data/entities/APIMStoreEntity;", "getTotalVATAmount", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMDataEntity {
    public static final int $stable = 8;
    @C33608c("total_amount_before_discount")
    @C12580l
    private final Amount amountBeforeDiscount;
    @C33608c("total_amount_immediate_discount")
    @C12580l
    private final Amount amountImmediateDiscount;
    @C33608c("transaction_deferred_reward_amount_with_tax")
    @C12580l
    private final Amount amountRewardedOnLoyalty;
    @C33608c("loyalty_card_number")
    @C12580l
    private final String loyaltyCardNumber;
    @C33608c("products")
    @C12580l
    private final List<APIMOfflineOfferEntity> offlineOfferEntityList;
    @C33608c("total_paid_amount")
    @C12580l
    private final Amount orderAmount;
    @C33608c("transaction_date")
    @C12580l
    private final String orderDate;
    @C33608c("transaction_key")
    @C12580l
    private final String orderKey;
    @C33608c("paid_vat_by_pct")
    @C12580l
    private final List<APIMPaidVATEntity> paidVAT;
    @C33608c("payments")
    @C12580l
    private final List<APIMPaymentEntity> payments;
    @C33608c("store")
    @C12580l
    private final APIMStoreEntity store;
    @C33608c("trx_vat_Amt")
    @C12580l
    private final Amount totalVATAmount;

    public APIMDataEntity(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Amount amount, @C12580l Amount amount2, @C12580l Amount amount3, @C12580l Amount amount4, @C12580l APIMStoreEntity aPIMStoreEntity, @C12580l List<APIMOfflineOfferEntity> list, @C12580l List<APIMPaymentEntity> list2, @C12580l List<APIMPaidVATEntity> list3, @C12580l Amount amount5) {
        this.orderKey = str;
        this.orderDate = str2;
        this.loyaltyCardNumber = str3;
        this.orderAmount = amount;
        this.amountBeforeDiscount = amount2;
        this.amountImmediateDiscount = amount3;
        this.amountRewardedOnLoyalty = amount4;
        this.store = aPIMStoreEntity;
        this.offlineOfferEntityList = list;
        this.payments = list2;
        this.paidVAT = list3;
        this.totalVATAmount = amount5;
    }

    public static /* synthetic */ APIMDataEntity copy$default(APIMDataEntity aPIMDataEntity, String str, String str2, String str3, Amount amount, Amount amount2, Amount amount3, Amount amount4, APIMStoreEntity aPIMStoreEntity, List list, List list2, List list3, Amount amount5, int i, Object obj) {
        APIMDataEntity aPIMDataEntity2 = aPIMDataEntity;
        int i2 = i;
        return aPIMDataEntity.copy((i2 & 1) != 0 ? aPIMDataEntity2.orderKey : str, (i2 & 2) != 0 ? aPIMDataEntity2.orderDate : str2, (i2 & 4) != 0 ? aPIMDataEntity2.loyaltyCardNumber : str3, (i2 & 8) != 0 ? aPIMDataEntity2.orderAmount : amount, (i2 & 16) != 0 ? aPIMDataEntity2.amountBeforeDiscount : amount2, (i2 & 32) != 0 ? aPIMDataEntity2.amountImmediateDiscount : amount3, (i2 & 64) != 0 ? aPIMDataEntity2.amountRewardedOnLoyalty : amount4, (i2 & 128) != 0 ? aPIMDataEntity2.store : aPIMStoreEntity, (i2 & 256) != 0 ? aPIMDataEntity2.offlineOfferEntityList : list, (i2 & 512) != 0 ? aPIMDataEntity2.payments : list2, (i2 & 1024) != 0 ? aPIMDataEntity2.paidVAT : list3, (i2 & 2048) != 0 ? aPIMDataEntity2.totalVATAmount : amount5);
    }

    @C12580l
    public final String component1() {
        return this.orderKey;
    }

    @C12580l
    public final List<APIMPaymentEntity> component10() {
        return this.payments;
    }

    @C12580l
    public final List<APIMPaidVATEntity> component11() {
        return this.paidVAT;
    }

    @C12580l
    public final Amount component12() {
        return this.totalVATAmount;
    }

    @C12580l
    public final String component2() {
        return this.orderDate;
    }

    @C12580l
    public final String component3() {
        return this.loyaltyCardNumber;
    }

    @C12580l
    public final Amount component4() {
        return this.orderAmount;
    }

    @C12580l
    public final Amount component5() {
        return this.amountBeforeDiscount;
    }

    @C12580l
    public final Amount component6() {
        return this.amountImmediateDiscount;
    }

    @C12580l
    public final Amount component7() {
        return this.amountRewardedOnLoyalty;
    }

    @C12580l
    public final APIMStoreEntity component8() {
        return this.store;
    }

    @C12580l
    public final List<APIMOfflineOfferEntity> component9() {
        return this.offlineOfferEntityList;
    }

    @C12579k
    public final APIMDataEntity copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Amount amount, @C12580l Amount amount2, @C12580l Amount amount3, @C12580l Amount amount4, @C12580l APIMStoreEntity aPIMStoreEntity, @C12580l List<APIMOfflineOfferEntity> list, @C12580l List<APIMPaymentEntity> list2, @C12580l List<APIMPaidVATEntity> list3, @C12580l Amount amount5) {
        return new APIMDataEntity(str, str2, str3, amount, amount2, amount3, amount4, aPIMStoreEntity, list, list2, list3, amount5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMDataEntity)) {
            return false;
        }
        APIMDataEntity aPIMDataEntity = (APIMDataEntity) obj;
        return Intrinsics.areEqual((Object) this.orderKey, (Object) aPIMDataEntity.orderKey) && Intrinsics.areEqual((Object) this.orderDate, (Object) aPIMDataEntity.orderDate) && Intrinsics.areEqual((Object) this.loyaltyCardNumber, (Object) aPIMDataEntity.loyaltyCardNumber) && Intrinsics.areEqual((Object) this.orderAmount, (Object) aPIMDataEntity.orderAmount) && Intrinsics.areEqual((Object) this.amountBeforeDiscount, (Object) aPIMDataEntity.amountBeforeDiscount) && Intrinsics.areEqual((Object) this.amountImmediateDiscount, (Object) aPIMDataEntity.amountImmediateDiscount) && Intrinsics.areEqual((Object) this.amountRewardedOnLoyalty, (Object) aPIMDataEntity.amountRewardedOnLoyalty) && Intrinsics.areEqual((Object) this.store, (Object) aPIMDataEntity.store) && Intrinsics.areEqual((Object) this.offlineOfferEntityList, (Object) aPIMDataEntity.offlineOfferEntityList) && Intrinsics.areEqual((Object) this.payments, (Object) aPIMDataEntity.payments) && Intrinsics.areEqual((Object) this.paidVAT, (Object) aPIMDataEntity.paidVAT) && Intrinsics.areEqual((Object) this.totalVATAmount, (Object) aPIMDataEntity.totalVATAmount);
    }

    @C12580l
    public final Amount getAmountBeforeDiscount() {
        return this.amountBeforeDiscount;
    }

    @C12580l
    public final Amount getAmountImmediateDiscount() {
        return this.amountImmediateDiscount;
    }

    @C12580l
    public final Amount getAmountRewardedOnLoyalty() {
        return this.amountRewardedOnLoyalty;
    }

    @C12580l
    public final String getLoyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    @C12580l
    public final List<APIMOfflineOfferEntity> getOfflineOfferEntityList() {
        return this.offlineOfferEntityList;
    }

    @C12580l
    public final Amount getOrderAmount() {
        return this.orderAmount;
    }

    @C12580l
    public final String getOrderDate() {
        return this.orderDate;
    }

    @C12580l
    public final String getOrderKey() {
        return this.orderKey;
    }

    @C12580l
    public final List<APIMPaidVATEntity> getPaidVAT() {
        return this.paidVAT;
    }

    @C12580l
    public final List<APIMPaymentEntity> getPayments() {
        return this.payments;
    }

    @C12580l
    public final APIMStoreEntity getStore() {
        return this.store;
    }

    @C12580l
    public final Amount getTotalVATAmount() {
        return this.totalVATAmount;
    }

    public int hashCode() {
        String str = this.orderKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loyaltyCardNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Amount amount = this.orderAmount;
        int hashCode4 = (hashCode3 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.amountBeforeDiscount;
        int hashCode5 = (hashCode4 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.amountImmediateDiscount;
        int hashCode6 = (hashCode5 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.amountRewardedOnLoyalty;
        int hashCode7 = (hashCode6 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        APIMStoreEntity aPIMStoreEntity = this.store;
        int hashCode8 = (hashCode7 + (aPIMStoreEntity == null ? 0 : aPIMStoreEntity.hashCode())) * 31;
        List<APIMOfflineOfferEntity> list = this.offlineOfferEntityList;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<APIMPaymentEntity> list2 = this.payments;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<APIMPaidVATEntity> list3 = this.paidVAT;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Amount amount5 = this.totalVATAmount;
        if (amount5 != null) {
            i = amount5.hashCode();
        }
        return hashCode11 + i;
    }

    @C12579k
    public String toString() {
        String str = this.orderKey;
        String str2 = this.orderDate;
        String str3 = this.loyaltyCardNumber;
        Amount amount = this.orderAmount;
        Amount amount2 = this.amountBeforeDiscount;
        Amount amount3 = this.amountImmediateDiscount;
        Amount amount4 = this.amountRewardedOnLoyalty;
        APIMStoreEntity aPIMStoreEntity = this.store;
        List<APIMOfflineOfferEntity> list = this.offlineOfferEntityList;
        List<APIMPaymentEntity> list2 = this.payments;
        List<APIMPaidVATEntity> list3 = this.paidVAT;
        Amount amount5 = this.totalVATAmount;
        return "APIMDataEntity(orderKey=" + str + ", orderDate=" + str2 + ", loyaltyCardNumber=" + str3 + ", orderAmount=" + amount + ", amountBeforeDiscount=" + amount2 + ", amountImmediateDiscount=" + amount3 + ", amountRewardedOnLoyalty=" + amount4 + ", store=" + aPIMStoreEntity + ", offlineOfferEntityList=" + list + ", payments=" + list2 + ", paidVAT=" + list3 + ", totalVATAmount=" + amount5 + ")";
    }
}
