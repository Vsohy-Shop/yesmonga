package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.C33822e;
import java.util.ArrayList;

/* renamed from: com.google.maps.android.data.kml.g */
public class C33855g extends C33822e {

    /* renamed from: c */
    public final ArrayList<Double> f82107c;

    public C33855g(ArrayList<LatLng> arrayList) {
        this(arrayList, (ArrayList<Double>) null);
    }

    /* renamed from: f */
    public ArrayList<Double> mo98469f() {
        return this.f82107c;
    }

    /* renamed from: g */
    public ArrayList<LatLng> mo98257e() {
        return new ArrayList<>(super.mo98234d());
    }

    public C33855g(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2) {
        super(arrayList);
        this.f82107c = arrayList2;
    }
}
