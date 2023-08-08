package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMPaymentInfo;", "", "paymentAmount", "Lcom/carrefour/fid/android/data/entities/Amount;", "paymentChoice", "", "paymentDate", "(Lcom/carrefour/fid/android/data/entities/Amount;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentAmount", "()Lcom/carrefour/fid/android/data/entities/Amount;", "getPaymentChoice", "()Ljava/lang/String;", "getPaymentDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMPaymentInfo {
    public static final int $stable = 0;
    @C33608c("payment_amount")
    @C12579k
    private final Amount paymentAmount;
    @C33608c("payment_choice")
    @C12579k
    private final String paymentChoice;
    @C33608c("payment_date")
    @C12580l
    private final String paymentDate;

    public OHMPaymentInfo(@C12579k Amount amount, @C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(amount, "paymentAmount");
        Intrinsics.checkNotNullParameter(str, "paymentChoice");
        this.paymentAmount = amount;
        this.paymentChoice = str;
        this.paymentDate = str2;
    }

    public static /* synthetic */ OHMPaymentInfo copy$default(OHMPaymentInfo oHMPaymentInfo, Amount amount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            amount = oHMPaymentInfo.paymentAmount;
        }
        if ((i & 2) != 0) {
            str = oHMPaymentInfo.paymentChoice;
        }
        if ((i & 4) != 0) {
            str2 = oHMPaymentInfo.paymentDate;
        }
        return oHMPaymentInfo.copy(amount, str, str2);
    }

    @C12579k
    public final Amount component1() {
        return this.paymentAmount;
    }

    @C12579k
    public final String component2() {
        return this.paymentChoice;
    }

    @C12580l
    public final String component3() {
        return this.paymentDate;
    }

    @C12579k
    public final OHMPaymentInfo copy(@C12579k Amount amount, @C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(amount, "paymentAmount");
        Intrinsics.checkNotNullParameter(str, "paymentChoice");
        return new OHMPaymentInfo(amount, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMPaymentInfo)) {
            return false;
        }
        OHMPaymentInfo oHMPaymentInfo = (OHMPaymentInfo) obj;
        return Intrinsics.areEqual((Object) this.paymentAmount, (Object) oHMPaymentInfo.paymentAmount) && Intrinsics.areEqual((Object) this.paymentChoice, (Object) oHMPaymentInfo.paymentChoice) && Intrinsics.areEqual((Object) this.paymentDate, (Object) oHMPaymentInfo.paymentDate);
    }

    @C12579k
    public final Amount getPaymentAmount() {
        return this.paymentAmount;
    }

    @C12579k
    public final String getPaymentChoice() {
        return this.paymentChoice;
    }

    @C12580l
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public int hashCode() {
        int hashCode = ((this.paymentAmount.hashCode() * 31) + this.paymentChoice.hashCode()) * 31;
        String str = this.paymentDate;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    public String toString() {
        Amount amount = this.paymentAmount;
        String str = this.paymentChoice;
        String str2 = this.paymentDate;
        return "OHMPaymentInfo(paymentAmount=" + amount + ", paymentChoice=" + str + ", paymentDate=" + str2 + ")";
    }
}
