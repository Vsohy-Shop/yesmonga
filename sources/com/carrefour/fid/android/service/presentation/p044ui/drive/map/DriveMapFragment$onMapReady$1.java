package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.android.gms.maps.internal.C30519p1;
import com.google.android.gms.maps.model.C30587h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onMapReady$1 */
public /* synthetic */ class DriveMapFragment$onMapReady$1 extends AdaptedFunctionReference implements C11305q<C30587h, DrivePoint, Boolean, C11079d2> {
    public DriveMapFragment$onMapReady$1(Object obj) {
        super(3, obj, DriveMapFragment.class, "updateMarkerIcon", "updateMarkerIcon-0E7RQCE(Lcom/google/android/gms/maps/model/Marker;Lcom/carrefour/fid/android/service/presentation/model/DrivePoint;Z)Ljava/lang/Object;", 8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C30587h) obj, (DrivePoint) obj2, ((Boolean) obj3).booleanValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C30587h hVar, @C12579k DrivePoint drivePoint, boolean z) {
        Intrinsics.checkNotNullParameter(hVar, "p0");
        Intrinsics.checkNotNullParameter(drivePoint, C30519p1.f72971a);
        Object unused = ((DriveMapFragment) this.receiver).m172903updateMarkerIcon0E7RQCE(hVar, drivePoint, z);
    }
}
