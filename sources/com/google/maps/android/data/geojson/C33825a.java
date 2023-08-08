package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.C33818b;
import com.google.maps.android.data.C33819c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.maps.android.data.geojson.a */
public class C33825a extends C33818b implements Observer {

    /* renamed from: d */
    public final LatLngBounds f82005d;

    /* renamed from: e */
    public C33837k f82006e;

    /* renamed from: f */
    public C33830e f82007f;

    /* renamed from: g */
    public C33839m f82008g;

    public C33825a(C33819c cVar, String str, HashMap<String, String> hashMap, LatLngBounds latLngBounds) {
        super(cVar, str, hashMap);
        this.f81995a = str;
        this.f82005d = latLngBounds;
    }

    /* renamed from: i */
    public String mo98230i(String str) {
        return super.mo98230i(str);
    }

    /* renamed from: j */
    public void mo98231j(C33819c cVar) {
        super.mo98231j(cVar);
        setChanged();
        notifyObservers();
    }

    /* renamed from: k */
    public String mo98232k(String str, String str2) {
        return super.mo98232k(str, str2);
    }

    /* renamed from: l */
    public final void mo98272l(C33841o oVar) {
        if (mo98227f() && Arrays.asList(oVar.mo98294a()).contains(mo98222a().mo98233a())) {
            setChanged();
            notifyObservers();
        }
    }

    /* renamed from: m */
    public LatLngBounds mo98273m() {
        return this.f82005d;
    }

    /* renamed from: n */
    public C33830e mo98274n() {
        return this.f82007f;
    }

    /* renamed from: o */
    public MarkerOptions mo98275o() {
        return this.f82006e.mo98328D();
    }

    /* renamed from: p */
    public C33837k mo98276p() {
        return this.f82006e;
    }

    /* renamed from: q */
    public PolygonOptions mo98277q() {
        return this.f82008g.mo98374y();
    }

    /* renamed from: r */
    public C33839m mo98278r() {
        return this.f82008g;
    }

    /* renamed from: s */
    public PolylineOptions mo98279s() {
        return this.f82007f.mo98311u();
    }

    /* renamed from: t */
    public void mo98280t(C33830e eVar) {
        if (eVar != null) {
            C33830e eVar2 = this.f82007f;
            if (eVar2 != null) {
                eVar2.deleteObserver(this);
            }
            this.f82007f = eVar;
            eVar.addObserver(this);
            mo98272l(this.f82007f);
            return;
        }
        throw new IllegalArgumentException("Line string style cannot be null");
    }

    @C0359n0
    public String toString() {
        return "Feature{" + "\n bounding box=" + this.f82005d + ",\n geometry=" + mo98222a() + ",\n point style=" + this.f82006e + ",\n line string style=" + this.f82007f + ",\n polygon style=" + this.f82008g + ",\n id=" + this.f81995a + ",\n properties=" + mo98224c() + "\n}\n";
    }

    /* renamed from: u */
    public void mo98282u(C33837k kVar) {
        if (kVar != null) {
            C33837k kVar2 = this.f82006e;
            if (kVar2 != null) {
                kVar2.deleteObserver(this);
            }
            this.f82006e = kVar;
            kVar.addObserver(this);
            mo98272l(this.f82006e);
            return;
        }
        throw new IllegalArgumentException("Point style cannot be null");
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof C33841o) {
            mo98272l((C33841o) observable);
        }
    }

    /* renamed from: v */
    public void mo98284v(C33839m mVar) {
        if (mVar != null) {
            C33839m mVar2 = this.f82008g;
            if (mVar2 != null) {
                mVar2.deleteObserver(this);
            }
            this.f82008g = mVar;
            mVar.addObserver(this);
            mo98272l(this.f82008g);
            return;
        }
        throw new IllegalArgumentException("Polygon style cannot be null");
    }
}
