package com.carrefour.fid.android.service.presentation.p044ui.drive.map.model;

import androidx.compose.runtime.internal.C8567o;
import com.google.android.gms.maps.model.LatLng;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/model/MapConstant;", "", "()V", "CityLocation", "Zoom", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.model.MapConstant */
public final class MapConstant {
    @C12579k
    public static final MapConstant INSTANCE = new MapConstant();

    @C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/model/MapConstant$CityLocation;", "", "()V", "FRANCE", "Lcom/google/android/gms/maps/model/LatLng;", "getFRANCE", "()Lcom/google/android/gms/maps/model/LatLng;", "FRANCE_LAT", "", "FRANCE_LONG", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.model.MapConstant$CityLocation */
    public static final class CityLocation {
        public static final int $stable = 8;
        @C12579k
        private static final LatLng FRANCE = new LatLng(45.06055160733443d, 2.8949793210698544d);
        private static final double FRANCE_LAT = 45.06055160733443d;
        private static final double FRANCE_LONG = 2.8949793210698544d;
        @C12579k
        public static final CityLocation INSTANCE = new CityLocation();

        private CityLocation() {
        }

        @C12579k
        public final LatLng getFRANCE() {
            return FRANCE;
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/model/MapConstant$Zoom;", "", "()V", "BOUNDS_PADDING", "", "CITY_ZOOM", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.model.MapConstant$Zoom */
    public static final class Zoom {
        public static final int $stable = 0;
        public static final int BOUNDS_PADDING = 100;
        public static final float CITY_ZOOM = 5.0f;
        @C12579k
        public static final Zoom INSTANCE = new Zoom();

        private Zoom() {
        }
    }

    private MapConstant() {
    }
}
