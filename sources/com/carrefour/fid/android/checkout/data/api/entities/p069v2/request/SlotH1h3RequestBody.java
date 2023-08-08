package com.carrefour.fid.android.checkout.data.api.entities.p069v2.request;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/request/SlotH1h3RequestBody;", "", "productCount", "", "(I)V", "getProductCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.request.SlotH1h3RequestBody */
public final class SlotH1h3RequestBody {
    @C33608c("product_count")
    private final int productCount;

    public SlotH1h3RequestBody(int i) {
        this.productCount = i;
    }

    public static /* synthetic */ SlotH1h3RequestBody copy$default(SlotH1h3RequestBody slotH1h3RequestBody, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotH1h3RequestBody.productCount;
        }
        return slotH1h3RequestBody.copy(i);
    }

    public final int component1() {
        return this.productCount;
    }

    @C12579k
    public final SlotH1h3RequestBody copy(int i) {
        return new SlotH1h3RequestBody(i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotH1h3RequestBody) && this.productCount == ((SlotH1h3RequestBody) obj).productCount;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.productCount);
    }

    @C12579k
    public String toString() {
        int i = this.productCount;
        return "SlotH1h3RequestBody(productCount=" + i + ")";
    }
}
