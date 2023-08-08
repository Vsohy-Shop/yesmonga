package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/viewmodels/drive/DriveSummaryState;", "", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "component1", "", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "component2", "store", "driveTypes", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "getStore", "()Lcom/carrefour/fid/android/domain/models/service/models/l;", "Ljava/util/List;", "getDriveTypes", "()Ljava/util/List;", "<init>", "(Lcom/carrefour/fid/android/domain/models/service/models/l;Ljava/util/List;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class DriveSummaryState {
    @C12579k
    private final List<DriveType> driveTypes;
    @C12579k
    private final C38163l store;

    public DriveSummaryState(@C12579k C38163l lVar, @C12579k List<? extends DriveType> list) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        Intrinsics.checkNotNullParameter(list, "driveTypes");
        this.store = lVar;
        this.driveTypes = list;
    }

    public static /* synthetic */ DriveSummaryState copy$default(DriveSummaryState driveSummaryState, C38163l lVar, List<DriveType> list, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = driveSummaryState.store;
        }
        if ((i & 2) != 0) {
            list = driveSummaryState.driveTypes;
        }
        return driveSummaryState.copy(lVar, list);
    }

    @C12579k
    public final C38163l component1() {
        return this.store;
    }

    @C12579k
    public final List<DriveType> component2() {
        return this.driveTypes;
    }

    @C12579k
    public final DriveSummaryState copy(@C12579k C38163l lVar, @C12579k List<? extends DriveType> list) {
        Intrinsics.checkNotNullParameter(lVar, "store");
        Intrinsics.checkNotNullParameter(list, "driveTypes");
        return new DriveSummaryState(lVar, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveSummaryState)) {
            return false;
        }
        DriveSummaryState driveSummaryState = (DriveSummaryState) obj;
        return Intrinsics.areEqual((Object) this.store, (Object) driveSummaryState.store) && Intrinsics.areEqual((Object) this.driveTypes, (Object) driveSummaryState.driveTypes);
    }

    @C12579k
    public final List<DriveType> getDriveTypes() {
        return this.driveTypes;
    }

    @C12579k
    public final C38163l getStore() {
        return this.store;
    }

    public int hashCode() {
        return (this.store.hashCode() * 31) + this.driveTypes.hashCode();
    }

    @C12579k
    public String toString() {
        C38163l lVar = this.store;
        List<DriveType> list = this.driveTypes;
        return "DriveSummaryState(store=" + lVar + ", driveTypes=" + list + ")";
    }
}
