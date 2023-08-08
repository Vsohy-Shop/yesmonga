package com.google.maps.android.data.kml;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.C33818b;
import com.google.maps.android.data.C33819c;
import java.util.Map;

/* renamed from: com.google.maps.android.data.kml.k */
public class C33859k extends C33818b {

    /* renamed from: d */
    public final String f82120d;

    /* renamed from: e */
    public final C33865o f82121e;

    public C33859k(C33819c cVar, String str, C33865o oVar, Map<String, String> map) {
        super(cVar, str, map);
        this.f82120d = str;
        this.f82121e = oVar;
    }

    /* renamed from: l */
    public C33865o mo98478l() {
        return this.f82121e;
    }

    /* renamed from: m */
    public MarkerOptions mo98479m() {
        C33865o oVar = this.f82121e;
        if (oVar == null) {
            return null;
        }
        return oVar.mo98542q();
    }

    /* renamed from: n */
    public PolygonOptions mo98480n() {
        C33865o oVar = this.f82121e;
        if (oVar == null) {
            return null;
        }
        return oVar.mo98543r();
    }

    /* renamed from: o */
    public PolylineOptions mo98481o() {
        C33865o oVar = this.f82121e;
        if (oVar == null) {
            return null;
        }
        return oVar.mo98544s();
    }

    /* renamed from: p */
    public String mo98482p() {
        return super.mo98223b();
    }

    @C0359n0
    public String toString() {
        return "Placemark" + C33093b.f80281i + "\n style id=" + this.f82120d + ",\n inline style=" + this.f82121e + "\n}\n";
    }
}
