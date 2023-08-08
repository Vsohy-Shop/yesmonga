package com.google.maps.android.data.kml;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.firebase.installations.local.C33093b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.maps.android.data.kml.e */
public class C33853e {

    /* renamed from: a */
    public final Map<String, String> f82103a;

    /* renamed from: b */
    public final GroundOverlayOptions f82104b;

    /* renamed from: c */
    public String f82105c;

    /* renamed from: d */
    public LatLngBounds f82106d;

    public C33853e(String str, LatLngBounds latLngBounds, float f, int i, HashMap<String, String> hashMap, float f2) {
        boolean z;
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.f82104b = groundOverlayOptions;
        this.f82105c = str;
        this.f82103a = hashMap;
        if (latLngBounds != null) {
            this.f82106d = latLngBounds;
            groundOverlayOptions.mo86321M1(latLngBounds);
            groundOverlayOptions.mo86323Q(f2);
            groundOverlayOptions.mo86328c2(f);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            groundOverlayOptions.mo86327Y1(z);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }

    /* renamed from: a */
    public GroundOverlayOptions mo98460a() {
        return this.f82104b;
    }

    /* renamed from: b */
    public String mo98461b() {
        return this.f82105c;
    }

    /* renamed from: c */
    public LatLngBounds mo98462c() {
        return this.f82106d;
    }

    /* renamed from: d */
    public Iterable<String> mo98463d() {
        return this.f82103a.keySet();
    }

    /* renamed from: e */
    public String mo98464e(String str) {
        return this.f82103a.get(str);
    }

    /* renamed from: f */
    public boolean mo98465f(String str) {
        return this.f82103a.get(str) != null;
    }

    @C0359n0
    public String toString() {
        return "GroundOverlay" + C33093b.f80281i + "\n properties=" + this.f82103a + ",\n image url=" + this.f82105c + ",\n LatLngBox=" + this.f82106d + "\n}\n";
    }
}
