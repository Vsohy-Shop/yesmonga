package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/MidFidClubResponse;", "", "limitClub", "", "clubs", "", "Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "(ZLjava/util/List;)V", "getClubs", "()Ljava/util/List;", "getLimitClub", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class MidFidClubResponse {
    @C33608c("clubs")
    @C12580l
    private final List<ClubsResponse> clubs;
    @C33608c("limit_club")
    private final boolean limitClub;

    public MidFidClubResponse(boolean z, @C12580l List<ClubsResponse> list) {
        this.limitClub = z;
        this.clubs = list;
    }

    public static /* synthetic */ MidFidClubResponse copy$default(MidFidClubResponse midFidClubResponse, boolean z, List<ClubsResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = midFidClubResponse.limitClub;
        }
        if ((i & 2) != 0) {
            list = midFidClubResponse.clubs;
        }
        return midFidClubResponse.copy(z, list);
    }

    public final boolean component1() {
        return this.limitClub;
    }

    @C12580l
    public final List<ClubsResponse> component2() {
        return this.clubs;
    }

    @C12579k
    public final MidFidClubResponse copy(boolean z, @C12580l List<ClubsResponse> list) {
        return new MidFidClubResponse(z, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MidFidClubResponse)) {
            return false;
        }
        MidFidClubResponse midFidClubResponse = (MidFidClubResponse) obj;
        return this.limitClub == midFidClubResponse.limitClub && Intrinsics.areEqual((Object) this.clubs, (Object) midFidClubResponse.clubs);
    }

    @C12580l
    public final List<ClubsResponse> getClubs() {
        return this.clubs;
    }

    public final boolean getLimitClub() {
        return this.limitClub;
    }

    public int hashCode() {
        boolean z = this.limitClub;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<ClubsResponse> list = this.clubs;
        return i + (list == null ? 0 : list.hashCode());
    }

    @C12579k
    public String toString() {
        boolean z = this.limitClub;
        List<ClubsResponse> list = this.clubs;
        return "MidFidClubResponse(limitClub=" + z + ", clubs=" + list + ")";
    }
}
