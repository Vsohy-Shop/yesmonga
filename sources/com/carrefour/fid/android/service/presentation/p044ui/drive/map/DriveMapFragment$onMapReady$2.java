package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.android.gms.maps.model.C30587h;
import com.google.maps.android.clustering.C33764c;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDriveMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriveMapFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$onMapReady$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n1194#2,2:713\n1222#2,4:715\n*S KotlinDebug\n*F\n+ 1 DriveMapFragment.kt\ncom/carrefour/fid/android/service/presentation/ui/drive/map/DriveMapFragment$onMapReady$2\n*L\n316#1:713,2\n316#1:715,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$onMapReady$2 */
public final class DriveMapFragment$onMapReady$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C33764c<DrivePoint> $clusterManager;
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$onMapReady$2(DriveMapFragment driveMapFragment, C33764c<DrivePoint> cVar) {
        super(0);
        this.this$0 = driveMapFragment;
        this.$clusterManager = cVar;
    }

    public final void invoke() {
        DriveMapFragment driveMapFragment = this.this$0;
        Collection<C30587h> m = this.$clusterManager.mo98072i().mo98191m();
        Intrinsics.checkNotNullExpressionValue(m, "clusterManager.markerCollection.markers");
        Iterable iterable = m;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Object next : iterable) {
            Object f = ((C30587h) next).mo86561f();
            linkedHashMap.put(f instanceof DrivePoint ? (DrivePoint) f : null, next);
        }
        driveMapFragment.setMarkerForDrive(linkedHashMap);
        DriveMapFragment driveMapFragment2 = this.this$0;
        Collection<C30587h> m2 = this.$clusterManager.mo98071h().mo98191m();
        Intrinsics.checkNotNullExpressionValue(m2, "clusterManager.clusterMarkerCollection.markers");
        driveMapFragment2.setClusterMarkers(CollectionsKt___CollectionsKt.m40557Q5(m2));
    }
}
