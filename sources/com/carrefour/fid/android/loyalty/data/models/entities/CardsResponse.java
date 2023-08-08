package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/CardsResponse;", "", "clubName", "", "flag", "(Ljava/lang/String;Ljava/lang/String;)V", "getClubName", "()Ljava/lang/String;", "getFlag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CardsResponse {
    @C33608c("Club1")
    @C12579k
    private final String clubName;
    @C33608c("FlagSet")
    @C12579k
    private final String flag;

    public CardsResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "clubName");
        Intrinsics.checkNotNullParameter(str2, "flag");
        this.clubName = str;
        this.flag = str2;
    }

    public static /* synthetic */ CardsResponse copy$default(CardsResponse cardsResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardsResponse.clubName;
        }
        if ((i & 2) != 0) {
            str2 = cardsResponse.flag;
        }
        return cardsResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.clubName;
    }

    @C12579k
    public final String component2() {
        return this.flag;
    }

    @C12579k
    public final CardsResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "clubName");
        Intrinsics.checkNotNullParameter(str2, "flag");
        return new CardsResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsResponse)) {
            return false;
        }
        CardsResponse cardsResponse = (CardsResponse) obj;
        return Intrinsics.areEqual((Object) this.clubName, (Object) cardsResponse.clubName) && Intrinsics.areEqual((Object) this.flag, (Object) cardsResponse.flag);
    }

    @C12579k
    public final String getClubName() {
        return this.clubName;
    }

    @C12579k
    public final String getFlag() {
        return this.flag;
    }

    public int hashCode() {
        return (this.clubName.hashCode() * 31) + this.flag.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.clubName;
        String str2 = this.flag;
        return "CardsResponse(clubName=" + str + ", flag=" + str2 + ")";
    }
}
