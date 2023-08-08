package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.C33869l;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.e */
public class C33830e extends C33869l implements C33841o {

    /* renamed from: d */
    public static final String[] f82011d = {"LineString", C33834i.f82026r, C33834i.f82019k};

    public C33830e() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.f82164b = polylineOptions;
        polylineOptions.mo86420X(true);
    }

    /* renamed from: a */
    public String[] mo98294a() {
        return f82011d;
    }

    /* renamed from: h */
    public int mo98295h() {
        return this.f82164b.mo86431p0();
    }

    /* renamed from: i */
    public List<PatternItem> mo98296i() {
        return this.f82164b.mo86411C0();
    }

    public boolean isVisible() {
        return this.f82164b.mo86414L1();
    }

    /* renamed from: j */
    public float mo98298j() {
        return this.f82164b.mo86427j1();
    }

    /* renamed from: k */
    public float mo98299k() {
        return this.f82164b.mo86428k1();
    }

    /* renamed from: l */
    public boolean mo98300l() {
        return this.f82164b.mo86410A1();
    }

    /* renamed from: m */
    public boolean mo98301m() {
        return this.f82164b.mo86412G1();
    }

    /* renamed from: n */
    public void mo98302n(boolean z) {
        this.f82164b.mo86420X(z);
        mo98309t();
    }

    /* renamed from: o */
    public void mo98303o(int i) {
        this.f82164b.mo86424e0(i);
        mo98309t();
    }

    /* renamed from: p */
    public void mo98304p(boolean z) {
        this.f82164b.mo86430n0(z);
        mo98309t();
    }

    /* renamed from: q */
    public void mo98305q(List<PatternItem> list) {
        this.f82164b.mo86421X1(list);
        mo98309t();
    }

    /* renamed from: r */
    public void mo98306r(float f) {
        mo98555c(f);
        mo98309t();
    }

    /* renamed from: s */
    public void mo98307s(float f) {
        this.f82164b.mo86429l2(f);
        mo98309t();
    }

    public void setVisible(boolean z) {
        this.f82164b.mo86423c2(z);
        mo98309t();
    }

    /* renamed from: t */
    public final void mo98309t() {
        setChanged();
        notifyObservers();
    }

    @C0359n0
    public String toString() {
        return "LineStringStyle{" + "\n geometry type=" + Arrays.toString(f82011d) + ",\n color=" + mo98295h() + ",\n clickable=" + mo98300l() + ",\n geodesic=" + mo98301m() + ",\n visible=" + isVisible() + ",\n width=" + mo98298j() + ",\n z index=" + mo98299k() + ",\n pattern=" + mo98296i() + "\n}\n";
    }

    /* renamed from: u */
    public PolylineOptions mo98311u() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.mo86424e0(this.f82164b.mo86431p0());
        polylineOptions.mo86420X(this.f82164b.mo86410A1());
        polylineOptions.mo86430n0(this.f82164b.mo86412G1());
        polylineOptions.mo86423c2(this.f82164b.mo86414L1());
        polylineOptions.mo86425e2(this.f82164b.mo86427j1());
        polylineOptions.mo86429l2(this.f82164b.mo86428k1());
        polylineOptions.mo86421X1(mo98296i());
        return polylineOptions;
    }
}
