package com.google.maps.android.data;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* renamed from: com.google.maps.android.data.l */
public abstract class C33869l extends Observable {

    /* renamed from: a */
    public MarkerOptions f82163a = new MarkerOptions();

    /* renamed from: b */
    public PolylineOptions f82164b;

    /* renamed from: c */
    public PolygonOptions f82165c;

    public C33869l() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.f82164b = polylineOptions;
        polylineOptions.mo86420X(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.f82165c = polygonOptions;
        polygonOptions.mo86399e0(true);
    }

    /* renamed from: b */
    public float mo98329b() {
        return this.f82163a.mo86357K0();
    }

    /* renamed from: c */
    public void mo98555c(float f) {
        this.f82164b.mo86425e2(f);
    }

    /* renamed from: d */
    public void mo98556d(float f, float f2, String str, String str2) {
        if (!str.equals("fraction")) {
            f = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f2 = 1.0f;
        }
        this.f82163a.mo86362Q(f, f2);
    }

    /* renamed from: e */
    public void mo98557e(float f) {
        this.f82163a.mo86367c2(f);
    }

    /* renamed from: f */
    public void mo98558f(int i) {
        this.f82165c.mo86401f0(i);
    }

    /* renamed from: g */
    public void mo98559g(float f) {
        this.f82165c.mo86398c2(f);
    }
}
