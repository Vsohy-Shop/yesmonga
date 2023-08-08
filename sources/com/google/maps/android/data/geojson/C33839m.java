package com.google.maps.android.data.geojson;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.C33869l;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.maps.android.data.geojson.m */
public class C33839m extends C33869l implements C33841o {

    /* renamed from: d */
    public static final String[] f82040d = {"Polygon", C33834i.f82028t, C33834i.f82019k};

    public C33839m() {
        PolygonOptions polygonOptions = new PolygonOptions();
        this.f82165c = polygonOptions;
        polygonOptions.mo86399e0(true);
    }

    /* renamed from: a */
    public String[] mo98294a() {
        return f82040d;
    }

    /* renamed from: h */
    public int mo98356h() {
        return this.f82165c.mo86406p0();
    }

    /* renamed from: i */
    public int mo98357i() {
        return this.f82165c.mo86386C0();
    }

    public boolean isVisible() {
        return this.f82165c.mo86389L1();
    }

    /* renamed from: j */
    public int mo98358j() {
        return this.f82165c.mo86388K0();
    }

    /* renamed from: k */
    public List<PatternItem> mo98359k() {
        return this.f82165c.mo86392N0();
    }

    /* renamed from: l */
    public float mo98360l() {
        return this.f82165c.mo86402j1();
    }

    /* renamed from: m */
    public float mo98361m() {
        return this.f82165c.mo86403k1();
    }

    /* renamed from: n */
    public boolean mo98362n() {
        return this.f82165c.mo86385A1();
    }

    /* renamed from: o */
    public boolean mo98363o() {
        return this.f82165c.mo86387G1();
    }

    /* renamed from: p */
    public void mo98364p(boolean z) {
        this.f82165c.mo86399e0(z);
        mo98373x();
    }

    /* renamed from: q */
    public void mo98365q(int i) {
        mo98558f(i);
        mo98373x();
    }

    /* renamed from: r */
    public void mo98366r(boolean z) {
        this.f82165c.mo86405n0(z);
        mo98373x();
    }

    /* renamed from: s */
    public void mo98367s(int i) {
        this.f82165c.mo86391M1(i);
        mo98373x();
    }

    public void setVisible(boolean z) {
        this.f82165c.mo86400e2(z);
        mo98373x();
    }

    /* renamed from: t */
    public void mo98368t(int i) {
        this.f82165c.mo86396X1(i);
        mo98373x();
    }

    @C0359n0
    public String toString() {
        return "PolygonStyle{" + "\n geometry type=" + Arrays.toString(f82040d) + ",\n fill color=" + mo98356h() + ",\n geodesic=" + mo98363o() + ",\n stroke color=" + mo98357i() + ",\n stroke joint type=" + mo98358j() + ",\n stroke pattern=" + mo98359k() + ",\n stroke width=" + mo98360l() + ",\n visible=" + isVisible() + ",\n z index=" + mo98361m() + ",\n clickable=" + mo98362n() + "\n}\n";
    }

    /* renamed from: u */
    public void mo98370u(List<PatternItem> list) {
        this.f82165c.mo86397Y1(list);
        mo98373x();
    }

    /* renamed from: v */
    public void mo98371v(float f) {
        mo98559g(f);
        mo98373x();
    }

    /* renamed from: w */
    public void mo98372w(float f) {
        this.f82165c.mo86404l2(f);
        mo98373x();
    }

    /* renamed from: x */
    public final void mo98373x() {
        setChanged();
        notifyObservers();
    }

    /* renamed from: y */
    public PolygonOptions mo98374y() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.mo86401f0(this.f82165c.mo86406p0());
        polygonOptions.mo86405n0(this.f82165c.mo86387G1());
        polygonOptions.mo86391M1(this.f82165c.mo86386C0());
        polygonOptions.mo86396X1(this.f82165c.mo86388K0());
        polygonOptions.mo86397Y1(this.f82165c.mo86392N0());
        polygonOptions.mo86398c2(this.f82165c.mo86402j1());
        polygonOptions.mo86400e2(this.f82165c.mo86389L1());
        polygonOptions.mo86404l2(this.f82165c.mo86403k1());
        polygonOptions.mo86399e0(this.f82165c.mo86385A1());
        return polygonOptions;
    }
}
