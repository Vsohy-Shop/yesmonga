package com.carrefour.fid.android.service.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/model/DriveTypeForService;", "Landroid/os/Parcelable;", "", "component1", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "component2", "serviceId", "driveType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getServiceId", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "getDriveType", "()Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/service/models/DriveType;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class DriveTypeForService implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<DriveTypeForService> CREATOR = new Creator();
    @C12579k
    private final DriveType driveType;
    @C12579k
    private final String serviceId;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<DriveTypeForService> {
        @C12579k
        public final DriveTypeForService createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DriveTypeForService(parcel.readString(), DriveType.valueOf(parcel.readString()));
        }

        @C12579k
        public final DriveTypeForService[] newArray(int i) {
            return new DriveTypeForService[i];
        }
    }

    public DriveTypeForService(@C12579k String str, @C12579k DriveType driveType2) {
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(driveType2, "driveType");
        this.serviceId = str;
        this.driveType = driveType2;
    }

    public static /* synthetic */ DriveTypeForService copy$default(DriveTypeForService driveTypeForService, String str, DriveType driveType2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = driveTypeForService.serviceId;
        }
        if ((i & 2) != 0) {
            driveType2 = driveTypeForService.driveType;
        }
        return driveTypeForService.copy(str, driveType2);
    }

    @C12579k
    public final String component1() {
        return this.serviceId;
    }

    @C12579k
    public final DriveType component2() {
        return this.driveType;
    }

    @C12579k
    public final DriveTypeForService copy(@C12579k String str, @C12579k DriveType driveType2) {
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(driveType2, "driveType");
        return new DriveTypeForService(str, driveType2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveTypeForService)) {
            return false;
        }
        DriveTypeForService driveTypeForService = (DriveTypeForService) obj;
        return Intrinsics.areEqual((Object) this.serviceId, (Object) driveTypeForService.serviceId) && this.driveType == driveTypeForService.driveType;
    }

    @C12579k
    public final DriveType getDriveType() {
        return this.driveType;
    }

    @C12579k
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return (this.serviceId.hashCode() * 31) + this.driveType.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.serviceId;
        DriveType driveType2 = this.driveType;
        return "DriveTypeForService(serviceId=" + str + ", driveType=" + driveType2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.serviceId);
        parcel.writeString(this.driveType.name());
    }
}
