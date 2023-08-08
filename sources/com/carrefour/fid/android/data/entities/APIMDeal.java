package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMDeal;", "", "discountAmount", "", "mandateId", "", "bundle", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getBundle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiscountAmount", "()I", "getMandateId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/data/entities/APIMDeal;", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMDeal {
    public static final int $stable = 0;
    @C33608c("bundle")
    @C12580l
    private final Integer bundle;
    @C33608c("discount_amount")
    private final int discountAmount;
    @C33608c("mandate_id")
    @C12579k
    private final String mandateId;

    public APIMDeal(int i, @C12579k String str, @C12580l Integer num) {
        Intrinsics.checkNotNullParameter(str, "mandateId");
        this.discountAmount = i;
        this.mandateId = str;
        this.bundle = num;
    }

    public static /* synthetic */ APIMDeal copy$default(APIMDeal aPIMDeal, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aPIMDeal.discountAmount;
        }
        if ((i2 & 2) != 0) {
            str = aPIMDeal.mandateId;
        }
        if ((i2 & 4) != 0) {
            num = aPIMDeal.bundle;
        }
        return aPIMDeal.copy(i, str, num);
    }

    public final int component1() {
        return this.discountAmount;
    }

    @C12579k
    public final String component2() {
        return this.mandateId;
    }

    @C12580l
    public final Integer component3() {
        return this.bundle;
    }

    @C12579k
    public final APIMDeal copy(int i, @C12579k String str, @C12580l Integer num) {
        Intrinsics.checkNotNullParameter(str, "mandateId");
        return new APIMDeal(i, str, num);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMDeal)) {
            return false;
        }
        APIMDeal aPIMDeal = (APIMDeal) obj;
        return this.discountAmount == aPIMDeal.discountAmount && Intrinsics.areEqual((Object) this.mandateId, (Object) aPIMDeal.mandateId) && Intrinsics.areEqual((Object) this.bundle, (Object) aPIMDeal.bundle);
    }

    @C12580l
    public final Integer getBundle() {
        return this.bundle;
    }

    public final int getDiscountAmount() {
        return this.discountAmount;
    }

    @C12579k
    public final String getMandateId() {
        return this.mandateId;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.discountAmount) * 31) + this.mandateId.hashCode()) * 31;
        Integer num = this.bundle;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @C12579k
    public String toString() {
        int i = this.discountAmount;
        String str = this.mandateId;
        Integer num = this.bundle;
        return "APIMDeal(discountAmount=" + i + ", mandateId=" + str + ", bundle=" + num + ")";
    }
}
