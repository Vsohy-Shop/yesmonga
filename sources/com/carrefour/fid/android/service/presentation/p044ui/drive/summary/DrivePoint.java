package com.carrefour.fid.android.service.presentation.p044ui.drive.summary;

import com.carrefour.fid.android.domain.models.service.models.DriveType;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/summary/DrivePoint;", "", "name", "", "banner", "driveTypes", "", "Lcom/carrefour/fid/android/domain/models/service/models/DriveType;", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getBanner", "getDriveTypes", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.summary.DrivePoint */
final class DrivePoint {
    @C12579k
    private final String address;
    @C12579k
    private final String banner;
    @C12579k
    private final List<DriveType> driveTypes;
    @C12579k
    private final String name;

    public DrivePoint(@C12579k String str, @C12579k String str2, @C12579k List<? extends DriveType> list, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        Intrinsics.checkNotNullParameter(list, "driveTypes");
        Intrinsics.checkNotNullParameter(str3, "address");
        this.name = str;
        this.banner = str2;
        this.driveTypes = list;
        this.address = str3;
    }

    public static /* synthetic */ DrivePoint copy$default(DrivePoint drivePoint, String str, String str2, List<DriveType> list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drivePoint.name;
        }
        if ((i & 2) != 0) {
            str2 = drivePoint.banner;
        }
        if ((i & 4) != 0) {
            list = drivePoint.driveTypes;
        }
        if ((i & 8) != 0) {
            str3 = drivePoint.address;
        }
        return drivePoint.copy(str, str2, list, str3);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.banner;
    }

    @C12579k
    public final List<DriveType> component3() {
        return this.driveTypes;
    }

    @C12579k
    public final String component4() {
        return this.address;
    }

    @C12579k
    public final DrivePoint copy(@C12579k String str, @C12579k String str2, @C12579k List<? extends DriveType> list, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        Intrinsics.checkNotNullParameter(list, "driveTypes");
        Intrinsics.checkNotNullParameter(str3, "address");
        return new DrivePoint(str, str2, list, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivePoint)) {
            return false;
        }
        DrivePoint drivePoint = (DrivePoint) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) drivePoint.name) && Intrinsics.areEqual((Object) this.banner, (Object) drivePoint.banner) && Intrinsics.areEqual((Object) this.driveTypes, (Object) drivePoint.driveTypes) && Intrinsics.areEqual((Object) this.address, (Object) drivePoint.address);
    }

    @C12579k
    public final String getAddress() {
        return this.address;
    }

    @C12579k
    public final String getBanner() {
        return this.banner;
    }

    @C12579k
    public final List<DriveType> getDriveTypes() {
        return this.driveTypes;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.banner.hashCode()) * 31) + this.driveTypes.hashCode()) * 31) + this.address.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.banner;
        List<DriveType> list = this.driveTypes;
        String str3 = this.address;
        return "DrivePoint(name=" + str + ", banner=" + str2 + ", driveTypes=" + list + ", address=" + str3 + ")";
    }
}
