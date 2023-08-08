package com.google.maps.android.data;

import androidx.annotation.C0359n0;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.geojson.C33834i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.maps.android.data.f */
public class C33823f implements C33819c {

    /* renamed from: a */
    public String f82001a = "MultiGeometry";

    /* renamed from: b */
    public List<C33819c> f82002b;

    public C33823f(List<? extends C33819c> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C33819c add : list) {
                arrayList.add(add);
            }
            this.f82002b = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    /* renamed from: a */
    public String mo98233a() {
        return this.f82001a;
    }

    /* renamed from: e */
    public List<C33819c> mo98234d() {
        return this.f82002b;
    }

    /* renamed from: f */
    public void mo98260f(String str) {
        this.f82001a = str;
    }

    @C0359n0
    public String toString() {
        String str;
        if (this.f82001a.equals(C33834i.f82024p)) {
            str = "LineStrings=";
        } else {
            str = "Geometries=";
        }
        if (this.f82001a.equals(C33834i.f82026r)) {
            str = "points=";
        }
        if (this.f82001a.equals(C33834i.f82028t)) {
            str = "Polygons=";
        }
        StringBuilder sb = new StringBuilder(mo98233a());
        sb.append(C33093b.f80281i);
        sb.append("\n " + str);
        sb.append(mo98234d());
        sb.append("\n}\n");
        return sb.toString();
    }
}
