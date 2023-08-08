package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.C33822e;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.d */
public class C33829d extends C33822e {

    /* renamed from: c */
    public final List<Double> f82010c;

    public C33829d(List<LatLng> list) {
        this(list, (List<Double>) null);
    }

    /* renamed from: f */
    public List<Double> mo98291f() {
        return this.f82010c;
    }

    /* renamed from: g */
    public List<LatLng> mo98292g() {
        return mo98234d();
    }

    /* renamed from: h */
    public String mo98293h() {
        return mo98233a();
    }

    public C33829d(List<LatLng> list, List<Double> list2) {
        super(list);
        this.f82010c = list2;
    }
}
