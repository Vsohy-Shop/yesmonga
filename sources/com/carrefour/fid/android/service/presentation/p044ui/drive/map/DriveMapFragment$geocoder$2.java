package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.location.Geocoder;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo22516d2 = {"<anonymous>", "Landroid/location/Geocoder;", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$geocoder$2 */
public final class DriveMapFragment$geocoder$2 extends Lambda implements C11289a<Geocoder> {
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$geocoder$2(DriveMapFragment driveMapFragment) {
        super(0);
        this.this$0 = driveMapFragment;
    }

    @C12579k
    public final Geocoder invoke() {
        return new Geocoder(this.this$0.getApplication().getApplicationContext());
    }
}
