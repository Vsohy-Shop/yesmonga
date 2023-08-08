package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Location;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\b"}, mo22516d2 = {"computeDistanceInMeters", "", "Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;", "loc", "Landroid/location/Location;", "lat", "", "lon", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.StoreLocUtilsKt */
public final class StoreLocUtilsKt {
    public static final float computeDistanceInMeters(@C12579k DrivePoint drivePoint, @C12579k Location location) {
        Intrinsics.checkNotNullParameter(drivePoint, "<this>");
        Intrinsics.checkNotNullParameter(location, "loc");
        Location location2 = new Location("");
        location2.setLatitude(drivePoint.getLatitude());
        location2.setLongitude(drivePoint.getLongitude());
        return location.distanceTo(location2);
    }

    public static final float computeDistanceInMeters(@C12579k DrivePoint drivePoint, double d, double d2) {
        Intrinsics.checkNotNullParameter(drivePoint, "<this>");
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        Location location2 = new Location("");
        location2.setLatitude(drivePoint.getLatitude());
        location2.setLongitude(drivePoint.getLongitude());
        return location.distanceTo(location2);
    }
}
