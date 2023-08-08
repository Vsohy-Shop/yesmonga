package com.google.maps.android.data.kml;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.C33817a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.maps.android.data.kml.m */
public class C33861m implements C33817a<ArrayList<ArrayList<LatLng>>> {

    /* renamed from: c */
    public static final String f82123c = "Polygon";

    /* renamed from: a */
    public final List<LatLng> f82124a;

    /* renamed from: b */
    public final List<List<LatLng>> f82125b;

    public C33861m(List<LatLng> list, List<List<LatLng>> list2) {
        if (list != null) {
            this.f82124a = list;
            this.f82125b = list2;
            return;
        }
        throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo98233a() {
        return "Polygon";
    }

    /* renamed from: b */
    public List<LatLng> mo98220b() {
        return this.f82124a;
    }

    /* renamed from: c */
    public List<List<LatLng>> mo98221c() {
        return this.f82125b;
    }

    /* renamed from: e */
    public List<List<LatLng>> mo98234d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f82124a);
        List<List<LatLng>> list = this.f82125b;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @C0359n0
    public String toString() {
        return "Polygon" + C33093b.f80281i + "\n outer coordinates=" + this.f82124a + ",\n inner coordinates=" + this.f82125b + "\n}\n";
    }
}
