package com.google.maps.android.heatmaps;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.C33872b;
import com.google.maps.android.projection.C33881b;
import com.google.maps.android.quadtree.C33882a;

/* renamed from: com.google.maps.android.heatmaps.c */
public class C33879c implements C33882a.C33883a {

    /* renamed from: c */
    public static final double f82210c = 1.0d;

    /* renamed from: d */
    public static final C33881b f82211d = new C33881b(1.0d);

    /* renamed from: a */
    public C33872b f82212a;

    /* renamed from: b */
    public double f82213b;

    public C33879c(LatLng latLng, double d) {
        this.f82212a = f82211d.mo98584b(latLng);
        if (d >= 0.0d) {
            this.f82213b = d;
        } else {
            this.f82213b = 1.0d;
        }
    }

    /* renamed from: a */
    public C33872b mo98050a() {
        return this.f82212a;
    }

    /* renamed from: b */
    public double mo98582b() {
        return this.f82213b;
    }

    public C33879c(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
