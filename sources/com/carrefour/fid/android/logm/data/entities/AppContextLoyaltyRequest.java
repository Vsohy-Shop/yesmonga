package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyRequest;", "", "loyaltyCard", "Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyCardRequest;", "(Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyCardRequest;)V", "getLoyaltyCard", "()Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyCardRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextLoyaltyRequest {
    @C33608c("loyalty_card")
    @C12580l
    private final AppContextLoyaltyCardRequest loyaltyCard;

    public AppContextLoyaltyRequest() {
        this((AppContextLoyaltyCardRequest) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextLoyaltyRequest copy$default(AppContextLoyaltyRequest appContextLoyaltyRequest, AppContextLoyaltyCardRequest appContextLoyaltyCardRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            appContextLoyaltyCardRequest = appContextLoyaltyRequest.loyaltyCard;
        }
        return appContextLoyaltyRequest.copy(appContextLoyaltyCardRequest);
    }

    @C12580l
    public final AppContextLoyaltyCardRequest component1() {
        return this.loyaltyCard;
    }

    @C12579k
    public final AppContextLoyaltyRequest copy(@C12580l AppContextLoyaltyCardRequest appContextLoyaltyCardRequest) {
        return new AppContextLoyaltyRequest(appContextLoyaltyCardRequest);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppContextLoyaltyRequest) && Intrinsics.areEqual((Object) this.loyaltyCard, (Object) ((AppContextLoyaltyRequest) obj).loyaltyCard);
    }

    @C12580l
    public final AppContextLoyaltyCardRequest getLoyaltyCard() {
        return this.loyaltyCard;
    }

    public int hashCode() {
        AppContextLoyaltyCardRequest appContextLoyaltyCardRequest = this.loyaltyCard;
        if (appContextLoyaltyCardRequest == null) {
            return 0;
        }
        return appContextLoyaltyCardRequest.hashCode();
    }

    @C12579k
    public String toString() {
        AppContextLoyaltyCardRequest appContextLoyaltyCardRequest = this.loyaltyCard;
        return "AppContextLoyaltyRequest(loyaltyCard=" + appContextLoyaltyCardRequest + ")";
    }

    public AppContextLoyaltyRequest(@C12580l AppContextLoyaltyCardRequest appContextLoyaltyCardRequest) {
        this.loyaltyCard = appContextLoyaltyCardRequest;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppContextLoyaltyRequest(AppContextLoyaltyCardRequest appContextLoyaltyCardRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appContextLoyaltyCardRequest);
    }
}
