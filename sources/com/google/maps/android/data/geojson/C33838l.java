package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.C33817a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.l */
public class C33838l implements C33817a {

    /* renamed from: b */
    public static final String f82036b = "Polygon";

    /* renamed from: c */
    public static final int f82037c = 0;

    /* renamed from: d */
    public static final int f82038d = 1;

    /* renamed from: a */
    public final List<? extends List<LatLng>> f82039a;

    public C33838l(List<? extends List<LatLng>> list) {
        if (list != null) {
            this.f82039a = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo98233a() {
        return mo98354i();
    }

    /* renamed from: e */
    public List<? extends List<LatLng>> mo98350e() {
        return this.f82039a;
    }

    /* renamed from: f */
    public List<? extends List<LatLng>> mo98234d() {
        return mo98350e();
    }

    /* renamed from: g */
    public ArrayList<ArrayList<LatLng>> mo98221c() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i = 1; i < mo98350e().size(); i++) {
            arrayList.add((ArrayList) mo98350e().get(i));
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList<LatLng> mo98220b() {
        return (ArrayList) mo98350e().get(0);
    }

    /* renamed from: i */
    public String mo98354i() {
        return "Polygon";
    }

    @C0359n0
    public String toString() {
        return "Polygon" + C33093b.f80281i + "\n coordinates=" + this.f82039a + "\n}\n";
    }
}
