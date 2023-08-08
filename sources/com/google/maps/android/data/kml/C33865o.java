package com.google.maps.android.data.kml;

import android.graphics.Color;
import androidx.annotation.C0344h1;
import com.google.android.gms.maps.model.C30575b;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.installations.local.C33093b;
import com.google.maps.android.data.C33869l;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* renamed from: com.google.maps.android.data.kml.o */
public class C33865o extends C33869l {

    /* renamed from: o */
    public static final int f82135o = 3;

    /* renamed from: p */
    public static final int f82136p = 0;

    /* renamed from: q */
    public static final int f82137q = 1;

    /* renamed from: d */
    public final HashMap<String, String> f82138d = new HashMap<>();

    /* renamed from: e */
    public final HashSet<String> f82139e = new HashSet<>();

    /* renamed from: f */
    public boolean f82140f = true;

    /* renamed from: g */
    public boolean f82141g = true;

    /* renamed from: h */
    public String f82142h;

    /* renamed from: i */
    public double f82143i = 1.0d;

    /* renamed from: j */
    public String f82144j = null;

    /* renamed from: k */
    public boolean f82145k = false;

    /* renamed from: l */
    public boolean f82146l = false;

    /* renamed from: m */
    public boolean f82147m = false;
    @C0344h1

    /* renamed from: n */
    public float f82148n = 0.0f;

    /* renamed from: h */
    public static int m136351h(int i) {
        Random random = new Random();
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (red != 0) {
            red = random.nextInt(red);
        }
        if (blue != 0) {
            blue = random.nextInt(blue);
        }
        if (green != 0) {
            green = random.nextInt(green);
        }
        return Color.rgb(red, green, blue);
    }

    /* renamed from: i */
    public static String m136352i(String str) {
        String trim = str.trim();
        if (trim.length() > 6) {
            return trim.substring(0, 2) + trim.substring(6, 8) + trim.substring(4, 6) + trim.substring(2, 4);
        }
        return trim.substring(4, 6) + trim.substring(2, 4) + trim.substring(0, 2);
    }

    /* renamed from: j */
    public static MarkerOptions m136353j(MarkerOptions markerOptions, boolean z, float f) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.mo86367c2(markerOptions.mo86357K0());
        markerOptions2.mo86362Q(markerOptions.mo86370f0(), markerOptions.mo86375n0());
        if (z) {
            markerOptions.mo86354A1(C30575b.m123156b(m136356n(m136351h((int) f))));
        }
        markerOptions2.mo86354A1(markerOptions.mo86376p0());
        return markerOptions2;
    }

    /* renamed from: k */
    public static PolygonOptions m136354k(PolygonOptions polygonOptions, boolean z, boolean z2) {
        float f;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z) {
            polygonOptions2.mo86401f0(polygonOptions.mo86406p0());
        }
        if (z2) {
            polygonOptions2.mo86391M1(polygonOptions.mo86386C0());
            f = polygonOptions.mo86402j1();
        } else {
            f = 0.0f;
        }
        polygonOptions2.mo86398c2(f);
        polygonOptions2.mo86399e0(polygonOptions.mo86385A1());
        return polygonOptions2;
    }

    /* renamed from: l */
    public static PolylineOptions m136355l(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.mo86424e0(polylineOptions.mo86431p0());
        polylineOptions2.mo86425e2(polylineOptions.mo86427j1());
        polylineOptions2.mo86420X(polylineOptions.mo86410A1());
        return polylineOptions2;
    }

    /* renamed from: n */
    public static float m136356n(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return fArr[0];
    }

    /* renamed from: A */
    public boolean mo98523A(String str) {
        return this.f82139e.contains(str);
    }

    /* renamed from: B */
    public void mo98524B(boolean z) {
        this.f82140f = z;
    }

    /* renamed from: C */
    public void mo98525C(String str) {
        mo98558f(Color.parseColor("#" + m136352i(str)));
        this.f82139e.add("fillColor");
    }

    /* renamed from: D */
    public void mo98526D(float f) {
        mo98557e(f);
        this.f82139e.add("heading");
    }

    /* renamed from: E */
    public void mo98527E(float f, float f2, String str, String str2) {
        mo98556d(f, f2, str, str2);
        this.f82139e.add(C33866p.f82153e);
    }

    /* renamed from: F */
    public void mo98528F(String str) {
        this.f82145k = str.equals(BaseOptionModel.f27465E0);
        this.f82139e.add("iconColorMode");
    }

    /* renamed from: G */
    public void mo98529G(double d) {
        this.f82143i = d;
        this.f82139e.add("iconScale");
    }

    /* renamed from: H */
    public void mo98530H(String str) {
        this.f82142h = str;
        this.f82139e.add("iconUrl");
    }

    /* renamed from: I */
    public void mo98531I(String str) {
        this.f82138d.put("text", str);
    }

    /* renamed from: J */
    public void mo98532J(String str) {
        this.f82146l = str.equals(BaseOptionModel.f27465E0);
        this.f82139e.add("lineColorMode");
    }

    /* renamed from: K */
    public void mo98533K(String str) {
        float n = m136356n(Color.parseColor("#" + m136352i(str)));
        this.f82148n = n;
        this.f82163a.mo86354A1(C30575b.m123156b(n));
        this.f82139e.add("markerColor");
    }

    /* renamed from: L */
    public void mo98534L(boolean z) {
        this.f82141g = z;
        this.f82139e.add(C33866p.f82159k);
    }

    /* renamed from: M */
    public void mo98535M(String str) {
        PolylineOptions polylineOptions = this.f82164b;
        polylineOptions.mo86424e0(Color.parseColor("#" + m136352i(str)));
        PolygonOptions polygonOptions = this.f82165c;
        polygonOptions.mo86391M1(Color.parseColor("#" + m136352i(str)));
        this.f82139e.add("outlineColor");
    }

    /* renamed from: N */
    public void mo98536N(String str) {
        this.f82147m = str.equals(BaseOptionModel.f27465E0);
        this.f82139e.add("polyColorMode");
    }

    /* renamed from: O */
    public void mo98537O(String str) {
        this.f82144j = str;
    }

    /* renamed from: P */
    public void mo98538P(Float f) {
        mo98555c(f.floatValue());
        mo98559g(f.floatValue());
        this.f82139e.add("width");
    }

    /* renamed from: m */
    public HashMap<String, String> mo98539m() {
        return this.f82138d;
    }

    /* renamed from: o */
    public double mo98540o() {
        return this.f82143i;
    }

    /* renamed from: p */
    public String mo98541p() {
        return this.f82142h;
    }

    /* renamed from: q */
    public MarkerOptions mo98542q() {
        return m136353j(this.f82163a, mo98550x(), this.f82148n);
    }

    /* renamed from: r */
    public PolygonOptions mo98543r() {
        return m136354k(this.f82165c, this.f82140f, this.f82141g);
    }

    /* renamed from: s */
    public PolylineOptions mo98544s() {
        return m136355l(this.f82164b);
    }

    /* renamed from: t */
    public String mo98545t() {
        return this.f82144j;
    }

    public String toString() {
        return "Style" + C33093b.f80281i + "\n balloon options=" + this.f82138d + ",\n fill=" + this.f82140f + ",\n outline=" + this.f82141g + ",\n icon url=" + this.f82142h + ",\n scale=" + this.f82143i + ",\n style id=" + this.f82144j + "\n}\n";
    }

    /* renamed from: u */
    public boolean mo98547u() {
        return this.f82138d.size() > 0;
    }

    /* renamed from: v */
    public boolean mo98548v() {
        return this.f82140f;
    }

    /* renamed from: w */
    public boolean mo98549w() {
        return this.f82141g;
    }

    /* renamed from: x */
    public boolean mo98550x() {
        return this.f82145k;
    }

    /* renamed from: y */
    public boolean mo98551y() {
        return this.f82146l;
    }

    /* renamed from: z */
    public boolean mo98552z() {
        return this.f82147m;
    }
}
