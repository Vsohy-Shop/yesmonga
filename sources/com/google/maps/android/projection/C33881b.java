package com.google.maps.android.projection;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.C33872b;

/* renamed from: com.google.maps.android.projection.b */
public class C33881b {

    /* renamed from: a */
    public final double f82214a;

    public C33881b(double d) {
        this.f82214a = d;
    }

    /* renamed from: a */
    public LatLng mo98583a(C33872b bVar) {
        double d = bVar.f82172a;
        double d2 = this.f82214a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar.f82173b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public C33880a mo98584b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f73028a));
        double d = this.f82214a;
        return new C33880a(((latLng.f73029b / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
