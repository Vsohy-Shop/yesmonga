package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.maps.android.data.kml.q */
public class C33867q extends C33855g {

    /* renamed from: d */
    public final ArrayList<Long> f82161d;

    /* renamed from: e */
    public final HashMap<String, String> f82162e;

    public C33867q(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2, ArrayList<Long> arrayList3, HashMap<String, String> hashMap) {
        super(arrayList, arrayList2);
        this.f82161d = arrayList3;
        this.f82162e = hashMap;
    }

    /* renamed from: h */
    public HashMap<String, String> mo98553h() {
        return this.f82162e;
    }

    /* renamed from: i */
    public ArrayList<Long> mo98554i() {
        return this.f82161d;
    }
}
