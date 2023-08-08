package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileInfoResponse;", "", "accountInfoPojo", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileResponse;", "lastModification", "", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileResponse;Ljava/lang/String;)V", "getAccountInfoPojo", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileResponse;", "getLastModification", "()Ljava/lang/String;", "setLastModification", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ProfileInfoResponse {
    @C33608c("customer")
    @C12579k
    private final ProfileResponse accountInfoPojo;
    @C33608c("last_modification")
    @C12579k
    private String lastModification;

    public ProfileInfoResponse(@C12579k ProfileResponse profileResponse, @C12579k String str) {
        Intrinsics.checkNotNullParameter(profileResponse, "accountInfoPojo");
        Intrinsics.checkNotNullParameter(str, "lastModification");
        this.accountInfoPojo = profileResponse;
        this.lastModification = str;
    }

    public static /* synthetic */ ProfileInfoResponse copy$default(ProfileInfoResponse profileInfoResponse, ProfileResponse profileResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            profileResponse = profileInfoResponse.accountInfoPojo;
        }
        if ((i & 2) != 0) {
            str = profileInfoResponse.lastModification;
        }
        return profileInfoResponse.copy(profileResponse, str);
    }

    @C12579k
    public final ProfileResponse component1() {
        return this.accountInfoPojo;
    }

    @C12579k
    public final String component2() {
        return this.lastModification;
    }

    @C12579k
    public final ProfileInfoResponse copy(@C12579k ProfileResponse profileResponse, @C12579k String str) {
        Intrinsics.checkNotNullParameter(profileResponse, "accountInfoPojo");
        Intrinsics.checkNotNullParameter(str, "lastModification");
        return new ProfileInfoResponse(profileResponse, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileInfoResponse)) {
            return false;
        }
        ProfileInfoResponse profileInfoResponse = (ProfileInfoResponse) obj;
        return Intrinsics.areEqual((Object) this.accountInfoPojo, (Object) profileInfoResponse.accountInfoPojo) && Intrinsics.areEqual((Object) this.lastModification, (Object) profileInfoResponse.lastModification);
    }

    @C12579k
    public final ProfileResponse getAccountInfoPojo() {
        return this.accountInfoPojo;
    }

    @C12579k
    public final String getLastModification() {
        return this.lastModification;
    }

    public int hashCode() {
        return (this.accountInfoPojo.hashCode() * 31) + this.lastModification.hashCode();
    }

    public final void setLastModification(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastModification = str;
    }

    @C12579k
    public String toString() {
        ProfileResponse profileResponse = this.accountInfoPojo;
        String str = this.lastModification;
        return "ProfileInfoResponse(accountInfoPojo=" + profileResponse + ", lastModification=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileInfoResponse(ProfileResponse profileResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileResponse, (i & 2) != 0 ? new String() : str);
    }
}
