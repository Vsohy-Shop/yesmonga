package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.C33869l;
import java.util.Arrays;

/* renamed from: com.google.maps.android.data.geojson.k */
public class C33837k extends C33869l implements C33841o {

    /* renamed from: d */
    public static final String[] f82035d = {"Point", C33834i.f82024p, C33834i.f82019k};

    public C33837k() {
        this.f82163a = new MarkerOptions();
    }

    /* renamed from: A */
    public void mo98325A(String str) {
        this.f82163a.mo86373l2(str);
        mo98327C();
    }

    /* renamed from: B */
    public void mo98326B(float f) {
        this.f82163a.mo86379y2(f);
        mo98327C();
    }

    /* renamed from: C */
    public final void mo98327C() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: D */
    public MarkerOptions mo98328D() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.mo86359M(this.f82163a.mo86368e0());
        markerOptions.mo86362Q(this.f82163a.mo86370f0(), this.f82163a.mo86375n0());
        markerOptions.mo86363W(this.f82163a.mo86358L1());
        markerOptions.mo86364X(this.f82163a.mo86360M1());
        markerOptions.mo86354A1(this.f82163a.mo86376p0());
        markerOptions.mo86356G1(this.f82163a.mo86377t0(), this.f82163a.mo86353A0());
        markerOptions.mo86367c2(this.f82163a.mo86357K0());
        markerOptions.mo86369e2(this.f82163a.mo86361N0());
        markerOptions.mo86373l2(this.f82163a.mo86371j1());
        markerOptions.mo86374m2(this.f82163a.mo86365X1());
        markerOptions.mo86379y2(this.f82163a.mo86372k1());
        return markerOptions;
    }

    /* renamed from: a */
    public String[] mo98294a() {
        return f82035d;
    }

    /* renamed from: b */
    public float mo98329b() {
        return this.f82163a.mo86357K0();
    }

    /* renamed from: h */
    public float mo98330h() {
        return this.f82163a.mo86368e0();
    }

    /* renamed from: i */
    public float mo98331i() {
        return this.f82163a.mo86370f0();
    }

    public boolean isVisible() {
        return this.f82163a.mo86365X1();
    }

    /* renamed from: j */
    public float mo98332j() {
        return this.f82163a.mo86375n0();
    }

    /* renamed from: k */
    public C30573a mo98333k() {
        return this.f82163a.mo86376p0();
    }

    /* renamed from: l */
    public float mo98334l() {
        return this.f82163a.mo86377t0();
    }

    /* renamed from: m */
    public float mo98335m() {
        return this.f82163a.mo86353A0();
    }

    /* renamed from: n */
    public String mo98336n() {
        return this.f82163a.mo86361N0();
    }

    /* renamed from: o */
    public String mo98337o() {
        return this.f82163a.mo86371j1();
    }

    /* renamed from: p */
    public float mo98338p() {
        return this.f82163a.mo86372k1();
    }

    /* renamed from: q */
    public boolean mo98339q() {
        return this.f82163a.mo86358L1();
    }

    /* renamed from: r */
    public boolean mo98340r() {
        return this.f82163a.mo86360M1();
    }

    /* renamed from: s */
    public void mo98341s(float f) {
        this.f82163a.mo86359M(f);
        mo98327C();
    }

    public void setVisible(boolean z) {
        this.f82163a.mo86374m2(z);
        mo98327C();
    }

    /* renamed from: t */
    public void mo98342t(float f, float f2) {
        mo98556d(f, f2, "fraction", "fraction");
        mo98327C();
    }

    @C0359n0
    public String toString() {
        return "PointStyle{" + "\n geometry type=" + Arrays.toString(f82035d) + ",\n alpha=" + mo98330h() + ",\n anchor U=" + mo98331i() + ",\n anchor V=" + mo98332j() + ",\n draggable=" + mo98339q() + ",\n flat=" + mo98340r() + ",\n info window anchor U=" + mo98334l() + ",\n info window anchor V=" + mo98335m() + ",\n rotation=" + mo98329b() + ",\n snippet=" + mo98336n() + ",\n title=" + mo98337o() + ",\n visible=" + isVisible() + ",\n z index=" + mo98338p() + "\n}\n";
    }

    /* renamed from: u */
    public void mo98344u(boolean z) {
        this.f82163a.mo86363W(z);
        mo98327C();
    }

    /* renamed from: v */
    public void mo98345v(boolean z) {
        this.f82163a.mo86364X(z);
        mo98327C();
    }

    /* renamed from: w */
    public void mo98346w(C30573a aVar) {
        this.f82163a.mo86354A1(aVar);
        mo98327C();
    }

    /* renamed from: x */
    public void mo98347x(float f, float f2) {
        this.f82163a.mo86356G1(f, f2);
        mo98327C();
    }

    /* renamed from: y */
    public void mo98348y(float f) {
        mo98557e(f);
        mo98327C();
    }

    /* renamed from: z */
    public void mo98349z(String str) {
        this.f82163a.mo86369e2(str);
        mo98327C();
    }
}
