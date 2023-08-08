package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextFacilityRequest;", "", "hasChosenDriveService", "", "hasChosenDeliveryService", "chosenFacility", "Lcom/carrefour/fid/android/logm/data/entities/ChosenFacilityRequest;", "(ZZLcom/carrefour/fid/android/logm/data/entities/ChosenFacilityRequest;)V", "getChosenFacility", "()Lcom/carrefour/fid/android/logm/data/entities/ChosenFacilityRequest;", "getHasChosenDeliveryService", "()Z", "getHasChosenDriveService", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextFacilityRequest {
    @C33608c("choosen_facility")
    @C12580l
    private final ChosenFacilityRequest chosenFacility;
    @C33608c("has_choosen_delivery_service")
    private final boolean hasChosenDeliveryService;
    @C33608c("has_choosen_drive_service")
    private final boolean hasChosenDriveService;

    public AppContextFacilityRequest() {
        this(false, false, (ChosenFacilityRequest) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextFacilityRequest copy$default(AppContextFacilityRequest appContextFacilityRequest, boolean z, boolean z2, ChosenFacilityRequest chosenFacilityRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appContextFacilityRequest.hasChosenDriveService;
        }
        if ((i & 2) != 0) {
            z2 = appContextFacilityRequest.hasChosenDeliveryService;
        }
        if ((i & 4) != 0) {
            chosenFacilityRequest = appContextFacilityRequest.chosenFacility;
        }
        return appContextFacilityRequest.copy(z, z2, chosenFacilityRequest);
    }

    public final boolean component1() {
        return this.hasChosenDriveService;
    }

    public final boolean component2() {
        return this.hasChosenDeliveryService;
    }

    @C12580l
    public final ChosenFacilityRequest component3() {
        return this.chosenFacility;
    }

    @C12579k
    public final AppContextFacilityRequest copy(boolean z, boolean z2, @C12580l ChosenFacilityRequest chosenFacilityRequest) {
        return new AppContextFacilityRequest(z, z2, chosenFacilityRequest);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContextFacilityRequest)) {
            return false;
        }
        AppContextFacilityRequest appContextFacilityRequest = (AppContextFacilityRequest) obj;
        return this.hasChosenDriveService == appContextFacilityRequest.hasChosenDriveService && this.hasChosenDeliveryService == appContextFacilityRequest.hasChosenDeliveryService && Intrinsics.areEqual((Object) this.chosenFacility, (Object) appContextFacilityRequest.chosenFacility);
    }

    @C12580l
    public final ChosenFacilityRequest getChosenFacility() {
        return this.chosenFacility;
    }

    public final boolean getHasChosenDeliveryService() {
        return this.hasChosenDeliveryService;
    }

    public final boolean getHasChosenDriveService() {
        return this.hasChosenDriveService;
    }

    public int hashCode() {
        boolean z = this.hasChosenDriveService;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.hasChosenDeliveryService;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        ChosenFacilityRequest chosenFacilityRequest = this.chosenFacility;
        return i2 + (chosenFacilityRequest == null ? 0 : chosenFacilityRequest.hashCode());
    }

    @C12579k
    public String toString() {
        boolean z = this.hasChosenDriveService;
        boolean z2 = this.hasChosenDeliveryService;
        ChosenFacilityRequest chosenFacilityRequest = this.chosenFacility;
        return "AppContextFacilityRequest(hasChosenDriveService=" + z + ", hasChosenDeliveryService=" + z2 + ", chosenFacility=" + chosenFacilityRequest + ")";
    }

    public AppContextFacilityRequest(boolean z, boolean z2, @C12580l ChosenFacilityRequest chosenFacilityRequest) {
        this.hasChosenDriveService = z;
        this.hasChosenDeliveryService = z2;
        this.chosenFacility = chosenFacilityRequest;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppContextFacilityRequest(boolean z, boolean z2, ChosenFacilityRequest chosenFacilityRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : chosenFacilityRequest);
    }
}
