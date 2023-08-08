package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Moved in [basket] module.")
@Keep
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/LoyaltyCardRequestBody;", "", "id", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public final class LoyaltyCardRequestBody {
    public static final int $stable = 0;
    @C33608c("id")
    @C12579k

    /* renamed from: id */
    private final String f90058id;
    @C33608c("type")
    @C12579k
    private final String type;

    public LoyaltyCardRequestBody(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "type");
        this.f90058id = str;
        this.type = str2;
    }

    public static /* synthetic */ LoyaltyCardRequestBody copy$default(LoyaltyCardRequestBody loyaltyCardRequestBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyCardRequestBody.f90058id;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyCardRequestBody.type;
        }
        return loyaltyCardRequestBody.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.f90058id;
    }

    @C12579k
    public final String component2() {
        return this.type;
    }

    @C12579k
    public final LoyaltyCardRequestBody copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "type");
        return new LoyaltyCardRequestBody(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyCardRequestBody)) {
            return false;
        }
        LoyaltyCardRequestBody loyaltyCardRequestBody = (LoyaltyCardRequestBody) obj;
        return Intrinsics.areEqual((Object) this.f90058id, (Object) loyaltyCardRequestBody.f90058id) && Intrinsics.areEqual((Object) this.type, (Object) loyaltyCardRequestBody.type);
    }

    @C12579k
    public final String getId() {
        return this.f90058id;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.f90058id.hashCode() * 31) + this.type.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f90058id;
        String str2 = this.type;
        return "LoyaltyCardRequestBody(id=" + str + ", type=" + str2 + ")";
    }
}
