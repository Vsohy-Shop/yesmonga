package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMPaymentEntity;", "", "choice", "", "label", "amount", "Lcom/carrefour/fid/android/data/entities/Amount;", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/Amount;)V", "getAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getChoice", "()Ljava/lang/String;", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMPaymentEntity {
    public static final int $stable = 0;
    @C33608c("amount")
    @C12580l
    private final Amount amount;
    @C33608c("choice")
    @C12580l
    private final String choice;
    @C33608c("label")
    @C12580l
    private final String label;

    public APIMPaymentEntity(@C12580l String str, @C12580l String str2, @C12580l Amount amount2) {
        this.choice = str;
        this.label = str2;
        this.amount = amount2;
    }

    public static /* synthetic */ APIMPaymentEntity copy$default(APIMPaymentEntity aPIMPaymentEntity, String str, String str2, Amount amount2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMPaymentEntity.choice;
        }
        if ((i & 2) != 0) {
            str2 = aPIMPaymentEntity.label;
        }
        if ((i & 4) != 0) {
            amount2 = aPIMPaymentEntity.amount;
        }
        return aPIMPaymentEntity.copy(str, str2, amount2);
    }

    @C12580l
    public final String component1() {
        return this.choice;
    }

    @C12580l
    public final String component2() {
        return this.label;
    }

    @C12580l
    public final Amount component3() {
        return this.amount;
    }

    @C12579k
    public final APIMPaymentEntity copy(@C12580l String str, @C12580l String str2, @C12580l Amount amount2) {
        return new APIMPaymentEntity(str, str2, amount2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMPaymentEntity)) {
            return false;
        }
        APIMPaymentEntity aPIMPaymentEntity = (APIMPaymentEntity) obj;
        return Intrinsics.areEqual((Object) this.choice, (Object) aPIMPaymentEntity.choice) && Intrinsics.areEqual((Object) this.label, (Object) aPIMPaymentEntity.label) && Intrinsics.areEqual((Object) this.amount, (Object) aPIMPaymentEntity.amount);
    }

    @C12580l
    public final Amount getAmount() {
        return this.amount;
    }

    @C12580l
    public final String getChoice() {
        return this.choice;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.choice;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount2 = this.amount;
        if (amount2 != null) {
            i = amount2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.choice;
        String str2 = this.label;
        Amount amount2 = this.amount;
        return "APIMPaymentEntity(choice=" + str + ", label=" + str2 + ", amount=" + amount2 + ")";
    }
}
