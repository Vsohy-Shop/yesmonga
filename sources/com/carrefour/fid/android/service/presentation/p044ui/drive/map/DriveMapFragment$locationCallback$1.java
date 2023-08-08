package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Location;
import com.google.android.gms.location.C30354k;
import com.google.android.gms.location.LocationResult;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo22516d2 = {"com/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$locationCallback$1", "Lcom/google/android/gms/location/k;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "Lkotlin/d2;", "onLocationResult", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$locationCallback$1 */
public final class DriveMapFragment$locationCallback$1 extends C30354k {
    final /* synthetic */ DriveMapFragment this$0;

    public DriveMapFragment$locationCallback$1(DriveMapFragment driveMapFragment) {
        this.this$0 = driveMapFragment;
    }

    public void onLocationResult(@C12579k LocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        Location location = locationResult.mo85594X().get(0);
        if (location != null) {
            this.this$0.setLastLocation(location);
        }
    }
}
