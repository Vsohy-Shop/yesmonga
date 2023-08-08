package androidx.compose.p004ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.graphics.colorspace.g */
public final class C15144g {
    @C12579k

    /* renamed from: a */
    public static final C15144g f37408a = new C15144g();
    @C12579k

    /* renamed from: b */
    public static final float[] f37409b;
    @C12579k

    /* renamed from: c */
    public static final float[] f37410c;
    @C12579k

    /* renamed from: d */
    public static final C15134a0 f37411d;
    @C12579k

    /* renamed from: e */
    public static final C15134a0 f37412e;
    @C12579k

    /* renamed from: f */
    public static final Rgb f37413f;
    @C12579k

    /* renamed from: g */
    public static final Rgb f37414g;
    @C12579k

    /* renamed from: h */
    public static final Rgb f37415h;
    @C12579k

    /* renamed from: i */
    public static final Rgb f37416i;
    @C12579k

    /* renamed from: j */
    public static final Rgb f37417j;
    @C12579k

    /* renamed from: k */
    public static final Rgb f37418k;
    @C12579k

    /* renamed from: l */
    public static final Rgb f37419l;
    @C12579k

    /* renamed from: m */
    public static final Rgb f37420m;
    @C12579k

    /* renamed from: n */
    public static final Rgb f37421n;
    @C12579k

    /* renamed from: o */
    public static final Rgb f37422o;
    @C12579k

    /* renamed from: p */
    public static final Rgb f37423p;
    @C12579k

    /* renamed from: q */
    public static final Rgb f37424q;
    @C12579k

    /* renamed from: r */
    public static final Rgb f37425r;
    @C12579k

    /* renamed from: s */
    public static final Rgb f37426s;
    @C12579k

    /* renamed from: t */
    public static final C15138c f37427t;
    @C12579k

    /* renamed from: u */
    public static final C15138c f37428u;
    @C12579k

    /* renamed from: v */
    public static final Rgb f37429v;
    @C12579k

    /* renamed from: w */
    public static final C15138c f37430w;
    @C12579k

    /* renamed from: x */
    public static final C15138c[] f37431x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f37409b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f37410c = fArr2;
        C15134a0 a0Var = new C15134a0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f37411d = a0Var;
        C15134a0 a0Var2 = new C15134a0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f37412e = a0Var2;
        C15150j jVar = C15150j.f37445a;
        float[] fArr3 = fArr;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr3, jVar.mo42634h(), a0Var, 0);
        f37413f = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr3, jVar.mo42634h(), 1.0d, 0.0f, 1.0f, 1);
        f37414g = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr3, jVar.mo42634h(), (float[]) null, new C15142e(), new C15143f(), -0.799f, 2.399f, a0Var, 2);
        f37415h = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr3, jVar.mo42634h(), 1.0d, -0.5f, 7.499f, 3);
        f37416i = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, jVar.mo42634h(), new C15134a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 4);
        f37417j = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, jVar.mo42634h(), new C15134a0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 5);
        f37418k = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C15137b0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f37419l = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, jVar.mo42634h(), a0Var, 7);
        f37420m = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, jVar.mo42629c(), new C15134a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 8);
        f37421n = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, jVar.mo42634h(), new C15134a0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 9);
        f37422o = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, jVar.mo42634h(), 2.2d, 0.0f, 1.0f, 10);
        f37423p = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jVar.mo42630d(), new C15134a0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 11);
        f37424q = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, jVar.mo42633g(), 1.0d, -65504.0f, 65504.0f, 12);
        f37425r = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, jVar.mo42633g(), 1.0d, -65504.0f, 65504.0f, 13);
        f37426s = rgb14;
        C15140c0 c0Var = new C15140c0("Generic XYZ", 14);
        f37427t = c0Var;
        C15151k kVar = new C15151k("Generic L*a*b*", 15);
        f37428u = kVar;
        float[] fArr4 = fArr;
        Rgb rgb15 = new Rgb("None", fArr4, jVar.mo42634h(), a0Var2, 16);
        f37429v = rgb15;
        C15153l lVar = new C15153l("Oklab", 17);
        f37430w = lVar;
        f37431x = new C15138c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, c0Var, kVar, rgb15, lVar};
    }

    /* renamed from: c */
    public static final double m65457c(double d) {
        return C15141d.m65431a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: d */
    public static final double m65458d(double d) {
        return C15141d.m65432b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @C12579k
    /* renamed from: A */
    public final Rgb mo42591A() {
        return f37429v;
    }

    @C12580l
    /* renamed from: B */
    public final C15138c mo42592B(@C12579k float[] fArr, @C12579k C15134a0 a0Var) {
        Intrinsics.checkNotNullParameter(fArr, "toXYZD50");
        Intrinsics.checkNotNullParameter(a0Var, "function");
        for (C15138c cVar : f37431x) {
            if (C15135b.m65390h(cVar.mo42585g(), C15135b.f37394b.mo42571c())) {
                C15138c e = C15141d.m65435e(cVar, C15150j.f37445a.mo42630d(), (C15129a) null, 2, (Object) null);
                Intrinsics.checkNotNull(e, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) e;
                if (C15141d.m65439i(fArr, rgb.mo42517h0()) && C15141d.m65437g(a0Var, rgb.mo42512e0())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: e */
    public final Rgb mo42593e() {
        return f37425r;
    }

    @C12579k
    /* renamed from: f */
    public final Rgb mo42594f() {
        return f37426s;
    }

    @C12579k
    /* renamed from: g */
    public final Rgb mo42595g() {
        return f37423p;
    }

    @C12579k
    /* renamed from: h */
    public final Rgb mo42596h() {
        return f37418k;
    }

    @C12579k
    /* renamed from: i */
    public final Rgb mo42597i() {
        return f37417j;
    }

    @C12579k
    /* renamed from: j */
    public final C15138c mo42598j() {
        return f37428u;
    }

    @C12579k
    /* renamed from: k */
    public final C15138c mo42599k() {
        return f37427t;
    }

    @C12579k
    /* renamed from: l */
    public final C15138c mo42600l(int i) {
        return mo42601m()[i];
    }

    @C12579k
    /* renamed from: m */
    public final C15138c[] mo42601m() {
        return f37431x;
    }

    @C12579k
    /* renamed from: n */
    public final Rgb mo42602n() {
        return f37419l;
    }

    @C12579k
    /* renamed from: o */
    public final Rgb mo42603o() {
        return f37420m;
    }

    @C12579k
    /* renamed from: p */
    public final Rgb mo42604p() {
        return f37415h;
    }

    @C12579k
    /* renamed from: q */
    public final Rgb mo42605q() {
        return f37416i;
    }

    @C12579k
    /* renamed from: r */
    public final Rgb mo42606r() {
        return f37414g;
    }

    @C12579k
    /* renamed from: s */
    public final Rgb mo42607s() {
        return f37421n;
    }

    @C12579k
    /* renamed from: t */
    public final float[] mo42608t() {
        return f37410c;
    }

    @C12579k
    /* renamed from: u */
    public final C15138c mo42609u() {
        return f37430w;
    }

    @C12579k
    /* renamed from: v */
    public final Rgb mo42610v() {
        return f37424q;
    }

    @C12579k
    /* renamed from: w */
    public final Rgb mo42611w() {
        return f37422o;
    }

    @C12579k
    /* renamed from: x */
    public final Rgb mo42612x() {
        return f37413f;
    }

    @C12579k
    /* renamed from: y */
    public final float[] mo42613y() {
        return f37409b;
    }

    @C12579k
    /* renamed from: z */
    public final C15134a0 mo42614z() {
        return f37411d;
    }
}
