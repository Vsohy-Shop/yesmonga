package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AccountResponse;", "", "profileInfoResponse", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileInfoResponse;", "dateOfSave", "", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileInfoResponse;J)V", "getDateOfSave", "()J", "setDateOfSave", "(J)V", "getProfileInfoResponse", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileInfoResponse;", "setProfileInfoResponse", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/ProfileInfoResponse;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AccountResponse {
    private long dateOfSave;
    @C33608c("data")
    @C12579k
    private ProfileInfoResponse profileInfoResponse;

    public AccountResponse(@C12579k ProfileInfoResponse profileInfoResponse2, long j) {
        Intrinsics.checkNotNullParameter(profileInfoResponse2, "profileInfoResponse");
        this.profileInfoResponse = profileInfoResponse2;
        this.dateOfSave = j;
    }

    public static /* synthetic */ AccountResponse copy$default(AccountResponse accountResponse, ProfileInfoResponse profileInfoResponse2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            profileInfoResponse2 = accountResponse.profileInfoResponse;
        }
        if ((i & 2) != 0) {
            j = accountResponse.dateOfSave;
        }
        return accountResponse.copy(profileInfoResponse2, j);
    }

    @C12579k
    public final ProfileInfoResponse component1() {
        return this.profileInfoResponse;
    }

    public final long component2() {
        return this.dateOfSave;
    }

    @C12579k
    public final AccountResponse copy(@C12579k ProfileInfoResponse profileInfoResponse2, long j) {
        Intrinsics.checkNotNullParameter(profileInfoResponse2, "profileInfoResponse");
        return new AccountResponse(profileInfoResponse2, j);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountResponse)) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) obj;
        return Intrinsics.areEqual((Object) this.profileInfoResponse, (Object) accountResponse.profileInfoResponse) && this.dateOfSave == accountResponse.dateOfSave;
    }

    public final long getDateOfSave() {
        return this.dateOfSave;
    }

    @C12579k
    public final ProfileInfoResponse getProfileInfoResponse() {
        return this.profileInfoResponse;
    }

    public int hashCode() {
        return (this.profileInfoResponse.hashCode() * 31) + Long.hashCode(this.dateOfSave);
    }

    public final void setDateOfSave(long j) {
        this.dateOfSave = j;
    }

    public final void setProfileInfoResponse(@C12579k ProfileInfoResponse profileInfoResponse2) {
        Intrinsics.checkNotNullParameter(profileInfoResponse2, "<set-?>");
        this.profileInfoResponse = profileInfoResponse2;
    }

    @C12579k
    public String toString() {
        ProfileInfoResponse profileInfoResponse2 = this.profileInfoResponse;
        long j = this.dateOfSave;
        return "AccountResponse(profileInfoResponse=" + profileInfoResponse2 + ", dateOfSave=" + j + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountResponse(ProfileInfoResponse profileInfoResponse2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileInfoResponse2, (i & 2) != 0 ? 0 : j);
    }
}
