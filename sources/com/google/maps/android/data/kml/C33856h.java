package com.google.maps.android.data.kml;

import androidx.annotation.C0359n0;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.C33823f;
import java.util.ArrayList;

/* renamed from: com.google.maps.android.data.kml.h */
public class C33856h extends C33823f {
    public C33856h(ArrayList<C33819c> arrayList) {
        super(arrayList);
    }

    /* renamed from: g */
    public ArrayList<C33819c> mo98259e() {
        return new ArrayList<>(super.mo98234d());
    }

    @C0359n0
    public String toString() {
        return mo98233a() + C33093b.f80281i + "\n geometries=" + mo98259e() + "\n}\n";
    }
}
