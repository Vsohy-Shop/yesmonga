package com.carrefour.fid.android.loyalty.data.models.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/ClubsResponse;", "", "clubName", "", "subscriptionDate", "subscriptionChannel", "unsubscribeDate", "unsubscribeChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClubName", "()Ljava/lang/String;", "getSubscriptionChannel", "getSubscriptionDate", "getUnsubscribeChannel", "getUnsubscribeDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ClubsResponse {
    @C33608c("club_name")
    @C12579k
    private final String clubName;
    @C33608c("subscription_channel")
    @C12579k
    private final String subscriptionChannel;
    @C33608c("subscription_date")
    @C12579k
    private final String subscriptionDate;
    @C33608c("unsubscribe_channel")
    @C12579k
    private final String unsubscribeChannel;
    @C33608c("unsubscribe_date")
    @C12579k
    private final String unsubscribeDate;

    public ClubsResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "clubName");
        Intrinsics.checkNotNullParameter(str2, "subscriptionDate");
        Intrinsics.checkNotNullParameter(str3, "subscriptionChannel");
        Intrinsics.checkNotNullParameter(str4, "unsubscribeDate");
        Intrinsics.checkNotNullParameter(str5, "unsubscribeChannel");
        this.clubName = str;
        this.subscriptionDate = str2;
        this.subscriptionChannel = str3;
        this.unsubscribeDate = str4;
        this.unsubscribeChannel = str5;
    }

    public static /* synthetic */ ClubsResponse copy$default(ClubsResponse clubsResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clubsResponse.clubName;
        }
        if ((i & 2) != 0) {
            str2 = clubsResponse.subscriptionDate;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = clubsResponse.subscriptionChannel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = clubsResponse.unsubscribeDate;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = clubsResponse.unsubscribeChannel;
        }
        return clubsResponse.copy(str, str6, str7, str8, str5);
    }

    @C12579k
    public final String component1() {
        return this.clubName;
    }

    @C12579k
    public final String component2() {
        return this.subscriptionDate;
    }

    @C12579k
    public final String component3() {
        return this.subscriptionChannel;
    }

    @C12579k
    public final String component4() {
        return this.unsubscribeDate;
    }

    @C12579k
    public final String component5() {
        return this.unsubscribeChannel;
    }

    @C12579k
    public final ClubsResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "clubName");
        Intrinsics.checkNotNullParameter(str2, "subscriptionDate");
        Intrinsics.checkNotNullParameter(str3, "subscriptionChannel");
        Intrinsics.checkNotNullParameter(str4, "unsubscribeDate");
        Intrinsics.checkNotNullParameter(str5, "unsubscribeChannel");
        return new ClubsResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubsResponse)) {
            return false;
        }
        ClubsResponse clubsResponse = (ClubsResponse) obj;
        return Intrinsics.areEqual((Object) this.clubName, (Object) clubsResponse.clubName) && Intrinsics.areEqual((Object) this.subscriptionDate, (Object) clubsResponse.subscriptionDate) && Intrinsics.areEqual((Object) this.subscriptionChannel, (Object) clubsResponse.subscriptionChannel) && Intrinsics.areEqual((Object) this.unsubscribeDate, (Object) clubsResponse.unsubscribeDate) && Intrinsics.areEqual((Object) this.unsubscribeChannel, (Object) clubsResponse.unsubscribeChannel);
    }

    @C12579k
    public final String getClubName() {
        return this.clubName;
    }

    @C12579k
    public final String getSubscriptionChannel() {
        return this.subscriptionChannel;
    }

    @C12579k
    public final String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    @C12579k
    public final String getUnsubscribeChannel() {
        return this.unsubscribeChannel;
    }

    @C12579k
    public final String getUnsubscribeDate() {
        return this.unsubscribeDate;
    }

    public int hashCode() {
        return (((((((this.clubName.hashCode() * 31) + this.subscriptionDate.hashCode()) * 31) + this.subscriptionChannel.hashCode()) * 31) + this.unsubscribeDate.hashCode()) * 31) + this.unsubscribeChannel.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.clubName;
        String str2 = this.subscriptionDate;
        String str3 = this.subscriptionChannel;
        String str4 = this.unsubscribeDate;
        String str5 = this.unsubscribeChannel;
        return "ClubsResponse(clubName=" + str + ", subscriptionDate=" + str2 + ", subscriptionChannel=" + str3 + ", unsubscribeDate=" + str4 + ", unsubscribeChannel=" + str5 + ")";
    }
}
