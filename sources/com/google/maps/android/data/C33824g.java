package com.google.maps.android.data;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.installations.local.C33093b;

/* renamed from: com.google.maps.android.data.g */
public class C33824g implements C33819c {

    /* renamed from: b */
    public static final String f82003b = "Point";

    /* renamed from: a */
    public final LatLng f82004a;

    public C33824g(LatLng latLng) {
        if (latLng != null) {
            this.f82004a = latLng;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo98233a() {
        return "Point";
    }

    /* renamed from: e */
    public LatLng mo98234d() {
        return this.f82004a;
    }

    @C0359n0
    public String toString() {
        return "Point" + C33093b.f80281i + "\n coordinates=" + this.f82004a + "\n}\n";
    }
}
