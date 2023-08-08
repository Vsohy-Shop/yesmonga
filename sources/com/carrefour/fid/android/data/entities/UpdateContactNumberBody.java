package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/UpdateContactNumberBody;", "", "contactNumber", "", "oneOrderId", "(Ljava/lang/String;Ljava/lang/String;)V", "getContactNumber", "()Ljava/lang/String;", "getOneOrderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class UpdateContactNumberBody {
    public static final int $stable = 0;
    @C33608c("contact_number")
    @C12579k
    private final String contactNumber;
    @C33608c("one_order_id")
    @C12579k
    private final String oneOrderId;

    public UpdateContactNumberBody(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "contactNumber");
        Intrinsics.checkNotNullParameter(str2, "oneOrderId");
        this.contactNumber = str;
        this.oneOrderId = str2;
    }

    public static /* synthetic */ UpdateContactNumberBody copy$default(UpdateContactNumberBody updateContactNumberBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateContactNumberBody.contactNumber;
        }
        if ((i & 2) != 0) {
            str2 = updateContactNumberBody.oneOrderId;
        }
        return updateContactNumberBody.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.contactNumber;
    }

    @C12579k
    public final String component2() {
        return this.oneOrderId;
    }

    @C12579k
    public final UpdateContactNumberBody copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "contactNumber");
        Intrinsics.checkNotNullParameter(str2, "oneOrderId");
        return new UpdateContactNumberBody(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateContactNumberBody)) {
            return false;
        }
        UpdateContactNumberBody updateContactNumberBody = (UpdateContactNumberBody) obj;
        return Intrinsics.areEqual((Object) this.contactNumber, (Object) updateContactNumberBody.contactNumber) && Intrinsics.areEqual((Object) this.oneOrderId, (Object) updateContactNumberBody.oneOrderId);
    }

    @C12579k
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @C12579k
    public final String getOneOrderId() {
        return this.oneOrderId;
    }

    public int hashCode() {
        return (this.contactNumber.hashCode() * 31) + this.oneOrderId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.contactNumber;
        String str2 = this.oneOrderId;
        return "UpdateContactNumberBody(contactNumber=" + str + ", oneOrderId=" + str2 + ")";
    }
}
