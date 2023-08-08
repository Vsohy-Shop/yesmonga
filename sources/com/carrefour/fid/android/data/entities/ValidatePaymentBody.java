package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/ValidatePaymentBody;", "", "paymentOnSite", "", "(Z)V", "getPaymentOnSite", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class ValidatePaymentBody {
    public static final int $stable = 0;
    @C33608c("payment_on_site")
    private final boolean paymentOnSite;

    public ValidatePaymentBody(boolean z) {
        this.paymentOnSite = z;
    }

    public static /* synthetic */ ValidatePaymentBody copy$default(ValidatePaymentBody validatePaymentBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = validatePaymentBody.paymentOnSite;
        }
        return validatePaymentBody.copy(z);
    }

    public final boolean component1() {
        return this.paymentOnSite;
    }

    @C12579k
    public final ValidatePaymentBody copy(boolean z) {
        return new ValidatePaymentBody(z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidatePaymentBody) && this.paymentOnSite == ((ValidatePaymentBody) obj).paymentOnSite;
    }

    public final boolean getPaymentOnSite() {
        return this.paymentOnSite;
    }

    public int hashCode() {
        boolean z = this.paymentOnSite;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.paymentOnSite;
        return "ValidatePaymentBody(paymentOnSite=" + z + ")";
    }
}
