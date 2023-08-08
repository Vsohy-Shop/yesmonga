package com.google.maps.android.data;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.installations.local.C33093b;
import java.util.List;

/* renamed from: com.google.maps.android.data.e */
public class C33822e implements C33819c<List<LatLng>> {

    /* renamed from: b */
    public static final String f81999b = "LineString";

    /* renamed from: a */
    public final List<LatLng> f82000a;

    public C33822e(List<LatLng> list) {
        if (list != null) {
            this.f82000a = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo98233a() {
        return "LineString";
    }

    /* renamed from: e */
    public List<LatLng> mo98234d() {
        return this.f82000a;
    }

    @C0359n0
    public String toString() {
        return "LineString" + C33093b.f80281i + "\n coordinates=" + this.f82000a + "\n}\n";
    }
}
